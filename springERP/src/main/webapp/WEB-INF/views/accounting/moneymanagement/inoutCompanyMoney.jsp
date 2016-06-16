<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--jQuery UI CSS파일   -->
<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />
<!--jQuery 기본 js파일   -->
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<!--jQuery UI 라이브러리 js파일   -->
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>

<!-- JS파일 -->
<script src="/resources/accounting/js/promissory.js" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="_csrf" content="${_csrf.token}"/>
<meta name="_csrf_header" content="${_csrf.headerName}"/>
</head>
<body>

	<h2 class="page_title">거래처로부터</h2>

	<div class="mainContents">
		<form:form action="/accounting/moneymanagement/inoutCompanyMoney" method="post">
			<div class="contents contents-fixed" style="top: 29px; bottom: 34px">
				<!-- 신규등록 Table Start -->
				<table
					class="table table-bordered table-hover table-left table-striped">
					<colgroup>
						<col style="width: 149px;">
						<col style="width: 600px;">
					</colgroup>
					<tbody>
						<tr id="row-date">
							<th>전표일자</th>
							<td><div class="col-sm-6 input-group">
									<input type="text" name="red_date" id="datepicker"	class="form-control">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-th" id="icon"></span>
									</div>
							</div></td>
						</tr>		
						<tr id="row-CardTYPE">
							<th>매입/매출 <span class="card-Info" data-html="true"
								data-toggle="popover" data-trigger="focus hover"
								data-placement="right" data-original-title="" title=""></span>
							</th>
							<td>
								<div class="radio-inline">
									<label> <input id="optionsRadios1" type="radio"
										checked="" value="매입" name="typelist">매입
									</label>
								</div>
								<div class="radio-inline">
									<label> <input id="optionsRadios2" type="radio"
										value="매출" name="typelist">매출
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
								<button id="project_number_search"
									class="btn btn-default btn-sm">
									<span class="fa fa-search"></span>
								</button> <input type="text" name="" value="">
						</tr>
						<tr id="row-accountNum">
							<th>계좌번호</th>
							<td><input id="account_number" type="text"
								name="account_number">
								<button id="account_number_search"
									class="btn btn-default btn-sm">
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
							<td><input class="form-control" type="text" value=""  name="charge"></td>
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
						<input id="btn-footer-Save" class="btn btn-xs btn-default"
							type="submit" value="저장"> <input id="btn-footer-Reset"
							class="btn btn-xs btn-default" type="reset" value="다시작성">
					</div>
				</div>
			</div>
			<!-- 메뉴 footar END -->
		</form:form>
	</div>
	<!-- 신규등록 END -->

</body>
</html>