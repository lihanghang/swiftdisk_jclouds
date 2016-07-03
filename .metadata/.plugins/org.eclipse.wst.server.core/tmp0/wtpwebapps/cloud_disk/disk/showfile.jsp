<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page	import="org.jclouds.openstack.swift.v1.options.ListContainerOptions"%>
<%@page import="org.jclouds.openstack.swift.v1.domain.SwiftObject"%>
<%@page import="org.jclouds.openstack.swift.v1.domain.ObjectList"%>
<%@page import="org.jclouds.openstack.swift.v1.features.ObjectApi"%>
<%@page import="org.jclouds.openstack.swift.v1.domain.Container"%>
<%@page import="com.google.common.collect.FluentIterable"%>
<%@page import="org.jclouds.openstack.swift.v1.SwiftApi"%>
<%@page import = "com.swift.dao.swift_util" %>
<%@page import = "java.text.DecimalFormat"%>
<%@page import = " java.util.Set" %>
<%@page import = "org.jclouds.openstack.swift.v1.features.ContainerApi" %>
 <%@page import= "java.text.SimpleDateFormat"%>
 <%@page import ="java.util.Date"%>

<%
	if ( session.getAttribute("username")==null ) {
	 	response.sendRedirect("../auth/islogi.jsp");
		 
	}
%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="LC 云盘">
<meta name="author" content="lee">
<title>LC云盘</title>
<link rel="shortcut icon" href="https://www.fangcloud.com/favicon.ico" type="image/x-icon">
<link href="../Resources/file/bootstrap.min.css" rel="stylesheet">
<link href="../Resources/file/style.css" rel="stylesheet">
<link href="../Resources/file/sticky-footer-navbar.css" rel="stylesheet">
<link href="../Resources/file/filestyle.css" rel="stylesheet">
<link href="../Resources/file/uploadfile.css" rel="stylesheet">
<link href="../Resources/file/jquery.contextMenu.css" rel="stylesheet">
<link href="../Resources/file/MimeTypeIcon.css" rel="stylesheet">
<%
	
	Set<String> regions = swift_util.getSwift().getConfiguredRegions();
	ContainerApi containerAPI = swift_util.getSwift().getContainerApi(regions.iterator().next());
%>

    


  </head>

  <body class="">
    

    <!-- Wrap all page content here -->
<div id="wrap">

    

     <div class="navbar navbar-fixed-top">
      <div class="container" style="background-color:#ffffff">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        	<a id="logo_48_196" href=#" title="Lc云盘"><img src="../Resources/images/lc_meitu_1.png"/></a>
      </div>
       <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav pull-right">
        <li class="dropdown">
          <a id="drop4" role="button" data-toggle="dropdown" href="http://localhost:8080/cloud_disk/disk/storage.jsp#"><%=session.getAttribute("username")%><b class="caret"></b></a>
          <ul id="menu1" class="dropdown-menu" role="menu" aria-labelledby="drop4">
            <li role="presentation"><a role="menuitem" tabindex="-1" href="http://localhost:8080/cloud_disk/disk/storage.jsp#">个人信息</a></li>
            <li role="presentation" class="divider"></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="../Login_Out">退出</a></li>
          </ul>
        </li>
        </ul>
      </div>
      </div>
      </div>
<div class="fileheader-fiexed-top">
    <div id="overallcontrol" class="container"> 
    <div class="span8">
        <div id="filelevel">
<!--文件导航 -->
             <a class="btn btn-default btn-sm" href="../disk/storage.jsp">返回目录</a>
             <% String current_path = (String) session.getAttribute("path"); %>
		     <input type="hidden" id="current_path" value=<%=current_path %>>
		     <a class="btn btn-default btn-sm" href="#"><%=current_path %></a>  
        </div>
        <div id="uploadcontrol" class="pull-right">

            <button class="btn btn-primary" data-toggle="modal" data-target="#newFolderModal">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                新建文件夹
            </button>
            <button class="btn btn-success" data-toggle="modal" data-target="#uploadModal">
                <span class="glyphicon glyphicon-cloud-upload" aria-hidden="true"></span>
                                     上 传 </button>
        </div>
     </div>
    </div>

</div>
<!-- Modal -->
<div class="modal fade" id="uploadModal" tabindex="-1" role="dialog" aria-labelledby="uploadModalLabel" aria-hidden="true" style="display: none;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h4 class="modal-title" id="uploadModalLabel">上传文件(对象)</h4>
      </div>
      <div class="modal-body">


<div class="ajax-upload-dragdrop" style="vertical-align: top; border: 2px dotted rgb(165, 165, 50);">
<!-- 上传文件对象弹窗 -->
<form action="../UploadFile?current_path=<%=current_path%>" method="POST" enctype="multipart/form-data">
			<div class="setup_info">
				<div class="setup_info2" id="setup_inf,go2_pic" >
					<div class="file_input">
						<input type="file" id="file" class="fileonload" name="input_obj">
					</div>
				</div>
				<div  style=" text-align:center" >
					<input class="ajax-file-upload" style=" text-align:center  cursor: default;" type="submit"value="上传">
				</div>
			</div>
		</form>
