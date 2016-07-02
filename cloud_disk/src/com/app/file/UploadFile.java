package com.app.file;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.jclouds.io.Payload;
import org.jclouds.io.payloads.InputStreamPayload;
import org.jclouds.openstack.swift.v1.SwiftApi;
import org.jclouds.openstack.swift.v1.features.ObjectApi;

import com.swift.dao.swift_util;

/**
 * Servlet implementation class UploadFile
 */
@WebServlet("/UploadFile")
public class UploadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadFile() {
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
		    request.setCharacterEncoding("UTF-8"); 
	        response.setCharacterEncoding("UTF-8");
		    HttpSession session = request.getSession();
	        String container    = (String) session.getAttribute("username");
			SwiftApi swift = swift_util.getSwift();
			
			ObjectApi objectApi = swift.getObjectApi("RegionOne", container);
			
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			String fileName = null;
			InputStream in = null;
			try {
				Map<String, List<FileItem>> list = upload.parseParameterMap(request);
				Iterator<FileItem> it = list.get("input_obj").iterator();
				
				 while ( it.hasNext () ) 
		         {
		            FileItem fi = (FileItem)it.next();
		            if ( !fi.isFormField () )	
		            {
		            fileName = fi.getName(); 
		            in = fi.getInputStream();  
		            
		            }
		         }
			} catch (FileUploadException e) {
				e.printStackTrace();
			}
			
			Payload payload = new InputStreamPayload(in);
			
			String path = request.getParameter("current_path");

			 objectApi.put(path+"/"+fileName, payload);		
			 session.setAttribute("current_path",path);
			 RequestDispatcher disp = request.getRequestDispatcher("/ShowFile");
		        disp.forward(request, response);     
	}

}
