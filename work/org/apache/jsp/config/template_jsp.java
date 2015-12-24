package org.apache.jsp.config;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/config/../taglib.jsp");
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
      // /config/../taglib.jsp(2,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("easyui");
      // /config/../taglib.jsp(2,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
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
      // /config/../taglib.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("ctx");
      // /config/../taglib.jsp(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
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
      out.write("<title>模板配置</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.fitem{margin: 4px;}\r\n");
      out.write("\t.fitem input{width:200px;}\r\n");
      out.write("\t.codeArea{\r\n");
      out.write("\t\tfont-size:13px;\r\n");
      out.write("\t\tborder: dotted #ccc 1px;\r\n");
      out.write("\t\tpadding: 3px;\r\n");
      out.write("\t\tfont-family: 宋体,Consolas,sans-serif;\r\n");
      out.write("\t}\r\n");
      out.write("\t.codeText{\r\n");
      out.write("\t\twidth: 100%;font-size:13px;font-family: 宋体,Consolas,sans-serif;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <div id=\"toolbar\">\r\n");
      out.write("\t\t<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\" onclick=\"add()\">添加模板</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<table id=\"dg\" title=\"模板列表\" class=\"easyui-datagrid\"\r\n");
      out.write("\t\t\tstyle=\"width:500px;\"\r\n");
      out.write("\t\t\turl=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("listTemplate.do\"\r\n");
      out.write("\t\t\ttoolbar=\"#toolbar\" pagination=\"true\" striped=\"true\"\r\n");
      out.write("\t\t\trownumbers=\"false\" fitColumns=\"true\" singleSelect=\"true\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'name',align:'center'\">模板名</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'content',align:'center',formatter:formatContent\">内容</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'_operate',align:'center',formatter:formatOper\">操作</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t</table>\r\n");
      out.write("<br>\r\n");
      out.write("\t<div id=\"dlg\" class=\"easyui-window\" \r\n");
      out.write("\t\tstyle=\"width:1000px;height:600px;padding:10px 20px\"\r\n");
      out.write("\t\tdata-options=\"modal:true,closed:true,minimizable:false,collapsible:false\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"easyui-layout\" data-options=\"fit:true\">\r\n");
      out.write("\t\t\t<div data-options=\"region:'center'\" style=\"padding:10px;\">\r\n");
      out.write("\t\t\t\t<form id=\"fm\" method=\"post\" novalidate>\r\n");
      out.write("\t\t\t\t\t<div class=\"fitem\">\r\n");
      out.write("\t\t\t\t\t\t<label>模板名:</label><br>\r\n");
      out.write("\t\t\t\t\t\t<input name=\"name\" class=\"easyui-validatebox\" required=\"true\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<hr style=\"border-bottom: dotted 1px gray;border-top: 0px;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"fitem\">\r\n");
      out.write("\t\t\t\t\t\t<label>内容:</label><br>\r\n");
      out.write("\t\t\t\t\t\t<textarea class=\"codeText\" name=\"content\" rows=\"22\" required=\"true\"></textarea>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div data-options=\"region:'south',border:false\" style=\"text-align:right;padding:5px 0 0;\">\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" onclick=\"crud.save(); return false;\">保存</a>\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\" onclick=\"crud.closeDlg(); return false;\">取消</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("<div id=\"viewWin\"\r\n");
      out.write("\tclass=\"easyui-window\" \r\n");
      out.write("\ttitle=\"模板内容\" \r\n");
      out.write("\tstyle=\"width:800px;height:450px;padding:5px;\"   \r\n");
      out.write("    data-options=\"closed:true,minimizable:false,collapsible:false\">   \r\n");
      out.write("\t    \r\n");
      out.write("\t<div class=\"easyui-layout\" data-options=\"fit:true\">\r\n");
      out.write("\t\t<div data-options=\"region:'center'\" style=\"padding:10px;\">\r\n");
      out.write("\t\t\t<div id=\"viewCode\" class=\"codeArea\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-options=\"region:'south',border:false\" style=\"text-align:right;padding:5px 0 0;\">\r\n");
      out.write("\t\t\t<a class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-ok'\" href=\"javascript:void(0)\" onclick=\"$('#viewWin').window('close');\">确定</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div> \r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../easyui_lib.jsp", out, false);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function showEg(){\r\n");
      out.write("\t$('#eg').show(500);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var url;\r\n");
      out.write("var that = this;\r\n");
      out.write("var crud = Crud.create({\r\n");
      out.write("\tpk:'tcId'\r\n");
      out.write("\t,addUrl:ctx + 'addTemplate.do'\r\n");
      out.write("\t,updateUrl:ctx + 'updateTemplate.do'\r\n");
      out.write("\t,delUrl:ctx + 'delTemplate.do'\r\n");
      out.write("\t,dlgId:'dlg'\r\n");
      out.write("\t,formId:'fm'\r\n");
      out.write("\t,gridId:'dg'\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function add(){\r\n");
      out.write("\tcrud.add('添加模板');\r\n");
      out.write("\t//$('#dlg').panel('maximize');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function formatOper(val,row,index){\r\n");
      out.write("\treturn '<a href=\"#\" onclick=\"'+FunUtil.createFun(crud,'update',row)+'\">修改</a>'+\r\n");
      out.write("\t\t' | <a href=\"#\" onclick=\"'+FunUtil.createFun(crud,'del',row)+'\">删除</a>';\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function formatContent(val,row){\r\n");
      out.write("\treturn '<a href=\"#\" onclick=\"'+FunUtil.createFun(that,'showContent',row)+'\">查看</a>';\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 展示内容\r\n");
      out.write("function showContent(row){\r\n");
      out.write("\t$('#viewCode').html(HtmlUtil.parseToHtml(row.content));\r\n");
      out.write("\t$('#viewWin').window('open');\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-- 保持session -->\r\n");
      out.write("<iframe src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("keepSession.jsp\" frameborder=\"0\" height=\"0\" width=\"0\" style=\"height: 0px;width: 0px;\"></iframe>\r\n");
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
