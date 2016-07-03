package com.app.file;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jclouds.openstack.swift.v1.SwiftApi;
import org.jclouds.openstack.swift.v1.domain.SwiftObject;
import org.jclouds.openstack.swift.v1.features.ObjectApi;
import org.jclouds.openstack.swift.v1.options.ListContainerOptions;

import com.swift.dao.swift_util;

/**
 * Servlet implementation class ShowFile
 */
@WebServlet("/ShowFile")
public class ShowFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8"); 
	    response.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		String path = request.getParameter("current_dir");
		System.out.println(path);
		String getpath = (String) session.getAttribute("con_dir");
		path = path==null?getpath:path;
		//String container = (String) session.getAttribute("current_dir");
		SwiftApi swift =swift_util.getSwift();
		ObjectApi objectApi = swift.getObjectApi("RegionOne", path);
		//ListContainerOptions opts = ListContainerOptions.Builder.path(path);
		System.out.println(path);
		List<? extends SwiftObject>  objects = objectApi.list();
//		for(int i = 0 ; i< objects.size(); i++){
//			
//			String Name =  objects.get(i).getName();
//	 		
//	 		System.out.println(Name);
//			
//		}
	    session.setAttribute("objs",objects);
	    session.setAttribute("path",path);    
	    response.sendRedirect("./disk/showfile.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * show file
		 */
		
	}

}
