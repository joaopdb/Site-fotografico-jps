package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contato_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<script type=text/javascript>\n");
      out.write("\n");
      out.write("function Alerta(){\n");
      out.write("alert(Cadastro Realizado com sucesso);\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Foco na Foto</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"lib/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"lib/owl.carousel/owl-carousel/owl.carousel.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"lib/fontawesome/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/foconafoto.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/foconafoto-mobile.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("\n");
      out.write("            <div id=\"menu-mobile\" class=\"visible-xs\">\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <button type=\"button\" class=\"btn-close\"><i class=\"fa fa-close\"></i></button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <ul class=\"list-unstyled\">\n");
      out.write("                    <li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("                    <li><a href=\"portfolio.jsp\">PORTFÓLIO</a></li>\n");
      out.write("                    <li><a href=\"loja.jsp\">LOJA</a></li>\n");
      out.write("                    <li><a href=\"contato.jsp\">CONTATO</a></li>\n");
      out.write("                    <li><a href=\"carrinho.jsp\">CARRINHO</a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"container container-logo\">\n");
      out.write("                <img id=\"logotipo\" src=\"img/logo.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <button id=\"btn-bars\" class=\"visible-xs\" type=\"button\"><i class=\"fa fa-bars\"></i></button>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <nav id=\"menu\" class=\"pull-right\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("                            <li><a href=\"portfolio.jsp\">PORTFÓLIO</a></li>\n");
      out.write("                            <li><a href=\"loja.jsp\">LOJA</a></li>\n");
      out.write("                            <li><a href=\"contato.jsp\">CONTATO</a></li>\n");
      out.write("                            <li><a href=\"carrinho.jsp\">CARRINHO</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <div class=\"titulo\">\n");
      out.write("\n");
      out.write("                <h2>CONTATO</h2>\n");
      out.write("                <h5>Para solicitar orçamentos ou outras informações, preencha o formulário, envie seu email para foconafoto@gmail.com ou ligue (48) 99137-8436, de segunda à sexta, das 08h às 18h.</h5>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"contato\">\n");
      out.write("\n");
      out.write("                <div class=\"googlemaps\">\n");
      out.write("\n");
      out.write("                    <iframe src=\"https://www.google.com/maps/embed?pb=!1m10!1m8!1m3!1d1050.679812615425!2d-48.67107700597604!3d-27.65387669294065!3m2!1i1024!2i768!4f13.1!5e0!3m2!1spt-BR!2sbr!4v1510062192841\" width=\"500\" height=\"354\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("              \n");
      out.write("                <div>\n");
      out.write("                    <form class=\"formulario\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"campo-formulario\" name=\"txtNome\" placeholder=\"Nome\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"campo-formulario\" name=\"txtEmail\"  placeholder=\"E-mail\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"campo-formulario \" name=\"txtTelefone\"  placeholder=\"Telefone\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <textarea class=\"campo-formulario\" rows=\"4\" name=\"txtMsg\" placeholder=\"Mensagem\" ></textarea>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <button onclick=\"Alerta()\" class=\"bnt-enviar\" >ENVIAR</button>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"informacao\">\n");
      out.write("\n");
      out.write("                <label class=\"contato-email\">\n");
      out.write("\n");
      out.write("                    <div class=\"icon\">\n");
      out.write("\n");
      out.write("                        <img src=\"img/icones/email.png\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"texto-contato\">\n");
      out.write("\n");
      out.write("                        <h2>E-mail</h2>\n");
      out.write("                        <p>foconafoto@gmail.com</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </label>\n");
      out.write("\n");
      out.write("                <label class=\"contato-telefone\">\n");
      out.write("\n");
      out.write("                    <div class=\"icon\">\n");
      out.write("\n");
      out.write("                        <img src=\"img/icones/telefone.png\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"texto-contato\">\n");
      out.write("\n");
      out.write("                        <h2>Telefone</h2>\n");
      out.write("                        <p> (48) 99137-8436</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </label>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"orcamento\">\n");
      out.write("\n");
      out.write("                <a href=\"contato.jsp\"><button type=\"button\" >GOSTOU? PEÇA JÁ SEU ORÇAMENTO</button></a>\n");
      out.write("\n");
      out.write("                <h3>\"Fotografar é colocar na mesma linha a cabeça, o olho e o coração\" - Henri Cartier-Bresson</h3>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("\n");
      out.write("            <div id=\"rodape\">\n");
      out.write("\n");
      out.write("                <ul id=\"lista_social\">\t\n");
      out.write("                    <a href=\"pagina.htm.\" target=\"_blank\"><img src=\"img/icones/facebook.png\"></a>\n");
      out.write("                    <a href=\"pagina.htm.\" target=\"_blank\"><img src=\"img/icones/twitter.png\"></a>\n");
      out.write("                    <a href=\"pagina.htm.\" target=\"_blank\"><img src=\"img/icones/pinterest.png\"></a>\n");
      out.write("                    <a href=\"pagina.htm.\" target=\"_blank\"><img src=\"img/icones/instagram.png\"></a>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <script src=\"lib/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"lib/owl.carousel/owl-carousel/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"lib/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/efeitos.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
