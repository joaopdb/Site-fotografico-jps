<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.List"%>
<%@page import="foconafoto.model.Carrinho"%>
<%@page import="foconafoto.dao.CarrinhoDao"%>
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

            <div class="container container-logo">
                <img id="logotipo" src="img/logo.png" alt="">
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

        <section>

            <div class="container">

                <div class="titulo">

                    <h2>CARRINHO DE COMPRAS</h2>

                </div>

                <%
                    CarrinhoDao carrinhoDao = new CarrinhoDao();
                    List<Carrinho> produtos = carrinhoDao.getAll();

                    NumberFormat z = NumberFormat.getInstance();
                    double total = 0;

                %>

                <div class="table-responsive">
                    <table id="cart-products" class="table table-bordered">
                        <thead>
                            <tr>
                                <th colspan="2">Produto(s)</th>
                                <th class="text-center">Quantidade</th>
                                <th class="text-center">Entrega</th>
                                <th class="text-center">Valor Unitário</th>
                                <th class="text-center">Valor Total</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <% for (Carrinho produto : produtos) {%>
                            <tr>
                                <td class="text-center"><img src="<%=produto.getFoto_principal()%>"></td>
                                <td><%=produto.getNome_prod()%></td>
                                <td class="col-xs-2">
                                    <div class="input-group">
                                        <span class="input-group-btn">
                                            <a href="CarrinhoControlo?acao=diminuir&id_produto=<%=produto.getId()%>">
                                                <button class="btn text-roxo" type="button"><i class="fa fa-chevron-down"></i></button></a>
                                        </span>
                                        <input type="text" class="form-control" value= "<%=produto.getQuant_prod()%>" >
                                        <span class="input-group-btn">
                                            <a href="CarrinhoControlo?acao=aumentar&id_produto=<%=produto.getId()%>">
                                                <button class="btn text-roxo" type="button"><i class="fa fa-chevron-up"></i></button></a>
                                        </span>
                                    </div>
                                </td>
                                <td class="text-center col-xs-2">
                                    <p>Entrega para o<br/>CEP: 88131-170</p>
                                    <strong class="text-roxo"></strong>
                                </td>
                                <td class="text-center">R$ <%= z.format(produto.getPreco_unit())%></td>
                                <td class="text-center">R$ <%= z.format(produto.getTotal())%></td>
                                <td class="text-center"><a href="CarrinhoControlo?acao=remover_car&id_produto=<%=produto.getId()%>"><button class="btn text-roxo" type="button"><i class="fa fa-close"></i></button></a></td>
                            </tr>
                            <%
                            total = total + produto.getTotal(); %>

                            <%}%>
                        </tbody>
                    </table>
                </div>

                <div id="calculo-de-frete" class="row-carrinho">
                    <div class="col-sm-8">
                        <div class="box-outline-grey">
                            <p style="margin:28px auto;">Simule o prazo de entrega e o frete para seu CEP abaixo:</p>
                            <div class="input-group col-xs-4" style="margin:0 auto;">
                                <input type="text" class="form-control">
                                <span class="input-group-btn">
                                    <button class="btn btn-default" type="button">Calcular Frete</button>
                                </span>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="box-cart-totais">
                            <table class="table">
                                <tr>
                                    <td>Subtotal</td>
                                    <td class="text-right">R$ <%= z.format(total)%></td>
                                </tr>
                                <tr>
                                    <td>Frete:</td>
                                    <td class="text-right">R$ 0,00</td>
                                </tr>
                                <tr style="border-top:#999 1px solid;">
                                    <td class="text-roxo text-bold">Total: </td>
                                    <td class="text-roxo text-bold text-right">R$ <%= z.format(total)%></td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>

                <button type="button" class="btn btn-roxo pull-right" style="margin-top:10px">comprar</button>

            </div>
            <div id="orcamento">

                <a href="contato.jsp" ><button type="button" >GOSTOU? PEÇA JÁ SEU ORÇAMENTO</button></a>

                <h3>"Fotografar é colocar na mesma linha a cabeça, o olho e o coração" - Henri Cartier-Bresson</h3>

            </div>

        </section>


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