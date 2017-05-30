package org.apache.jsp.WEB_002dINF.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/vistas/includes/cabecera.jsp");
    _jspx_dependants.add("/WEB-INF/vistas/includes/pie.jsp");
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

      out.write("\r\n");
      out.write("\r\n");
      com.ipartek.TIPOS.Usuario usuario = null;
      synchronized (request) {
        usuario = (com.ipartek.TIPOS.Usuario) _jspx_page_context.getAttribute("usuario", PageContext.REQUEST_SCOPE);
        if (usuario == null){
          usuario = new com.ipartek.TIPOS.Usuario();
          _jspx_page_context.setAttribute("usuario", usuario, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n");
      out.write(" \t");
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
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("css/estilos.css\">\r\n");
      out.write("\t<title>Mantenimiento de Usuarios</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<h1>Mantenimiento de Usuarios</h1>\r\n");
      out.write("\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.requestURI}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"/admin/productocrud\">Mantenimiento Productos</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<li><a href=\"/admin/productocrud?op=alta\">Alta</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/admin/usuariocrud\">Mantenimiento Usuarios</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/loginserver\">Login</a></li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write(" \t<style>\r\n");
      out.write(" \t\n");
      out.write("ul{\r\n");
      out.write("\r\n");
      out.write("margin-left: 500px;\r\n");
      out.write("margin-top: 30px;\r\n");
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
      out.write("margin-left: 530px;\r\n");
      out.write("margin-top: 50px;}\r\n");
      out.write("\r\n");
      out.write(".errores{\r\n");
      out.write("\r\n");
      out.write("margin-top:20px;\r\n");
      out.write("width: 200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"loginserver\" method=\"post\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<label for=\"nombre\">Nombre</label> \r\n");
      out.write("\t\t\t<input id=\"nombre\" name=\"nombre\" required minlength=\"4\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \" >\r\n");
      out.write("\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<label for=\"pass\">Contraseña</label>\r\n");
      out.write("\t\t\t<input id=\"pass\" name=\"pass\" type=\"password\">\r\n");
      out.write("\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Login\">\r\n");
      out.write("\t\t\t<p class=\"errores\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.errores }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.requestURI != '/WEB-INF/vistas/login.jsp'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<li><a href=\"/loginserver?opcion=logout\">Logout</a></li>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t");
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
}
