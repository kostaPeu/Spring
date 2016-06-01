<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/shopERP/css/emp.css">
</head>
<body>
	<div class="container-fluid">
		<div class="col-md-8 col-md-offset-2">
			<form class="form-horizontal" id="indol_update">
				<div class="form-group">
					<label for="late_label" class="col-sm-2 control-label">지각</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="lateness">
					</div>
					<label for="absence_label" class="col-sm-2 col-sm-offset-1 control-label">결근</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="absence">
					</div>
				</div>

				<div class="form-group">
					<label for="early_label" class="col-sm-2 control-label">조퇴</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="early_leave">
					</div>
					<label for="vacation_label"
						class="col-sm-2 col-sm-offset-1 control-label">휴가</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="vacation">
					</div>
				</div>

				<div class="form-group">
					<label for="annual_label" class="col-sm-2 control-label">연차</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="annual">
					</div>
					
					<label for="half_label" class="col-sm-2 col-sm-offset-1 control-label">반차</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="half_annual">
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-3 col-sm-offset-5">
						<button type="submit" class="btn btn-default">제출</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>