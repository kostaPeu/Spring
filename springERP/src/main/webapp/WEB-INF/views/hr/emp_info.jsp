<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="/resources/hr/css/emp.css">
<script type="text/javascript">
	
	function fn_update_emp(){
		location.href="./main.jsp?left=./hr/view/hr_side.jsp?&contents=./hr/view/update_emp.jsp";
	}

	function fn_insert_emp(){
		location.href="./main.jsp?left=./hr/view/hr_side.jsp?&contents=./hr/view/insert_emp.jsp";
	}

</script>
<style type="text/css">
ul{
	list-style: none;
	padding: 0;
	margin: 0;
}
</style>
</head>
<body>

	<h2 class="page_title">직원조회</h2>
	
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
					<tr class="emp_info_head">
						<th>사번</th>
						<th>이름</th>
						<th>나이</th>
						<th>입사일</th>
						<th>부서명</th>
						<th>연봉</th>
						<th>주소</th>
						<th>이메일</th>
						<th>전화번호</th>
						<th>직급명</th>
						<th>직무명</th>
						<th>직책명</th>
						<th>프로필사진</th>
						<th>수정</th>
						<th>삭제</th>
					</tr>
				</thead>
				<tbody>
					<tr class="emp_info_body">
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td>aa</td>
						<td><button type="button" class="btn btn-default btn-xs">사진</button></td>
						<td>
							<button type="button" class="btn btn-default btn-xs" id="insert_emp_btn" onclick="fn_update_emp()">수정</button>
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