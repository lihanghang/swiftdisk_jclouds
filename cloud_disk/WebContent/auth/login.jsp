<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="applicable-device" content="pc,mobile">
    <title>登录-LC云盘</title>
    <link rel="shortcut icon" href="https://www.fangcloud.com/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="./Resources/css/sprites_25cd3ba.css">
    <link rel="stylesheet" type="text/css" href="./Resources/css/base_4ec9ee6.css">
    <link rel="stylesheet" type="text/css" href="./Resources/css/auth_901307e.css">
<script charset="utf-8" src="./Resources/js/v.js"></script>
<script type="text/javascript" async="" src="./Resources/js/vds.js"></script>
<script src="./Resources/js/hm.js"></script></head>
<body>
    <div class="center-logo">
        <a href="localhost" title="LC云盘">
                    <img src="./Resources/images/login/logo.png" alt="LC云盘" >
                </a>
    </div>
<div class="login-box">
    <form action="./Login" method="post" accept-charset="utf-8" class="form"><div style="display:none">
<input type="hidden" name="requesttoken" value="d7ec7d84ab13031e51899bbc754567c2">
</div>        <div class="error-msg"></div>
        <ul class="input-box">
            <li class="email">
                <label for="email"><i class="icon icon-login-user"></i></label>
                <input type="text" id="email" name="email"class="input" value="" placeholder="请输入邮箱">
            </li>
            <li>
                <label for="password"><i class="icon icon-login-pswd"></i></label>
                <input type="password" id="password" name="password" class="input" placeholder="输入密码">
            </li>
        </ul>
        <div class="login-other">
            <div class="remember-login">
               <!--<i class="icon icon-checkbox"></i><label>记住我</label>-->
                <input type="hidden" name="remember_login" id="remember_login" value="0" autocomplete="off">
            </div>
           <span>还没有账户吗？点击<a href="auth/register.jsp" class="register">注册</a></span> 
        </div>
        <button class="pure-button button-primary" id="login_btn">登 录</button>
        <input type="hidden" name="login" value="1">
    </form></div>
<div class="footer">
    2016 LC云盘@<a href="">oss开发小组-6</a>
</div>
<input type="hidden" value="d7ec7d84ab13031e51899bbc754567c2" id="oc_requesttoken">
<input type="hidden" value="https://static.fangcloud.com/assets/dist/" id="asset_url">
<input type="hidden" value="LC云盘" id="enterprise_default">
<input type="hidden" value="" id="enterprise_type">
<input type="hidden" value="" id="referrer_url">
<input type="hidden" value="https://www.fangcloud.com/" id="base_url">
    <script src="./Resources/js/sea.js"></script>
    <script src="./Resources/js/seajs-config_2f1056e.js"></script>

<script type="text/javascript" src="./Resources/js/bw-loader-411.4.5.js"></script>
    <script src="./Resources/file/jquery.js"></script>
    <script src="./Resources/file/bootstrap.min.js"></script>

<script src="./Resources/js/bw-send-411.4.5.js"></script>
<script type="text/javascript" >

  var ele = { //存放各个input字段obj
    email: document.getElementById("email"),  
    password: document.getElementById("password"),
  };
  console.log(ele.email.value);
  ele.email.onmouseout = function(){ //name失去焦点则检测
    checkEmail (ele.email.value);
  }
  ele.password.onmouseout = function(){   //password失去焦点则检测
    checkPassw(ele.password.value);
  }


 function checkPassw(passw1){ //验证密码
	// console.log(passw1);
   if(passw1 == ""){ //密码输入不为空且不等 不符合
	   $("#ilogin_btn").attr("disabled","true"); 
     return false;
   }else{  //密码输入正确
	
	   $("#login_btn").removeAttr("disabled"); 
   return true;
    
   }
 }
   function checkEmail(email){  //验证邮箱
	   var pattern = /^([\.a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\.[a-zA-Z0-9_-])+/; 
	   if(!pattern.test(email)){ //email格式不正确	      
	        $("#login_btn").attr("disabled","true"); 
	          return false;
	   }else{ //格式正确
			   $("#login_btn").removeAttr("disabled");       
	   return true;
	   }
	 }
 
   </script>

</body></html>