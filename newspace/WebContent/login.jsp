<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
	<c:when test="${not empty sessionScope.id}">
		<c:redirect url="/home.jsp"/>
	</c:when>
</c:choose>
<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang="en"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <title>Login Page</title>
        <meta name="description" content="">
        <meta http-equiv='X-UA-Compatible' content='IE=edge'>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="icon" type="image/png" href="favicon.png">

        <!-- Google fonts links-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">

        <!--For Plugins external css-->
        <link rel="stylesheet" href="assets/css/bootstrap.css">

        <link rel="stylesheet" href="assets/css/animate.css">
        <link rel="stylesheet" href="assets/css/fonticons.css">
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/slick.css">
        <link rel="stylesheet" href="assets/css/slick-theme.css">
        <link rel="stylesheet" href="assets/css/bootsnav.css">
        <link rel="stylesheet" href="assets/css/plugins.css">

        <link rel="stylesheet" href="assets/css/bootstrap-touch-slider.css">

        <!--Theme custom css -->
        <link rel="stylesheet" href="assets/css/style.css?ver=1">
        <!--<link rel="stylesheet" href="assets/css/colors/blue.css">-->

        <!--Theme Responsive css-->
        <link rel="stylesheet" href="assets/css/responsive.css" />

        <script src="assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
		<style>
			.image-align{
				align-items:right;
			}
			.image-mg{
				align-items: center;
			}
			.mar-logo{
				margin-right:40px;
			}
			.row-font{
				font-family:AppleSDGothicNeoM00;
				font-size:15px;
			}
			
		
			.image-size{
				width:150px;
				height:150px;
			}
			.bg-primary{
				height:200px;
			}
		
			.weidget-item{
				width : 300px;
				
				/* margin-left : 100px; */
				
			}
			.item-flex{
    			display:flex;
    		}
    		.infos{
    			margin-left:30px;
    		}
			.home{
				height:13em;
			}
			.button{
				background-color: white;
			 	border: none;
			 	color: #0891f9;
			 	padding: 16px 32px;
			 	text-decoration: none;
			 	margin: 4px 2px;
			 	cursor: pointer;
			}
			.info{
			 	color: #797979;
				box-shadow: none !important
			}
			input[readOnly] {
      			background: white !important;
    		}
    		.text{
    			padding:30px !important;
    		}
    		.call-us-text{
            	font-family: AppleSDGothicNeoL00;
            	font-size:15px;
            }
            .navbar-brand{
    			padding : 17px 15px 15px 15px;
    		}
    		.text-black{
	    		font-family: AppleSDGothicNeoM00;
	    	}
	    	.contact-form{
	    		font-family: AppleSDGothicNeoM00;
	    	}
	    	.text-center{
	    		font-family: AppleSDGothicNeoL00;
	    	}
		</style>
    </head>
    <body data-spy="scroll" data-target=".navbar-collapse">

        <!-- Preloader -->
        <div id="loading">
            <div id="loading-center">
                <div id="loading-center-absolute">
                    <div class="object" id="object_one"></div>
                    <div class="object" id="object_two"></div>
                    <div class="object" id="object_three"></div>
                    <div class="object" id="object_four"></div>
                </div>
            </div>
        </div><!--End off Preloader -->


         <!-- Navbar start -->
        <nav class="navbar navbar-default navbar-fixed white no-background bootsnav navbar-mobile">
            <div class="call-us-area bg-info text-white">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-6 col-xs-12">
                            <div class="call-us-number">
                                <ul class="list-inline">
                                    <!-- <li><span class="icon_phone"></span> 123 456 7890</li>
                                    <li><span class="icon_mail_alt"></span> sampel@name.com</li> -->
                                </ul>
                            </div>
                        </div>
                        <div class="col-sm-6 col-xs-12">
                            <div class="call-us-text text-right">
                                <form class="form-inline">
