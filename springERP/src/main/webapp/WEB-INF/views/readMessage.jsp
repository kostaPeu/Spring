<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="_csrf" content="${_csrf.token}" />
<meta name="_csrf_header" content="${_csrf.headerName}" />
<script src="/webjars/jquery/2.0.0/jquery.min.js"></script>
<script src="/resources/common/js/csrf.js" type="text/javascript"></script>
<script src="/resources/hr/js/hr.js" type="text/javascript"></script>
<script src="/webjars/bootstrap/3.3.6/dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/resources/hr/css/emp.css">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="/webjars/bootstrap/3.3.6/dist/css/bootstrap.min.css">

<title>Insert title here</title>
<script type="text/javascript">
	$(function(){
		$('#list_btn').on('click', function(){
			var url = "/message${pageMaker.makeSearch(pageMaker.cri.page) }";
			$(location).attr('href',url);
		});
	});
	$(function(){
		$('#re_send_btn').on('click', function(){
			var url = "/message/sendForm?emp_id=${message.receive_id }&receive_id=${message.send_id }";
			$(location).attr('href',url);
		});
	});
</script>
</head>
<body>
	<div class="container-fluid">
		<div class="col-md-8 col-md-offset-2">
			<label for="sender_label" class="col-sm-2 control-label">보낸이</label>
			<input id="send_id" type="text" readonly value="${message.e_name }" width="300"><br>
			<label for="title_label" class="col-sm-2 control-label">제목</label>
			<input type="text" readonly value="${message.title }" width="300"><br>
			<input id="receive_id" type="hidden" value="${message.receive_id }"/>
			<textarea id="contents" readonly rows="10" cols="40">
				${message.contents }
			</textarea>
		</div>
		<button type="button" class="btn btn-default" id="list_btn">목록</button>
		<button type="button" class="btn btn-default" id="re_send_btn">답장</button>
	</div>
</body>
</html>