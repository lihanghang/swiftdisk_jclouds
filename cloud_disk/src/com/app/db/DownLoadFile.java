package com.app.db;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jclouds.http.options.GetOptions;
import org.jclouds.openstack.swift.v1.SwiftApi;
import org.jclouds.openstack.swift.v1.domain.SwiftObject;
import org.jclouds.openstack.swift.v1.features.ObjectApi;

import com.swift.dao.swift_util;

/**
 * Servlet implementation class DownLoadFile
 */
@WebServlet("/DownLoadFile")
public class DownLoadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownLoadFile() {
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
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * download file
		 */
		 SwiftApi swift = swift_util.getSwift();
		 HttpSession session=req.getSession();
        String container = (String) session.getAttribute("username");
        String objectName = req.getParameter ("objectName");
        ObjectApi objectApi = swift.getObjectApi("RegionOne", container);
        SwiftObject obj = objectApi.get(objectName, GetOptions.NONE);
        
		String[] realName = objectName.split("/");
		String filename = realName[realName.length-1];
		System.out.print(filename);
        
        InputStream in = obj.getPayload().openStream();
        FileOutputStream out = new FileOutputStream("E://out/"+filename);
        byte buffer[] = new byte[1024];
        int len = 0;
        while((len=in.read(buffer))>0){
        	out.write(buffer, 0, len);
        }
        in.close();
        out.close();
        
        res.sendRedirect("Views/download.jsp");
	}
	}


