<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="/resources/accounting/js/moneymanagement.js" type="text/javascript"></script>
<script src="/resources/common/js/csrf.js" type="text/javascript"></script>

</head>
<body>

	<h2 class="page_title">입출금 보고서</h2>


	<!-- 자금계획 조회 모달기능 -->
	<div>
		<div class="selectdate">
			<input type="date" id="datefiker">
			<a  data>
			<button type="button" id="moneyplanselect" data-toggle="modal" data-target="#Modal">자금계획</button>
			</a>
		</div>
	</div>

	<!-- 자금계획 모달 내용부분 -->
	<div class="modal fade" id="Modal" aria-hidden="true" aria-labelledby="Modal">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">
						<strong>자금계획</strong>
					</h4>
				</div>
				<div class="modal-body">
						<table class="table table-bordered table-hover table-striped"
					id="Card">
					<thead id="cardList">
						<tr class="mainTable">							
							<th><input type="checkbox"></th>
							<th>구분</th>
							<th>발생일자</th>						
							<th>발생기간</th>
							<th>자금계획번호</th>
							<th>금액</th>
							<th>계좌번호</th>
							<th>거래처</th>
							<th>비고</th>
						</tr>
					</thead>					
					<tbody id="cardInfos">
					<c:forEach var="cash" items="${listModel}">
						<tr class="mainTable">
							<td><input type="checkbox"></td>													
							<td>${cash.typelist}</td>
							<td>${cash.start_date}</td>
							<td>${cash.periods}</td>
							<td>${cash.funds_id}</td>							
							<td>${cash.sums}</td>
							<td>${cash.account_number}</td>
							<td>${cash.customer_id}</td>
							<td>${cash.remarks}</td>							
						</tr>
					</c:forEach>
					</tbody>
				</table>
					<div id="ustBtnArea">
						<input type="button" class="btn btn-default center useBtn"	value="사용" data-dismiss="modal">
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	
	
<div id="Bottom2-contents-warpper">
	<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
		<ul id="myTab" class="nav nav-tabs " role="tablist">
			<li class="active" role="presentation">
				<a id="first-tab" aria-expanded="in" aria-controls="#first-tabs" data-toggle="tab" role="tab" href="#first-tabs">입금보고서</a>
			</li>
			<li class="" role="presentation">
				<a id="second-tab" aria-controls="#second-tabs" data-toggle="tab" role="tab" href="#second-tabs" aria-expanded="">출금보고서</a>
			</li>						
		</ul>
		
	<!-- 입금보고서 Start -->
	
		<form class="form-horizontal">
			<div id="deposit-contents" class="tab-content">
				<div id="first-tabs" class="tab-pane fade active in" aria-labelledby="first-tab" role="tabpanel" style="display: none;">
				<table class="table table-bordered table-hover new" id="saleList">
					<thead>
					<tr id="abc" align="center" valign="middle">
						<th class="abcd" align="center" valign="middle">
							<input	type="checkbox" disabled="disabled">
						</th>
						<th align="center" valign="middle">
							<input type="button" class="btn btn-default btn-sm saleListAdd" value="▼">
						</th>
						<th align="center" valign="middle" class="col-sm-12">계정코드</th>
						<th align="center" valign="middle">입금된계좌번호</th>
						<th align="center" valign="middle">거래처</th>
						<th align="center" valign="middle">금액</th>
						<th align="center" valign="middle">수수료</th>
						<th align="center" valign="middle">부서</th>
						<th align="center" valign="middle">프로젝트</th>
						<th align="center" valign="middle">비고</th>
					</tr>
					</thead>
					
				<tbody>
					<tr align="center">
						<td><input type="checkbox"></td>
						<td>
						
							<input type="button"class="btn btn-default btn-sm saleListAdd" value="▼"/>
						</td>
						
						<td class="col-sm-8"><input type="text"	size="10">
							<button class="btn btn-default btn-sm" type="submit" style="margin-left: 10px;">
								<span class="fa fa-search" style="width: 100%"></span>
							</button>
						</td>
						
						<td>
						<input type="text" name="" id="" size="20">
							<button class="btn btn-default btn-sm" type="submit"style="margin-left: 10px;">
								<span class="fa fa-search"></span>
							</button>
						</td>
						
						<td>
						<input type="text" name="" id="" size="15">
							<button class="btn btn-default btn-sm" type="submit" style="margin-left: 10px;">
								<span class="fa fa-search"></span>
							</button>
						</td>
						
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
					</tr>
					
					<tr align="center">
						<td><input type="checkbox"></td>
						<td>
						
							<input type="button"class="btn btn-default btn-sm saleListAdd" value="▼"/>
						</td>
						
						<td class="col-sm-8"><input type="text"	size="10">
							<button class="btn btn-default btn-sm" type="submit" style="margin-left: 10px;">
								<span class="fa fa-search" style="width: 100%"></span>
							</button>
						</td>
						
						<td>
						<input type="text" name="" id="" size="20">
							<button class="btn btn-default btn-sm" type="submit"style="margin-left: 10px;">
								<span class="fa fa-search"></span>
							</button>
						</td>
						
						<td>
						<input type="text" name="" id="" size="15">
							<button class="btn btn-default btn-sm" type="submit" style="margin-left: 10px;">
								<span class="fa fa-search"></span>
							</button>
						</td>
						
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
					</tr>
					
					<tr style="text-align: center; font-size: 14px; font-weight: bold;">
						<td colspan="3">금액합계</td>
						<td colspan="2"><input type="text" name="" id="" width="100%"
							size="65" disabled="disabled"></td>
						<td colspan="2">수수료합계</td>
						<td colspan="3"><input type="text" name="" id=""
							disabled="disabled" size="65" width="20"></td>
					</tr>
					</tbody>
				</table>
				</div>
			</div>
		</form> <!-- 입금보고서 END -->	
		


