package org.apache.jsp.generator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class generator_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/generator/../taglib.jsp");
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
      // /generator/../taglib.jsp(2,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("easyui");
      // /generator/../taglib.jsp(2,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
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
      // /generator/../taglib.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("ctx");
      // /generator/../taglib.jsp(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
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
      out.write("<title>文件生成</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.step{margin-bottom: 20px;padding:5px;border-bottom: 2px solid #95b8e7;}\r\n");
      out.write("\t.codeArea{font-size:13px;border: dotted #ccc 1px;padding: 3px;font-family: 宋体,Consolas,sans-serif ;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"stepMsg\" class=\"step\">第一步,选择数据源</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"step1\">\r\n");
      out.write("\t<table id=\"gdDataSource\" title=\"数据源列表\" class=\"easyui-datagrid\"\r\n");
      out.write("\t\t\turl=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("listDataSource.do\"\r\n");
      out.write("\t\t\ttoolbar=\"#toolbar\" pagination=\"true\"\r\n");
      out.write("\t\t\trownumbers=\"false\" fitColumns=\"true\" singleSelect=\"true\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'name',align:'center'\">名称</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'jdbcUrl',align:'center'\">连接</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'_operate',align:'center',align:'center',formatter:formatOper\">操作</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"step2\" style=\"display: none;width: 600px;\">\r\n");
      out.write("\t<fieldset style=\"border: 1px solid #ccc;font-size: 12px;\">\r\n");
      out.write("\t    <legend>输入包名</legend>\r\n");
      out.write("\t    package: <input id=\"packageName\" type=\"text\" style=\"width:260px; \"/> (不填则表名作为包名)\r\n");
      out.write("\t</fieldset>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<table id=\"dgTable\"></table>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-forward\" onclick=\"goStep3(); return false;\">下一步</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"step3\" style=\"display: none;\">\r\n");
      out.write("\t<div id=\"templateTb\">\r\n");
      out.write("\t\t模板名:&nbsp;<input id=\"tempSch\" class=\"easyui-textbox\" type=\"text\"></input>\r\n");
      out.write("\t\t<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" onclick=\"searchTemplate(); return false;\">搜索</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<table id=\"dgTemplate\"></table>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" onclick=\"finish(); return false;\">生成</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"win\"\r\n");
      out.write("\tclass=\"easyui-window\" \r\n");
      out.write("\ttitle=\"代码生成结果\" \r\n");
      out.write("\tstyle=\"width:800px;height:450px;padding:5px;\"   \r\n");
      out.write("    data-options=\"modal:true,closed:true,minimizable:false,collapsible:false\">   \r\n");
      out.write("\t    \r\n");
      out.write("\t<div class=\"easyui-layout\" data-options=\"fit:true\">\r\n");
      out.write("\t\t<div data-options=\"region:'west',split:true\" style=\"width:150px\">\r\n");
      out.write("\t\t\t<div id=\"tree\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-options=\"region:'center'\" style=\"padding:10px;\">\r\n");
      out.write("\t\t\t<a id=\"copyCode\" href=\"javascript:void(0)\" style=\"cursor:default;display: none;\">复制代码</a>\r\n");
      out.write("\t\t\t<div id=\"codeContent\" class=\"codeArea\">点击树菜单查看代码</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-options=\"region:'south',border:false\" style=\"text-align:right;padding:5px 0 0;\">\r\n");
      out.write("\t\t\t<a class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-ok'\" href=\"javascript:void(0)\" onclick=\"$('#win').window('close');\">确定</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>  \r\n");
      out.write("\r\n");
      out.write("<div id=\"viewWin\"\r\n");
      out.write("\tclass=\"easyui-window\" \r\n");
      out.write("\ttitle=\"模板内容\" \r\n");
      out.write("\tstyle=\"width:800px;height:450px;padding:5px;\"   \r\n");
      out.write("    data-options=\"modal:true,maximizable:true,closed:true,minimizable:false\">   \r\n");
      out.write("\t    \r\n");
      out.write("\t<div class=\"easyui-layout\" data-options=\"fit:true\">\r\n");
      out.write("\t\t<div data-options=\"region:'center'\" style=\"padding:10px;\">\r\n");
      out.write("\t\t\t<div id=\"viewCode\" class=\"codeArea\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-options=\"region:'south',border:false\" style=\"text-align:right;padding:5px 0 0;\">\r\n");
      out.write("\t\t\t<a class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-ok'\" href=\"javascript:void(0)\" onclick=\"$('#viewWin').window('close');\">确定</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../easyui_lib.jsp", out, false);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("js/jquery.zclip/jquery.zclip.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var that = this;\r\n");
      out.write("// 请求参数\r\n");
      out.write("var GeneratorParam = {\r\n");
      out.write("\tdcId:0\r\n");
      out.write("\t,tableNames:[]\r\n");
      out.write("\t,tcIds:[]\r\n");
      out.write("\t,packageName:''\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function formatOper(val,row,index){\r\n");
      out.write("\treturn '<a href=\"javascript:void(0)\" onclick=\"'+FunUtil.createFun(that,'selectDataSource',row)+'\">选择</a>';\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 选择数据源\r\n");
      out.write("function selectDataSource(row){\r\n");
      out.write("\t\r\n");
      out.write("\tMaskUtil.mask();\r\n");
      out.write("\t\r\n");
      out.write("\ttestConnection(row,function(row){\r\n");
      out.write("\t\tMaskUtil.unmask();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tGeneratorParam.dcId = row.dcId;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tshowStep2(function(){\r\n");
      out.write("\t\t\t$('#dgTable').datagrid({    \r\n");
      out.write("\t\t\t\ttitle:'数据源['+row.jdbcUrl+']',\r\n");
      out.write("\t\t\t    url:ctx + 'listTable.do?dcId='+row.dcId,\r\n");
      out.write("\t\t\t    columns:[[    \r\n");
      out.write("\t\t\t        {field:'ck',title:'',checkbox:true}  \r\n");
      out.write("\t\t\t        ,{field:'tableName',title:'表名'}  \r\n");
      out.write("\t\t\t    ]]\r\n");
      out.write("\t\t\t    ,width:500\r\n");
      out.write("\t\t\t    ,height:500\r\n");
      out.write("\t\t\t    ,striped:true\r\n");
      out.write("\t\t\t    ,checkOnSelect:true\r\n");
      out.write("\t\t\t    ,onLoadSuccess:function(e){\r\n");
      out.write("\t\t\t    \tif(e.errorMsg){\r\n");
      out.write("\t\t\t\t\t\tMsgUtil.error(e.errorMsg);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 显示第二步\r\n");
      out.write("function showStep2(callback){\r\n");
      out.write("\t$('#step1').hide(500,callback);\r\n");
      out.write("\t$('#stepMsg').html('第二步,选择表');\r\n");
      out.write("\t$('#step2').show(500);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 显示第三步\r\n");
      out.write("function showStep3(callback){\r\n");
      out.write("\t$('#step2').hide(500,callback);\r\n");
      out.write("\t$('#stepMsg').html('第三步,选择模板');\r\n");
      out.write("\t$('#step3').show(500);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 转向第三步\r\n");
      out.write("function goStep3(){\r\n");
      out.write("\t\r\n");
      out.write("\tvar packageName = $.trim($('#packageName').val());\r\n");
      out.write("\tif(!validatePackage(packageName)){\r\n");
      out.write("\t\tMsgUtil.topMsg('包名不正确');\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tvar rows = $('#dgTable').datagrid('getSelections');\r\n");
      out.write("\tif(!validateTableSelect(rows)){\r\n");
      out.write("\t\tMsgUtil.topMsg('请选择表');\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tGeneratorParam.packageName = packageName;\r\n");
      out.write("\tGeneratorParam.tableNames = [];\r\n");
      out.write("\t\r\n");
      out.write("\tfor(var i=0,len=rows.length;i<len;i++){\r\n");
      out.write("\t\tGeneratorParam.tableNames.push(rows[i].tableName);\r\n");
      out.write("\t}\r\n");
      out.write("\tshowStep3(listTemplate);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function validateTableSelect(rows){\r\n");
      out.write("\treturn rows && rows.length > 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var regexPackage = /^([a-zA-Z_$]{1}[\\w$]*)(\\.[a-zA-Z_$]{1}[\\w$]*)*$/;\r\n");
      out.write("function validatePackage(packageName){\r\n");
      out.write("\tif(packageName == ''){\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\treturn regexPackage.test(packageName);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 查询模板\r\n");
      out.write("function listTemplate(){\r\n");
      out.write("\t$('#dgTemplate').datagrid({    \r\n");
      out.write("\t\ttitle:'模板列表',\r\n");
      out.write("\t    url:ctx + 'listUserTepmlate.do',\r\n");
      out.write("\t    toolbar: '#templateTb',\r\n");
      out.write("\t    columns:[[    \r\n");
      out.write("\t        {field:'ck',title:'',checkbox:true}  \r\n");
      out.write("\t        ,{field:'name',title:'模板名'}  \r\n");
      out.write("\t        ,{field:'content',title:'内容',formatter: function(value,row,index){\r\n");
      out.write("\t        \t\treturn '<a href=\"javascript:void(0)\" onclick=\"'+FunUtil.createFun(that,'showContent',row)+'\">查看</a>';\r\n");
      out.write("\t        \t}\r\n");
      out.write("\t\t\t}  \r\n");
      out.write("\t    ]]\r\n");
      out.write("\t    ,pagination:true\r\n");
      out.write("\t    ,width:500\r\n");
      out.write("\t    ,striped:true\r\n");
      out.write("\t    ,checkOnSelect:true\r\n");
      out.write("\t    ,onLoadSuccess:function(e){\r\n");
      out.write("\t    \tif(e.errorMsg){\r\n");
      out.write("\t\t\t\tMsgUtil.error(e.errorMsg);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t    }\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function searchTemplate(){\r\n");
      out.write("\tvar value = $('#tempSch').val();\r\n");
      out.write("\t$('#dgTemplate').datagrid('load',{\r\n");
      out.write("\t\tnameSch: value\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 展示内容\r\n");
      out.write("function showContent(row){\r\n");
      out.write("\t$('#viewCode').html(HtmlUtil.parseToHtml(row.content));\r\n");
      out.write("\t$('#viewWin').window('open');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 完成\r\n");
      out.write("function finish(){\r\n");
      out.write("\treset();\r\n");
      out.write("\tvar rows = $('#dgTemplate').datagrid('getSelections');\r\n");
      out.write("\t\r\n");
      out.write("\tif(rows && rows.length > 0){\r\n");
      out.write("\t\tGeneratorParam.tcIds = [];\r\n");
      out.write("\t\tfor(var i=0,len=rows.length;i<len;i++){\r\n");
      out.write("\t\t\tGeneratorParam.tcIds.push(rows[i].tcId);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tgenerate();\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tMsgUtil.topMsg('请选择模板');\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function reset(){\r\n");
      out.write("\t$(\"#copyCode\").hide();\r\n");
      out.write("\t$('#codeContent').html('点击树菜单查看代码');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 生成代码\r\n");
      out.write("function generate(){\r\n");
      out.write("\tMaskUtil.mask('代码生成中,请稍后...');\r\n");
      out.write("\tAction.jsonAsyncActByData(ctx + 'generatFile.do',GeneratorParam,function(rows){\r\n");
      out.write("\t\tMaskUtil.unmask();\r\n");
      out.write("\t\tif(rows){\r\n");
      out.write("\t\t\tshowGeneratCode(rows);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tMsgUtil.error(e.errorMsg);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 显示结果\r\n");
      out.write("function showGeneratCode(rows){\r\n");
      out.write("\tvar treeData = buildTreeData(rows);\r\n");
      out.write("\t$('#tree').tree({\r\n");
      out.write("\t\tdata:treeData\r\n");
      out.write("\t\t// 点击树节点显示代码\r\n");
      out.write("\t\t,onClick: function(node){\r\n");
      out.write("\t\t\tvar attributes = node.attributes;\r\n");
      out.write("\t\t\tif(attributes){\r\n");
      out.write("\t\t\t\t$(\"#copyCode\").show();\r\n");
      out.write("\t\t\t\t$('#codeContent').html(attributes.content);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(!bindCopyEvent.binded){\r\n");
      out.write("\t\t\t\t\tbindCopyEvent();\r\n");
      out.write("\t\t\t\t\tbindCopyEvent.binded = true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$('#win').window('open');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 绑定复制代码事件\r\n");
      out.write("function bindCopyEvent(){\r\n");
      out.write("\t$('#copyCode').show().zclip({ \r\n");
      out.write("\t\tpath:ctx + 'js/jquery.zclip/ZeroClipboard.swf', \r\n");
      out.write("\t\tcopy:function(){\r\n");
      out.write("\t\t\treturn HtmlUtil.parseToText($('#codeContent').html());\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tafterCopy:function(){ \r\n");
      out.write("\t\t\tMsgUtil.topMsg('复制成功');\r\n");
      out.write("\t\t} \r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 构建树菜单数据\r\n");
      out.write("function buildTreeData(rows){\r\n");
      out.write("\tvar treeData = [];\r\n");
      out.write("\tvar codeMap = {};\r\n");
      out.write("\t// 把列表数据转换到map中,key为表名\r\n");
      out.write("\t// value是个List\r\n");
      out.write("\tfor(var i=0,len=rows.length;i<len;i++){\r\n");
      out.write(" \t\tvar row = rows[i];\r\n");
      out.write(" \t\tvar list = codeMap[row.tableName];\r\n");
      out.write(" \t\tif(!list){\r\n");
      out.write(" \t\t\tlist = [];\r\n");
      out.write("\t \t\tcodeMap[row.tableName] = list;\r\n");
      out.write(" \t\t}\r\n");
      out.write(" \t\t\r\n");
      out.write(" \t\tlist.push({templateName:row.templateName,content:row.content});\r\n");
      out.write("\t}\r\n");
      out.write("\t// 把这个map对象转成tree格式数据\r\n");
      out.write("\tfor(var tableName in codeMap){\r\n");
      out.write("\t\tvar codeFileArr = codeMap[tableName];\r\n");
      out.write("\t\tvar treeElement = {\r\n");
      out.write("\t\t\ttext:tableName\r\n");
      out.write("\t\t\t//,state:'closed' // 默认关闭\r\n");
      out.write("\t\t\t,children:buildChildren(codeFileArr)\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\r\n");
      out.write("\t\ttreeData.push(treeElement);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\treturn treeData;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function buildChildren(codeFileArr){\r\n");
      out.write("\tvar children = [];\r\n");
      out.write("\tfor(var i=0,len=codeFileArr.length;i<len;i++){\r\n");
      out.write("\t\tvar codeFile = codeFileArr[i];\r\n");
      out.write("\t\tvar child = {\r\n");
      out.write("\t\t\ttext:codeFile.templateName\r\n");
      out.write("\t\t\t,attributes:{\r\n");
      out.write("\t\t\t\tcontent:HtmlUtil.parseToHtml(codeFile.content)\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tchildren.push(child);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\treturn children;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function testConnection(row,callback){\r\n");
      out.write("\tAction.jsonAsyncActByData(ctx + 'connectionTest.do',row,function(e){\r\n");
      out.write("\t\tif(e.success){\r\n");
      out.write("\t\t\tcallback(row);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tMsgUtil.error(e.errorMsg);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t})\r\n");
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
