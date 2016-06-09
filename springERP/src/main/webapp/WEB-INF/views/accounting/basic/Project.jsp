<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<<<<<<< HEAD
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="/shopERP/accounting/js/main.js" type="text/javascript"></script>
<link href="/shopERP/accounting/css/card.css" rel="stylesheet">
</head>
<body>

	<h2 class="page_title">프로젝트등록</h2>

	<!-- 프로젝트리스트 -->
	<div class="container-fluid">
		<div class="table-responsive">
			<table class="table table-bordered table-hover table-striped" id="Card">
				<thead id="cardList">
					<tr class="mainTable">
						<th>프로젝트번호</th>
						<th>프로젝트명</th>
						<th>사용여부</th>
						<th>비고</th>
					</tr>
				</thead>
				<tbody id="cardInfos">
					<tr class="mainTable">
						<td>100</td>
						<td>여름방학 시즌판매</td>
						<td>사용</td>
						<td></td>
					</tr>
				</tbody>

			</table>
		</div>
		<div class="buttongroup" align="right">
			<input type="button" id="newAdd" class="btn btn-default" value="신규등록">
		</div>
	</div>

	<!-- 프로젝트 신규추가 -->
	<div class="newAddCard miniTitle-panel">
		<div class="miniMenuTitle" aria-labelledby="ui-id-1">
			<!-- 상단툴바  -->
			<span class="title-name" id="ui-id-1"><i
				class=" glyphicon glyphicon-edit"></i>프로젝트등록</span>
			<button id="closeBtn" class="close" type="button">
				<span>X</span>
			</button>
		</div>
		<!--/상단툴바  -->

		<!-- 프로젝트 신규추가 본문 START-->
		<div class="contents contents-fixed" style="top: 29px; bottom: 34px">
			<table
				class="table table-bordered table-hover table-left table-striped">
				<colgroup>
					<col style="width: 149px;">
					<col style="width: 600px;">
				</colgroup>
				<tbody>
					<tr id="row-BankBookNumber">
						<th>프로젝트번호</th>
						<td><input class="form-control" type="text" value=""
							placeholder="프로젝트번호"></td>
					</tr>
					<tr id="row-BackBookName">
						<th>프로젝트명</th>
						<td><input class="form-control" type="text" value=""
							placeholder="계좌명"></td>
					</tr>
					<tr id="row-BackBookUseCheck">
						<th>사용여부 <span class="card-Info" data-html="true"
							data-toggle="popover" data-trigger="focus hover"
							data-placement="right" data-original-title="" title=""></span>
						</th>
						<td>
							<div class="radio-inline">
								<label> <input id="optionsRadios-1" type="radio"
									checked="" value="option1" name="UseCheck">사용
								</label>
							</div>
							<div class="radio-inline">
								<label> <input id="optionsRadios2" type="radio"
									value="option2" name="UseCheck">정지
								</label>
							</div>
						</td>
					</tr>
					<tr id="row-note">
						<th>비고</th>
						<td><input class="form-control" type="text" value=""
							placeholder="비고"></td>
					</tr>
				</tbody>
			</table>
		</div>
		<!-- /프로젝트신규추가본문 END -->

		<!-- 프로젝트신규 footer START -->
		<div class="footer footer-fixed" id="footer-Group"
			style="display: block;">
			<div class="wrapper-toolbar">
				<div class="pull-reft"></div>
				<div class="pull-right" id="button-Group">
					<button id="btn-footer-Save" class="btn btn-xs btn-default"
						type="Submit">저장</button>
					<button id="btn-footer-Reset" class="btn btn-xs btn-default"
						type="button" value="reset">다시작성</button>
					<button id="btn-footer-Close" class="btn btn-xs btn-default" type="button">닫기</button>
				</div>
			</div>
		</div><!-- 프로젝트신규 footer END -->
	</div><!-- 프로젝트신규END -->
=======
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="_csrf" content="${_csrf.token}" />
<meta name="_csrf_header" content="${_csrf.headerName}" />

<!-- CSS -->
<link href="/resources/accounting/css/account.css" rel="stylesheet">

<!-- JS -->
<script src="/resources/accounting/js/card.js" type="text/javascript"></script>
<script src="/resources/common/js/csrf.js" type="text/javascript"></script>
</head>
<body>

	<h2 class="page_title">프로젝트등록</h2>

	<!-- 프로젝트리스트 -->
	<div class="container-fluid">
		<div class="table-responsive">
			<table class="table table-bordered table-hover table-striped"
				id="Card">
				<thead id="cardList">
					<tr class="mainTable">
						<th><input type="checkbox" id="checkAll"></th>
						<th>프로젝트번호</th>
						<th>프로젝트명</th>
						<th>금액</th>
						<th>계좌번호</th>
						<th>비고</th>
					</tr>
				</thead>
				<tbody id="cardInfos">
					<c:forEach var="projects" items="${listModel}">
						<tr class="mainTable">
							<td><input type="checkbox" class="upSelect check_id"
								name="number_box" value="${projects.proj_id}"></td>
							<td>${projects.proj_id}</td>
							<td>${projects.proj_name}</td>
							<td>${projects.sums}</td>
							<td>${projects.account_number}</td>
							<td>${projects.remarks}</td>
						</tr>
					</c:forEach>
				</tbody>

			</table>
		</div>
		<div class="buttongroup" align="right">
			<input type="button" id="updateBtn" class="btn btn-default"	value="예산설정">
		</div>
	</div>

	<!-- 프로젝트 예산설정 -->
	<div class="modal fade" id="exampleModal3" tabindex="-1" role="dialog"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="exampleModalLabel">
							<strong>프로젝트 예산설정</strong>
						</h4>
					</div>

					<form:form action="/accounting/account/update" method="post" >
						<div class="modal-body">
							<div class="form-group">
								<div class="form-group">
									<label for="message-text" class="control-label">계좌번호</label>
									<input class="form-control" id="account_number_update" type="text" placeholder="계좌번호"	name="account_number">
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
									<input class="form-control" type="text" placeholder="계정코드" name="diagnosis_number" id="diagnosis_number">
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
		</div><!-- 신규 통장계좌 수정 END-->

					<!-- 프로젝트신규 footer END -->
			
				<!-- 프로젝트신규END -->
>>>>>>> branch 'master' of https://github.com/kostaPeu/Spring.git
</body>
</html>