<!--                                     <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Search this sit">
                                        <a href="#"><span class="icon_search"></span></a>
                                    </div>
 -->
                                </form>
                                <a href="MemberLoginService.do" class="signin">로그인</a>
                                <a href="MemberContactService.do" class="signin">회원가입</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="hv2-main-menu-bg">
                <div class="container">
                    <div class="row">
                        <div class="container">
                            <div class="row">
                                <!-- Start Header Navigation -->
                                <div class="navbar-header">
                                    <button
                                        type="button"
                                        class="navbar-toggle"
                                        data-toggle="collapse"
                                        data-target="#navbar-menu">
                                        <i class="fa fa-bars"></i>
                                    </button>
                                    <a class="navbar-brand" href="NewsService.do?num=1">
                                        <img src="assets/images/logov1.png" class="logo logo-display" alt="">
                                        <img src="assets/images/logoscroll.png" class="logo logo-scrolled" alt="">
                                    </a>
                                </div>
                                <!-- End Header Navigation -->

                                <!-- Collect the nav links, forms, and other content for toggling -->
                                <div class="collapse navbar-collapse" id="navbar-menu">
                                    <ul
                                        class="nav navbar-nav navbar-right m-top-20"
                                        data-in="fadeIn"
                                        data-out="fadeOut">
                                        <li id="homes" class="active"><a href="NewsService.do?num=1">전체</a> </li>
                                        <li id="soc"><a href="NewsService.do?num=1&cate=1">사회</a></li>
                                        <li id="pol"><a href="NewsService.do?num=1&cate=2">정치</a></li> 
                                        <li id="eco"><a href="NewsService.do?num=1&cate=3">경제</a></li>
                                        <li id="cul"><a href="NewsService.do?num=1&cate=4">문화</a></li>
                                        <li id="dig"><a href="NewsService.do?num=1&cate=5">IT</a></li>
                                        <li id="spo"><a href="NewsService.do?num=1&cate=6">스포츠</a></li>
                                        <li id="edit"><a href="NewsService.do?num=1&cate=7">컬럼</a></li>
                                        <li id="ent"><a href="NewsService.do?num=1&cate=8">연예</a></li>
                                    </ul>
                                </div>
                                <!-- /.navbar-collapse -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </nav>
        <!-- End off Nav -->

        <!--Home page style start-->
        <div class="culmn">

            <section id="home" class="home">
            </section><!-- End off homev1 section -->

            <!-- Contact Form start -->
            <section class="contact p-top-80">
                <form id="contact-form" action="LoginService.do" method="post">
                    <div class="container p-bottom-120">
                    	<h2 class="m-bottom-10 m-top-100 text-center"><span class="separator2"></span><span class="text text-black">로그인</span><span class="separator1"></span></h2>
                        <p class="text-center">로그인할 회원 정보를 입력하세요.</p>
                        <div class="row contact-form">
                            <div class="col-sm-12 col-md-8 col-md-offset-2 m-top-30">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="아이디를 입력하세요." name = "id" required="required">
                                </div>
                            </div>
                             <div class="col-sm-12 col-md-8 col-md-offset-2 m-top-30">
                                <div class="form-group">
                                    <input type="password" class="form-control" placeholder="비밀번호를 입력하세요." name = "pw" required="required">
                                </div>
                            </div>                                                                                                                         
                            <div class="col-sm-12 col-md-12 <col-md-of></col-md-of>fset-2 m-top-25 text-center">
                                <button type="submit" class="btn btn-default btn-round">로그인</button>
                            </div>
                        </div>
                    </div>
                </form>
            </section><!-- Contact-form end -->

            <!-- Footer Widget section -->
			<section class="bg-primary">
	                <div class="container">
	                    <div class="row row-font">
	                        <div class="main-weidget p-top-30 p-bottom-80">
	                             <div class="col-md-1 mar-logo">
	                                <div class="weidget-item image-align"> 
	                                    	<img src="assets/images/logo_bottom.png" class="image-size">	
	                                   
	                                </div>
	                            </div>
	
	                            <div class="col-md-2 sm-m-top-40 infos">
	                                <div class="weidget-item "> 
	                                	
	                                    <h5 class="text-white m-top-20">NewSpace</h5>
	                                    <ul class="m-top-20">
	                                        <li>광주광역시 남구 송암로60 광주CGI센터 2층</li>
	                                        <li>대표자 : 안홍선 / TEL : 010-1234-5678</li>
	                                        <li>E-Mail : smhrd@smhrd.or.kr</li>
	                                    </ul>
	                                </div>
	                            </div><!-- End off col-sm-3 -->
	                    	</div><!-- End off main widget-->
	                    </div>
	                </div><!-- End off container -->
	            </section><!-- End off footer widget Section -->

            <!--Footer section-->
            <footer class="footer bg-info p-top-20 p-bottom-20">
                <div class="scrollup">
                    <a href="#" class="hvr-hang"><span class="arrow_up"></span></a>
                </div>

                <div class="container">
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="hv2-main-footer wow fadeInUp">
                                <div class="row">

                                    <div class="col-md-12">
                                        <div class="copyright-text text-center">
                                            <p class="text-white">Made with by <a class="text-white" href="NewsService.do?num=1" target="_blank">NewSpace</a> 2020. All Rights Reserved</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </footer><!-- End off footer Section--> 

        </div><!--End of home page style-->

        <!-- JS includes -->
        <script src="assets/js/vendor/jquery-1.11.2.min.js"></script>
        <script src="assets/js/vendor/bootstrap.js"></script>

        <script src="assets/js/jquery.easing.1.3.js"></script>

        <script src="assets/js/bootsnav.js"></script>
        <script src="assets/js/jquery.formchimp.js"></script>

         <!-- map -->
        <script src="http://maps.google.com/maps/api/js?sensor=true"></script>
        <script src="assets/js/gmaps.min.js"></script>

        <script src="assets/js/plugins.js"></script>
        <script src="assets/js/main.js"></script>
    </body>
</html>
