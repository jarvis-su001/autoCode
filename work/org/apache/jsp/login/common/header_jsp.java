package org.apache.jsp.login.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.durcframework.autocode.common.AutoCodeContext;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<span style=\"float: right; padding-right: 10px;\">\r\n");
      out.write("欢迎,");
      out.print(AutoCodeContext.getInstance().getUser().getUsername());
      out.write(" | <a href=\"javascript:void(0)\" onclick=\"logout(); return false;\">安全退出</a>\r\n");
      out.write("</span>\r\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function logout(){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\ttype: \"POST\",\r\n");
      out.write("\t    url: ctx + 'logout.do',\r\n");
      out.write("\t  \tdataType:'json',\r\n");
      out.write("\t    success: function(result){\r\n");
      out.write("\t\t\tif (result.success){\r\n");
      out.write("\t\t\t\tvar win = window.parent || window;\r\n");
      out.write("\t\t\t\twin.location.reload();\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t},\r\n");
      out.write("\t\terror:function(){\r\n");
      out.write("\t\t\twindow.location.reload();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<span style=\"padding-left: 5px; font-size: 16px;\">\r\n");
      out.write("<!-- \t\t<img src=\"images/blocks.gif\" width=\"20\" height=\"20\" align=\"absmiddle\" /> -->\r\n");
      out.write("代码生成系统\r\n");
      out.write("</span>\r\n");
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
