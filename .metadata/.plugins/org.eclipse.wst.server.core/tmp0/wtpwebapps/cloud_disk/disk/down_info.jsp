<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>下载文件信息提示</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	    <script src="../Resources/resource/js/jquery-1.9.1.min.js"></script>
		<link rel="stylesheet" href="../Resources/resource/css/disk.css"/>
		<link rel="stylesheet" href="../Resources/resource/css/base.css"/>
		<link rel="stylesheet" href="../Resources/resource/css/skin.css"/>
		<link rel="shortcut icon" href="https://www.fangcloud.com/favicon.ico" type="image/x-icon">
		<meta http-equiv="refresh" content ="5;url=../disk/showfile.jsp">
		<script type="text/javascript"> 
	
  			    var i = 6; function shownum(){ 
  				i=i-1; document.getElementById("error").innerHTML="文件下载成功，保存在本机指定路径D://cloud_disk_download/目录！"+i+"秒后自动跳转主界面";
  			     setTimeout('shownum()', 1000);
  	
  		}
 </script>
		
		
		
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
				font-size:40px;
				color:#38A3DB;
			}
		</style>
	</head>
	<body onload="shownum()" >
		<div id="debug"></div>
		<div id="wrap">
    		<div id="sky">
    			<a id="logo" href="../" title="LC云盘"><img src="../Resources/images/lc.png"/></a>
    		</div>
	        <div id="main">
	        	<div id="error"  >  	
	        
	        	</div>
	        	
	        </div>
    	</div>
	</body>
</html>
