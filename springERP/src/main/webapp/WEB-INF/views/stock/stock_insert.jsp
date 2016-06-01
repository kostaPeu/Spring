<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

		<form action="/basic/stock/insert" method="post">
			<select class="form-control" id="pgroup_id" name="pgroup_id">
				<c:forEach var="p" items="${plist }">
					<option value="${p.pgroup_id }">${p.pgroup_id}</option>
				</c:forEach>
			</select>
			<input type="number" id="inout_amount" name="inout_amount" min="1" max="1000" step="10"> 개
			<input type="radio" name="type" value="in">입고
			<input type="radio" name="type" value="out">출고
			<input type="hidden" name="emp_id" value="aa">
		</form>
</body>
</html>