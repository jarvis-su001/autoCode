package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>首页</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<p style=\"font-size:14px\">欢迎使用代码生成系统</p>\r\n");
      out.write("如果您首次使用本系统，请按以下步骤操作：\r\n");
      out.write("<ol>\r\n");
      out.write("\t<li>配置数据源。模板的生成需要依赖数据库表</li>\r\n");
      out.write("\t<li>配置模板。基于Velocity模板引擎，<a href=\"javascript:void(0)\" onclick=\"showVelocity(); return false;\">点此查看</a>Velocity参数列表</li>\r\n");
      out.write("\t<li>生成代码。只需三步即可生成代码文件</li>\r\n");
      out.write("</ol>\r\n");
      out.write("\r\n");
      out.write("示例:\r\n");
      out.write("<div class=\"easyui-tabs\" style=\"width:800px;height:400px;\">\r\n");
      out.write("<div title=\"模板内容\" style=\"padding:5px\">\r\n");
      out.write("<pre>\r\n");
      out.write("package &#36;{context.packageName}.entity;\r\n");
      out.write("\r\n");
      out.write("import org.durcframework.entity.BaseEntity;\r\n");
      out.write("\r\n");
      out.write("public class &#36;{context.javaBeanName} extends BaseEntity {\r\n");
      out.write("## 此处用foreach循环构建java类中的属性\r\n");
      out.write("#foreach(&#36;column in &#36;columns) \r\n");
      out.write("    private &#36;{column.javaType} &#36;{column.javaFieldName};\r\n");
      out.write("#end\r\n");
      out.write("\r\n");
      out.write("## 此处用foreach循环构建属性的get/set方法\r\n");
      out.write("#foreach(&#36;{column} in &#36;{columns}) \r\n");
      out.write("    public void set&#36;{column.javaFieldNameUF}(&#36;{column.javaType} &#36;{column.javaFieldName}){\r\n");
      out.write("        this.&#36;{column.javaFieldName} = &#36;{column.javaFieldName};\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    public &#36;{column.javaType} get&#36;{column.javaFieldNameUF}(){\r\n");
      out.write("        return this.&#36;{column.javaFieldName};\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("#end\r\n");
      out.write("}\r\n");
      out.write("</pre>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"生成后的代码\" style=\"padding:5px\">\r\n");
      out.write("<pre>\r\n");
      out.write("package datasourceconfig.entity;\r\n");
      out.write("\r\n");
      out.write("import org.durcframework.entity.BaseEntity;\r\n");
      out.write("\r\n");
      out.write("publc class DatasourceConfig extends BaseEntity {\r\n");
      out.write("    private int dcId;\r\n");
      out.write("    private String name;\r\n");
      out.write("    private String driverClass;\r\n");
      out.write("    private String jdbcUrl;\r\n");
      out.write("    private String username;\r\n");
      out.write("    private String password;\r\n");
      out.write("    private String backUser;\r\n");
      out.write("\r\n");
      out.write("    public void setDcId(int dcId){\r\n");
      out.write("        this.dcId = dcId;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    public int getDcId(){\r\n");
      out.write("        return this.dcId;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    public void setName(String name){\r\n");
      out.write("        this.name = name;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    public String getName(){\r\n");
      out.write("        return this.name;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    public void setDriverClass(String driverClass){\r\n");
      out.write("        this.driverClass = driverClass;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    public String getDriverClass(){\r\n");
      out.write("        return this.driverClass;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    public void setJdbcUrl(String jdbcUrl){\r\n");
      out.write("        this.jdbcUrl = jdbcUrl;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    public String getJdbcUrl(){\r\n");
      out.write("        return this.jdbcUrl;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    public void setUsername(String username){\r\n");
      out.write("        this.username = username;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    public String getUsername(){\r\n");
      out.write("        return this.username;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    public void setPassword(String password){\r\n");
      out.write("        this.password = password;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    public String getPassword(){\r\n");
      out.write("        return this.password;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    public void setBackUser(String backUser){\r\n");
      out.write("        this.backUser = backUser;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    public String getBackUser(){\r\n");
      out.write("        return this.backUser;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</pre>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("js/VelocityContext.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function showVelocity(){\r\n");
      out.write("\t$('#mainLayout').layout('expand','east');\r\n");
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
