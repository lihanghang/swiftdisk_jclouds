package com.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class jdbcUtils {
	
	private static String user = "root";
	private static String password = "root";
	private static String dbName = "cloud_netdisk";
	private static  String url = "jdbc:mysql://localhost:3306/"+dbName+"?user="+user+"&password="+password+"&useUnicode=true&characterEncoding=utf-8";
	
	private static DataSource dataSource = null;
	private static jdbcUtils jdbc = null;
	
	public static jdbcUtils getInstance() throws SQLException {  
		         if (jdbc == null) {    
		        	 jdbc = new jdbcUtils();  
		         }    
		       return jdbc;  
		      
	}  

	private jdbcUtils() throws SQLException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
			System.out.println("Exception:"+e.getMessage()+"");
		throw new ExceptionInInitializerError(e);
		}
	}
	
	/**
	 * 获取连接
	 * @return
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url);
	}
	
	public  DataSource getDataSource(){
		return dataSource;
	}
	
	/**
	 * 释放资源
	 * @param rs
	 * @param st
	 * @param conn
	 */
	public  static   void free(ResultSet rs,Statement st,Connection conn){
		try{
			if(rs != null){
				rs.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(st != null){
					st.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				try{
					if(conn != null){
						conn.close();
					}
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
			
	}

}