<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="_csrf" content="${_csrf.token}" />
<meta name="_csrf_header" content="${_csrf.headerName}" />
<script src="/resources/common/js/csrf.js" type="text/javascript"></script>
<!-- 커스텀 -->
<link rel="stylesheet" href="/resources/hr/css/emp.css">
<script src="/resources/hr/js/hr.js" type="text/javascript"></script>
</head>
<body>
	<div class="container-fluid">
		<div class="col-md-8 col-md-offset-2">
			<form:form class="form-horizontal" id="indol_info_update"
				action="/hr/indol/update_indol" method="post">
				<input type='hidden' name='page' value="${cri.page}">
				<input type='hidden' name='perPageNum' value="${cri.perPageNum}">
				<input type='hidden' name='searchType' value="${cri.searchType}">
				<input type='hidden' name='keyword' value="${cri.keyword}">
				<div class="form-group">
					<label for="lateness_label" class="col-sm-2 control-label">지각</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="lateness" value="${indolInfoVO.lateness }">
					</div>
					<input type="hidden" name="emp_id" value="${indolInfoVO.emp_id }">
				</div>

				<div class="form-group">
					<label for="absence_label" class="col-sm-2 control-label">결근</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="absence"
							value="${indolInfoVO.absence }">
					</div>
					<label for="vacation_label"
						class="col-sm-2 col-sm-offset-1 control-label">휴가</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="vacation"
							value="${indolInfoVO.vacation }">
					</div>
				</div>

				<div class="form-group">
					<label for="half_annual_label" class="col-sm-2 control-label">반차</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="half_annual"
							value="${indolInfoVO.half_annual }">
					</div>
					<label for="annual_label"
						class="col-sm-2 col-sm-offset-1 control-label">연차</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="annual"
							value="${indolInfoVO.annual }">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-3 col-sm-offset-5">
						<button type="submit" class="btn btn-default">제출</button>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>