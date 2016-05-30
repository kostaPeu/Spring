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
			<form class="form-horizontal" id="emp_insert">
				<div class="form-group">
					<label for="emp_id_label" class="col-sm-2 control-label">사번</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="emp_id">
					</div>
					<div class="col-sm-1">
						<button type="button" class="btn btn-default">중복확인</button>
					</div>
					<label for="e_pwd_label" class="col-sm-2 control-label">암호</label>
					<div class="col-sm-3">
						<input type="password" class="form-control" name="e_pwd">
					</div>
				</div>

				<div class="form-group">
					<label for="e_name_label" class="col-sm-2 control-label">이름</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="e_name">
					</div>
					<label for="e_age_label"
						class="col-sm-2 col-sm-offset-1 control-label">나이</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="e_age">
					</div>
				</div>

				<div class="form-group">
					<label for="e_hiredate_label" class="col-sm-2 control-label">입사일</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="e_hiredate"
							placeholder="YYYY-MM-DD">
					</div>
					<label for="e_sal_label"
						class="col-sm-2 col-sm-offset-1 control-label">연봉</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="e_sal">
					</div>
				</div>

				<div class="form-group">
					<label for="e_sal_label" class="col-sm-2 control-label">연봉</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="e_sal">
					</div>
					<label for="e_email_label"
						class="col-sm-2 col-sm-offset-1 control-label">전화번호</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="phone_number">
					</div>
				</div>

				<div class="form-group">
					<label for="e_address_label" class="col-sm-2 control-label">주소</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" name="e_address">
					</div>
				</div>

				<div class="form-group">
					<label for="dept_id_label" class="col-sm-2 control-label">부서</label>
					<div class="col-sm-5">
						<input type="text" class="form-control" name="dept_id">
					</div>
					<div class="col-sm-2">
						<button type="button" class="btn btn-default">부서검색</button>
					</div>
				</div>

				<div class="form-group">
					<label for="position_id_label" class="col-sm-2 control-label">직급</label>
					<div class="col-sm-5">
						<input type="text" class="form-control" name="position_id">
					</div>
					<div class="col-sm-2">
						<button type="button" class="btn btn-default">직급검색</button>
					</div>
				</div>

				<div class="form-group">
					<label for="job_id_label" class="col-sm-2 control-label">직무</label>
					<div class="col-sm-5">
						<input type="text" class="form-control" name="job_id">
					</div>
					<div class="col-sm-2">
						<button type="button" class="btn btn-default">직무검색</button>
					</div>
				</div>

				<div class="form-group">
					<label for="duty_id_label" class="col-sm-2 control-label">직책</label>
					<div class="col-sm-5">
						<input type="text" class="form-control" name="duty_id">
					</div>
					<div class="col-sm-2">
						<button type="button" class="btn btn-default">직책검색</button>
					</div>
				</div>

				<div class="form-group">
					<label for="pic_label" class="col-sm-2 control-label">프로필사진</label>
					<div class="col-sm-8">
						<input type="file" name="e_prople_pic">
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