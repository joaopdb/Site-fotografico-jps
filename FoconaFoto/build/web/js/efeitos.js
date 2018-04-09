$(document).ready(function(){

	$("#destaque-produtos").owlCarousel({

		autoPlay: 5000,
		items : 4,
		singleItem: true,

	});

	var owlDestaque = $("#destaque-produtos").data('owlCarousel');

	$('#btn-destaque-prev').on("click", function(){

		owlDestaque.prev();

	});

	$('#btn-destaque-next').on("click", function(){

		owlDestaque .next();

	});

	$('.estrelas').each(function(){


		$(this).raty({

			starHalf : 'lib/raty/lib/images/star-half.png',
			starOff  : 'lib/raty/lib/images/star-off.png',
			starOn  : 'lib/raty/lib/images/star-on.png',
			score : parseFloat($(this).data("score"))

		});

	});


	$("#btn-bars").on("click", function(){

		$("header").toggleClass("open-menu");

	});

	$("menu-mobile, .btn-close").on("click",function(){

		$("header").removeClass("open-menu");

	});
        
});