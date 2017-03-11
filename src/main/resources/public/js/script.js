$(document).ready(function(){
	/* Banner Carousel | Start */
	if($(".owl-carousel").length > 0){
		$(".owl-carousel").owlCarousel({
			items:1,
			loop:true,
			nav:false,
			navText:["",""],
			autoplay:true,
			dots:true
		})
	}
	/* Banner Carousel | End */
});