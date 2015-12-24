package org.apache.jsp.login.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.durcframework.autocode.common.AutoCodeContext;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div id=\"menu\"></div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("(function(){\r\n");
      out.write("\tvar treeData = [\r\n");
      out.write("\t    {\r\n");
      out.write("\t\t    text : \"生成代码\",\r\n");
      out.write("\t\t    attributes : {\r\n");
      out.write("\t            url : \"generator/generator.jsp\"\r\n");
      out.write("\t        }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t    ,{\r\n");
      out.write("\t\t    text : \"配置数据源\",\r\n");
      out.write("\t\t    attributes : {\r\n");
      out.write("\t            url : \"config/dataSource.jsp\"\r\n");
      out.write("\t        }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t    ,{\r\n");
      out.write("\t\t    text : \"配置模板\",\r\n");
      out.write("\t\t    attributes : {\r\n");
      out.write("\t            url : \"config/template.jsp\"\r\n");
      out.write("\t        }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t    ");
if(AutoCodeContext.getInstance().isAdmin()){
      out.write("\r\n");
      out.write("\t    ,{\r\n");
      out.write("\t\t    text : \"用户管理\",\r\n");
      out.write("\t\t    attributes : {\r\n");
      out.write("\t            url : \"config/backUser.jsp\"\r\n");
      out.write("\t        }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t    ");
}
      out.write("\r\n");
      out.write("\t    \r\n");
      out.write("\t];\r\n");
      out.write("\t$(\"#menu\").tree({\r\n");
      out.write("\t    data : treeData,\r\n");
      out.write("\t    lines : true,\r\n");
      out.write("\t    onClick : function (node) {\r\n");
      out.write("\t        if (node.attributes) {\r\n");
      out.write("\t        \topenTab(node.text, node.attributes.url);\r\n");
      out.write("\t        }\r\n");
      out.write("\t    }\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t//在右边center区域打开菜单，新增tab\r\n");
      out.write("\tfunction openTab(text, url) {\r\n");
      out.write("\t    if ($(\"#mainTab\").tabs('exists', text)) {\r\n");
      out.write("\t        $('#mainTab').tabs('select', text);\r\n");
      out.write("\t    } else {\r\n");
      out.write("\t        $('#mainTab').tabs('add', {\r\n");
      out.write("\t            title : text,\r\n");
      out.write("\t            closable : true,\r\n");
      out.write("\t           // href : ctx + url\r\n");
      out.write("\t            content : '<iframe src=\"'+ ctx + url+'\" scrolling=\"yes\" frameborder=\"0\" style=\"width:100%;height:100%;\"></iframe>'\r\n");
      out.write("\t        });\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("})();\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
