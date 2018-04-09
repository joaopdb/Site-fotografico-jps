
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Foco na Foto</title>
        <link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="lib/owl.carousel/owl-carousel/owl.carousel.css">
        <link rel="stylesheet" href="lib/fontawesome/css/font-awesome.min.css">
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

                <h2>CONTATO</h2>
                <h5>Para solicitar orçamentos ou outras informações, preencha o formulário, envie seu email para foconafoto@gmail.com ou ligue (48) 99137-8436, de segunda à sexta, das 08h às 18h.</h5>

            </div>

            <div class="contato">

                <div class="googlemaps">

                    <iframe src="https://www.google.com/maps/embed?pb=!1m10!1m8!1m3!1d1050.679812615425!2d-48.67107700597604!3d-27.65387669294065!3m2!1i1024!2i768!4f13.1!5e0!3m2!1spt-BR!2sbr!4v1510062192841" width="500" height="354" frameborder="0" style="border:0" allowfullscreen></iframe>

                </div>
              
                <div>
                    <form class="formulario" data-toggle="validator">
                        <div class="form-group">
                            <input type="text" class="campo-formulario"  required name="txtNome" placeholder="Nome" >
                        </div>
                       
                        <div class="form-group">
                            <input type="text" class="campo-formulario" required name="txtEmail"  placeholder="E-mail" >
                        </div>
                        
                        <div class="form-group">
                            <input type="text" class="campo-formulario" required name="txtTelefone"  placeholder="Telefone">
                        </div>
                        
                        <div class="form-group">
                            <textarea class="campo-formulario" rows="4" required name="txtMsg" placeholder="Mensagem" ></textarea>
                        </div>
                        
                        <button type="submit" class="bnt-enviar" >ENVIAR</button>

                    </form>
                </div>

            </div>

            <div class="informacao">

                <label class="contato-email">

                    <div class="icon">

                        <img src="img/icones/email.png">

                    </div>
                    <div class="texto-contato">

                        <h2>E-mail</h2>
                        <p>foconafoto@gmail.com</p>


                    </div>

                </label>

                <label class="contato-telefone">

                    <div class="icon">

                        <img src="img/icones/telefone.png">

                    </div>
                    <div class="texto-contato">

                        <h2>Telefone</h2>
                        <p> (48) 99137-8436</p>


                    </div>

                </label>
            </div>

            <div id="orcamento">

                <a href="contato.jsp"><button type="button" >GOSTOU? PEÇA JÁ SEU ORÇAMENTO</button></a>

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
        <script src="lib/bootstrap-validator-master/js/validator.js"></script>
        <script src="js/efeitos.js"></script>

    </body>
</html>

