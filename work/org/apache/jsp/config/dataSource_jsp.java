package org.apache.jsp.config;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dataSource_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>数据源配置</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".fm_lab{text-align: right;padding:10px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t <div id=\"toolbar\">\r\n");
      out.write("\t\t<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\" onclick=\"crud.add()\">添加数据源</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<table id=\"dg\"></table>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"dlg\" class=\"easyui-dialog\" style=\"width:500px;padding:10px 20px\"\r\n");
      out.write("\t\t\tclosed=\"true\" modal=\"true\" buttons=\"#dlg-buttons\" doSize=\"true\">\r\n");
      out.write("\t\t<form id=\"fm\" method=\"post\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"fm_lab\">名称(Alias):</td><td><input name=\"name\" class=\"easyui-validatebox\" required=\"true\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr><td class=\"fm_lab\">驱动(Driver):</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select class=\"easyui-combobox\" name=\"driverClass\" required=\"true\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"com.mysql.jdbc.Driver\" selected>com.mysql.jdbc.Driver</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"net.sourceforge.jtds.jdbc.Driver\">net.sourceforge.jtds.jdbc.Driver</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"fm_lab\">连接(Url):</td><td><input name=\"jdbcUrl\" class=\"easyui-validatebox\" style=\"width: 300px;\" required=\"true\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"fm_lab\">用户名(Username):</td><td><input name=\"username\" class=\"easyui-validatebox\" required=\"true\"></td>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"fm_lab\">密码(Password):</td><td><input name=\"password\" class=\"easyui-validatebox\" required=\"true\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"dlg-buttons\">\r\n");
      out.write("\t\t<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" onclick=\"crud.save(); return false;\">保存</a>\r\n");
      out.write("\t\t<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\" onclick=\"crud.closeDlg(); return false;\">取消</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../easyui_lib.jsp", out, false);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var that = this;\r\n");
      out.write("var crud = Crud.create({\r\n");
      out.write("\tpk:'dcId'\r\n");
      out.write("\t,listUrl:ctx + 'listDataSource.do'\r\n");
      out.write("\t,addUrl:ctx + 'addDataSource.do'\r\n");
      out.write("\t,updateUrl:ctx + 'updateDataSource.do'\r\n");
      out.write("\t,delUrl:ctx + 'delDataSource.do'\r\n");
      out.write("\t,dlgId:'dlg'\r\n");
      out.write("\t,formId:'fm'\r\n");
      out.write("\t,gridId:'dg'\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("crud.buildGrid([\r\n");
      out.write("\t{field:'name',title:'名称'}  \r\n");
      out.write("\t,{field:'driverClass',title:'驱动'}\r\n");
      out.write("\t,{field:'jdbcUrl',title:'连接'}\r\n");
      out.write("\t,{field:'_account',title:'账号/密码',formatter:accountFormater}    \r\n");
      out.write("\t,{field:'_oper',title:'操作',formatter:formatOper}     \r\n");
      out.write("]);\r\n");
      out.write("\r\n");
      out.write("function formatOper(val,row,index){\r\n");
      out.write("\treturn '<a href=\"#\" onclick=\"'+FunUtil.createFun(that,'testConnection',row)+'\">连接测试</a>'+\r\n");
      out.write("\t\t' | <a href=\"#\" onclick=\"'+FunUtil.createFun(crud,'update',row)+'\">修改</a>'+\r\n");
      out.write("\t\t' | <a href=\"#\" onclick=\"'+FunUtil.createFun(crud,'del',row)+'\">删除</a>';\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function accountFormater(val,row,index){\r\n");
      out.write("\treturn row.username + \"/\" + row.password;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function testConnection(row){\r\n");
      out.write("\tMaskUtil.mask('测试连接中...');\r\n");
      out.write("\t\r\n");
      out.write("\tAction.jsonAsyncActByData(ctx + 'connectionTest.do',row,function(e){\r\n");
      out.write("\t\tMaskUtil.unmask();\r\n");
      out.write("\t\tif(e.success){\r\n");
      out.write("\t\t\tMsgUtil.alert('连接成功');\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tMsgUtil.error(e.errorMsg);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
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
