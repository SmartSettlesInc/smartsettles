$(document).ready(function(){
	//For Filter Slide
	$(document).on('click', '.filter-handle', function(e){
		e.preventDefault();
		$(this).parents('.map-filter').toggleClass('active');
	});
	
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
	
	/* For Full Screen Video | Start */
	if($(".video-wrap").length > 0){
		var fullScreenVideo = document.getElementById("fullScreen-video");
		var pauseButton = document.querySelector("button.icon-media");

		pauseButton.addEventListener("click", function() {
			if (fullScreenVideo.paused) {
				fullScreenVideo.play();
				pauseButton.className = "icon-media pause";
			} else {
				fullScreenVideo.pause();
				pauseButton.className = "icon-media play";
			}
		});
	}
	/* For Full Screen Video | End */
	
	widthHeightPosSetter();
	
	$(window).on('resize', function(){		
		setTimeout(function(){
			widthHeightPosSetter();
		}, 100);	
	});
	
	//For rating stars
	$(document).on('click', '.stars', function(){
		$(this).addClass('active').siblings().removeClass('active');
	});
	
	//For tabs
	$(document).on('click', '.tab-nav li > a', function(e){
		e.preventDefault();
		$($(this).attr('href')).addClass('active').siblings().removeClass('active');
		$(this).parent().addClass('active').siblings().removeClass('active');
	});
	
	//Set auto height for review and gallery content
	$(document).on('click', '.tab-nav li.auto-height > a', function(e){
		$(this).parents('.map-wrap').css('height', 'auto');
	});
	
	//For custom scrollbars
	if($(".scroll-content").length > 0){
		$(".scroll-content").mCustomScrollbar({
			setHeight:400,
			theme:"minimal-dark",
			scrollbarPosition:"outside",
			scrollInertia:500
		});
	}
	
	//For custom calendar | Start
	$('#calendar').DatePicker({
		format: 'DD/MM/YYYY',
        startDate: moment()
    });
	
	$('#calendar').next().addClass('show');
	//For custom calendar | End
	
	//For number spinner | Start
	$(document).on("click", ".spinner > a", function(e){
		e.preventDefault();
		var $button = $(this);
		var oldValue = $(".spinner > .spinner-txt").text();
		if($button.hasClass('right-chev')){
			var newVal = parseInt(oldValue) + 1;
		} 
		else{
			if(oldValue > 1){
				var newVal = parseInt(oldValue) - 1;
			} 
			else{
				newVal = 1;
			}
		}

		$(".spinner > .spinner-txt").text(newVal);

	});	
	//For number spinner | End	
});

/* Width, Height & Position Setter | Start */
function widthHeightPosSetter(){
	var mapHt = $('.map-wrap').innerHeight();
	var headerHt = $('.header').innerHeight();
	var mapHeadingHt = $('.map-wrap > h1').innerHeight();
	
	$('.map-wrap > .map-filter').css({'top': mapHeadingHt, 'height': mapHt - mapHeadingHt});
	$('.map-wrap > .map').css('height', mapHt - mapHeadingHt + 20);
	$('.banner-less .main-wrapper').css('margin-top', headerHt);
}
/* Width, Height & Position Setter | End */