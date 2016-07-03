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
 * Servlet implementation class CreateDirFile
 */
@WebServlet("/CreateDirFile")
public class CreateDirFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateDirFile() {
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
	         HttpSession session=request.getSession(); 
			//String path = request.getParameter("Path");
		    String FolderName = "/"+request.getParameter("new_folder");
	        String container = (String) session.getAttribute("current_path");
	        SwiftApi swift = swift_util.getSwift();
			ObjectApi objectApi = swift.getObjectApi("RegionOne", container);
			Payload payload = Payloads.newByteSourcePayload(ByteSource.wrap(FolderName.getBytes()));
	        objectApi.put(FolderName, payload);
	        
	        RequestDispatcher disp = request.getRequestDispatcher("/ShowFile");
	        disp.forward(request, response);
	}

}
