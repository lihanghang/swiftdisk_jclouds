/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2016-07-03 08:34:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.disk;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import org.jclouds.openstack.swift.v1.options.ListContainerOptions;
import org.jclouds.openstack.swift.v1.domain.SwiftObject;
import org.jclouds.openstack.swift.v1.domain.ObjectList;
import org.jclouds.openstack.swift.v1.features.ObjectApi;
import org.jclouds.openstack.swift.v1.domain.Container;
import com.google.common.collect.FluentIterable;
import org.jclouds.openstack.swift.v1.SwiftApi;
import com.swift.dao.swift_util;
import java.text.DecimalFormat;
import java.util.Set;
import org.jclouds.openstack.swift.v1.features.ContainerApi;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class showfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("org.jclouds.openstack.swift.v1.features.ObjectApi");
    _jspx_imports_classes.add("java.text.DecimalFormat");
    _jspx_imports_classes.add("java.util.Set");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("org.jclouds.openstack.swift.v1.domain.ObjectList");
    _jspx_imports_classes.add("org.jclouds.openstack.swift.v1.SwiftApi");
    _jspx_imports_classes.add("org.jclouds.openstack.swift.v1.domain.SwiftObject");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.google.common.collect.FluentIterable");
    _jspx_imports_classes.add("org.jclouds.openstack.swift.v1.options.ListContainerOptions");
    _jspx_imports_classes.add("com.swift.dao.swift_util");
    _jspx_imports_classes.add("org.jclouds.openstack.swift.v1.domain.Container");
    _jspx_imports_classes.add("org.jclouds.openstack.swift.v1.features.ContainerApi");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");

	if ( session.getAttribute("username")==null ) {
	 	response.sendRedirect("../auth/islogi.jsp");
		 
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"description\" content=\"LC 云盘\">\r\n");
      out.write("<meta name=\"author\" content=\"lee\">\r\n");
      out.write("<title>LC云盘</title>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"https://www.fangcloud.com/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("<link href=\"../Resources/file/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../Resources/file/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../Resources/file/sticky-footer-navbar.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../Resources/file/filestyle.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../Resources/file/uploadfile.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../Resources/file/jquery.contextMenu.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../Resources/file/MimeTypeIcon.css\" rel=\"stylesheet\">\r\n");

	
	Set<String> regions = swift_util.getSwift().getConfiguredRegions();
	ContainerApi containerAPI = swift_util.getSwift().getContainerApi(regions.iterator().next());

      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body class=\"\">\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- Wrap all page content here -->\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("     <div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("      <div class=\"container\" style=\"background-color:#ffffff\">\r\n");
      out.write("      <div class=\"navbar-header\">\r\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("          <span class=\"icon-bar\"></span>\r\n");
      out.write("          <span class=\"icon-bar\"></span>\r\n");
      out.write("          <span class=\"icon-bar\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        \t<a id=\"logo_48_196\" href=#\" title=\"Lc云盘\"><img src=\"../Resources/images/lc_meitu_1.png\"/></a>\r\n");
      out.write("      </div>\r\n");
      out.write("       <div class=\"collapse navbar-collapse\">\r\n");
      out.write("        <ul class=\"nav navbar-nav pull-right\">\r\n");
      out.write("        <li class=\"dropdown\">\r\n");
      out.write("          <a id=\"drop4\" role=\"button\" data-toggle=\"dropdown\" href=\"http://localhost:8080/cloud_disk/disk/storage.jsp#\">");
      out.print(session.getAttribute("username"));
      out.write("<b class=\"caret\"></b></a>\r\n");
      out.write("          <ul id=\"menu1\" class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"drop4\">\r\n");
      out.write("            <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"http://localhost:8080/cloud_disk/disk/storage.jsp#\">个人信息</a></li>\r\n");
      out.write("            <li role=\"presentation\" class=\"divider\"></li>\r\n");
      out.write("            <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"../Login_Out\">退出</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("<div class=\"fileheader-fiexed-top\">\r\n");
      out.write("    <div id=\"overallcontrol\" class=\"container\"> \r\n");
      out.write("    <div class=\"span8\">\r\n");
      out.write("        <div id=\"filelevel\">\r\n");
      out.write("<!--文件导航 -->\r\n");
      out.write("             <a class=\"btn btn-default btn-sm\" href=\"../disk/storage.jsp\">返回目录</a>\r\n");
      out.write("             ");
 String current_path = (String) session.getAttribute("path"); 
      out.write("\r\n");
      out.write("\t\t     <input type=\"hidden\" id=\"current_path\" value=");
      out.print(current_path );
      out.write(">\r\n");
      out.write("\t\t     <a class=\"btn btn-default btn-sm\" href=\"#\">");
      out.print(current_path );
      out.write("</a>  \r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"uploadcontrol\" class=\"pull-right\">\r\n");
      out.write("\r\n");
      out.write("            <button class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#newFolderModal\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\"></span>\r\n");
      out.write("                新建文件夹\r\n");
      out.write("            </button>\r\n");
      out.write("            <button class=\"btn btn-success\" data-toggle=\"modal\" data-target=\"#uploadModal\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-cloud-upload\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                     上 传 </button>\r\n");
      out.write("        </div>\r\n");
      out.write("     </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"uploadModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"uploadModalLabel\" aria-hidden=\"true\" style=\"display: none;\">\r\n");
      out.write("  <div class=\"modal-dialog\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\r\n");
      out.write("        <h4 class=\"modal-title\" id=\"uploadModalLabel\">上传文件(对象)</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"ajax-upload-dragdrop\" style=\"vertical-align: top; border: 2px dotted rgb(165, 165, 50);\">\r\n");
      out.write("<!-- 上传文件对象弹窗 -->\r\n");
      out.write("<form action=\"../UploadFile?current_path=");
      out.print(current_path);
      out.write("\" method=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t<div class=\"setup_info\">\r\n");
      out.write("\t\t\t\t<div class=\"setup_info2\" id=\"setup_inf,go2_pic\" >\r\n");
      out.write("\t\t\t\t\t<div class=\"file_input\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"file\" id=\"file\" class=\"fileonload\" name=\"input_obj\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div  style=\" text-align:center\" >\r\n");
      out.write("\t\t\t\t\t<input class=\"ajax-file-upload\" style=\" text-align:center  cursor: default;\" type=\"submit\"value=\"上传\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("</div><div></div>\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <a type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div><!-- /.modal-content -->\r\n");
      out.write("  </div><!-- /.modal-dialog -->\r\n");
      out.write("</div><!-- /.modal -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"downloadModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"downloadModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\r\n");
      out.write("        <h4 class=\"modal-title\" id=\"downloadModalLabel\">下载文件</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("          <form action=\"http://storage.thucloud.com:7088/download_file\" method=\"get\" id=\"download_window\">\r\n");
      out.write("              <input type=\"hidden\" id=\"downloadfilename\" name=\"file_name\">\r\n");
      out.write("              <input type=\"hidden\" name=\"current_dir\" value=\"\">\r\n");
      out.write("              <input type=\"submit\" class=\"btn btn-primary btn-large\" value=\"下载\">\r\n");
      out.write("          </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <a type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div><!-- /.modal-content -->\r\n");
      out.write("  </div><!-- /.modal-dialog -->\r\n");
      out.write("</div><!-- /.modal -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"modal fade\" id=\"newFolderModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"newFolderModalLabel\" aria-hidden=\"true\" style=\"display: none;\">\r\n");
      out.write("  <div class=\"modal-dialog\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\r\n");
      out.write("        <h4 class=\"modal-title\" id=\"newFolderModalLabel\">新建文件夹</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("          <form action=\"../CreateDirFile\" method=\"POST\">\r\n");
      out.write("              <input type=\"hidden\" name=\"current_dir\" value=\"\">\r\n");
      out.write("              <input type=\"text\"  placeholder=\"请输入文件夹名\"  name=\"new_folder\">\r\n");
      out.write("              <input type=\"submit\" class=\"btn btn-primary btn-large\" value=\"创建\">\r\n");
      out.write("          </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <a type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div><!-- /.modal-content -->\r\n");
      out.write("  </div><!-- /.modal-dialog -->\r\n");
      out.write("</div><!-- /.modal -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"modal fade\" id=\"shareModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"shareModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\r\n");
      out.write("        <h4 class=\"modal-title\" id=\"shareModalLabel\">删除</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("          <input type=\"text\" name=\"clipboard-text\" id=\"clipboard-text\" value=\"its me!\" style=\"width:300px\">\r\n");
      out.write("          <button class=\"btn btn-sm btn-success\" id=\"target-to-copy\" data-clipboard-target=\"clipboard-text\">复制链接</button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <a type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div><!-- /.modal-content -->\r\n");
      out.write("  </div><!-- /.modal-dialog -->\r\n");
      out.write("</div><!-- /.modal -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!-- Begin page content -->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  \r\n");
      out.write("<div id=\"filelist\" class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <table class=\"table table-hover\" id=\"filetable\">\r\n");
      out.write("\r\n");
      out.write("        <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th class=\"listfilename\"></th>         \r\n");
      out.write("            <th class=\"listfilename\"><a href=\"\">文件名</a></th>\r\n");
      out.write("            <th class=\"allcontrol\"><span id=\"operateonfiles\">文件操作</span></th>\r\n");
      out.write("            <th class=\"listsize\"><a href=\"#\">大小</a></th>\r\n");
      out.write("            <th class=\"listdate\"><a href=\"#\">修改日期</a></th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("\r\n");
      out.write("    <tbody id=\"filebody\">\r\n");
      out.write("      ");

         
		   List<? extends SwiftObject> objs = (List)session.getAttribute("objs");
      
              if(objs.isEmpty()==true){
                 
            	  
              }
		   		for(int i = 0 ; i< objs.size(); i++){
		   
      out.write(" \r\n");
      out.write("            <tr class=\"fileinfo\">\r\n");
      out.write("        \r\n");
      out.write("                <td class=\"listcheckbox\"></td>\r\n");
      out.write("                <td class=\"listfilename\">\r\n");
      out.write("                <div class=\"image-icon icon\" style=\"float:left\"></div>\r\n");
      out.write("                <div style=\"float:left\" class=\"filename-wrapper\">\r\n");
      out.write("         \r\n");
      out.write("                      <span class=\"file-name\"> ");
      out.print(objs.get(i).getName());
      out.write("</span>\t\t\r\n");
      out.write("                </div>\r\n");
      out.write("                </td>\r\n");
      out.write("               \r\n");
      out.write("                <td class=\"file_control\">\r\n");
      out.write("                <a  onclick=\"return window.confirm('确定要删除此文件？')\" href=\"../DeleteObject?fileName=");
      out.print(objs.get(i).getName() );
      out.write("\" >删除</a>\r\n");
      out.write("                \r\n");
      out.write("                <a href=\"../DownLoadFile?objectName=");
      out.print(objs.get(i).getName() );
      out.write("\" >下载</a>\r\n");
      out.write("                 </td>\r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("             \r\n");
      out.write("               \r\n");
      out.write("                <td class=\"listsize\">\r\n");
      out.write("                \r\n");
      out.write("              </td>\r\n");
      out.write("                <td class=\"listdate\">");


                Date date = new Date();//这里date的值就是你这个值20 Dec 2012 10am哈，你改下就行了
                date = objs.get(i).getLastModified();
        	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        	    String dates  = sdf.format(date);
                
              out.print(dates);
                
                
                
                
                
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \t\r\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("        \r\n");
      out.write("        \t\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <p class=\"text-muted credit text-center\">软件工程    LC云盘oss开发小组 copyright ©2016<br>\r\n");
      out.write("    <a href=\"..\">联系我们</a>‎‎‎\r\n");
      out.write("    </p>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("    <script src=\"../Resources/file/jquery.js\"></script>\r\n");
      out.write("    <script src=\"../Resources/file/bootstrap.min.js\"></script>\r\n");
      out.write("   <script src=\"../Resources/file/jquery.js\"></script>\r\n");
      out.write("    <script src=\"../Resources/file/jquery.uploadfile.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../Resources/file/base64.js\"></script>\r\n");
      out.write("    <script src=\"../Resources/file/ZeroClipboard.js\"></script>\r\n");
      out.write("    <script src=\"../Resources/file/main.js\"></script>\r\n");
      out.write("    <div id=\"global-zeroclipboard-html-bridge\" class=\"global-zeroclipboard-container\" style=\"position: absolute; left: 0px; top: -9999px; width: 1px; height: 1px; z-index: 999999999;\">\r\n");
      out.write("    <object id=\"global-zeroclipboard-flash-bridge\" name=\"global-zeroclipboard-flash-bridge\" width=\"100%\" height=\"100%\" type=\"application/x-shockwave-flash\" data=\"http://storage.thucloud.com:7088/static/clipborad/ZeroClipboard.swf?noCache=1466682961897\"><param name=\"allowScriptAccess\" value=\"sameDomain\"><param name=\"allowNetworking\" value=\"all\"><param name=\"menu\" value=\"false\"><param name=\"wmode\" value=\"transparent\"><param name=\"flashvars\" value=\"trustedOrigins=storage.thucloud.com%3A7088%2C%2F%2Fstorage.thucloud.com%3A7088%2Chttp%3A%2F%2Fstorage.thucloud.com%3A7088&amp;swfObjectId=global-zeroclipboard-flash-bridge&amp;jsVersion=2.2.0\"><div id=\"global-zeroclipboard-flash-bridge_fallbackContent\">&nbsp;</div></object></div>\r\n");
      out.write("</body></html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
