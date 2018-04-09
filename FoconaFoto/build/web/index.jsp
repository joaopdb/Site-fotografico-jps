<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
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
                                <li><a href="loja.jsp">LOJA</a>
                                <li><a href="carrinho.jsp">CARRINHO</a></li>
                                <li><a href="contato.jsp">CONTATO</a></li>
			</ul>

		</div>

		<div class="container container-logo">
			<img id="logotipo" src="img/logo.png">
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

		<div class="banner">

			<div id="myCarousel" class="carousel slide" data-ride="carousel">

				<ol class="carousel-indicators" class="carousel-top">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1" ></li>
					<li data-target="#myCarousel" data-slide-to="2" ></li>

				</ol>


				<div class="carousel-inner">
					<div class="item active">
						<img src="img/1.jpg" id="centro">
					</div>
					<div class="item">
						<img src="img/2.jpg" id="centro">
					</div>
					<div class="item">
						<img src="img/3.jpg" id="centro">
					</div>

				</div>

				<a class="left carousel-control" href="#myCarousel" data-slide="prev">
					<span class="glyphicon glyphicon-chevron-left"></span>
					<span class="sr-only">Previous</span>
				</a>
				<a class="right carousel-control" href="#myCarousel" data-slide="next">
					<span class="glyphicon glyphicon-chevron-right"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
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
	<script src="js/efeitos.js"></script>

</body>
</html>