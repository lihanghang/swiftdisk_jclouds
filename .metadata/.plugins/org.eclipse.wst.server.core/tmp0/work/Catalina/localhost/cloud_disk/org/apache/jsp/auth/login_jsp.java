/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2016-07-02 03:52:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.auth;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"applicable-device\" content=\"pc,mobile\">\n");
      out.write("    <title>登录-LC云盘</title>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"https://www.fangcloud.com/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./Resources/css/sprites_25cd3ba.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./Resources/css/base_4ec9ee6.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./Resources/css/auth_901307e.css\">\n");
      out.write("<script charset=\"utf-8\" src=\"./Resources/js/v.js\"></script>\n");
      out.write("<script type=\"text/javascript\" async=\"\" src=\"./Resources/js/vds.js\"></script>\n");
      out.write("<script src=\"./Resources/js/hm.js\"></script></head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"center-logo\">\n");
      out.write("        <a href=\"localhost\" title=\"LC云盘\">\n");
      out.write("                    <img src=\"./Resources/images/login/logo.png\" alt=\"LC云盘\" >\n");
      out.write("                </a>\n");
      out.write("    </div>\n");
      out.write("<div class=\"login-box\">\n");
      out.write("    <form action=\"./Login\" method=\"post\" accept-charset=\"utf-8\" class=\"form\"><div style=\"display:none\">\n");
      out.write("<input type=\"hidden\" name=\"requesttoken\" value=\"d7ec7d84ab13031e51899bbc754567c2\">\n");
      out.write("</div>        <div class=\"error-msg\"></div>\n");
      out.write("        <ul class=\"input-box\">\n");
      out.write("            <li class=\"email\">\n");
      out.write("                <label for=\"email\"><i class=\"icon icon-login-user\"></i></label>\n");
      out.write("                <input type=\"text\" id=\"email\" name=\"email\"class=\"input\" value=\"\" placeholder=\"请输入邮箱\">\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <label for=\"password\"><i class=\"icon icon-login-pswd\"></i></label>\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" class=\"input\" placeholder=\"输入密码\">\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <div class=\"login-other\">\n");
      out.write("            <div class=\"remember-login\">\n");
      out.write("               <!--<i class=\"icon icon-checkbox\"></i><label>记住我</label>-->\n");
      out.write("                <input type=\"hidden\" name=\"remember_login\" id=\"remember_login\" value=\"0\" autocomplete=\"off\">\n");
      out.write("            </div>\n");
      out.write("           <span>还没有账户吗？点击<a href=\"auth/register.jsp\" class=\"register\">注册</a></span> \n");
      out.write("        </div>\n");
      out.write("        <button class=\"pure-button button-primary\" id=\"login_btn\">登 录</button>\n");
      out.write("        <input type=\"hidden\" name=\"login\" value=\"1\">\n");
      out.write("    </form></div>\n");
      out.write("<div class=\"footer\">\n");
      out.write("    2016 LC云盘@<a href=\"\">oss开发小组-6</a>\n");
      out.write("</div>\n");
      out.write("<input type=\"hidden\" value=\"d7ec7d84ab13031e51899bbc754567c2\" id=\"oc_requesttoken\">\n");
      out.write("<input type=\"hidden\" value=\"https://static.fangcloud.com/assets/dist/\" id=\"asset_url\">\n");
      out.write("<input type=\"hidden\" value=\"LC云盘\" id=\"enterprise_default\">\n");
      out.write("<input type=\"hidden\" value=\"\" id=\"enterprise_type\">\n");
      out.write("<input type=\"hidden\" value=\"\" id=\"referrer_url\">\n");
      out.write("<input type=\"hidden\" value=\"https://www.fangcloud.com/\" id=\"base_url\">\n");
      out.write("    <script src=\"./Resources/js/sea.js\"></script>\n");
      out.write("    <script src=\"./Resources/js/seajs-config_2f1056e.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"./Resources/js/bw-loader-411.4.5.js\"></script>\n");
      out.write("    <script src=\"./Resources/file/jquery.js\"></script>\n");
      out.write("    <script src=\"./Resources/file/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"./Resources/js/bw-send-411.4.5.js\"></script>\n");
      out.write("<script type=\"text/javascript\" >\n");
      out.write("\n");
      out.write("  var ele = { //存放各个input字段obj\n");
      out.write("    email: document.getElementById(\"email\"),  \n");
      out.write("    password: document.getElementById(\"password\"),\n");
      out.write("  };\n");
      out.write("  console.log(ele.email.value);\n");
      out.write("  ele.email.onmouseout = function(){ //name失去焦点则检测\n");
      out.write("    checkEmail (ele.email.value);\n");
      out.write("  }\n");
      out.write("  ele.password.onmouseout = function(){   //password失去焦点则检测\n");
      out.write("    checkPassw(ele.password.value);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("\n");
      out.write(" function checkPassw(passw1){ //验证密码\n");
      out.write("\t// console.log(passw1);\n");
      out.write("   if(passw1 == \"\"){ //密码输入不为空且不等 不符合\n");
      out.write("\t   $(\"#ilogin_btn\").attr(\"disabled\",\"true\"); \n");
      out.write("     return false;\n");
      out.write("   }else{  //密码输入正确\n");
      out.write("\t\n");
      out.write("\t   $(\"#login_btn\").removeAttr(\"disabled\"); \n");
      out.write("   return true;\n");
      out.write("    \n");
      out.write("   }\n");
      out.write(" }\n");
      out.write("   function checkEmail(email){  //验证邮箱\n");
      out.write("\t   var pattern = /^([\\.a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\\.[a-zA-Z0-9_-])+/; \n");
      out.write("\t   if(!pattern.test(email)){ //email格式不正确\t      \n");
      out.write("\t        $(\"#login_btn\").attr(\"disabled\",\"true\"); \n");
      out.write("\t          return false;\n");
      out.write("\t   }else{ //格式正确\n");
      out.write("\t\t\t   $(\"#login_btn\").removeAttr(\"disabled\");       \n");
      out.write("\t   return true;\n");
      out.write("\t   }\n");
      out.write("\t }\n");
      out.write(" \n");
      out.write("   </script>\n");
      out.write("\n");
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