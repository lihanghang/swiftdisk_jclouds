package com.app.file;

import java.io.IOException;

import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jclouds.openstack.swift.v1.domain.Container;
import org.jclouds.openstack.swift.v1.features.ContainerApi;

import com.google.common.collect.FluentIterable;
import com.swift.dao.swift_util;

/**
 * Servlet implementation class ShowFloder
 */
@WebServlet("/ShowFloder")
public class ShowFloder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowFloder() {
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
		 * 瀹瑰櫒鍒楄〃锛堟枃浠跺す锛�
		 */
		//DeleteObjectsAndContainer deleteObjectsAndContainer = new DeleteObjectsAndContainer(args[0], args[1]);
		HttpSession session=request.getSession();
		Set<String> regions = swift_util.getSwift().getConfiguredRegions();
		ContainerApi containerAPI = swift_util.getSwift().getContainerApi(regions.iterator().next());
		FluentIterable<Container> containers = containerAPI.list();
		session.setAttribute("cons",containers);   
	    response.sendRedirect("./auth/storage.jsp");
	   
	}

}
