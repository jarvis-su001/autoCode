package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>用户登录</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "easyui_lib.jsp", out, false);
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".login_msg {\r\n");
      out.write("color:red;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"win\" class=\"easyui-window\" \r\n");
      out.write("\tstyle=\"width:350px;height:230px;\"\r\n");
      out.write("\ttitle=\"用户登录\" \r\n");
      out.write("\tcollapsible=\"false\" minimizable=\"false\" maximizable=\"false\" \r\n");
      out.write("\tclosable=\"false\" draggable=\"false\">\r\n");
      out.write("\t\r\n");
      out.write("\t<form id=\"fm\" style=\"padding:10px 20px 10px 40px;\" onkeypress=\"keyPress(event)\">\r\n");
      out.write("\t\t<p id=\"msg\" class=\"login_msg\">&nbsp;</p>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr><td>用户名: </td><td><input name=\"username\" type=\"text\" class=\"easyui-validatebox\" required=\"true\"></td></tr>\r\n");
      out.write("\t\t\t<tr><td>密    码: </td><td><input name=\"password\" type=\"password\" class=\"easyui-validatebox\" required=\"true\"></td></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<div style=\"padding:5px;\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:void(0)\" onclick=\"login();\" class=\"easyui-linkbutton\" icon=\"icon-ok\">登录</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</td></tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var $msg = $('#msg');\r\n");
      out.write("\r\n");
      out.write("function login(){\r\n");
      out.write("\t\r\n");
      out.write("\t$('#fm').form('submit',{\r\n");
      out.write("\t\turl: ctx + 'login.do',\r\n");
      out.write("\t\tonSubmit: function(){\r\n");
      out.write("\t\t\treturn $(this).form('validate');\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tsuccess: function(resultTxt){\r\n");
      out.write("\t\t\tvar result = $.parseJSON(resultTxt);\r\n");
      out.write("\t\t\tif (result.success){\r\n");
      out.write("\t\t\t\twindow.location = ctx + 'login/main.jsp';\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tvar errorMsg = result.errorMsg;\r\n");
      out.write("\t\t\t\t$msg.html(errorMsg);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function keyPress(event){\r\n");
      out.write("\tif(event.keyCode == 13){\r\n");
      out.write("\t\tlogin();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 自动登录\r\n");
      out.write("// $('#fm').form('load',{username:'admin',password:'admin'});\r\n");
      out.write("// login();\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
