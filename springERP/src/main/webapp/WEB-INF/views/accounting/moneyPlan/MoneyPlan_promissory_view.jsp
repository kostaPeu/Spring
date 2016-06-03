<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="/shopERP/accounting/js/main.js" type="text/javascript"></script>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<link href="/shopERP/accounting/css/card.css" rel="stylesheet">
</head>
<body>

	<h2 class="page_title">계획전표조회</h2>

	<div class="mainContents">
		<form class="form-horizontal" action="">
			<table class="table table-bordered table-hover new" id="moneyList">
				<thead style="vertical-align: middle; text-align: center;">
					<tr>
						<th><input type="checkbox"></th>
						<th>일자</th>
						<th colspan="2">구분</th>
						<th>금액</th>
						<th>계정</th>
						<th>거래처</th>
						<th>비고</th>
						<th>통장</th>
					</tr>
				</thead>
				<tbody style="vertical-align: middle; text-align: center;">
					<tr>
						<td><input type="checkbox"></td>
						<td>2016/04/11</td>
						<td>출</td>
						<td>지급</td>
						<td>7,000,000</td>
						<td>외상매입금</td>
						<td>LG전자</td>
						<td>원재료</td>
						<td><input type="button" value="통장" name=""></td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
			<!-- 메뉴 footar END -->
		<div class="footer footer-fixed" id="footer-Group"
			style="display: block;">
			<div class="wrapper-toolbar">
				<div class="pull-reft"></div>
				<div class="pull-right" id="button-Group">
					<button id="btn-footer-Save" class="btn btn-xs btn-default"
						type="button" name="">전표 목록조회</button>
					<button id="btn-footer-Save" class="btn btn-xs btn-default"
						type="Submit" name="">지출결의서 작성</button>
					<button id="btn-footer-Reset" class="btn btn-xs btn-default"
						type="Submit" name="">입금보고서 작성</button>
					<button id="btn-footer-Close" class="btn btn-xs btn-default"
						type="button">삭제</button>
				</div>
			</div>
		</div><!-- 메뉴 footar END -->
	</div><!-- 신규등록 END -->


</body>
</html>