<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="/shopERP/accounting/js/main.js" type="text/javascript"></script>
<link href="/shopERP/accounting/css/card.css" rel="stylesheet">
</head>
<body>

	<h2 class="page_title">거래처로부터</h2>

	<div class="mainContents">
		
		
		<div class="contents contents-fixed" style="top: 29px; bottom: 34px">
		<!-- 신규등록 Table Start -->
			<table
				class="table table-bordered table-hover table-left table-striped">
				<colgroup>
					<col style="width: 149px;">
					<col style="width: 600px;">
				</colgroup>
				<tbody>
					<tr id="row-CardTYPE">
						<th>전표일자</th>
						<td><select id="yy" onfocus="nextfield ='mm';" name="statement_id">
								<option value="2017">2017</option>
								<option value="2016" selected="selected">2016</option>
								<option value="2015">2015</option>
								<option value="2014">2014</option>
								<option value="2013">2013</option>
								<option value="2012">2012</option>
						</select> <select id="mm" onfocus="nextfield ='dd';" name="statement_id">
								<option value="01">1월</option>
								<option value="02">2월</option>
								<option value="03">3월</option>
								<option value="04" selected="selected">4월</option>
								<option value="05">5월</option>
								<option value="06">6월</option>
								<option value="07">7월</option>
								<option value="08">8월</option>
								<option value="09">9월</option>
								<option value="10">10월</option>
								<option value="11">11월</option>
								<option value="12">12월</option>
						</select> <input type="text" class="default" id="dd"
							style="width: 20px; background-color: rgb(255, 255, 255);"
							size="5" value="25" maxlength="3" name="statement_id"></td>
					</tr>
					<tr id="row-CardTYPE">
						<th>매입/매출 <span class="card-Info" data-html="true"	data-toggle="popover" data-trigger="focus hover" data-placement="right" data-original-title="" title=""></span>
						</th>
						<td>
							<div class="radio-inline">
								<label> <input id="optionsRadios1" type="radio"
									checked="" value="option1" name="type">매입
								</label>
							</div>
							<div class="radio-inline">
								<label> <input id="optionsRadios2" type="radio"
									value="option2" name="type"> 매출
								</label>
							</div>
						</td>
					</tr>
					<tr id="row-customer">
						<th>거래처</th>
						<td><input id="warehouse_id" type="text" name="customer_id">
							<button id="warehouse_id_search" class="btn btn-default btn-sm">
								<span class="fa fa-search"></span>
							</button> <input type="text" name="" value="">
					</tr>
					<tr id="row-deptNum">
						<th>부서코드</th>
						<td><input id="warehouse_id" type="text" name="dept_id">
							<button id="warehouse_id_search" class="btn btn-default btn-sm">
								<span class="fa fa-search"></span>
							</button> <input type="text" name="" value="">
					</tr>
					<tr id="row-project">
						<th>프로젝트 번호</th>
						<td><input id="project_number" type="text" name="proj_id">
							<button id="project_number_search" class="btn btn-default btn-sm">
								<span class="fa fa-search"></span>
							</button> <input type="text" name="" value="">
					</tr>
					<tr id="row-accountNum">
						<th>계좌번호</th>
						<td><input id="account_number" type="text" name="account_number">
							<button id="account_number_search" class="btn btn-default btn-sm">
								<span class="fa fa-search"></span>
							</button> <input type="text" name="" value="">
					</tr>	

					<tr id="row-money">
						<th>금액</th>
						<td><input class="form-control" type="text" value=""
							placeholder="금액" name="sums"></td>
					</tr>

					<tr id="row-CardName">
						<th>수수료</th>
						<td><input class="form-control" type="text" value=""
							placeholder="수수료 10%" disabled="disabled" name="charge"></td>
					</tr>

					<tr id="row-Employee">
						<th>비고</th>
						<td><input class="form-control" type="text" value="" name="remarks"></td>
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
						<input id="btn-footer-Save" class="btn btn-xs btn-default"
							type="submit" value="저장">
						<input id="btn-footer-Reset" class="btn btn-xs btn-default"
							type="reset" value="다시작성">						
					</div>
			</div>
		</div><!-- 메뉴 footar END -->
	</div><!-- 신규등록 END -->

</body>
</html>