<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/shopERP/odm/css/odm.css" rel="stylesheet"> 
<script type="text/javascript">
$("#addBtn").on('click',function(){
		$("input[name=orderRow]:checked").each(function() {
		var checks = $(this).val();
		$(location).attr("href","deliveryAdd.odm?checks="+checks);
		
	});
});
</script>
</head>
<body>

	<h2 class="page_title">주문리스트</h2>
	<table class="table table-bordered table-hover">
		<thead>
			<tr>
				<th><input type="checkbox"></th>
				<th>주문일</th>
				<th>주문번호</th>
				<th>상품코드</th>
				<th>상품명</th>
				<th>주문자명</th>
<!-- 				<th>주문수량</th> -->
<!-- 				<th>결제금액</th> -->
			</tr>
		</thead>
		<c:forEach var="order" items="${list }">
				<tr class="tablecenter">
					<td><input type="checkbox" class="orderChecked" name="orderRow" value="${order.order_detail_id }"></td>
					<td>${order.order_date}</td>
					<td>${order.order_id }</td>
					<td>${order.product_id }</td>
					<td>${order.product_name }</td>
					<td>${order.client_name }</td>
	<!-- 			<td></td> -->
	<!-- 			<td></td> -->
				</tr>
		</c:forEach>

	</table>
	<div class="buttongroup">
<!-- 		<input type="button" id="checkBtn" class="btn btn-default" value="발주확인"> -->
		<input type="button" id="addBtn" class="btn btn-default" value="송장등록">
		<input type="button" id="sendBtn" class="btn btn-default" value="송장전송">
	</div>
</body>
</html>