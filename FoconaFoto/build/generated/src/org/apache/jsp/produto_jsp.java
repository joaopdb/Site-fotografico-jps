package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import foconafoto.model.Produtos;
import java.util.List;
import foconafoto.dao.ProdutoDao;

public final class produto_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
      out.write("        <script src=\"lib/angularjs/angular.min.js\"></script>\n");
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
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <div class=\"titulo\">\n");
      out.write("\n");
      out.write("                <h2>LOJA</h2>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"container\" id=\"destaque-produtos-container\" >\n");
      out.write("                \n");
      out.write("                 ");

                    ProdutoDao produtoDao = new ProdutoDao();
                    List<Produtos> produtos = produtoDao.getAll();
                    
                    NumberFormat z = NumberFormat.getInstance();

                
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"destaque-produtos\">\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <div class=\"col-sm-6 col-image\">\n");
      out.write("                            <img src=\"");
      out.print(produtos.get(0).getFoto_produto());
      out.write("\" style=\"margin-right: -140px;\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6 col-descricao\">\n");
      out.write("                            <h2>");
      out.print(produtos.get(0).getNome());
      out.write("</h2>\n");
      out.write("                            <div class=\"box-valor\">\n");
      out.write("                                <div class=\"text-noboleto text-arial-cinza\">no boleto</div>\n");
      out.write("                                <div class=\"text-por text-arial-cinza\">por</div>\n");
      out.write("                                <div class=\"text-reais text-roxo\">R$</div>\n");
      out.write("                                <div class=\"text-valor text-roxo\">");
      out.print( z.format(produtos.get(0).getPreco()));
      out.write("</div>\n");
      out.write("                                <div class=\"text-parcelas text-arial-cinza\">ou em até ");
      out.print(produtos.get(0).getNum_parcelas());
      out.write(" de R$ ");
      out.print( z.format(produtos.get(0).getValor_parcela()));
      out.write("</div>\n");
      out.write("                                <div class=\"text-total text-arial-cinza\">total a prazo R$ ");
      out.print( z.format(produtos.get(0).getValor_prazo()));
      out.write("</div>\t\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"#\" class=\"btn-comprar text-roxo\"><i class=\"fa fa-shopping-cart\"></i> Compre agora</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"orcamento\">\n");
      out.write("\n");
      out.write("                <a href=\"contato.jsp\" ><button type=\"button\" >GOSTOU? PEÇA JÁ SEU ORÇAMENTO</button></a>\n");
      out.write("\n");
      out.write("                <h3>\"Fotografar é colocar na mesma linha a cabeça, o olho e o coração\" - Henri Cartier-Bresson</h3>\n");
      out.write("\n");
      out.write("            </div>\n");
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
      out.write("        <script src=\"lib/raty/lib/jquery.raty.js\"></script>\n");
      out.write("        <script src=\"js/efeitos.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
