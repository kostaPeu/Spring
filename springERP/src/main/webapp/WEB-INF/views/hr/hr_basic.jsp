<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	request.setCharacterEncoding("utf-8");
%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/shopERP/css/emp.css">
<script type="text/javascript">
	$(function() {
		$("#dept").click(function() {
			$(".add_basic").css("display", "block");
			
			$(".basic_title").html("부서");
			
			$(".basic_info_head th:nth-child(1)").html("부서번호");
			$(".basic_info_head th:nth-child(2)").html("부서명");
			
			$("#insert_id_label").html("부서번호");
			$("#insert_name_label").html("부서명");
			$("#update_id_label").html("부서번호");
			$("#update_name_label").html("부서명");
			
			$("#insert_type").val("dept");
			$("#update_type").val("dept");
		});
		$("#position").click(function() {
			$(".add_basic").css("display", "block");
			
			$(".basic_title").html("직급");
			
			$(".basic_info_head th:nth-child(1)").html("직급번호");
			$(".basic_info_head th:nth-child(2)").html("직급명");
			
			$("#insert_id_label").html("직급번호");
			$("#insert_name_label").html("직급명");
			$("#update_id_label").html("직급번호");
			$("#update_name_label").html("직급명");
			
			$("#insert_type").val("position");
			$("#update_type").val("position");
		});
		$("#job").click(function() {
			$(".add_basic").css("display", "block");
			
			$(".basic_title").html("직무");
			
			$(".basic_info_head th:nth-child(1)").html("직무번호");
			$(".basic_info_head th:nth-child(2)").html("직무명");
			
			$("#insert_id_label").html("직무번호");
			$("#insert_name_label").html("직무명");
			$("#update_id_label").html("직무번호");
			$("#update_name_label").html("직무명");
			
			$("#insert_type").val("job");
			$("#update_type").val("job");
		});
		$("#duty").click(function() {
			$(".add_basic").css("display", "block");
			
			$(".basic_title").html("직책");
			
			$(".basic_info_head th:nth-child(1)").html("직책번호");
			$(".basic_info_head th:nth-child(2)").html("직책명");
			
			$("#insert_id_label").html("직책번호");
			$("#insert_name_label").html("직책명");
			$("#update_id_label").html("직책번호");
			$("#update_name_label").html("직책명");
			
			$("#insert_type").val("duty");
			$("#update_type").val("duty");
		});

		$("#closebtn").click(function() {
			$(".add_basic").css("display", "none");
		});
	});
	
</script>
</head>
<body>

	<h2 class="page_title">인사기초등록</h2>
	
	<div class="add_basic">
		<div class="title">
			<span class="basic_title"><strong>부서등록</strong></span>
			<button type="button" class="close" id="closeBtn">
				<span>&times;</span>
			</button>
		</div>
		<div class="container-fluid">
			<div class="col-md-12">
				<table class="table table-condensed table table-bordered">
					<thead>
						<tr class="basic_info_head">
							<th>부서번호</th>
							<th>부서명</th>
							<th>삭제</th>
						</tr>
					</thead>
					<tr class="basic_info_body">
						<td>aa</td>
						<td>aa</td>
						<td><button type="button" class="btn btn-default btn-xs">삭제</button></td>
					</tr>
				</table>
			</div>
		</div>

		<form class="form-horizontal" id="b_insert">
			<div class="form-group">
				<div class="container-fluid" id="basic_insert_form">
					<label id="insert_id_label" for="basic_id_label" class="col-sm-2 control-label">부서번호</label>
					<div class="col-sm-2">
						<input type="text" class="form-control" name="basic_id">
					</div>
					<div class="col-sm-1">
						<button type="button" class="btn btn-default">중복확인</button>
					</div>
					<label id="insert_name_label" for="basic_name_label" class="col-sm-2 control-label">부서명</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="basic_name">
					</div>
					
					<input type="hidden" id="insert_type" name="basic_type" value="">
					
					<div class="col-sm-1">
						<button type="submit" class="btn btn-default">등록</button>
					</div>
				</div>
			</div>
		</form>
		<form class="form-horizontal" id="b_update">
			<div class="form-group">
				<div class="container-fluid" id="basic_update_form">
					<label id="update_id_label" for="basic_id_label" class="col-sm-2 control-label">부서번호</label>
					<div class="col-sm-2">
						<input type="text" class="form-control" name="basic_id">
					</div>

					<label id="update_name_label" for="basic_name_label"
						class="col-sm-2 col-sm-offset-1 control-label">부서명</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="basic_name">
					</div>
					
					<input type="hidden" id="update_type" name="basic_type" value="">
					
					<div class="col-sm-2">
						<button type="submit" class="btn btn-default">수정</button>
					</div>
				</div>
			</div>
		</form>
		<button class="btn btn-default col-md-2 col-md-offset-5" id="closebtn">닫기</button>
	</div>
	
	
	
	<div class="container-fluid">
		<table class="table table-bordered" id="basic_insert">
			<tr>
				<th>부서</th>
				<th>직급</th>
				<th>직무</th>
				<th>직책</th>
			</tr>
			<tr>
				<td><button type="button" class="btn btn-default" id="dept">등록</button></td>
				<td><button type="button" class="btn btn-default" id="position">등록</button></td>
				<td><button type="button" class="btn btn-default" id="job">등록</button></td>
				<td><button type="button" class="btn btn-default" id="duty">등록</button></td>
			</tr>
		</table>
	</div>
	<script src="/shopERP/js/bootstrap.min.js"></script>
</body>
</html>