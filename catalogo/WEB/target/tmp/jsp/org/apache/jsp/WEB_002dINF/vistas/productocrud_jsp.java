package org.apache.jsp.WEB_002dINF.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productocrud_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/vistas/includes/productocabecera.jsp");
    _jspx_dependants.add("/WEB-INF/vistas/includes/productopie.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("h2{\r\n");
      out.write("text-align: center;\r\n");
      out.write("margin-top: 30px;\r\n");
      out.write("}\r\n");
      out.write("ul{\r\n");
      out.write("\r\n");
      out.write("margin-left: 380px;\r\n");
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
      out.write("table{\r\n");
      out.write("\r\n");
      out.write("margin-left: 370px;\r\n");
      out.write("margin-top: 30px;\r\n");
      out.write("border: solid;\r\n");
      out.write("background-color: green;\r\n");
      out.write("\r\n");
      out.write("border-color: green;\r\n");
      out.write("}\r\n");
      out.write("table tr{\r\n");
      out.write("background-color: white;\r\n");
      out.write("}\r\n");
      out.write("table tr td a{\r\n");
      out.write("\r\n");
      out.write("color:blue;\r\n");
      out.write("font-weight: bold;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("table tr td a:hover{\r\n");
      out.write("\r\n");
      out.write("color:red;\r\n");
      out.write("background-color: white;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("table tr th{\r\n");
      out.write("\r\n");
      out.write("height:25px;\r\n");
      out.write("background-color: red;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table tr td{\r\n");
      out.write("\r\n");
      out.write("text-align: center;}\r\n");
      out.write("\r\n");
      out.write("a{\r\n");
      out.write("\r\n");
      out.write("text-decoration: none;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<h2>Mantenimiento de Productos</h2>\r\n");
      out.write("\r\n");
      out.write("<table border=1 width=\"700\" height=150px;>\r\n");
      out.write("\r\n");
      out.write("<thead>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\r\n");
      out.write("\t<th>Operaciones</th>\r\n");
      out.write("\t<th>ID</th>\r\n");
      out.write("\t<th>Producto</th>\r\n");
      out.write("\t<th>Descripcion</th>\r\n");
      out.write("\t<th>Precio</th>\r\n");
      out.write("\t<th>Imagen</th>\r\n");
      out.write("\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t</thead>\r\n");
      out.write("\t\r\n");
      out.write("\t<tbody>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</tbody>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.productos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("producto");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td><a href=\"?op=modificar&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${producto.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Modificar</a>\r\n");
          out.write("\t\t<a href=\"?op=borrar&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${producto.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Borrar</a></td>\r\n");
          out.write("\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${producto.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${producto.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${producto.descripcion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${producto.precio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" €</td>\r\n");
          out.write("\t\t<td><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${producto.imagen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg\" width=\"80px\"></td>\r\n");
          out.write("\t\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
