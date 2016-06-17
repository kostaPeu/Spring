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
    <link href="/resources/accounting/css/print.css" rel="stylesheet" >
    <!-- <link href="/resources/purchase/css/main.css" rel="stylesheet"> -->
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="/resources/purchase/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/resources/purchase/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/resources/purchase/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="/resources/purchase/images/ico/apple-touch-icon-57-precomposed.png">

	<script src="/resources/purchase/js/jquery.js"></script>
<script type="text/javascript">
$(function(){
	$('.icon-md').click(function(){
		var id = $(this).attr('id'); //<-- id값 받아옴
		alert(id);
		//$(location).attr('href',id+'.jsp');  <-- a.jsp 링크  
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
                            <h4>재무상태표</h4>
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