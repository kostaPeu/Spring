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

</head>
<body>

<h2 class="page_title">전표 조회</h2>
<div class="mainContents">

		<!-- 매입청구서리스트 -->
		<div class="container-fluid">
			<div class="table-responsive">
				<table class="table table-bordered table-hover table-striped"
					id="Card">
					<thead id="Statement_ExpenseList">
						<tr class="mainTable">
							<th><input type="checkbox"></th>
							<th>전표일자</th>
							<th>전표유형</th>
							<th>금액</th>
							<th>거래처명</th>													
							<th>내역</th>									
						</tr>
					</thead>
					<tbody id="cardInfos">
						<c:forEach var="promissorysales" items="${promissorysales}">
							<tr class="mainTable">
								<td><input type="checkbox" class="upSelect check_id" name="number_box"></td>
								<td>${promissorysales.red_date}</td>
								<td>매출전표(매출)</td>
								<td>${promissorysales.total }</td>
								<td>${promissorysales.customer_name }</td>		
								<td>${promissorysales.remarks }</td>
							</tr>
						</c:forEach>
						<c:forEach var="Cashsales" items="${Cashsales}">
							<tr class="mainTable">
								<td><input type="checkbox" class="upSelect check_id" name="number_box"></td>
								<td>${Cashsales.red_date}</td>
								<td>매출전표(매출)</td>
								<td>${Cashsales.total }</td>
								<td>${Cashsales.customer_name }</td>		
								<td>${Cashsales.remarks }</td>
							</tr>
						</c:forEach>	
						<c:forEach var="promissoryPurchase" items="${promissoryPurchase}">
							<tr class="mainTable">
								<td><input type="checkbox" class="upSelect check_id" name="number_box"></td>
								<td>${promissoryPurchase.red_date}</td>
								<td>매입전표(매입)</td>
								<td>${promissoryPurchase.total }</td>
								<td>${promissoryPurchase.customer_name }</td>		
								<td>${promissoryPurchase.remarks }</td>
							</tr>
						</c:forEach>
						<c:forEach var="CashPurchase" items="${CashPurchase}">
							<tr class="mainTable">
								<td><input type="checkbox" class="upSelect check_id" name="number_box"></td>
								<td>${CashPurchase.red_date}</td>
								<td>매입전표(매입)</td>
								<td>${CashPurchase.total }</td>
								<td>${CashPurchase.customer_name }</td>		
								<td>${CashPurchase.remarks }</td>
							</tr>
						</c:forEach>	
						
						
						
									
					</tbody>
				</table>
				<div class="buttongroup" align="right">
					<input type="button" id="print" class="btn btn-default"	value="인쇄">
					<input type="button" id="excel" class="btn btn-default"	value="엑셀저장">
				</div>
			</div>
		</div>
	</div>

</body>
</html>