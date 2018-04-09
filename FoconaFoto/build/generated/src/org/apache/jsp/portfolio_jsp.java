package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class portfolio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<title>Foco na Foto</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"lib/bootstrap/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"lib/owl.carousel/owl-carousel/owl.carousel.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"lib/fontawesome/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/foconafoto.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/foconafoto-mobile.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<header>\n");
      out.write("\n");
      out.write("\t\t<div id=\"menu-mobile\" class=\"visible-xs\">\n");
      out.write("\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn-close\"><i class=\"fa fa-close\"></i></button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<ul class=\"list-unstyled\">\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"portfolio.jsp\">PORTFÓLIO</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"loja.jsp\">LOJA</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"contato.jsp\">CONTATO</a></li>\n");
      out.write("                                <li><a href=\"carrinho.jsp\">CARRINHO</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"container container-logo\">\n");
      out.write("\t\t\t <a href=\"index.jsp\"><img  id=\"logotipo\" src=\"img/logo.png\" alt=\"\"></a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t<button id=\"btn-bars\" class=\"visible-xs\" type=\"button\"><i class=\"fa fa-bars\"></i></button>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t<nav id=\"menu\" class=\"pull-right\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"portfolio.jsp\">PORTFÓLIO</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"loja.jsp\">LOJA</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contato.jsp\">CONTATO</a></li>\n");
      out.write("                                                <li><a href=\"carrinho.jsp\">CARRINHO</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<main>\n");
      out.write("\n");
      out.write("\t\t<div class=\"titulo\">\n");
      out.write("\n");
      out.write("\t\t\t<h2>PORTFÓLIO</h2>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<h3></h3>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"content\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"content-img\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"casamento.jsp\"><img src=\"img/galeria/casamento.jpg\" id=\"img\"></a>\t\n");
      out.write("\t\t\t\t<div id=\"leg-img\"><p>CASAMENTO</p></div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"content-img\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<a href=\"gestante.jsp\"><img src=\"img/galeria/gestante.jpg\" id=\"img\"></a>\n");
      out.write("\t\t\t\t<div id=\"leg-img\"><p>GESTANTE</p></div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"content-img\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<a href=\"newborn.jsp\"><img src=\"img/galeria/newborn.jpg\" id=\"img\"></a>\n");
      out.write("\t\t\t\t<div id=\"leg-img\"><p>NEWBORN</p></div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"content-img\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<a href=\"aniversario.jsp\"><img src=\"img/galeria/aniversario.jpg\" id=\"img\" ></a>\n");
      out.write("\t\t\t\t<div id=\"leg-img\"><p>ANIVERSÁRIO</p></div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"content-img\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<a href=\"formatura.jsp\"><img src=\"img/galeria/formatura.jpg\" id=\"img\"></a>\n");
      out.write("\t\t\t\t<div id=\"leg-img\"><p>FORMATURA</p></div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"content-img\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<a href=\"eventos.jsp\"><img src=\"img/galeria/eventos.jpg\" id=\"img\"></a>\n");
      out.write("\t\t\t\t<div id=\"leg-img\"><p>EVENTOS</p></div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"orcamento\">\n");
      out.write("\t\t\t\n");
      out.write("                    <a href=\"contato.jsp\"><button type=\"button\" >GOSTOU? PEÇA JÁ SEU ORÇAMENTO</button></a>\n");
      out.write("\n");
      out.write("\t\t\t<h3>\"Fotografar é colocar na mesma linha a cabeça, o olho e o coração\" - Henri Cartier-Bresson</h3>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</main>\n");
      out.write("\n");
      out.write("\t<footer>\n");
      out.write("\n");
      out.write("\t\t<div id=\"rodape\">\n");
      out.write("\n");
      out.write("\t\t\t<ul id=\"lista_social\">\t\n");
      out.write("\t\t\t\t<a href=\"pagina.htm.\" target=\"_blank\"><img src=\"img/icones/facebook.png\"></a>\n");
      out.write("\t\t\t\t<a href=\"pagina.htm.\" target=\"_blank\"><img src=\"img/icones/twitter.png\"></a>\n");
      out.write("\t\t\t\t<a href=\"pagina.htm.\" target=\"_blank\"><img src=\"img/icones/pinterest.png\"></a>\n");
      out.write("\t\t\t\t<a href=\"pagina.htm.\" target=\"_blank\"><img src=\"img/icones/instagram.png\"></a>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("\t<script src=\"lib/jquery/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"lib/owl.carousel/owl-carousel/owl.carousel.min.js\"></script>\n");
      out.write("\t<script src=\"lib/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/efeitos.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
}
