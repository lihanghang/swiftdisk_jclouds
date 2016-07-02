package com.app.user;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.db.jdbcUtils;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Util;



/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
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
		
		     request.setCharacterEncoding("UTF-8"); 
		     response.setCharacterEncoding("UTF-8");
		     Md5 md5 =new Md5();
		     request.setCharacterEncoding("UTF-8");//解决乱码问题
			 Connection conn = null;
			 PreparedStatement  pstm = null;  
			 ResultSet rs = null; 
			 boolean  tag = false;
			 try {
				conn = jdbcUtils.getInstance().getConnection();
			
			 String sql     = "select * from user where email = ? and password = ?";
			 String email    = request.getParameter("email");
			 String pwd     = request.getParameter("password");
			 String md5_pwd = md5.MD5(pwd);
			 pstm = (PreparedStatement) conn.prepareStatement(sql); 
			 pstm.setString(1, email);
			 pstm.setString(2, md5_pwd);
			 rs = pstm.executeQuery();
			while(rs.next()){
				HttpSession session = request.getSession();
				String username = rs.getString(3);
				//System.out.println(username);
				session.setAttribute("username", username);
				 tag = true;
				 break;
			 } } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					  try{
				            if (rs != null) rs.close() ;
				            if (pstm != null) pstm.close() ;
				            if (conn != null) conn.close() ;
				        }catch(Exception e){
				            e.printStackTrace() ;
				        }
				}
			 if (tag){
			     	response.sendRedirect("./disk/storage.jsp");
	        }else{
	        		response.sendRedirect("./auth/error.jsp");
		           
		        }
	}
}




