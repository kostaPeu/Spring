<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Custom CSS -->
<link rel="stylesheet" href="/resources/mypage/css/my_info.css">
</head>
<body>

	<h2 class="page_title">개인정보 및 휴무신청</h2>
	
		<div id="indolence" class="group">
		<h4>근태현황</h4>
		<table class="table table-bordered table-hover">
			<thead>
				<tr class="row">
					<th class="col-sm-2">지각</th>
					<th class="col-sm-2">반차</th>
					<th class="col-sm-2">휴가</th>
					<th class="col-sm-2">연차</th>
					<th class="col-sm-2">결근</th>
					<th class="col-sm-2">기간</th>
				</tr>
			</thead>
			<tbody>
				<tr class="row">
					<td class="col-sm-2">6</td>
					<td class="col-sm-2">6</td>
					<td class="col-sm-2">6</td>
					<td class="col-sm-2">6</td>
					<td class="col-sm-2">6</td>
					<td class="col-sm-2">6</td>
				</tr>
				<tr class="row">
					<td class="col-sm-2">6</td>
					<td class="col-sm-2">6</td>
					<td class="col-sm-2">6</td>
					<td class="col-sm-2">6</td>
					<td class="col-sm-2">6</td>
					<td class="col-sm-2">6</td>
				</tr>
			</tbody>
		</table>
		</div>
			
			
			
		<div id="myinfo" class="group">
		<h4>개인정보</h4>
			<form role="form">
			<table class="table table-bordered">
				<thead>
				</thead>
				<tbody>
					<tr>
						<td>hoho사원번호</td>
						<td><span>${employee.emp_id }</span></td>
						<td>이름</td>
						<td><span>${employee.e_name }</span></td>
						<td>입사일</td>
						<td><span>${employee.e_hiredate }</span></td>
						<td>부서</td>
						<td><span>${employee.dept_id }</span></td>
					</tr>
					<tr>
						<td>직무</td>
						<td><span>${employee.job_id }</span></td>
						<td>직급</td>
						<td><span>${employee.position_id }</span></td>
						<td>직책</td>
						<td><span>${employee.duty_id }</span></td>
						<td>연봉</td>
						<td><span>${employee.e_sal }</span></td>
					</tr>
					<tr>
						<td colspan="2">나이</td>
						<td colspan="6">
							<input class="form-control" type="text" value="${employee.e_age }">
						</td>
					</tr>
					<tr>
						<td colspan="2">전화번호</td>
						<td colspan="6">
							<input class="form-control" type="text" value="${employee.phone_number }">
						</td>
					</tr>
					<tr>
						<td colspan="2">이메일</td>
						<td colspan="6">
							<input class="form-control" type="text" value="${employee.e_email }">
						</td>
					</tr>
					<tr>
						<td colspan="2">주소</td>
						<td colspan="6">
							<input class="form-control" type="text" value="${employee.e_address }">
						</td>
					</tr>
					<tr>
						<td colspan="2">비밀번호</td>
						<td colspan="6">
							<input class="form-control" type="text" value="${employee.e_pwd }">
						</td>
					</tr>
				</tbody>
			</table>
		    	<button type="button" class="btn btn-default center-block">수정</button>
		    	
		    </form>
		</div>
		
		
		
		
		<div id="holiday" class="group">
		<h4>휴가신청</h4>
		<form class="col-sm-12">
			<div class="col-sm-3">
				<select class="form-control">
					<option selected>선택하세요</option>
					<option>연차</option>
					<option>휴가</option>
				</select>
			</div>
			<div class="col-sm-6">
				<input type="date" class="form-control">
			</div>
			<button type="button" class="col-sm-3 btn btn-success">신청</button>
		</form>
		</div>

</body>
</html>