<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link href="/resources/purchase/css/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/purchase/css/font-awesome.min.css" rel="stylesheet">
    <link href="/resources/purchase/css/prettyPhoto.css" rel="stylesheet">
    <!-- <link href="/resources/purchase/css/main.css" rel="stylesheet"> -->
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="/resources/purchase/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/resources/purchase/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/resources/purchase/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="/resources/purchase/images/ico/apple-touch-icon-57-precomposed.png">

	<script src="/resources/purchase/js/jquery.js"></script>

<style type="text/css">
.icon-md:hover{
	box-shadow: 3px 3px 3px darkgray;
}
a {
  color: #52b6ec;
  -webkit-transition: 300ms;
  -moz-transition: 300ms;
  -o-transition: 300ms;
  transition: 300ms;
}
.btn {
  font-weight: 300;
  border: 0;
}
.btn.btn-primary {
  background-color: #52b6ec;
}
.btn.btn-primary:hover,
.btn.btn-primary.active {
  background-color: #1586c3;
  -webkit-box-shadow: none;
  -moz-box-shadow: none;
  box-shadow: none;
}
a:hover,
a:focus {
  color: #80c9f1;
  text-decoration: none;
  outline: none;
}
#header {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 80px;
  z-index: 99999;
}
#main-slider {
  background-image: url(../images/slider-bg.jpg);
  background-attachment: fixed;
  background-size: cover;
  background-position: 50% 50%;
  background-repeat: no-repeat;
  padding: 200px 0;
  color: #fff;
}
#main-slider .item {
  -moz-transition: opacity ease-in-out 500ms;
  -o-transition: opacity ease-in-out 500ms;
  -webkit-transition: opacity ease-in-out 500ms;
  transition: opacity ease-in-out 500ms;
  left: 0 !important;
  opacity: 0;
  top: 0;
  position: absolute;
  width: 100%;
  display: block !important;
  z-index: 1;
  text-align: center;
}
#main-slider .item:first-child {
  top: auto;
  position: relative;
}
#main-slider .item.active {
  opacity: 1;
  -moz-transition: opacity ease-in-out 500ms;
  -o-transition: opacity ease-in-out 500ms;
  -webkit-transition: opacity ease-in-out 500ms;
  transition: opacity ease-in-out 500ms;
  z-index: 2;
}
#main-slider .item.active h1 {
  -webkit-animation: scaleUp 400ms;
  -moz-animation: scaleUp 400ms;
  -o-animation: scaleUp 400ms;
  -ms-animation: scaleUp 400ms;
  animation: scaleUp 400ms;
}
#main-slider .prev,
#main-slider .next {
  position: absolute;
  top: 50%;
  background-color: rgba(0, 0, 0, 0.3);
  color: #fff;
  display: inline-block;
  margin-top: -50px;
  font-size: 24px;
  height: 50px;
  width: 50px;
  line-height: 50px;
  text-align: center;
  border-radius: 4px;
  z-index: 5;
}
#main-slider .prev:hover,
#main-slider .next:hover {
  background-color: rgba(0, 0, 0, 0.5);
}
#main-slider .prev {
  left: 10px;
}
#main-slider .next {
  right: 10px;
}
#main-slider h1 {
  font-size: 68px;
  text-shadow: 0 3px rgba(0, 0, 0, 0.1);
  color: #fff;
}
#contact .box {
  background-color: #222;
  color: #999;
}
#contact .box h1,
#contact .box h2,
#contact .box h3 {
  color: #fff;
}
#contact .box a {
  color: #999;
}
#contact .box a:hover {
  color: #52b6ec;
}
#contact .box input[type="text"],
#contact .box input[type="email"],
#contact .box textarea {
  background-color: #111;
  border: 0;
  -webkit-transition: 300ms;
  -moz-transition: 300ms;
  -o-transition: 300ms;
  transition: 300ms;
}
#contact .box input[type="text"]:focus,
#contact .box input[type="email"]:focus,
#contact .box textarea:focus {
  background-color: #000;
  -webkit-box-shadow: none;
  -moz-box-shadow: none;
  box-shadow: none;
}
.box {
  width : 1000px;
  padding: 50px 30px;
  background: #fff;
  border-bottom: 1px solid #e9e9e9;
  position: relative;
}
.box.first {
  margin-top: -40px;
  border-radius: 5px 5px 0 0;
}
.box.last {
  border-radius: 0 0 5px 5px;
}
.box h2 {
  padding: 10px 30px;
  display: inline-block;
  border-radius: 4px;
  position: relative;
  margin-bottom: 30px;
  font-size: 48px;
}
#portfolio .box {
  background: #f3f3f3;
}
.portfolio-items,
.portfolio-filter {
  list-style: none;
  padding: 0;
  margin: 0;
}
.portfolio-items {
  margin-right: -20px;
}
.portfolio-filter {
  margin-bottom: 50px;
  text-align: center;
}
.portfolio-filter > li {
  display: inline-block;
}
.portfolio-items > li {
  float: left;
  padding: 0;
  margin: 0;
}
.portfolio-items.col-2 > li {
  width: 50%;
}
.portfolio-items.col-3 > li {
  width: 33%;
}
.portfolio-items.col-4 > li {
  width: 25%;
}
.portfolio-items.col-5 > li {
  width: 20%;
}
.portfolio-items.col-6 > li {
  width: 16%;
}
.portfolio-item .item-inner {
  margin: 0 20px 20px 0;
  text-align: center;
  background: #fff;
  padding: 10px;
  border-bottom: 1px solid #e1e1e1;
}
.portfolio-item img {
  width: 100%;
}
.portfolio-item .portfolio-image {
  position: relative;
}
.portfolio-item h5 {
  margin: 0;
  padding: 10px 0 0 0;
  white-space: nowrap;
  text-overflow: ellipsis;
  overflow: hidden;
}
.portfolio-item .overlay {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  opacity: 0;
  background-color: rgba(255, 255, 255, 0.9);
  text-align: center;
  vertical-align: middle;
  -webkit-transition: opacity 300ms;
  -moz-transition: opacity 300ms;
  -o-transition: opacity 300ms;
  transition: opacity 300ms;
}
.portfolio-item .overlay .preview {
  position: relative;
  top: 50%;
  display: inline-block;
  margin-top: -20px;
}
.portfolio-item:hover .overlay {
  opacity: 1;
}
/* Start: Recommended Isotope styles */
/**** Isotope Filtering ****/
.isotope-item {
  z-index: 2;
}
.isotope-hidden.isotope-item {
  pointer-events: none;
  z-index: 1;
}
/**** Isotope CSS3 transitions ****/
.isotope,
.isotope .isotope-item {
  -webkit-transition-duration: 0.8s;
  -moz-transition-duration: 0.8s;
  -ms-transition-duration: 0.8s;
  -o-transition-duration: 0.8s;
  transition-duration: 0.8s;
}
.isotope {
  -webkit-transition-property: height, width;
  -moz-transition-property: height, width;
  -ms-transition-property: height, width;
  -o-transition-property: height, width;
  transition-property: height, width;
}
.isotope .isotope-item {
  -webkit-transition-property: -webkit-transform, opacity;
  -moz-transition-property: -moz-transform, opacity;
  -ms-transition-property: -ms-transform, opacity;
  -o-transition-property: -o-transform, opacity;
  transition-property: transform, opacity;
}
/**** disabling Isotope CSS3 transitions ****/
.isotope.no-transition,
.isotope.no-transition .isotope-item,
.isotope .isotope-item.no-transition {
  -webkit-transition-duration: 0s;
  -moz-transition-duration: 0s;
  -ms-transition-duration: 0s;
  -o-transition-duration: 0s;
  transition-duration: 0s;
}
/* End: Recommended Isotope styles */
/* disable CSS transitions for containers with infinite scrolling*/
.isotope.infinite-scrolling {
  -webkit-transition: none;
  -moz-transition: none;
  -ms-transition: none;
  -o-transition: none;
  transition: none;
}
#pricing .box {
  background-color: #f9f9f9;
}
#pricing .plan {
  background: #fff;
  list-style: none;
  margin: 0 0 20px;
  text-align: center;
  padding: 0;
  border-bottom: 1px solid #e1e1e1;
}
#pricing .plan li {
  padding: 10px 0;
  margin: 0 15px;
  border-bottom: 1px dashed #eee;
}
#pricing .plan li.plan-name {
  padding: 15px 0;
  font-size: 18px;
  font-weight: 700;
}
#pricing .plan li.plan-price {
  color: #666;
  padding: 15px 0;
  font-size: 48px;
}
#pricing .plan li.plan-action {
  margin-top: 20px;
  margin-bottom: 20px;
  border-bottom: 0;
}
#pricing .plan.featured {
  -webkit-transform: scale(1.05);
  -moz-transform: scale(1.05);
  -ms-transform: scale(1.05);
  -o-transform: scale(1.05);
  transform: scale(1.05);
}
#pricing .plan.featured .plan-price {
  color: #fff;
  background-color: #52b6ec;
  border-bottom-color: #52b6ec;
  margin: 0;
}
#services .box {
  padding-bottom: 0;
}
#services .row > div {
  margin-bottom: 50px;
}
.center {
  text-align: center;
}
#team-scroller .designation {
  margin-top: 10px;
  display: block;
}
.member {
  margin: 0 50px;
  text-align: center;
}
.carousel.scale .left-arrow,
.carousel.scale .right-arrow {
  top: 30%;
  position: absolute;
}
.carousel.scale .left-arrow {
  left: -10px;
}
.carousel.scale .right-arrow {
  right: -10px;
}
.carousel.scale .active .row > div:nth-child(1) {
  -webkit-animation: scaleUp 200ms linear 0 both;
  -moz-animation: scaleUp 200ms linear 0 both;
  -ms-animation: scaleUp 200ms linear 0 both;
  -o-animation: scaleUp 200ms linear 0 both;
  animation: scaleUp 200ms linear 0 both;
}
.carousel.scale .active .row > div:nth-child(2) {
  -webkit-animation: scaleUp 200ms linear 100ms both;
  -moz-animation: scaleUp 200ms linear 100ms both;
  -ms-animation: scaleUp 200ms linear 100ms both;
  -o-animation: scaleUp 200ms linear 100ms both;
  animation: scaleUp 200ms linear 100ms both;
}
.carousel.scale .active .row > div:nth-child(3) {
  -webkit-animation: scaleUp 200ms linear 200ms both;
  -moz-animation: scaleUp 200ms linear 200ms both;
  -ms-animation: scaleUp 200ms linear 200ms both;
  -o-animation: scaleUp 200ms linear 200ms both;
  animation: scaleUp 200ms linear 200ms both;
}
.carousel.scale .active .row > div:nth-child(4) {
  -webkit-animation: scaleUp 200ms linear 400ms both;
  -moz-animation: scaleUp 200ms linear 400ms both;
  -ms-animation: scaleUp 200ms linear 400ms both;
  -o-animation: scaleUp 200ms linear 400ms both;
  animation: scaleUp 200ms linear 400ms both;
}
.icon-social {
  border: 0;
  color: #fff;
  border-radius: 100%;
  display: inline-block !important;
  width: 36px;
  height: 36px;
  line-height: 36px;
  text-align: center;
  padding: 0;
}
.icon-social.icon-facebook {
  background: #4f7dd4;
}
.icon-social.icon-facebook:hover {
  background: #789bde;
}
.icon-social.icon-twitter {
  background: #5bceff;
}
.icon-social.icon-twitter:hover {
  background: #8eddff;
}
.icon-social.icon-linkedin {
  background: #21a6d8;
}
.icon-social.icon-linkedin:hover {
  background: #49b9e3;
}
.icon-social.icon-google-plus {
  background: #dc422b;
}
.icon-social.icon-google-plus:hover {
  background: #e36957;
}
.icon-social.icon-pinterest {
  background: #cb2027;
}
.icon-social.icon-pinterest:hover {
  background: #e03e44;
}
.icon-social.icon-youtube {
  background: #ce332d;
}
.icon-social.icon-youtube:hover {
  background: #da5954;
}
.icon-social:hover {
  color: #fff;
}
.navbar-default {
  background: #fff;
  border-radius: 0 0 5px 5px;
  border: 0;
  padding: 0;
  -webkit-box-shadow: 0 1px 3px 0 rgba(0,0,0,.2);
  -moz-box-shadow: 0 1px 3px 0 rgba(0,0,0,.2);
  box-shadow: 0 1px 3px 0 rgba(0,0,0,.2);
  overflow: hidden;
}
.navbar-default .first a {
  border-radius: 0 0 0 5px;
}
.navbar-default .navbar-brand {
  margin-right: 50px;
  margin-left: 20px;
  width: 200px;
  height: 78px;
  background: url(../images/logo.png) no-repeat 0 50%;
}
.navbar-default .navbar-nav > li {
  margin-left: 1px;
}
.navbar-default .navbar-nav > li > a {
  padding: 30px 25px;
  font-size: 16px;
  line-height: 18px;
  color: #999;
}
.navbar-default .navbar-nav > li > a > i {
  display: inline-block;
}
.navbar-default .navbar-nav > li.active > a,
.navbar-default .navbar-nav > li.active:focus > a,
.navbar-default .navbar-nav > li.active:hover > a,
.navbar-default .navbar-nav > li:hover > a,
.navbar-default .navbar-nav > li:focus > a,
.navbar-default .navbar-nav > li.active > a:focus,
.navbar-default .navbar-nav > li.active:focus > a:focus,
.navbar-default .navbar-nav > li.active:hover > a:focus,
.navbar-default .navbar-nav > li:hover > a:focus,
.navbar-default .navbar-nav > li:focus > a:focus {
  background-color: #52b6ec;
  color: #fff;
}
.icon-lg {
  font-size: 48px;
  height: 108px;
  width: 108px;
  line-height: 108px;
  color: #fff;
  margin: 10px;
  background-color: rgba(0, 0, 0, 0.4);
  text-align: center;
  display: inline-block !important;
  border-radius: 100%;
}
.icon-md {
  font-size: 24px;
  height: 68px;
  width: 68px;
  line-height: 68px;
  color: #fff;
  margin-right: 10px;
  background-color: rgba(0, 0, 0, 0.4);
  text-align: center;
  display: inline-block;
  border-radius: 100%;
  margin-bottom: 10px;
}
.icon-color1 {
  background-color: #e74c3c;
}
.icon-color2 {
  background-color: #2ecc71;
}
.icon-color3 {
  background-color: #3498db;
}
.icon-color4 {
  background-color: #8e44ad;
}
.icon-color5 {
  background-color: #1abc9c;
}
.icon-color6 {
  background-color: #2c3e50;
}
.gap {
  margin-bottom: 50px;
}
.big-gap {
  margin-bottom: 100px;
}
#footer {
  padding-top: 30px;
  padding-bottom: 30px;
  color: #999;
}
#footer a {
  color: #999;
}
#footer a:hover {
  color: #52b6ec;
}
ul.social {
  list-style: none;
  margin: 10px 0 0;
  padding: 0;
}
ul.social > li {
  margin: 0 0 20px;
}
ul.social > li > a {
  display: block;
  font-size: 18px;
}
ul.social > li > a i {
  margin-right: 10px;
}
textarea#message {
  padding: 10px 15px;
  height: 220px;
}
@keyframes scaleUp {
  0% {
    opacity: 0;
    transform: scale(0.3);
  }
  100% {
    opacity: 1;
    transform: scale(1);
  }
}
@-moz-keyframes scaleUp {
  0% {
    opacity: 0;
    -moz-transform: scale(0.3);
  }
  100% {
    opacity: 1;
    -moz-transform: scale(1);
  }
}
@-webkit-keyframes scaleUp {
  0% {
    opacity: 0;
    -webkit-transform: scale(0.3);
  }
  100% {
    opacity: 1;
    -webkit-transform: scale(1);
  }
}
@-ms-keyframes scaleUp {
  0% {
    opacity: 0;
    -ms-transform: scale(0.3);
  }
  100% {
    opacity: 1;
    -ms-transform: scale(1);
  }
}
@-o-keyframes scaleUp {
  0% {
    opacity: 0;
    -o-transform: scale(0.3);
  }
  100% {
    opacity: 1;
    -o-transform: scale(1);
  }
}
#title{
	margin-bottom: 50px;
}
</style>
<script type="text/javascript">
$(function(){
	$('.icon-md').click(function(){
		var id = $(this).attr('id'); //<-- id값 받아옴
		alert(id);
		//$(location).attr('href',id+'.jsp');  <-- a.jsp 링크  밑에도 다 똑같음
	})
});
</script>
</head>
<body data-spy="scroll" data-target="#navbar" data-offset="0">
<h2 id="title">회계 핵심 출력물</h2>
    <section id="services">
        <div class="container">
            <div class="box first">
                <div class="row">
                    <div class="col-md-4 col-sm-6">
                        <div class="center">
                            <i id="a" class="icon-md icon-color1"></i>
                            <h4>iOS development</h4>
                        </div>
                    </div><!--/.col-md-4-->
                    <div class="col-md-4 col-sm-6">
                        <div class="center">
                            <i id="b" class="icon-md icon-color2"></i>
                            <h4>Android development</h4>
                        </div>
                    </div><!--/.col-md-4-->
                    <div class="col-md-4 col-sm-6">
                        <div class="center">
                            <i id="c" class="icon-md icon-color3"></i>
                            <h4>Windows Phone development</h4>
                        </div>
                    </div><!--/.col-md-4-->
                    <div class="col-md-4 col-sm-6">
                        <div class="center">
                            <i id="d" class="icon-md icon-color4"></i>
                            <h4>Ruby on Rails development</h4>
                        </div>
                    </div><!--/.col-md-4-->
                    <div class="col-md-4 col-sm-6">
                        <div class="center">
                            <i id="e" class="icon-md icon-color5"></i>
                            <h4>Javascript development</h4>
                        </div>
                    </div><!--/.col-md-4-->
                    <div class="col-md-4 col-sm-6">
                        <div class="center">
                            <i id="f" class="icon-md icon-color6"></i>
                            <h4>Responsive web design</h4>
                        </div>
                    </div><!--/.col-md-4-->
                </div><!--/.row-->
            </div><!--/.box-->
        </div><!--/.container-->
    </section><!--/#services-->
</body>
</html>