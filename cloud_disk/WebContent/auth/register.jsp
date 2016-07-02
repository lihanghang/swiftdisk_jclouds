<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- saved from url=(0041)http://storage.thucloud.com:7088/register -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <meta name="description" content="LC云盘">
 <meta name="author" content="xiaohe">
<title>LC云盘</title>
<link rel="shortcut icon" href="https://www.fangcloud.com/favicon.ico" type="image/x-icon">
<link href="../Resources/file/bootstrap.min.css" rel="stylesheet">
<link href="../Resources/file/style.css" rel="stylesheet">
<link href="../Resources/file/sticky-footer-navbar.css" rel="stylesheet">
<link href="../Resources/file/register.css" rel="stylesheet">
 </head>
 <body>
<div id="wrap">
  <!-- Fixed navbar -->
  <div class="navbar navbar-fixed-top">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
            <a id="logo_48_196" href=".." title="Lc云盘"><img src="../Resources/images/lc_meitu_1.png"/></a>
      </div>
      <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav ">
        </ul>
      </div><!--/.nav-collapse -->
    </div>
  </div>

      <!-- Begin page content -->
<div class="container">
  
 <form action="../register" method="POST"  class="form-horizontal form-register" role="form">
      <div class="form-group">  
        <!--[if lte IE 9]> <label>邮箱</label><![endif]-->    
        <input class="form-control" type="text" name="email" value="" id="email" placeholder="邮箱" required="">
    
        <span class="help-block" id="email_error"></span>
    </div>
    <div class="form-group">    
        <!--[if lte IE 9]> <label>昵称</label><![endif]-->    
         <input class="form-control" type="text" name="nickname" id="nickname" value="" placeholder="昵称" required="">
    
         <span class="help-block" id="nickname_error"></span>
    </div>
    <div class="form-group">
        <!--[if lte IE 9]> <label>密码</label><![endif]-->    
        <input class="form-control" type="password" name="password" id="password" value="" placeholder="密码" required="">
        <span class="help-block" id="password_error"></span>
    </div>
    <div class="form-group">
        <!--[if lte IE 9]> <label>确认密码</label><![endif]-->    
        <input class="form-control" type="password" name="password_confirm" value="" id="password_confirm" placeholder="确认密码" required="">
        <span class="help-block" id="confirm_error"></span>
        <span class="help-block" id="password_confirm_error"></span>
    </div>
    <div class="form-group">
        <input type="submit" value="注册" class="btn btn-primary btn-block" id="is_disable">
    </div>
    <div class="form-group">
        已经有账号？点击<a href="http://localhost:8080/cloud_disk">登录</a>
    </div>
 
  </form>
  
</div>
</div>
<div id="footer">

  <div class="container">
    <p class="text-muted credit text-center">软件工程 LC云盘oss开发小组 copyright ©2016<br>
    <a href="..">联系我们</a>‎‎‎
        <!--
    <script type="text/javascript">var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");document.write(unescape("%3Cspan id='cnzz_stat_icon_1000075329'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s22.cnzz.com/z_stat.php%3Fid%3D1000075329%26show%3Dpic' type='text/javascript'%3E%3C/script%3E"));</script>
    -->
    </p>
  </div>

</div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
   <!-- <script src="/static/js/jquery.js"></script>
    <script src="/static/bootstrap/js/bootstrap.min.js"></script>
-->
    <script src="../Resources/file/jquery.js"></script>
    <script src="../Resources/file/bootstrap.min.js"></script>
    
    
  <script type="text/javascript">
       //console.log("ok");
  var ele = { //存放各个input字段obj
    email: document.getElementById("email"),
    nickname: document.getElementById("nickname"),
    password: document.getElementById("password"),
    password_confirm: document.getElementById("password_confirm")
  };
  ele.email.onmouseout = function(){ //name失去焦点则检测
    checkEmail (ele.email.value);
  }
  ele.nickname.onmouseout = function(){ //nickname失去焦点则检测
	    checkNickname(ele.nickname.value);
	  }
  ele.password.onblur = function(){ //password失去焦点则检测
    checkPassw(ele.password.value,ele.password_confirm.value);
  }
  ele.password_confirm.onmouseout = function(){ //password_confirm失去焦点则检测
    checkPassw(ele.password.value,ele.password_confirm.value);
  }


function checkNickname(name){  //验证name
   if(name != ""){ //不为空则正确
	   $("#nickname_error").css('display','none');
	   $("#is_disable").removeAttr("disabled");    
   return true;
   }else{ //name不符合
	   $("#nickname_error").css('display','block');
       $("#nickname_error").html('昵称不能为空！').css("color","red");
       $("#is_disable").attr("disabled","true");  
        return false;
   }
 }
 function checkPassw(passw1,passw2){ //验证密码
	 console.log(passw1,passw2);
   if(passw1 == "" || passw2 == "" || passw1 != passw2){ //两次密码输入不为空且不等 不符合
      $("#confirm_error").css('display','block');
      $("#confirm_error").html("两次输入的密码不一致").css("color","red");
       $("#is_disable").attr("disabled","true");  
     return false;
   }else{  //密码输入正确
	   $("#confirm_error").css('display','none',"background-color","red");
	   $("#is_disable").removeAttr("disabled"); 
   return true;
    
   }
 }
 function checkEmail(email){  //验证邮箱
   var pattern = /^([\.a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\.[a-zA-Z0-9_-])+/; 
   if(!pattern.test(email)){ //email格式不正确
	  
       $("#email_error").css('display','block');
       $("#email_error").html('请填写正确的邮箱').css("color","red");
        $("#is_disable").attr("disabled","true"); 
          return false;
   }else{ //格式正确
	   $("#email_error").css('display','none');
	   $("#is_disable").removeAttr("disabled");       
   return true;
   }
 }
 </script>
</body></html>