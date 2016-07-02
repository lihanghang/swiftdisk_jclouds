package com.app.file;

import java.io.IOException;

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
import org.jclouds.openstack.swift.v1.features.ObjectApi;

import com.google.common.io.ByteSource;
import com.swift.dao.swift_util;

/**
 * Servlet implementation class Creat_Floder
 */
@WebServlet("/Creat_Floder")
public class Creat_Floder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Creat_Floder() {
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
		 * 实现创建文件夹（容器）
		 */
        HttpSession session=request.getSession(); 
		String path = request.getParameter("Path");
	
        String fileName = path+"/"+request.getParameter("newFile")+"."+"file";
        String container = (String) session.getAttribute("username");
        
		SwiftApi swift = swift_util.getSwift();
		ObjectApi objectApi = swift.getObjectApi("RegionOne", container);
		Payload payload = Payloads.newByteSourcePayload(ByteSource.wrap(fileName.getBytes()));
        String ret = objectApi.put(fileName, payload);
        
        RequestDispatcher disp = request.getRequestDispatcher("/ListObjects");
        disp.forward(request, response);     
	}

}
