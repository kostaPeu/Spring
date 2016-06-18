<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/accounting/css/accunting_print.css">
</head>
<body>
	<div class="container-fluid">
		<div class="col-md-3 col-md-offset-2" id="print_btn_group">
			<button type="button" class="btn btn-primary">인쇄</button>
			<button type="button" class="btn btn-primary">Excel</button>
			<button type="button" class="btn btn-primary">PDF</button>
		</div>
	</div>
	<div class="container-fluid">
		<div class="col-md-10 col-md-offset-1">
			<div class="container-fluid" id="print_header">
				<div class="col-md-3 col-md-offset-3">
					<table class="accounting_print_table">
						<tr class="print_head">
							<td>손익계산서</td>
						</tr>						
					</table>
				</div>
				<div class="col-md-3">
					<table class="table table-condensed table table-bordered"
						id="check_area">
						<tr class="print_check_head">
							<td rowspan="4">결재</td>
							<td colspan="2">담당</td>
							<td colspan="2">대리</td>
							<td colspan="2">과장</td>
						</tr>
						<tr class="print_head">
							<td rowspan="3" colspan="2"></td>
							<td rowspan="3" colspan="2"></td>
							<td rowspan="3" colspan="2"></td>
						</tr>
						<tr>
						</tr>
						<tr>
						</tr>
					</table>
				</div>
			</div>

			<div class="container-fluid" id="income_wrapper">
				<div class="col-md-8 col-md-offset-1">
					<table class="table table-condensed table table-bordered"
						id="income_state_table">
						<thead>
							<tr class="print_th">
								<th width="250px">계정명</th>
								<th colspan="2">2016년 6월</th>
								<th colspan="2">2016년 7월</th>
							</tr>
						</thead>
						<tr class="topName">
							<td>1.매출</td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td>상품매출</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
						</tr>						
						<tr>
							<td>제품매출</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
						</tr>						
						<tr class="topName">
							<td>2.매출원가</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
						</tr>
						<tr>
							<td>상품매출원가</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
						</tr>
						<tr>
							<td>제품매출원가</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
						</tr>
						<tr class="topName">
							<td>3.매출총이익</td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr class="topName">
							<td>4.판매비와관리비</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
						</tr>
						<tr>
							<td>직원급여</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
						</tr>
						<tr>
							<td>복리후생비</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
						</tr>
						<tr>
							<td>여비교통비</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
						</tr>
						<tr>
							<td>통신비</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
						</tr>
						<tr>
							<td>소모품비</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
						</tr>
						<tr>
							<td>보험료</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
						</tr>						
						<tr class="topName">
							<td>5.영업손익</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
						</tr>						
					<tr class="topName">
							<td>12.당기순이익</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
							<td>aa</td>
						</tr>
					</table>					
				</div>
			</div>
		</div>
	</div>
	<script src="/shopERP/js/bootstrap.min.js"></script>
</body>
</html>