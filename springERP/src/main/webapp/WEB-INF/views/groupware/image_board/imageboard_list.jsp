<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/resources/purchase/js/jquery.js"></script>
<script type="text/javascript">

</script>
<title>Insert title here</title>


<!-- Font Awesome -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">

<!-- Custom CSS -->

<link href="css/bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet" href="./groupware/css/imageboard_list.css">


<script src="./groupware/js/jquery-1.10.2.min.js"></script>
<script src="./groupware/js/jquery-ui-1.10.3.custom.min.js"></script>

</head>
<body>
	
	<h2 class="page_title">이미지게시판</h2>
	
	<table id="imageboard_list" class="td-over">
		<tr>
			<td>
				<a href="./main.jsp?left=./groupware/view/groupware.jsp&contents=./groupware/view/imageboard/imageboard_view.jsp">
				<div class="box">
					<img class="" src="" alt="게시한이미지"/>
					<h3>이미지제목</h3>
					<p>
						<span>16.04.25</span><br/>
						<span>김보람</span>
					</p>
				</div>
				</a>
			</td>
		</tr>
	</table>

	<div class="col-xs-2">
		<div class="dropdown">
			<button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">
				제목+내용 <span class="caret"></span>
			</button>
			<ul class="dropdown-menu col-xs-2">
				<li><a href="#">제목</a></li>
				<li><a href="#">내용</a></li>
				<li><a href="#">작성자</a></li>
			</ul>
		</div>
	</div>
	<div class="col-xs-2">
 			<input class="form-control" id="ex1" type="text">
	</div>
	<button type="button" class="btn btn-default">검색</button>
	<form:form action="/groupware/image_board/imageAdd" method="post">
		<input type="file" class="btn btn-default">
		<button type="submit" class="btn btn-default" id="imageAdd">등록</button>
	</form:form>

</body>
</html>