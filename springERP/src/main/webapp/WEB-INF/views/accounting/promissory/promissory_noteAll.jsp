<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="_csrf" content="${_csrf.token}"/>
<meta name="_csrf_header" content="${_csrf.headerName}"/>

<!-- CSS -->
<link href="/resources/accounting/css/account.css" rel="stylesheet">

<!-- JS -->
<script src="/resources/accounting/js/ac.js" type="text/javascript"></script>
<script src="/resources/common/js/csrf.js" type="text/javascript"></script>
</head>
<body>

	<h2 class="page_title">어음원장</h2>

	<!-- 상단 메뉴이름 -->
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
						<th>조회일자</th>
						<td><select id="yy" onfocus="nextfield ='mm';" name="yy">
								<option value="2017">2017</option>
								<option value="2016" selected="selected">2016</option>
								<option value="2015">2015</option>
								<option value="2014">2014</option>
								<option value="2013">2013</option>
								<option value="2012">2012</option>
						</select> <select id="mm" onfocus="nextfield ='dd';" name="mm">
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
							size="5" value="25" maxlength="3" name="dd"><a> ~ </a> <select
							id="yy" onfocus="nextfield ='mm';" name="yy">
								<option value="2017">2017</option>
								<option value="2016" selected="selected">2016</option>
								<option value="2015">2015</option>
								<option value="2014">2014</option>
								<option value="2013">2013</option>
								<option value="2012">2012</option>
						</select> <select id="mm" onfocus="nextfield ='dd';" name="mm">
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
							size="5" value="25" maxlength="3" name="dd"></td>
					</tr>

					<tr id="row-sysdate">
						<th>기준일</th>
						<td><select id="yy" onfocus="nextfield ='mm';" name="yy"
							disabled="disabled">
								<option value="2017">2017</option>
								<option value="2016" selected="selected">2016</option>
								<option value="2015">2015</option>
								<option value="2014">2014</option>
								<option value="2013">2013</option>
								<option value="2012">2012</option>
						</select> <select id="mm" onfocus="nextfield ='dd';" name="mm"
							disabled="disabled">
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
							size="5" value="25" maxlength="3" name="dd" disabled="disabled">
						</td>
					</tr>
					<tr id="row-deptNum">
						<th>부서코드</th>
						<td><input id="warehouse_id" type="text">
							<button id="warehouse_id_search" class="btn btn-default btn-sm">
								<span class="fa fa-search"></span>
							</button> <input type="text" name="" value="">
					</tr>
					<tr id="row-project">
						<th>프로젝트번호</th>
						<td><input id="project_number" type="text">
							<button id="project_number_search" class="btn btn-default btn-sm">
								<span class="fa fa-search"></span>
							</button> <input type="text" name="" value="">
					</tr>
					<tr>
						<th>구분</th>
						<td><select class="form-control">
								<option>받을어음발행내역</option>
								<option>지급어음발행내역</option>
								<option>보유어음현황</option>
						</select></td>
					</tr>
					<tr id="row-noteNum">
						<th>어음번호</th>
						<td><input id="card_number" type="text">
							<button id="card_number_search" class="btn btn-default btn-sm">
								<span class="fa fa-search"></span>
							</button> <input type="text" name="" value="">
					</tr>
					<tr >
						<th>간편검색조건</th>
						<td >
							<ul class="list-inline">
								<li>금일</li>
								<li>전일</li>
								<li>금주</li>
								<li>전주</li>
								<li>금월</li>
								<li>전월</li>
							</ul>
						</td>
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
						type="Submit">조회</button>
					<button id="btn-footer-Reset" class="btn btn-xs btn-default"
						type="button" value="reset">리셋</button>

				</div>
			</div>
		</div>
		<!-- 메뉴 footar END -->
	</div>
	<!-- 신규등록 END -->


</body>
</html>