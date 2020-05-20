<%@page import="com.model.NewsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:choose>
	<c:when test="${empty param.num }">
		<c:redirect url="home.jsp">
		</c:redirect>
	</c:when>
</c:choose>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js" lang="en">
    <!--<![endif]-->
    <head>
        <meta charset="utf-8" />
        <title>Tag List Page</title>
        <meta name="description" content="" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="icon" type="image/png" href="favicon.png" />

        <!-- Google fonts links-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" />
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" />

        <!--For Plugins external css-->
        <link rel="stylesheet" href="assets/css/bootstrap.css" />

        <link rel="stylesheet" href="assets/css/animate.css" />
        <link rel="stylesheet" href="assets/css/fonticons.css" />
        <link rel="stylesheet" href="assets/css/font-awesome.min.css" />
        <link rel="stylesheet" href="assets/css/slick.css" />
        <link rel="stylesheet" href="assets/css/slick-theme.css" />
        <link rel="stylesheet" href="assets/css/bootsnav.css" />
        <link rel="stylesheet" href="assets/css/plugins.css" />

        <link rel="stylesheet" href="assets/css/bootstrap-touch-slider.css" />

        <!--Theme custom css -->
        <link rel="stylesheet" href="assets/css/style.css?ver=1"  />
        <!--<link rel="stylesheet" href="assets/css/colors/blue.css">-->

        <!--Theme Responsive css-->
        <link rel="stylesheet" href="assets/css/responsive.css" />
		<script src="assets/js/jquery-3.4.1.min.js"></script>

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
        	.margin-div{
        		margin-top:200px;
        	}
            .navbar-brand{
                padding-top : 10px;
                margin-top: 12px;
                
            }
            .logo{
                height: 40px;
                margin-bottom: 30px;
            }

            .banner-flex{
                display : flex;
                flex-direction: column;
                
            }
            .banner-flex > h1{ 
                font-family: AppleSDGothicNeoM00;
                font-size : 36px;
            }

            .banner-flex >p{
                font-size : 18px;
                font-family: AppleSDGothicNeoL00;
            }

            .banner-flex > a{
                align-self: flex-first;
            }

            .btn-size{
                width : 0px;
                padding-top: 10px;
                padding-bottom: 10px;
                
            }

            .blog-post-menu{
                font-family: AppleSDGothicNeoL00;
                font-size : 18px;
            }

            .blog-post-menu-info{
                display : none;
            }

            .article-detail{
                color : #0891f9;
                font-weight : bold;
                
            }
            
            .font-font h3{
            	font-family: AppleSDGothicNeoM00;
       	        font-size:1.8em;
            }
            
            .font-font p{
            	font-family: AppleSDGothicNeoL00;
            }
            
            .btn-default{
            	font-family: AppleSDGothicNeoM00;
            }
            
            .call-us-text{
            	font-family: AppleSDGothicNeoL00;
            	font-size:15px;
            }
            .navbar-brand{
            	height:65px;
            	padding-top : 5px;
            }
            .news_imgs{
            	width:100%;
            	height:50%;
            }
            .active_meta{
            	font-weight: bold;
            }
            .active_meta a{        
            	color: #0082e5 !important;
 			}
 			.text_right{
 				text-align: right;
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
        </div>
        <!--End off Preloader -->
 
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
                                <c:choose>
                                	<c:when test="${empty sessionScope.id }">
		                                <a href="MemberLoginService.do" class="signin">로그인</a>
		                                <a href="MemberContactService.do" class="signin">회원가입</a>
                                	</c:when>
                                	<c:otherwise>
                                	    <a href="MemberBookmarkService.do" class="signin">즐겨찾기</a>
                                		<a href="MemberUpdateService.do" class="signin">정보수정</a>
                                	    <a href="LogoutService.do" class="signin">로그아웃</a>
                                	    <a href="" class="signin">${sessionScope.member.member_name}님</a>
                                	</c:otherwise>
                                </c:choose>
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
            
            <!-- End off homev1 section -->

            <!-- Blog-top start -->
            <section class="blog-post-top font-font">
            	<div class="margin-div">
            		
            	</div>
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12">
                            <ul class="blog-post-menu fix">
                              	<li id= "alls" class="active_meta"><a href="NewsTagService.do?num=1&tag_name=${sessionScope.tag_name}">전체</a></li>
								<li id = "true"><a href="NewsTagService.do?num=1&tag_name=${sessionScope.tag_name}&meta=0" class = "fact li" id="tip" title="육하원칙 위주의 사실 전달형 기사 ">스트레이트 기사</a></li>
                                <li id = "feature"><a href="NewsTagService.do?num=1&tag_name=${sessionScope.tag_name}&meta=1" class = "discrip li" id="tip" title="사건,인물에 대한 심층취재 기사">피쳐 기사</a></li>
                            </ul>
                        </div>

                        <div class="col-xs-12">
                            <!-- Blog-post start -->
                            <c:choose>
                            	<c:when test="${empty newsTagList }">
                            		<div >
                                		<div class="row">
           	                            	<div class="col-lg-12 p-top-60 p-bottom-60">
           	                            		<article>
		                                            <p class="post">
                               	                        <h3 class="m-bottom-10 m-top-100 text-center"><span class="text text-black">목록이 없습니다.</span> </h3>
		                                            </p>
		                                        </article>
		                                    </div>
		                                </div>
		                            </div>  	
                            	</c:when>
                            	<c:otherwise>
                            		 <c:forEach var="newsTag" items="${newsTagList}" begin="0"
										end="${fn:length(newsTagList)-1}" step="1" varStatus="status">              
			                                <c:choose>
			                                	<c:when test="${empty newsTag.news_img}" >
				                                	 <div >
				                                		<div class="row">
			            	                            	<div class="col-lg-12 p-top-60 p-bottom-60">
			            	                            		<article>
						                                            <h3>
						                                                ${newsTag.news_title}
						                                            </h3>
						                                            <p class="post">
						                                              	${newsTag.news_summary}
						                                            </p>
						
						                                            <p class="details">
						                                                <a href="ContentsService.do?news_no=${newsTag.news_num}" class="more">
						                                                    자세히 보기
						                                                    <span class="fa fa-angle-double-right"></span>
						                                                </a>
						                                            </p>
						                                            <p class="author m-top-25">
						                                                Writen by ${newsTag.news_writer} /
						                                                <a href="">${newsTag.news_media} · ${newsTag.news_time}</a>
						                                            </p>
						                                        </article>
						                                    </div>
						                                </div>
						                            </div>  	
			                                	</c:when>
			                                	<c:otherwise>
			                                		<div>
				                                		<div class="row">
							                                <div class="col-lg-5 p-top-60">
						                                        <div class="blog-post-img">
						                                            <img class = "news_imgs" src="assets/images/${newsTag.news_img}" alt="Post Image" />
						                                        </div>
						                                    </div>
				                                            <div class="col-lg-7 p-top-60 p-bottom-60">
					                                            <article>
							                                            <h3>
							                                                ${newsTag.news_title}
							                                            </h3>
							                                            <p class="post">
							                                              	${newsTag.news_summary}
							                                            </p>
							
							                                            <p class="details text_right">
							                                                <a href="ContentsService.do?news_no=${newsTag.news_num}" class="more">
							                                                    <span class="fa fa-angle-double-right"></span>
							                                                    자세히 보기
							                                                </a>
							                                            </p>
							                                            <p class="author m-top-25">
							                                                Writen by ${newsTag.news_writer} /
							                                                <a href="">${newsTag.news_media} · ${newsTag.news_time}</a>
							                                            </p>
							                                        </article>
							                                    </div>
							                                </div>
							                            </div>  	
			                                	</c:otherwise>
			                                </c:choose>
		                            </c:forEach>
                            	</c:otherwise>
                            </c:choose>
                           
                            <!-- Blog-post start -->
                        </div>
                    </div>
                    <!-- Row end -->
                </div>
                <!-- Container end -->
            </section>
            <div id="paging" align="center"></div>
            <!-- Blog-top end -->
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
        </div>
        <!--End of home page style-->
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

        <!-- JS includes -->
        <script src="assets/js/vendor/jquery-1.11.2.min.js"></script>
        <script src="assets/js/vendor/bootstrap.js"></script>

        <script src="assets/js/jquery.easing.1.3.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.touchswipe/1.6.18/jquery.touchSwipe.min.js"></script>
        <script src="assets/js/bootsnav.js"></script>
        <script src="assets/js/jquery.formchimp.js"></script>

        <script src="assets/js/plugins.js"></script>
        <script src="assets/js/main.js"></script>
        <script type="text/javascript">
        	/*---------------------------------------------*
        	 * WOW
        	 ---------------------------------------------*/

        	var wow = new WOW({
        	    mobile: false // trigger animations on mobile devices (default is true)
        	});
        	wow.init();
        </script>
        <script>
            $('a').tooltip({
                offset: [0, 10],
                css: {
                    'padding': '10px',
                    'max-width': '200px',
                    'color': '#303030',
                    'background-color': '#f5f5b5',
                    'border': '1px solid #deca7e',
                    '-moz-box-shadow': '0 0 10px rgba(0, 0, 0, .5)',
                    '-webkit-box-shadow': '0 0 10px rgba(0, 0, 0, .5)',
                    'box-shadow': '0 0 10px rgba(0, 0, 0, .5)',
                    'text-shadow': 'none'
                }
                    // 지우지 마세요 이거 툴팁 때문에 해놓은 거에요
            })
        </script>

        <script>
            jQuery(document).ready(function($) {
                $(".click-scroll").click(function(event){            
                        event.preventDefault();
                        $('html,body').animate({scrollTop:$(this.hash).offset().top}, 500);
                });
            });
        	var getParameters = function (paramName) {
			    var returnValue;
				var url = location.href;
				var parameters = (url.slice(url.indexOf('?') + 1, url.length)).split('&');
	
			    for (var i = 0; i < parameters.length; i++) {
			        var varName = parameters[i].split('=')[0];
			        
			        if (varName.toUpperCase() == paramName.toUpperCase()) {
			            returnValue = parameters[i].split('=')[1];
			            return decodeURIComponent(returnValue);
			        }
			    }
			};
	
			if(getParameters('cate')==null){
				$('.nav > li').removeClass('active');
	            $('#homes').addClass('active');
			}else if(getParameters('cate')==1){
				$('.nav > li').removeClass('active');
	            $('#soc').addClass('active');
			}else if(getParameters('cate')==2){
				$('.nav > li').removeClass('active');
	            $('#pol').addClass('active')
			}else if(getParameters('cate')==3){
				$('.nav > li').removeClass('active');
	            $('#eco').addClass('active');
			}else if(getParameters('cate')==4){
				$('.nav > li').removeClass('active');
	            $('#cul').addClass('active');
			}else if(getParameters('cate')==5){
				$('.nav > li').removeClass('active');
	            $('#dig').addClass('active');
			}else if(getParameters('cate')==6){
				$('.nav > li').removeClass('active');
	            $('#spo').addClass('active');
			}else if(getParameters('cate')==7){
				$('.nav > li').removeClass('active');
	            $('#edit').addClass('active');
			}else if(getParameters('cate')==8){
				$('.nav > li').removeClass('active');
	            $('#ent').addClass('active');
			}
			
			if(getParameters('meta')==null){
				$('.blog-post-menu li').removeClass('active_meta');
	            $('#alls').addClass('active_meta');
			}else if(getParameters('meta')==0){
				$('.blog-post-menu li').removeClass('active_meta');
	            $('#true').addClass('active_meta');
			}else if(getParameters('meta')==1){
				$('.blog-post-menu li').removeClass('active_meta');
	            $('#feature').addClass('active_meta')
			}

			var totalData = ${sessionScope.newsTagCount};
    	    var dataPerPage = 5; 
    	    var pageCount = 5;
    	    
    	    function paging(totalData, dataPerPage, pageCount, currentPage){
    	        console.log("currentPage : " + currentPage);
    	        
    	        var totalPage = Math.ceil(totalData/dataPerPage);    // 총 페이지 수
    	        var pageGroup = Math.ceil(currentPage/pageCount);    // 페이지 그룹
    	        
    	        console.log("pageGroup : " + pageGroup);
    	        
    	        var last = pageGroup * pageCount;    // 화면에 보여질 마지막 페이지 번호
    	        if(last > totalPage)
    	            last = totalPage;
    	        var first = last - (pageCount-1); // 화면에 보여질 첫번째 페이지 번호
    	        if(first <= 0){
    	        	first = 1;
    	        }
    	        var next = last+1;
    	        var prev = first-1;
    	        
    	        console.log("last : " + last);
    	        console.log("first : " + first);
    	        console.log("next : " + next);
    	        console.log("prev : " + prev);
    	 
    	        var $pingingView = $("#paging");
    	        
    	        var html = "";
    	        
    	        if(prev > 0)
    	            html += "<a href=# id='prev'><</a> ";
    	        
    	        for(var i=first; i <= last; i++){
    	            html += "<a href='#' id=" + i + ">" + i + "</a> ";
    	        }
    	        
    	        if(last < totalPage)
    	            html += "<a href=# id='next'>></a>";
    	        
    	        $("#paging").html(html);    // 페이지 목록 생성
    	        $("#paging a").css("color", "black");
    	        $("#paging a").css("font-family", "AppleSDGothicNeoL00");
    	        $("#paging a").css("font-size", "20px");
    	        $("#paging a").css("padding", "0px 5px");
    	        $("#paging").css("margin-top", "10px");
    	        $("#paging").css("margin-bottom", "50px");
    	        $("#paging a#" + currentPage).css({"text-decoration":"none", 
    	                                           "color":"#0891f9", 
    	                                           "font-weight":"bold"});    // 현재 페이지 표시
    	                                           
    	        $("#paging a").click(function(){
    	            
    	            var $item = $(this);
    	            var $id = $item.attr("id");
    	            var selectedPage = $item.text();
    	            
    	            if($id == "next")    selectedPage = next;
    	            if($id == "prev")    selectedPage = prev;

					if(getParameters("meta") == null){
	    	            var temp_url = 'NewsTagService.do?num='+selectedPage+"&tag_name=딥러닝";
					}else {
	    	            var temp_url = 'NewsTagService.do?num='+selectedPage+"&tag_name=딥러닝"+"&meta="+getParameters("meta");
					} 
    	            location.href=temp_url;
    	        });
    	                                           
    	    };
/*   	    	address = address.substring(address.indexOf("num", 0) + 4);
	    	let add = address.split('&');
	    	console.log(add[0]); */
	    	

    	    $("document").ready(function(){
    	    	var address = unescape(location.href); 
    	    	var param = ""; 
    	    	adds = address.substring(address.indexOf("num", 0) + 4);
    	    	let add = adds.split('&');
    	    	console.log(add[0]);
    	    	console.log('address'+address.indexOf("num",0));
    	    	if(address.indexOf("num", 0) != -1) {
    	    		param = add[0];
    				console.log("param: "+ param);
    			} else {
    				param = "1";
    			}
    			//displayTab(param);
    			param = Number(param);
    	        paging(totalData, dataPerPage, pageCount, param);
    	    });
        </script>
    </body>
</html>