<!-- 출금보고서 Start -->
	<form class="form-horizontal">
		<div id="deposit-contents" class="tab-content">
			<div id="second-tabs" class="tab-pane fade" aria-labelledby="second-tab" role="tabpanel">
			<table class="table table-bordered table-hover new" id="saleList">
				<thead>
					<tr id="abc" align="center" valign="middle">
						<th class="abcd" align="center" valign="middle"><input
							type="checkbox" disabled="disabled"></th>
						<th align="center" valign="middle"><input type="button"
							class="btn btn-default btn-sm saleListAdd" value="▼"></input></th>
						<th align="center" valign="middle" class="col-sm-12">계정코드</th>
						<th align="center" valign="middle">출금된계좌번호</th>
						<th align="center" valign="middle">거래처</th>
						<th align="center" valign="middle">금액</th>
						<th align="center" valign="middle">수수료</th>
						<th align="center" valign="middle">부서</th>
						<th align="center" valign="middle">프로젝트</th>
						<th align="center" valign="middle">비고</th>
					</tr>
				</thead>
				<tbody>
					<tr align="center">
						<td><input type="checkbox"></td>
						<td><input type="button"
							class="btn btn-default btn-sm saleListAdd" value="▼"></input></td>
						<td class="col-sm-8"><input type="text" name="" id=""
							size="10">
							<button class="btn btn-default btn-sm" type="submit"
								style="margin-left: 10px;">
								<span class="fa fa-search" style="width: 100%"></span>
							</button></td>
						<td><input type="text" name="" id="" size="20">
							<button class="btn btn-default btn-sm" type="submit"
								style="margin-left: 10px;">
								<span class="fa fa-search"></span>
							</button></td>
						<td><input type="text" name="" id="" size="15">
							<button class="btn btn-default btn-sm" type="submit"
								style="margin-left: 10px;">
								<span class="fa fa-search"></span>
							</button></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
					</tr>
					<tr align="center">
						<td><input type="checkbox"></td>
						<td><input type="button"
							class="btn btn-default btn-sm saleListAdd" value="▼"></input></td>
						<td><input type="text" name="" id="" class="col-sm-6">
							<button class="btn btn-default btn-sm" type="submit"
								style="margin-left: 10px;">
								<span class="fa fa-search" style="width: 100%"></span>
							</button></td>
						<td><input type="text" name="" id="" size="20">
							<button class="btn btn-default btn-sm" type="submit"
								style="margin-left: 10px;">
								<span class="fa fa-search"></span>
							</button></td>
						<td><input type="text" name="" id="" size="15">
							<button class="btn btn-default btn-sm" type="submit"
								style="margin-left: 10px;">
								<span class="fa fa-search"></span>
							</button></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
					</tr>
					<tr align="center">
						<td><input type="checkbox"></td>
						<td><input type="button"
							class="btn btn-default btn-sm saleListAdd" value="▼"></input></td>
						<td><input type="text" name="" id="" class="col-sm-6">
							<button class="btn btn-default btn-sm" type="submit"
								style="margin-left: 10px;">
								<span class="fa fa-search" style="width: 100%"></span>
							</button></td>
						<td><input type="text" name="" id="" size="20">
							<button class="btn btn-default btn-sm" type="submit"
								style="margin-left: 10px;">
								<span class="fa fa-search"></span>
							</button></td>
						<td><input type="text" name="" id="" size="15">
							<button class="btn btn-default btn-sm" type="submit"
								style="margin-left: 10px;">
								<span class="fa fa-search"></span>
							</button></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
						<td><input type="text" name="" id=""></td>
					</tr>



					<tr style="text-align: center; font-size: 14px; font-weight: bold;">
						<td colspan="3">금액합계</td>
						<td colspan="2"><input type="text" name="" id="" width="100%"
							size="65" disabled="disabled"></td>
						<td colspan="2">수수료합계</td>
						<td colspan="3"><input type="text" name="" id=""
							disabled="disabled" size="65" width="20"></td>
					</tr>
				</tbody>
			</table>
			</div>
			</div>
		</form><!-- 출금보고서 End --> 		
	</div>
</div>


			<div id="footer-Group" class="footer footer-fixed"
				style="display: block;">
				<div class="wrapper-toolbar">
					<div class="buttongroup" align="right">
						<button id="btn-footer-Save" class="btn btn-xs btn-default"
							type="Submit">저장</button>
						<button id="btn-footer-Reset" class="btn btn-xs btn-default"
							value="reset" type="button">선택삭제</button>
						<button id="btn-footer-Close" class="btn btn-xs btn-default"
							type="button">닫기</button>
					</div>
				</div>
			</div>
	
	
	
	
</body>
</html>