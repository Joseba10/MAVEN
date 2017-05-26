package org.apache.jsp.WEB_002dINF.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productoform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:toUpperCase", org.apache.taglibs.standard.functions.Functions.class, "toUpperCase", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/vistas/includes/productocabecera.jsp");
    _jspx_dependants.add("/WEB-INF/vistas/includes/productopie.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\r\n");
      out.write("\th1,p{\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("*{\r\n");
      out.write("margin: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header h1{\r\n");
      out.write("\r\n");
      out.write("border:solid 2px;\r\n");
      out.write("background-color: yellow;\r\n");
      out.write("}\t\r\n");
      out.write("\r\n");
      out.write("nav ul li a:hover{\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("color:blue;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav ul li:hover{\r\n");
      out.write("\r\n");
      out.write("background-color: yellow;}\r\n");
      out.write("\r\n");
      out.write("nav ul li a{\r\n");
      out.write("\r\n");
      out.write("color:red;\r\n");
      out.write("font-weight: bold;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav ul li{\r\n");
      out.write("margin-left: 50px;\r\n");
      out.write("width:200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("nav ul {\r\n");
      out.write("\r\n");
      out.write("margin-top: 30px;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos.css\">\r\n");
      out.write("\t<title>Ejemplo MVC</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<h1>Tienda Virtual</h1><br>\r\n");
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li><a href=\"productocrud?op=alta\">Alta</a></li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<li><a href=\"usuariocrud\">Mantenimiento usuarios</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write(" \t\r\n");
      out.write(" \t\r\n");
      out.write(" \t\r\n");
      out.write(" \t\r\n");
      com.ipartek.TIPOS.Producto producto = null;
      synchronized (request) {
        producto = (com.ipartek.TIPOS.Producto) _jspx_page_context.getAttribute("producto", PageContext.REQUEST_SCOPE);
        if (producto == null){
          producto = new com.ipartek.TIPOS.Producto();
          _jspx_page_context.setAttribute("producto", producto, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("<style>\r\n");
      out.write(" \t\r\n");
      out.write("ul{\r\n");
      out.write("\r\n");
      out.write("margin-left: 370px;\r\n");
      out.write("margin-top: 0px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li{\r\n");
      out.write("background-color: #EFEFEF;\r\n");
      out.write("width:100px;\r\n");
      out.write("border:solid #EFEFEF;\r\n");
      out.write("-webkit-border-radius: 19px;\r\n");
      out.write("-moz-border-radius: 19px;\r\n");
      out.write("border-radius: 19px;\r\n");
      out.write("color:blue;\r\n");
      out.write("text-align:center;\r\n");
      out.write("display: inline-block;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a:hover {\r\n");
      out.write("\tcolor:red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a{\r\n");
      out.write("text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("fieldset{\r\n");
      out.write("\r\n");
      out.write("border: none;}\r\n");
      out.write("\r\n");
      out.write("form{\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("margin-left: 560px;\r\n");
      out.write("margin-top: 50px;}\r\n");
      out.write("\r\n");
      out.write(".errores{\r\n");
      out.write("\r\n");
      out.write("margin-top:20px;\r\n");
      out.write("width: 200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input:FOCUS{\r\n");
      out.write("\r\n");
      out.write("padding:10px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("input:hover{\r\n");
      out.write("\r\n");
      out.write("font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<form action=\"productoform\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("<ul>\r\n");
      out.write(" \t\r\n");
      out.write(" \t\t\r\n");
      out.write(" \t</ul>\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<label for=\"id\">Id</label> \r\n");
      out.write("\t\t\t<input id=\"id\" name=\"id\" required=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${producto.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write(">\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("<fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<label for=\"nombre\">Nombre</label>\r\n");
      out.write("\t\t\t<input id=\"nombre\" name=\"nombre\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${producto.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<label for=\"descripcion\">Descripcion</label>\r\n");
      out.write("\t\t\t<input id=\"descripcion\" name=\"descripcion\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${producto.descripcion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<label for=\"precio\">Precio</label>\r\n");
      out.write("\t\t\t<input id=\"precio\" name=\"precio\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${producto.precio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<label for=\"imagen\">Imagen</label>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<select name=\"imagen\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<option value=\"0\">Manzana</option> \r\n");
      out.write("\t\t\t<option value=\"1\">Tomate</option> \r\n");
      out.write("\t\t\t<option value=\"2\">Patata</option> \r\n");
      out.write("\t\t\t<option value=\"3\">Mandarina</option> \r\n");
      out.write("\t\t\t<option value=\"4\">Naranja</option> \r\n");
      out.write("\t\t\t<option value=\"5\">Pera</option> \r\n");
      out.write("\t\t\t<option value=\"6\">Vino</option> \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:toUpperCase(param.op) }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\"\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t>\r\n");
      out.write("\t\t\t<p class=\"errores\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${producto.errores }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"opform\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.op }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("footer{\r\n");
      out.write("margin-top: 30px;\r\n");
      out.write("font-weight: bold;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t\t<p>&copy; 2017 Joseba Clemente</p>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.op=='modificar' or param.op == 'borrar'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t \r\n");
        out.write("readonly=\"readonly\"\r\n");
        out.write("\t\t\t  ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.op==null or param.op=='' }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\tstyle=\"display:none\"\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.op == 'borrar'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<script>\r\n");
        out.write("\t\t\tdocument.forms[0].onsubmit = confirmarBorrado;\r\n");
        out.write("\t\t</script>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
