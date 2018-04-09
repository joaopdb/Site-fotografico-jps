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

        <main>
            <div class="titulo">

                <h2>LOJA</h2>

            </div>

            <div class="container" id="destaque-produtos-container" >

                <%
                    ProdutoDao produtoDao = new ProdutoDao();
                    List<Produtos> produtos = produtoDao.getAll();
                    
                    NumberFormat z = NumberFormat.getInstance();

                %>

                <div id="destaque-produtos">

                    <div class="item">
                        <div class="col-sm-6 col-image">
                            <img src="<%=produtos.get(0).getFoto_produto()%>" class="img-destaque">
                        </div>
                        <div class="col-sm-6 col-descricao">
                            <h2><%=produtos.get(0).getNome()%></h2>
                            <div class="box-valor">
                                <div class="text-noboleto text-arial-cinza">no boleto</div>
                                <div class="text-por text-arial-cinza">por</div>
                                <div class="text-reais text-roxo">R$</div>
                                <div class="text-valor text-roxo"><%= z.format(produtos.get(0).getPreco())%></div>
                                <div class="text-parcelas text-arial-cinza">ou em até <%=produtos.get(0).getNum_parcelas()%> de R$ <%= z.format(produtos.get(0).getValor_parcela())%></div>
                                <div class="text-total text-arial-cinza">total a prazo R$ <%= z.format(produtos.get(0).getValor_prazo())%></div>	
                            </div>
                            <a href="ProdutoControlo?acao=buscar_id&id_produto=<%=produtos.get(0).getId()%>" class="btn-comprar text-roxo"><i class="fa fa-shopping-cart"></i> Compre agora</a>
                        </div>
                    </div>
                    <div class="item">
                        <div class="col-sm-6 col-image">
                            <img src="<%=produtos.get(1).getFoto_produto()%>" class="img-destaque">
                        </div>
                        <div class="col-sm-6 col-descricao">
                            <h2><%=produtos.get(1).getNome()%></h2>
                            <div class="box-valor">
                                <div class="text-noboleto text-arial-cinza">no boleto</div>
                                <div class="text-por text-arial-cinza">por</div>
                                <div class="text-reais text-roxo">R$</div>
                                <div class="text-valor text-roxo"><%= z.format(produtos.get(1).getPreco()) %></div>
                                <div class="text-parcelas text-arial-cinza">ou em até <%=produtos.get(1).getNum_parcelas()%> de R$ <%= z.format(produtos.get(1).getValor_parcela())%></div>
                                <div class="text-total text-arial-cinza">total a prazo R$ <%= z.format(produtos.get(1).getValor_prazo())%></div>	
                            </div>
                            <a href="ProdutoControlo?acao=buscar_id&id_produto=<%=produtos.get(1).getId()%>" class="btn-comprar text-roxo"><i class="fa fa-shopping-cart"></i> Compre agora</a>
                        </div>
                    </div>
                    <div class="item">
                        <div class="col-sm-6 col-image">
                            <img src="<%=produtos.get(2).getFoto_produto()%>" class="img-destaque">
                        </div>
                        <div class="col-sm-6 col-descricao">
                            <h2><%=produtos.get(2).getNome()%></h2>
                            <div class="box-valor">
                                <div class="text-noboleto text-arial-cinza">no boleto</div>
                                <div class="text-por text-arial-cinza">por</div>
                                <div class="text-reais text-roxo">R$</div>
                                <div class="text-valor text-roxo"><%= z.format(produtos.get(2).getPreco()) %></div>
                                <div class="text-parcelas text-arial-cinza">ou em até <%=produtos.get(2).getNum_parcelas()%> de R$ <%= z.format(produtos.get(2).getValor_parcela())%></div>
                                <div class="text-total text-arial-cinza">total a prazo R$ <%= z.format(produtos.get(2).getValor_prazo())%></div>	
                            </div>
                           <a href="ProdutoControlo?acao=buscar_id&id_produto=<%=produtos.get(2).getId()%>" class="btn-comprar text-roxo"><i class="fa fa-shopping-cart"></i> Compre agora</a>
                        </div>
                    </div>
                    <div class="item">

                        <div class="col-sm-6 col-image">
                            <img src="<%=produtos.get(3).getFoto_produto()%>" class="img-destaque">
                        </div>
                        <div class="col-sm-6 col-descricao">
                            <h2><%=produtos.get(3).getNome()%></h2>
                            <div class="box-valor">
                                <div class="text-noboleto text-arial-cinza">no boleto</div>
                                <div class="text-por text-arial-cinza">por</div>
                                <div class="text-reais text-roxo">R$</div>
                                <div class="text-valor text-roxo"><%= z.format(produtos.get(3).getPreco()) %></div>
                                <div class="text-parcelas text-arial-cinza">ou em até <%=produtos.get(3).getNum_parcelas()%> de R$ <%= z.format(produtos.get(3).getValor_parcela())%></div>
                                <div class="text-total text-arial-cinza">total a prazo R$ <%= z.format(produtos.get(3).getValor_prazo())%></div>	
                            </div>
                            <a href="ProdutoControlo?acao=buscar_id&id_produto=<%=produtos.get(3).getId()%>" class="btn-comprar text-roxo"><i class="fa fa-shopping-cart"></i> Compre agora</a>
                        </div>
                    </div>

                </div>
                <button type="button" id="btn-destaque-prev"><i class="fa fa-angle-left"></i></button>
                <button type="button" id="btn-destaque-next"><i class="fa fa-angle-right"></i></button>

            </div>

            <div id="mais-buscados" class="container">


                <div class="row text-center title-default-roxo">
                    <h2>os mais buscados</h2>

                </div>

                <div class="row">

                    <div class="col-md-3">
                        <div class="box-produto-info">
                            <a href="ProdutoControlo?acao=buscar_id&id_produto=<%=produtos.get(4).getId()%>">
                                <img src="<%=produtos.get(4).getFoto_produto()%>" class="produto-img">
                                <h3><%=produtos.get(4).getNome()%></h3>
                                <div class="estrelas" data-score=<%=produtos.get(4).getReview()%>></div>
                                <div class="text-qtd-reviews text-arial-cinza">(300)</div>
                                <div class="text-valor text-roxo">R$ <%=z.format(produtos.get(4).getPreco())%></div>
                                <div class="text-parcelado text-arial-cinza"><%=produtos.get(4).getNum_parcelas()%> de R$ <%= z.format(produtos.get(4).getValor_parcela())%> sem juros</div>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="box-produto-info">
                            <a href="ProdutoControlo?acao=buscar_id&id_produto=<%=produtos.get(5).getId()%>">
                                <img src="<%=produtos.get(5).getFoto_produto()%>" class="produto-img">
                                <h3><%=produtos.get(5).getNome()%></h3>
                                <div class="estrelas" data-score=<%=produtos.get(5).getReview()%>></div>
                                <div class="text-qtd-reviews text-arial-cinza">(300)</div>
                                <div class="text-valor text-roxo">R$ <%= z.format(produtos.get(5).getPreco())%></div>
                                <div class="text-parcelado text-arial-cinza"><%=produtos.get(5).getNum_parcelas()%> de R$ <%= z.format(produtos.get(5).getValor_parcela())%> sem juros</div>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="box-produto-info">
                            <a href="ProdutoControlo?acao=buscar_id&id_produto=<%=produtos.get(6).getId()%>">
                                <img src="<%=produtos.get(6).getFoto_produto()%>" class="produto-img">
                                <h3><%=produtos.get(6).getNome()%></h3>
                                <div class="estrelas" data-score=<%=produtos.get(6).getReview()%>></div>
                                <div class="text-qtd-reviews text-arial-cinza">(300)</div>
                                <div class="text-valor text-roxo">R$ <%= z.format(produtos.get(6).getPreco())%></div>
                                <div class="text-parcelado text-arial-cinza"><%=produtos.get(6).getNum_parcelas()%> de R$ <%= z.format(produtos.get(6).getValor_parcela())%> sem juros</div>
                            </a>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="box-produto-info">
                            <a href="ProdutoControlo?acao=buscar_id&id_produto=<%=produtos.get(7).getId()%>">
                                <img src="<%=produtos.get(7).getFoto_produto()%>" class="produto-img">
                                <h3><%=produtos.get(7).getNome()%></h3>
                                <div class="estrelas" data-score=<%=produtos.get(7).getReview()%>></div>
                                <div class="text-qtd-reviews text-arial-cinza">(300)</div>
                                <div class="text-valor text-roxo">R$ <%= z.format(produtos.get(7).getPreco())%></div>
                                <div class="text-parcelado text-arial-cinza"><%=produtos.get(7).getNum_parcelas()%> de R$ <%= z.format(produtos.get(7).getValor_parcela())%> sem juros</div>
                            </a>
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


