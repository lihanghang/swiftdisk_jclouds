package com.app.user;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.app.db.jdbcUtils;
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class Login
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//连接数据库
		  // 设置响应内容类型
		   request.setCharacterEncoding("UTF-8"); 
		   response.setCharacterEncoding("UTF-8");
		   response.setContentType("text/html;charset=utf-8");   
			Connection conn = null;
			PreparedStatement  pstm = null;  
			ResultSet rs = null; 
			try {
			 conn = jdbcUtils.getInstance().getConnection();			
			Date date=new Date();
			Md5 md5 =new Md5();
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String email      =  request.getParameter("email");
			String pwd        =  request.getParameter("password");
			String username   =  request.getParameter("nickname");
			String time       =  format.format(date);
			String md5_pwd    = md5.MD5(pwd);
			System.out.println(username);
			String sql = "insert into user (email,username,password,joindate) values('"+email+"','"+username+"','"+md5_pwd+"','"+time+"')";
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			int tag = pstm.executeUpdate(sql);
		    if (tag >0){
		    	
		    	response.sendRedirect("./auth/r_success.jsp");
		    	 
			  }
			 else {
				 response.sendRedirect("./auth/error.jsp");
			
			 }
			} catch (Exception e){
			     e.printStackTrace();
			}finally{
				
				jdbcUtils.free(rs, pstm, conn);
			}
		}
}
