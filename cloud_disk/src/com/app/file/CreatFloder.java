package com.app.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jclouds.io.Payload;
import org.jclouds.io.Payloads;
import org.jclouds.openstack.swift.v1.SwiftApi;
import org.jclouds.openstack.swift.v1.features.ContainerApi;
import org.jclouds.openstack.swift.v1.features.ObjectApi;
import org.jclouds.openstack.swift.v1.options.CreateContainerOptions;

import com.google.common.collect.ImmutableMap;
import com.google.common.io.ByteSource;
import com.swift.dao.swift_util;

/**
 * Servlet implementation class Creat_Floder
 */
@WebServlet("/CreatFloder")
public class CreatFloder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreatFloder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * 瀹炵幇鍒涘缓鏂囦欢澶癸紙瀹瑰櫒锛�
		 */
		request.setCharacterEncoding("UTF-8"); 
	    response.setCharacterEncoding("UTF-8");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//璁剧疆鏃ユ湡鏍煎紡
		String    data      = df.format(new Date());// new Date()涓鸿幏鍙栧綋鍓嶇郴缁熸椂闂�
		String fileName = request.getParameter("new_folder");
	    HttpSession session=request.getSession(); 
		//String path = request.getParameter("current_path");
	     //int  size = fileName.length();
	      String User = (String) session.getAttribute("username"); 
		  SwiftApi swift = swift_util.getSwift();
		  ContainerApi containerApi = swift.getContainerApi("RegionOne");
		  
	      CreateContainerOptions options = CreateContainerOptions.Builder
	            .metadata(ImmutableMap.of(
	                      "data", data));
	   
	      containerApi.create(fileName, options);
	     
	      response.sendRedirect("./disk/storage.jsp");
		
		
		
		
		
        
        
        
	
		//ObjectApi objectApi = swift.getObjectApi("RegionOne", container);
		//Payload payload = Payloads.newByteSourcePayload(ByteSource.wrap(fileName.getBytes()));
       // objectApi.put(fileName, payload);
        
//        RequestDispatcher disp = request.getRequestDispatcher("/ListObjects");
//        disp.forward(request, response);     
	}

}
