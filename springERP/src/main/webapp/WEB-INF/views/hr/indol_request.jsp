<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="_csrf" content="${_csrf.token}"/>
<meta name="_csrf_header" content="${_csrf.headerName}"/>
<script src="/resources/common/js/csrf.js" type="text/javascript"></script>
<!-- 커스텀 -->
<link rel="stylesheet" href="/resources/hr/css/emp.css">
<script src="/resources/hr/js/hr.js" type="text/javascript"></script>

<script type="text/javascript">
	
	function fn_update_indol(){
		/* location.href="./mainTest2.jsp?left=./hr/view/hr_side.jsp?&contents=./hr/view/update_indol.jsp"; */
	}

</script>
</head>
<body>

	<h2 class="page_title">연차/휴가요청</h2>
	
	<div class="container-fluid">
		<table class="table table-condensed table table-bordered">
			<thead>
				<tr class="indol_request_th">
					<th>요청번호</th>
					<th>사번</th>
					<th>이름</th>
					<th>연차신청일</th>
					<th>신청일</th>
					<th>휴가/연차</th>
					<th>승인</th>
					<th>거부</th>
					<th>승인여부</th>
				</tr>
			</thead>
			<tr class="indol_request_td">
				<td>aa</td>
				<td>aa</td>
				<td>aa</td>
				<td>aa</td>
				<td>aa</td>
				<td>aa</td>
				<td>
					<button type="button" class="btn btn-default btn-xs">승인</button>
				</td>
				<td>
					<button type="button" class="btn btn-default btn-xs">거부</button>
				</td>
				<td>aa</td>
			</tr>
		</table>
	</div>
</body>
</html>