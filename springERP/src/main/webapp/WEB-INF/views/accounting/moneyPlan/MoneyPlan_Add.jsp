<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/shopERP/accounting/css/card.css" rel="stylesheet">
<script src="./js/bootstrap-datepicker.js"></script>
<script src="/shopERP/accounting/js/main.js" type="text/javascript"></script>
<script type="text/javascript">
$(function() {
	$('.datepicker').datepicker({
	    dateFormat: "yyyy-mm-dd",
	    startDate: '-3d'
	});
});

</script>
</head>
<body>

	<h2 class="page_title">자금계획등록</h2>

	<div class="mainContents">
		<form action="insertMoneyPlan.ac" method="post">
			<div class="contents contents-fixed" style="top: 29px; bottom: 34px">
				<!-- 신규등록 Table Start -->
				<table
					class="table table-bordered table-hover table-left table-striped">
					<colgroup>
						<col style="width: 149px;">
						<col style="width: 600px;">
					</colgroup>
					<tbody>
						<tr>
							<th>계획번호</th>
							<td><input type="text" name="funds_id"></td>
						</tr>
						<tr id="row-TYPES">
							<th>입출금 구분 <span class="card-Info" data-html="true"
								data-toggle="popover" data-trigger="focus hover"
								data-placement="right" data-original-title="" title=""></span>
							</th>
							<td>
								<div class="radio-inline">
									<label> <input id="optionsRadios1" type="radio"
										checked="" name="typelist">출금
									</label>
								</div>
								<div class="radio-inline">
									<label> <input id="optionsRadios2" type="radio"
										name="typelist">입금
									</label>
								</div>
							</td>
						</tr>
						<tr id="row-CardTYPE">
							<th>발생단위</th>
							<td><select class="form-control" name="repeat_unit">
									<option>1개월마다</option>
									<option>2개월마다</option>
									<option>3개월마다</option>
									<option>4개월마다</option>
									<option>5개월마다</option>
									<option>6개월마다</option>
									<option>7개월마다</option>
									<option>8개월마다</option>
									<option>9개월마다</option>
									<option>10개월마다</option>
									<option>11개월마다</option>
									<option>12개월마다</option>
							</select></td>
						</tr>
						<tr>
							<th>최초 발생날짜</th>
							<td>
								<div class="col-sm-6 input-group date datepicker">
									<input type="text" class="form-control" name="start_date">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-th"></span>
									</div>
								</div>
							</td>
						</tr>

						<tr>
							<th>발생기간</th>
							<td><div class="col-sm-6 input-group date datepicker">
									<input type="text" class="form-control" name="period">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-th"></span>
									</div>
								</div></td>
						</tr>

						<tr id="row-deptNum">
							<th>부서코드</th>
							<td><input id="warehouse_id" type="text" name="dept_id">
								<button id="warehouse_id_search" class="btn btn-default btn-sm">
									<span class="fa fa-search"></span>
								</button>
						</tr>
						<tr id="row-project">
							<th>프로젝트번호</th>
							<td><input id="project_number" name="proj_id" type="text">
								<button id="project_number_search"
									class="btn btn-default btn-sm">
									<span class="fa fa-search"></span>
								</button>
						</tr>
						<tr id="row-accountNum">
							<th>계좌번호</th>
							<td><input id="account_number" type="text"
								name="account_number">
								<button id="account_number_search"
									class="btn btn-default btn-sm">
									<span class="fa fa-search"></span>
								</button>
						</tr>
						<tr id="row-customer">
							<th>계정</th>
							<td><input id="warehouse_id" type="text"
								name="diagnosis_number">
								<button id="warehouse_id_search" class="btn btn-default btn-sm">
									<span class="fa fa-search"></span>
								</button>
						</tr>
						<tr id="row-noteNum">
							<th>거래처</th>
							<td><input id="customer_id" type="text" name="customer_id">
								<button id="card_number_search" class="btn btn-default btn-sm">
									<span class="fa fa-search"></span>
								</button>
						</tr>
						<tr id="row-money">
							<th>금액</th>
							<td><input class="form-control" type="text" value=""
								placeholder="금액" name="sums"></td>
						</tr>
						<tr id="row-Employee">
							<th>비고</th>
							<td><input class="form-control" type="text" value=""
								name="remarks"></td>
						</tr>
					</tbody>
				</table>
			</div>
			<!-- 메뉴 footar END -->
			<div class="footer footer-fixed" id="footer-Group"
				style="display: block;">
				<div class="wrapper-toolbar">
					<div class="pull-reft"></div>
					<div class="pull-right" id="button-Group">
						<button id="btn-footer-Save" class="btn btn-xs btn-default"
							type="Submit">저장</button>
						<button id="btn-footer-Reset" class="btn btn-xs btn-default"
							type="button" value="reset">리셋</button>
						<button id="btn-footer-Close" class="btn btn-xs btn-default"
							type="button">닫기</button>
					</div>
				</div>
			</div>
			<!-- 메뉴 footar END -->
		</form>
	</div>
	<!-- 신규등록 END -->

</body>
</html>