package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class carrinho_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Foco na Foto</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"lib/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"lib/owl.carousel/owl-carousel/owl.carousel.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"lib/fontawesome/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"lib/raty/lib/jquery.raty.css\">\n");
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
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <section  ng-controller=\"cart - controller\">\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"titulo\">\n");
      out.write("\n");
      out.write("                    <h2>CARRINHO DE COMPRAS</h2>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <table id=\"cart-products\" class=\"table table-bordered\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th colspan=\"2\">Produto(s)</th>\n");
      out.write("                            <th class=\"text-center\">Quantidade</th>\n");
      out.write("                            <th class=\"text-center\">Entrega</th>\n");
      out.write("                            <th class=\"text-center\">Valor Unitário</th>\n");
      out.write("                            <th class=\"text-center\">Valor Total</th>\n");
      out.write("                            <th></th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr ng-repeat=\"produto in produtos\">\n");
      out.write("                            <td class=\"text-center\"><img src=\"img/produtos/\"></td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td class=\"col-xs-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <span class=\"input-group-btn\">\n");
      out.write("                                        <button class=\"btn text-roxo\" ng-click=\"addQtd(produto)\" type=\"button\"><i class=\"fa fa-chevron-down\"></i></button>\n");
      out.write("                                    </span>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" ng-model=\"produto.qtd\">\n");
      out.write("                                    <span class=\"input-group-btn\">\n");
      out.write("                                        <button class=\"btn text-roxo\" ng-click=\"removeQtd(produto)\" type=\"button\"><i class=\"fa fa-chevron-up\"></i></button>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"text-center col-xs-2\">\n");
      out.write("                                <p>Entrega para o<br/>CEP:</p>\n");
      out.write("                                <strong class=\"text-roxo\"></strong>\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"text-center\">R$</td>\n");
      out.write("                            <td class=\"text-center\">R$</td>\n");
      out.write("                            <td class=\"text-center\"><button class=\"btn text-roxo\" type=\"button\"><i class=\"fa fa-close\"></i></button></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                <div id=\"calculo-de-frete\" class=\"row\">\n");
      out.write("                    <div class=\"col-sm-8\">\n");
      out.write("                        <div class=\"box-outline-grey\">\n");
      out.write("                            <p style=\"margin:28px auto;\">Simule o prazo de entrega e o frete para seu CEP abaixo:</p>\n");
      out.write("                            <div class=\"input-group col-xs-4\" style=\"margin:0 auto;\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\">\n");
      out.write("                                <span class=\"input-group-btn\">\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\">Calcular Frete</button>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <div class=\"box-cart-totais\">\n");
      out.write("                            <table class=\"table\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Subtotal</td>\n");
      out.write("                                    <td class=\"text-right\">R$</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Frete:</td>\n");
      out.write("                                    <td class=\"text-right\">R$</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr style=\"border-top:#999 1px solid;\">\n");
      out.write("                                    <td class=\"text-roxo text-bold\">Total:</td>\n");
      out.write("                                    <td class=\"text-roxo text-bold text-right\">R$</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <button type=\"button\" class=\"btn btn-roxo pull-right\" style=\"margin-top:10px\">comprar</button>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"orcamento\">\n");
      out.write("\n");
      out.write("                <a href=\"contato.jsp\" ><button type=\"button\" >GOSTOU? PEÇA JÁ SEU ORÇAMENTO</button></a>\n");
      out.write("\n");
      out.write("                <h3>?Fotografar é colocar na mesma linha a cabeça, o olho e o coração? - Henri Cartier-Bresson</h3>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
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
      out.write("        <script src=\"lib/raty/lib/jquery.raty.js\"></script>\n");
      out.write("        <script src=\"js/efeitos.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
