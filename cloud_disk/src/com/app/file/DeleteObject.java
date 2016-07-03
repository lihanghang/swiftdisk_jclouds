package com.app.file;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jclouds.openstack.swift.v1.SwiftApi;
import org.jclouds.openstack.swift.v1.features.ObjectApi;
import org.jclouds.openstack.swift.v1.options.ListContainerOptions;

import com.swift.dao.swift_util;

/**
 * Servlet implementation class DeleteObject
 */
@WebServlet("/DeleteObject")
public class DeleteObject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteObject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		   HttpSession session=req.getSession();
	        String container = (String) session.getAttribute("path");
	        String objName = req.getParameter("fileName");
			//String path = req.getParameter("delete_path");

	        SwiftApi swift = swift_util.getSwift();
			
			ObjectApi objectApi = swift.getObjectApi("RegionOne", container);
			//ListContainerOptions opt = ListContainerOptions.Builder.path(path);
			 objectApi.delete(objName); 
		     session.setAttribute("con_dir",container);
		     RequestDispatcher disp = req.getRequestDispatcher("/ShowFile");
		     disp.forward(req, resp);     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
