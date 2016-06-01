<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- CSS -->
<link href="/resources/accounting/css/account.css" rel="stylesheet">

<!-- JS -->
<script src="/resources/accounting/js/ac.js" type="text/javascript"></script>
<script type="text/javascript">

</script>
</head>
<body id="body_html" class="font-dotum">
		<h2 class="page_title">통장계좌 리스트</h2>

		<!-- 통장계좌리스트 -->
		<div class="container-fluid">
			<div class="table-responsive">
				<table class="table table-bordered table-hover table-striped"
					id="Card">
					<thead id="cardList">
						<tr class="mainTable">
							<th><input type="checkbox" disabled="disabled"></th>
							<th>계좌번호</th>
							<th>계좌명</th>
							<th>계정번호</th>
							<th>검색창내용</th>
							<th>사용여부</th>
							<th>비고</th>
						</tr>
					</thead>
					<tbody id="cardInfos">
						<c:forEach var="accounts" items="${listModel}">
							<tr class="mainTable">
								<td><input type="checkbox" class="upSelect check_id" name="number_box" value="${accounts.account_number}"></td>
								<td>${accounts.account_number }</td>
								<td>${accounts.account_name}</td>
								<td>${accounts.diagnosis_number }</td>
								<td>${accounts.account_detail }</td>
								<td>${accounts.use }</td>
								<td>${accounts.remarks }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="buttongroup">
				<button type="button" class="btn btn-default" data-toggle="modal"	data-target="#exampleModal" data-whatever="@mdo">신규등록</button>
				<button type="button" class="btn btn-default" data-toggle="modal"	data-target="#exampleModal" data-whatever="@fat">수정</button>
				<input type="button" id="newBtn" class="btn btn-default" value="삭제">
			</div>
		</div>
		
		<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="exampleModalLabel">
							<strong>통장계좌 신규등록</strong>
						</h4>
					</div>

					<form:form action="/accounting/account/insert" method="post">
						<div class="modal-body">
							<div class="form-group">
								<div class="form-group">
									<label for="message-text" class="control-label">계좌번호</label>
									<input class="form-control" type="text" placeholder="계좌번호"	name="account_number">
								</div>
								<div class="form-group">
									<label for="message-text" class="control-label">계좌명</label>
									<input class="form-control" type="text" placeholder="계좌명"	name="account_name">
								</div>								
								<div class="form-group">
									<label for="message-text" class="control-label">계정코드</label>
									<a data-toggle="modal" href="#myModal2">
									<button type="button" class="btn btn-default btn-sm" id="diagnosis_number">
									<span class="fa fa-search"></span></button></a>
									<input class="form-control" type="text" placeholder="계정코드" name="code" id="diagnosis_number">
								</div>
								
								<div class="form-group">
									<label for="message-text" class="control-label">검색창내용</label>
									<input class="form-control" type="text" placeholder="검색창내용" name="account_detail">
								</div>
								
								<div class="form-group">
									<label for="recipient-name" class="control-label">사용여부</label>
									<div class="radio-inline">
										<label> <input id="optionsRadios-1" type="radio" checked="" value="yes" name="use">사용
										</label>
									</div>
									<div class="radio-inline">
										<label> <input id="optionsRadios2" type="radio"	value="no" name="use">정지
										</label>
									</div>
								</div>
								
								<div class="form-group">
									<label for="message-text" class="control-label">비고</label>
									<input class="form-control" type="text" placeholder="비고"name="remarks">
								</div>
								
								<div class="modal-footer">
									<input type="submit" class="btn btn-default" value="저장">
									<input type="reset" class="btn btn-default" value="다시작성">
									<input type="button" class="btn btn-default" data-dismiss="modal" value="취소">
								</div>
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>

<!-- 계좌번호 검색 -->
<div class="modal" id="myModal2" aria-hidden="true" style="display: none; z-index: 1060;">
 <div class="modal-dialog modal-lg">      
    <div class="modal-content">
		<div class="modal-header">
			   <button type="button" class="close" data-dismiss="modal">&times;</button>
			   <h4 class="modal-title"><strong>목록 검색</strong></h4>	
		</div>
			<div class="modal-body">
				<div class="col-sm-2">
					<select >
						<option id="">계좌번호</option>	
						<option id="">사원번호</option>	
						<option id="">카드번호</option>	
						<option id="">ㅁㄴㅇㅁ</option>	
					</select>
				</div>	
				<div class="col-sm-8">
					<input type="text" class="form-control" name="account_number" id="search_account_number">
				</div>
						
				<div class="col-sm-2">
						<button type="button" class="btn btn-info btn-sm" id="warehouseID"><span class="fa fa-search"></span></button>
				</div>
				<br><br><br>
				<table id="m_searchTable" class="table table-bordered table-hover">
				
				</table>
				<div id="ustBtnArea">
					<input type="button" class="btn btn-default center useBtn" value="사용" data-dismiss="modal">
				</div>
				<div class="modal-footer">
      				  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
     			 </div>
			</div>
		</div>
	</div>
</div>
	
	
	
	
	

</body>
</html>