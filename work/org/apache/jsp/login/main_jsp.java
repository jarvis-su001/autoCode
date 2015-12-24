package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/login/../taglib.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /login/../taglib.jsp(2,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("easyui");
      // /login/../taglib.jsp(2,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/easyui/" );
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write('\r');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f1.setParent(null);
      // /login/../taglib.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("ctx");
      // /login/../taglib.jsp(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setValue(request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" );
      int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
      if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>代码生成系统</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../easyui_lib.jsp", out, false);
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<body id=\"mainLayout\" class=\"easyui-layout\">\r\n");
      out.write("\t<div data-options=\"region:'north',border:false\" style=\"height:30px;padding:5px;\">\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/header.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'west',split:true,title:'菜单'\" style=\"width:150px;padding:10px;\">\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/menu.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'east',split:false,collapsed:true,title:'Velocity参数列表'\" style=\"width:360px;\">\r\n");
      out.write("\t\t<div id=\"vcPg\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'center'\">\r\n");
      out.write("\t\t<div id=\"mainTab\" class=\"easyui-tabs\" data-options=\"fit:true,border:false\">\r\n");
      out.write("\t\t\t<div title=\"首页\" style=\"padding:10px\">\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "welcome.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- \t<div data-options=\"region:'south',border:false\" style=\"height:25px;\"> -->\r\n");
      out.write("\r\n");
      out.write("<!-- \t</div> -->\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"tabsMenu\" class=\"easyui-menu\" style=\"width:120px;\">\r\n");
      out.write("\t  <div name=\"Refresh\">刷新</div>  \r\n");
      out.write("\t  <div name=\"Other\">关闭其他</div>  \r\n");
      out.write("\t  <div name=\"All\">关闭所有</div>\r\n");
      out.write("\t</div>  \r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\tVelocityContext.createGrid('vcPg');\r\n");
      out.write("})\r\n");
      out.write("//绑定tabs的右键菜单\r\n");
      out.write("$(\"#mainTab\").tabs({\r\n");
      out.write("    onContextMenu : function (e, title) {\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("        $('#tabsMenu').menu('show', {\r\n");
      out.write("            left : e.pageX,\r\n");
      out.write("            top : e.pageY\r\n");
      out.write("        }).data(\"tabTitle\", title);\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\t//实例化menu的onClick事件\r\n");
      out.write("$(\"#tabsMenu\").menu({\r\n");
      out.write("    onClick : function (item) {\r\n");
      out.write("        closeTab(this, item.name);\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\t//几个关闭事件的实现\r\n");
      out.write("function closeTab(menu, type) {\r\n");
      out.write("    var curTabTitle = $(menu).data(\"tabTitle\");\r\n");
      out.write("    var tabs = $(\"#mainTab\");\r\n");
      out.write("    \r\n");
      out.write("    if (type === \"close\") {\r\n");
      out.write("        tabs.tabs(\"close\", curTabTitle);\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("    if (type === \"Refresh\") {\r\n");
      out.write("    \tvar currTab =  tabs.tabs('getSelected'); //获得当前tab\r\n");
      out.write("        var url = $(currTab.panel('options').content).attr('src');\r\n");
      out.write("    \tif(url){\r\n");
      out.write("   \t\t  tabs.tabs('update', {\r\n");
      out.write("   \t        \ttab : currTab,\r\n");
      out.write("   \t\t\t\toptions : {\r\n");
      out.write("   \t            \tcontent : '<iframe src=\"'+ url+'\" scrolling=\"yes\" frameborder=\"0\" style=\"width:100%;height:100%;\"></iframe>'\r\n");
      out.write("   \t            }\r\n");
      out.write("   \t\t\t});\r\n");
      out.write("    \t}\r\n");
      out.write("\t\treturn;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    var allTabs = tabs.tabs(\"tabs\");\r\n");
      out.write("    var closeTabsTitle = [];\r\n");
      out.write("    \r\n");
      out.write("    $.each(allTabs, function () {\r\n");
      out.write("        var opt = $(this).panel(\"options\");\r\n");
      out.write("        if (opt.closable && opt.title != curTabTitle && type === \"Other\") {\r\n");
      out.write("            closeTabsTitle.push(opt.title);\r\n");
      out.write("        } else if (opt.closable && type === \"All\") {\r\n");
      out.write("            closeTabsTitle.push(opt.title);\r\n");
      out.write("        } \r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    for (var i = 0; i < closeTabsTitle.length; i++) {\r\n");
      out.write("        tabs.tabs(\"close\", closeTabsTitle[i]);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
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
