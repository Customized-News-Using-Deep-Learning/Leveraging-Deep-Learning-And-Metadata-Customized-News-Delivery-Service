<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:choose>
	<c:when test="${empty param.news_no }">
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
        <!-- 제목에 따른 페이지 이름 -->
        <title>${sessionScope.newsInfo.news_title}</title>
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
        <link rel="stylesheet" href="assets/css/fonticons.css?ver=1">
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/slick.css">
        <link rel="stylesheet" href="assets/css/slick-theme.css">
        <link rel="stylesheet" href="assets/css/bootsnav.css">
        <link rel="stylesheet" href="assets/css/plugins.css">

        <!--Theme custom css -->
        <link rel="stylesheet" href="assets/css/style.css?ver=1">
        <!--<link rel="stylesheet" href="assets/css/colors/blue.css">-->

        <!--Theme Responsive css-->
        <link rel="stylesheet" href="assets/css/responsive.css" />
        <script src="assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
        <style>
        	.container-width{
        		width:100%;
        		margin: 0 auto;
        	}
        	.dict-word{
        		font-family : AppleSDGothicNeoR00;
        		font-size:1.4em;
        		color : #2980B9;
        		line-height: 1.4em;
        	}
        	.hide{
        		display:none;
        	}
        	.show{
        		display:block;
        	}
        	.word-dict{
        		margin-bottom : 70px;
        		margin-top : -120px;
        	}
        	.btn{
        		margin : 20px 1px;
        	}
        	.btn-bk_tag{
        		padding-top : 10px;
        		padding-bottom : 10px; 
                padding-left : 12px;
                padding-right : 12px;
        	}
            .navbar-brand{
                padding-top : 10px;
                margin-top: 12px;
                
            }

            .home{
                height : 150px;
            }

            .logo{
                height: 40px;
                margin-bottom: 30px;
            }
            .article{
                background: #f8f8f8;
                padding : 0px 40px;
                margin-top: 100px;
                width : 900px;
                margin-bottom: 100px;
            }

            .article-title{
                font-size : 2.5em;
                margin-bottom: 30px;
                margin-top:30px;
                color:#282828;
                font-family: AppleSDGothicNeoM00;
            }
            .article-sub{
                font-size : 1.2em;
                margin-bottom: 20px;
                font-family: AppleSDGothicNeoUL00;
            }

            .article-contents{
                font-size: 1.6em;
                font-family: AppleSDGothicNeoL00;
                color:#282828;
                margin-top:40px;
            }

            .container-flex{
                display : flex;
            }
            .container-width{
                width: 1920px;
            }
            .sidebar-width{
                width: 400px;
                height: 800px;
            }
 			.navbar-brand{
            	height:65px;
            	padding-top : 5px;
            }
            .category{
                margin-top: 100px;
                margin-left: 20px;
                font-size : 20px;
                font-family: AppleSDGothicNeoUL00;
            }

			input[type=checkbox] {  
			    display: none;  
			}
			
			input[type=checkbox] + label{
			    display: inline-block;  
			    cursor: pointer;
			    position: relative;
			    padding-left: 25px;  
			    margin-right: 15px; 
			    font-size: 13px;
			    left: 12px;
			    top: 10px;
			}
			input[type=checkbox] + label:before {     
			    content: "";  
			    display: inline-block;  
			    width: 20px;  
			    height: 20px;  
			    margin-right: 10px;  
			    position: absolute;  
			    left: 0;  
			    bottom: 1px;  
			    background-color: #ccc;  
			    border-radius: 2px;
			    box-shadow: inset 0px 1px 1px 0px rgba(0, 0, 0, .3), 0px 1px 0px 0px rgba(255, 255, 255, .8);  
			}
			input[type=checkbox]:checked + label:before { 
			    content: "\2713";  /* 체크모양 */
			    text-shadow: 1px 1px 1px rgba(0, 0, 0, .2);  
			    font-size: 18px; 
			    font-weight:800; 
			    color: #fff;  
			    background:#2f87c1;
			    text-align: center;  
			    line-height: 18px;  
			}
			#row-flex{
                display:flex;
                flex-direction: column;
            }
            
            #ul-flex{
               display:flex;
               width:900px;
               font-size:1.5em;
               justify-content: flex-start;
               margin-bottom: 20px;
               font-family : AppleSDGothicNeoL00;
            }
            #ul-flex li a{
               color:#282828;
            }
            
            #filters a{
               width:auto;
               
            }
            
            .grid-item--width2{
               width:auto;
            }
            
            @media screen and (max-width: 900px) { 
                .article{
                    background: #f8f8f8;
                    padding : 40px;
                    margin : auto;
                    width : 600px;
                    margin-top : 100px;
                }
                .container-flex{
                    display : flex;
                    flex-direction: column;
                    margin : auto;
                }
                .container-width{
                    width: 756px;
                }
                .sidebar-width{
                    width: 600px;
                    height: 800px;
                }
                .category .sidebar{
                    
                    justify-content: center;
                    margin-top: 100px;
                    margin-left: 20px;
                } 
                .contents{
                    background-color: #0891f9;
                    height: 120px;
                    width:100%;
                    position: relative;
                    overflow: hidden;
                }
                .category-size{
                    height: 300px;
                }
            }
            .scrollup{
            	border : 2px solid #084B8A;
            }
            .scrollup a{
            	color : #084B8A;
            }
            .tags{
            	font-family: AppleSDGothicNeoM00;
            }
            .book_img{
            	width:50px;
            	height: 50px;
            }
            .blog-post-img{
            	text-align:center;
            }
            .news_imgs{
            	width:80%;
            	height:50%;
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

        <div class="culmn">
            <section id="home" class="home">
                <div class="transit-01">
                    
                </div>
                <div class="container">
                    <div class="row">
                        <div  class="banner m-top-150 p-top-100" >

                            <div class="container">
                                <div class="row">
                                    <div class="col-lg-10 col-sm-offset-5 text-right">
                                        
                                    </div>

                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </section><!-- End off homev1 section -->
        </div><!--End of home page style-->
        <!--Home page style start-->
        <div class="culmn">
            <!-- Featured Start -->
             <section id="content " class="container-width">
                <div class="container ">
                    <div class="row container-flex">
                        <div class="col-7 col-10-medium">

                            <!-- Main Content -->
                                <section class = "article">
                                	<c:choose>
                                		<c:when test="${empty bm_num}">
		                           	        <a href="NewsBookmarkService.do?news_no=${newsInfo.news_num}&do=2"><img class = "book_img" src="assets/images/bookmark1.png" alt="" /></a>                                		
                                		</c:when>
                                		<c:otherwise>
		                                 	<a href="NewsBookmarkService.do?news_no=${newsInfo.news_num}&do=1"><img class = "book_img" src="assets/images/bookmark.svg" alt="" /></a>                                			
                                		</c:otherwise>
                                	</c:choose>
                                    <header>
                                        <h2 class = "article-title">${newsInfo.news_title}</h2>
                                        <h3 class = "article-sub">${newsInfo.news_time} ${newsInfo.news_media} ${newsInfo.news_writer}</h3>
                                    </header>
                                   		<c:choose>
                                   			<c:when test="${empty newsInfo.news_img}">
                                   			</c:when>
                                   			<c:otherwise>
	                                   			<div class="blog-post-img">
			                        				 <img class = "news_imgs" src="assets/images/${newsInfo.news_img}" alt="Post Image" />
	                                   			</div>
                                   			</c:otherwise>
                                   		</c:choose>
                                    <p class = "article-contents">
					                	${newsInfo.news_contents}
                                    </p>
                                </section>
                                
                                <div class = "word-dict">
	                                <div class="row" id="row-flex" >
	
										<div class="col-md-2 col-sm-3 text-center m-top-80 xs-m-top-0">
											<div id="filters">
												<ul id="ul-flex">
													<c:choose>
														<c:when test="${empty word_list}">
														</c:when>
														<c:otherwise>
															<c:set var="no" value="1"/>
	                                        				<c:forEach var="word" items="${word_list}" begin="0"
																end="${fn:length(word_list)-1}" step="1" varStatus="status">
																<li><a data-filter=".word-dict${no}" class="is-click">${word.word_name}</a></li>
		                                            			<c:set var="no" value="${no + 1}"/>
	                                            			</c:forEach>
														</c:otherwise>
													</c:choose>
												</ul>
											</div>
										</div>
					
										<div class="col-md-10 col-sm-10">
											<!-- Portfolio grid start-->     
											<div class="grid">
												<div class="grid-sizer"></div>
												<c:choose>
													<c:when test="${empty word_list}">
													</c:when>
													<c:otherwise>
														<c:set var="no2" value="1"/>
		                                        		<c:forEach var="word" items="${word_list}" begin="0"
															end="${fn:length(word_list)-1}" step="1" varStatus="status">
															<div class="grid-item grid-item--width2 grid-item--height2 word-dict${no2}">
																<h3 class = "dict-word">${word.dictionary }</h3>
															</div>
			                                            	<c:set var="no2" value="${no2 + 1}"/>
		                                            	</c:forEach>	
													</c:otherwise>
												</c:choose>
											</div><!-- Portfolio grid end -->
										</div>
									</div>
                                </div>                     
                        </div>
                        
                        
                        <div class="col-3 col-12-medium sidebar-width">
                            <!-- Sidebar -->
                            <div class="category">
                                <!-- Sidebar start -->
                                <div class="sidebar">
	     							<form action="TagBookmarkService.do" method="post">
	                                    <div class="tags m-top-20">
	                                        <h4>News Tags</h4>
	                                        <ul class="m-top-15">
		                                        <c:choose>
													<c:when test="${empty tag_list}">
													</c:when>
													<c:otherwise>
														<c:set var="cnt" value="1"/>
			                                        	<c:forEach var="tag" items="${tag_list}" begin="0"
															end="${fn:length(tag_list)-1}" step="1" varStatus="status">  
				                                            <li><a href="NewsTagService.do?tag_name=${tag.tag_name}">${tag.tag_name}<input type="checkbox" id="tag_ck${cnt}" name="tag_ck" value="${tag.tag_num}">
				                                            	<label for="tag_ck${cnt}"></label></a>
				                                            </li>
				                                            <c:set var="cnt" value="${cnt + 1}"/>
			                                            </c:forEach>
													</c:otherwise>
												 </c:choose>
	                                        </ul>
	                                        <input type="submit" class="btn btn-default btn-round btn-bk_tag" value="태그 즐겨찾기"/>

	                                    </div>
	                                </form>
                                </div><!-- Sidebar end -->
                            </div>
                        </div>
                    </div>
                </div>
            </section>


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
	        window.onload = function(){
	
	        	let wordList = document.querySelectorAll(".is-click");
	        	if( wordList == "" || wordList == null || wordList == undefined || ( wordList != null && typeof wordList == "object" && !Object.keys(wordList).length ) ){
	        		
	        	}else{ 
	        		function wordClick() {
		        		console.log(wordList[0]);
		        		wordList[0].click();
		        	}
		        	wordClick();
	        	}	
	        }
        	
        </script>
        
       <!-- 복사복사 -->
       
       	<script src="assets/js/vendor/jquery-1.11.2.min.js"></script>
		<script src="assets/js/vendor/bootstrap.js"></script>
	
		<script src="assets/js/jquery.easing.1.3.js"></script>
		<script src="assets/js/bootsnav.js"></script>
		<script src="assets/js/jquery.formchimp.js"></script>
		<script src="assets/js/isotope.js"></script>
		<script src="assets/js/isotope-active.js"></script>
	
		<script src="assets/js/plugins.js"></script>
		<script src="assets/js/main.js"></script>
<!-- 		<script>
 			window.onpageshow = function (event)
			{
				if ( event.persisted || (window.performance && window.performance.navigation.type == 2)) 
				{
					alert('뒤로가기 클릭');
				}else {
					alert('새로 열린 페이지');
				}
			} 
		</script> -->

    </body>
</html>
