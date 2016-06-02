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

</head>
<body>

	<h2 class="page_title">근태조회</h2>
	
	<div class="hr_body">
		<div class="pull-right">
			<form class="form-inline" id="search_form">
				<div class="form-group">
					<label for="search_employee">이름</label> <input type="text"
						class="form-control input-sm" id="emp_name_input" name="emp_id">
				</div>
				<button type="submit" class="btn btn-sm">직원검색</button>
			</form>
		</div>
		<div class="container-fluid">
			<table class="table table-condensed table table-bordered">
				<thead>
					<tr class="indol_info_head">
						<th>사번</th>
						<th>이름</th>
						<th>지각</th>
						<th>조퇴</th>
						<th>휴가</th>
						<th>반차</th>
						<th>결근</th>
						<th>이메일</th>
						<th>연차</th>
						<th>수정</th>
						<th>삭제</th>
					</tr>
				</thead>
				<tbody>
					<tr class="indol_info_body">
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td>
							<button type="button" class="btn btn-default btn-xs" id="insert_emp_btn" onclick="fn_update_indol()">수정</button>
						</td>
						<td><button type="button" class="btn btn-default btn-xs">삭제</button></td>
					</tr>
				</tbody>
			</table>
		</div>
		<button type="button" class="btn btn-default" id="insert_emp_btn" onclick="fn_insert_emp()">신규등록</button>
	</div>

</body>
</html>