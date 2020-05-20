"use strict";
jQuery(document).ready(function ($) {


//for Preloader

    $(window).load(function () {
        $("#loading").fadeOut(500);
        $("#loading").fadeOut(500);
    });


    /*---------------------------------------------*
     * Mobile menu
     ---------------------------------------------*/
    $('.navbar-collapse').find('a[href*=#]:not([href=#])').click(function () {
        if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') && location.hostname == this.hostname) {
            var target = $(this.hash);
            target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
            if (target.length) {
                $('html,body').animate({
                    scrollTop: (target.offset().top - -30)
                }, 1000);
                if ($('.navbar-toggle').css('display') != 'none') {
                    $(this).parents('.container').find(".navbar-toggle").trigger("click");
                }
                return false;
            }
        }
    });

//---------------------------------------------
// Counter 
//---------------------------------------------
    $('.statistic-counter').counterUp({
        delay: 10,
        time: 2000
    });


// magnificPopup
    $('.image-link').magnificPopup({
      type: 'image',
      mainClass: 'mfp-with-zoom', // this class is for CSS animation below

      zoom: {
        enabled: true, // By default it's false, so don't forget to enable it

        duration: 300, // duration of the effect, in milliseconds
        easing: 'ease-in-out', // CSS transition easing function

        // The "opener" function should return the element from which popup will be zoomed in
        // and to which popup will be scaled down
        // By defailt it looks for an image tag:
        opener: function(openerElement) {
          // openerElement is the element on which popup was initialized, in this case its <a> tag
          // you don't need to add "opener" option if this code matches your needs, it's defailt one.
          return openerElement.is('img') ? openerElement : openerElement.find('img');
        }
      }

    });

//---------------------------------------------
// Scroll Up 
//---------------------------------------------

    $('.scrollup').click(function () {
        $("html, body").animate({scrollTop: 0}, 1000);
        return false;
    });

    var controller = new ScrollMagic.Controller();

    new ScrollMagic.Scene({triggerElement: ".home"})
            .setVelocity(".transit-01", {bottom: "-10"}, 900).addTo(controller);
});


// nav menu
$(document).on("scroll", function () {
    if ($(document).scrollTop() > 0) {
        $("nav").addClass("scroll_menu");
    } else {
        $("nav").removeClass("scroll_menu");
    }
});


