package com.app.file;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Response;

import org.jclouds.openstack.swift.v1.SwiftApi;
import org.jclouds.openstack.swift.v1.features.ContainerApi;
import org.jclouds.openstack.swift.v1.features.ObjectApi;
import org.jclouds.openstack.swift.v1.options.ListContainerOptions;

import com.swift.dao.swift_util;

/**
 * Servlet implementation class DeleteFile
 */
@WebServlet("/DeleteFile")
public class DeleteFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req ,HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
        HttpSession session=req.getSession();
        //String container = (String) session.getAttribute("current_dir");
        //String objName = req.getParameter("objectName");
		String path = req.getParameter("current_dir");

        SwiftApi swift = swift_util.getSwift();
		//boolean rs = swift.
        ContainerApi  containerApi = swift.getContainerApi("RegionOne");
        boolean rs = containerApi.deleteIfEmpty(path);
        if(rs){
        	
        	  session.setAttribute("path",path);
        	  res.sendRedirect("./disk/storage.jsp");
//              RequestDispatcher disp = req.getRequestDispatcher("/ShowFloder");
//              disp.forward(req, res);   
        }
       
		//ObjectApi objectApi = swift.getObjectApi("RegionOne", container).;
		//ListContainerOptions opt = ListContainerOptions.Builder.path(path);
		//objectApi.delete(objName);
		
       
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
