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
		<link rel="stylesheet" href="../Resources/resource/css/disk.css"/>
		<link rel="stylesheet" href="../Resources/resource/css/base.css"/>
		<link rel="stylesheet" href="../Resources/resource/css/skin.css"/>
		<link rel="shortcut icon" href="https://www.fangcloud.com/favicon.ico" type="image/x-icon">
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
				font-size:50px;
				color:#38A3DB;
			}
		</style>
	</head>
	<body>
		<div id="debug"></div>
		<div id="wrap">
    		<div id="sky">
    			<a id="logo" href="../" title="LC云盘"><img src="../Resources/images/lc.png"/></a>
    		</div>
	        <div id="main">
	        	<div id="error">
	        		<span>登录失败</span>
	      			<h1>对不起，您输入的密码或用户名错误,请重新<a href="../">登录</a>！</h1>
	        	</div>
	        	
	        </div>
    	</div>
	</body>
</html>
