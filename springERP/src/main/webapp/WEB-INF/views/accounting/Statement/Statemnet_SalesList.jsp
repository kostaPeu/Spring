<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2 class="page_title">매출청구서조회</h2>

	<div class="mainContents">

		<!-- 매출청구서리스트 -->
		<div class="container-fluid">
			<div class="table-responsive">
				<table class="table table-bordered table-hover table-striped"
					id="Card">
					<thead id="Statement_ExpenseList">
						<tr class="mainTable">
							<th><input type="checkbox"></th>
							<th>일자 - 번호</th>
							<th>거래처명</th>
							<th>공급가액</th>
							<th>부가세</th>
							<th>합계</th>
							<th>내역</th>							
						</tr>
					</thead>
					<tbody id="cardInfos">
						<tr class="mainTable">						
							<td><input type="checkbox"></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>						
							<td><input type="button" name="select" value="보기"></td>
						</tr>
					</tbody>
				</table>
				<div class="buttongroup" align="right">
					<input type="button" id="print" class="btn btn-default"
						value="인쇄">
					<input type="button" id="excel" class="btn btn-default"
						value="엑셀저장">
				</div>
			</div>
		</div>
	</div>

</body>
</html>