</div><div></div>

       

      </div>
      <div class="modal-footer">
        <a type="button" class="btn btn-default" data-dismiss="modal">取消</a>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<div class="modal fade" id="downloadModal" tabindex="-1" role="dialog" aria-labelledby="downloadModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h4 class="modal-title" id="downloadModalLabel">下载文件</h4>
      </div>
      <div class="modal-body">
          <form action="http://storage.thucloud.com:7088/download_file" method="get" id="download_window">
              <input type="hidden" id="downloadfilename" name="file_name">
              <input type="hidden" name="current_dir" value="">
              <input type="submit" class="btn btn-primary btn-large" value="下载">
          </form>
      </div>
      <div class="modal-footer">
        <a type="button" class="btn btn-default" data-dismiss="modal">取消</a>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

    <div class="modal fade" id="newFolderModal" tabindex="-1" role="dialog" aria-labelledby="newFolderModalLabel" aria-hidden="true" style="display: none;">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h4 class="modal-title" id="newFolderModalLabel">新建文件夹</h4>
      </div>
      <div class="modal-body">
          <form action="../CreateDirFile" method="POST">
              <input type="hidden" name="current_dir" value="">
              <input type="text"  placeholder="请输入文件夹名"  name="new_folder">
              <input type="submit" class="btn btn-primary btn-large" value="创建">
          </form>
      </div>
      <div class="modal-footer">
        <a type="button" class="btn btn-default" data-dismiss="modal">取消</a>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

    <div class="modal fade" id="shareModal" tabindex="-1" role="dialog" aria-labelledby="shareModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h4 class="modal-title" id="shareModalLabel">删除</h4>
      </div>
      <div class="modal-body">
          <input type="text" name="clipboard-text" id="clipboard-text" value="its me!" style="width:300px">
          <button class="btn btn-sm btn-success" id="target-to-copy" data-clipboard-target="clipboard-text">复制链接</button>
      </div>
      <div class="modal-footer">
        <a type="button" class="btn btn-default" data-dismiss="modal">取消</a>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->


      <!-- Begin page content -->
<div class="container">
  
<div id="filelist" class="container">

    <table class="table table-hover" id="filetable">

        <thead>
          <tr>
            <th class="listfilename"></th>         
            <th class="listfilename"><a href="">文件名</a></th>
            <th class="allcontrol"><span id="operateonfiles">文件操作</span></th>
            <th class="listsize"><a href="#">大小</a></th>
            <th class="listdate"><a href="#">修改日期</a></th>
          </tr>
        </thead>

    <tbody id="filebody">
      <%
         
		   List<? extends SwiftObject> objs = (List)session.getAttribute("objs");
      
              if(objs.isEmpty()==true){
                 
            	  
              }
		   		for(int i = 0 ; i< objs.size(); i++){
		   %> 
            <tr class="fileinfo">
        
                <td class="listcheckbox"></td>
                <td class="listfilename">
                <div class="image-icon icon" style="float:left"></div>
                <div style="float:left" class="filename-wrapper">
         
                      <span class="file-name"> <%=objs.get(i).getName()%></span>		
                </div>
                </td>
               
                <td class="file_control">
                <a  onclick="return window.confirm('确定要删除此文件？')" href="../DeleteObject?fileName=<%=objs.get(i).getName() %>" >删除</a>
                
                <a href="../DownLoadFile?objectName=<%=objs.get(i).getName() %>" >下载</a>
                 </td>
               
               
             
               
                <td class="listsize">
                
              </td>
                <td class="listdate"><%

                Date date = new Date();//这里date的值就是你这个值20 Dec 2012 10am哈，你改下就行了
                date = objs.get(i).getLastModified();
        	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        	    String dates  = sdf.format(date);
                
              out.print(dates);
                
                
                
                
                %></td>
            </tr>
            	
						<%
							}
						%>
        </tbody>
        
        	
        
        
    </table>
</div>


</div>
</div>
<div id="footer">

  <div class="container">
    <p class="text-muted credit text-center">软件工程    LC云盘oss开发小组 copyright ©2016<br>
    <a href="..">联系我们</a>‎‎‎
    </p>
  </div>
</div>
    <script src="../Resources/file/jquery.js"></script>
    <script src="../Resources/file/bootstrap.min.js"></script>
   <script src="../Resources/file/jquery.js"></script>
    <script src="../Resources/file/jquery.uploadfile.min.js"></script>
    <script type="text/javascript" src="../Resources/file/base64.js"></script>
    <script src="../Resources/file/ZeroClipboard.js"></script>
    <script src="../Resources/file/main.js"></script>
    <div id="global-zeroclipboard-html-bridge" class="global-zeroclipboard-container" style="position: absolute; left: 0px; top: -9999px; width: 1px; height: 1px; z-index: 999999999;">
    <object id="global-zeroclipboard-flash-bridge" name="global-zeroclipboard-flash-bridge" width="100%" height="100%" type="application/x-shockwave-flash" data="http://storage.thucloud.com:7088/static/clipborad/ZeroClipboard.swf?noCache=1466682961897"><param name="allowScriptAccess" value="sameDomain"><param name="allowNetworking" value="all"><param name="menu" value="false"><param name="wmode" value="transparent"><param name="flashvars" value="trustedOrigins=storage.thucloud.com%3A7088%2C%2F%2Fstorage.thucloud.com%3A7088%2Chttp%3A%2F%2Fstorage.thucloud.com%3A7088&amp;swfObjectId=global-zeroclipboard-flash-bridge&amp;jsVersion=2.2.0"><div id="global-zeroclipboard-flash-bridge_fallbackContent">&nbsp;</div></object></div>
</body></html>