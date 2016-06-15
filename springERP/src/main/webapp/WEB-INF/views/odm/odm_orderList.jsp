<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/resources/odm/css/odm.css" rel="stylesheet"> 
<script src="/resources/odm/js/orderList.js"></script>
</head>
<body>
<div id="a"></div>
	<h2 class="page_title">주문리스트</h2>
	<table id="odmTable" class="table table-bordered table-hover">
		<thead>
			<tr>
				<th><input type="checkbox"></th>
				<th>주문번호</th>
				<th>주문일시</th>
				<th>주문자명</th>
 				<th>결제금액</th>
 				<th>연락처</th>
			</tr>
		</thead>
		<tbody id="tbody">
		</tbody>
	</table>
	<div class="buttongroup">
<!-- 		<input type="button" id="checkBtn" class="btn btn-default" value="발주확인"> -->
		<input type="button" id="addBtn" class="btn btn-default" value="송장등록">
		<input type="button" id="sendBtn" class="btn btn-default" value="송장전송">
	</div>
</body>
</html>