<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="foconafoto.model.Produtos"%>
<%@page import="java.util.List"%>
<%@page import="foconafoto.dao.ProdutoDao"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Foco na Foto</title>
        <link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="lib/owl.carousel/owl-carousel/owl.carousel.css">
        <link rel="stylesheet" href="lib/fontawesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="lib/raty/lib/jquery.raty.css">
        <link rel="stylesheet" href="css/foconafoto.css">
        <link rel="stylesheet" href="css/foconafoto-mobile.css">

        <script src="lib/angularjs/angular.min.js"></script>
    </head>
    <body>

        <header>

            <div id="menu-mobile" class="visible-xs">

                <div>
                    <button type="button" class="btn-close"><i class="fa fa-close"></i></button>
                </div>

                <ul class="list-unstyled">
                    <li><a href="index.jsp">HOME</a></li>
                    <li><a href="portfolio.jsp">PORTFÓLIO</a></li>
                    <li><a href="loja.jsp">LOJA</a></li>
                    <li><a href="carrinho.jsp">CARRINHO</a></li>
                    <li><a href="contato.jsp">CONTATO</a></li>
                </ul>

            </div>

            <div class="container">
                <img  id="logotipo" src="img/logo.png" alt="">
            </div>

            <div class="container">

                <button id="btn-bars" class="visible-xs" type="button"><i class="fa fa-bars"></i></button>

                <div class="row">

                    <nav id="menu" class="pull-right">
                        <ul>
                            <li><a href="index.jsp">HOME</a></li>
                            <li><a href="portfolio.jsp">PORTFÓLIO</a></li>
                            <li><a href="loja.jsp">LOJA</a></li>
                            <li><a href="carrinho.jsp">CARRINHO</a></li>
                            <li><a href="contato.jsp">CONTATO</a></li>
                        </ul>
                    </nav>

                </div>

            </div>

        </header>

        <main>
            <div class="titulo">

                <h2>LOJA</h2>

            </div>

            <div class="container" id="destaque-produtos-container" >

                <%
                    Produtos produto = (Produtos) request.getAttribute("produto");

                    NumberFormat z = NumberFormat.getInstance();
                %>

                <div id="destaque-produtos">

                    <div class="item">
                        <div class="col-sm-6 col-image">
                            <img src="<%=produto.getFoto_produto()%>" class="img-produto">
                        </div>
                        <div class="col-sm-6 col-descricao">
                            <h2><%=produto.getNome()%></h2>
                            <div class="box-valor">
                                <div class="text-noboleto text-arial-cinza">no boleto</div>
                                <div class="text-por text-arial-cinza">por</div>
                                <div class="text-reais text-roxo">R$</div>
                                <div class="text-valor text-roxo"><%= z.format(produto.getPreco())%></div>
                                <div class="text-parcelas text-arial-cinza">ou em até <%=produto.getNum_parcelas()%> de R$ <%= z.format(produto.getValor_parcela())%></div>
                                <div class="text-total text-arial-cinza">total a prazo R$ <%= z.format(produto.getValor_prazo())%></div>	
                            </div>
                            <a href="CarrinhoControlo?acao=adicionar_car&id_produto=<%=produto.getId()%>" class="btn-comprar text-roxo"><i class="fa fa-shopping-cart"></i> Compre agora</a>
                        </div>
                    </div>
                </div>

            </div>
            <div id="orcamento">

                <a href="contato.jsp" ><button type="button" >GOSTOU? PEÇA JÁ SEU ORÇAMENTO</button></a>

                <h3>"Fotografar é colocar na mesma linha a cabeça, o olho e o coração" - Henri Cartier-Bresson</h3>

            </div>

        </main>

        <footer>

            <div id="rodape">

                <ul id="lista_social">	
                    <a href="pagina.htm." target="_blank"><img src="img/icones/facebook.png"></a>
                    <a href="pagina.htm." target="_blank"><img src="img/icones/twitter.png"></a>
                    <a href="pagina.htm." target="_blank"><img src="img/icones/pinterest.png"></a>
                    <a href="pagina.htm." target="_blank"><img src="img/icones/instagram.png"></a>
                </ul>

            </div>


        </footer>

        <script src="lib/jquery/jquery.min.js"></script>
        <script src="lib/owl.carousel/owl-carousel/owl.carousel.min.js"></script>
        <script src="lib/bootstrap/js/bootstrap.min.js"></script>
        <script src="lib/raty/lib/jquery.raty.js"></script>
        <script src="js/efeitos.js"></script>

    </body>
</html>


