<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>登录失败</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" href="./Resources/resource/css/disk.css"/>
		<link rel="stylesheet" href="./Resources/resource/css/base.css"/>
		<link rel="stylesheet" href="./Resources/resource/css/skin.css"/>
		<style>
			#error{
				text-align:center;
				margin:0 auto;
			}
			#error a{
				text-decoration:none;
				color:green;			
			}
			#error a:hover{
				text-decoration:underline;
				color:blue;
			}
			#error span{
				font-size:80px;
				color:#38A3DB;
			}
		</style>
	</head>
	<body>
	<%
	if ( session.getAttribute("userInfo")==null ) {
		  
		 out.print("no");
	} else {
		   response.sendRedirect("./storage.jsp");
	       
	}
%>
		<div id="debug"></div>
		<div id="wrap">
    		<div id="sky">
    			<a id="logo" href="." title="LC云盘"><img src="./Resources/images/lc.png"/></a>
    		</div>
	        <div id="main">
	        	<div id="error">
	        		<span>登录失败</span>
	      			<h1><a href=".">对不起，您输入的密码或用户名错误,请重新登录！</a></h1>
	        	</div>
	        	
	        </div>
    	</div>
	</body>
</html>
