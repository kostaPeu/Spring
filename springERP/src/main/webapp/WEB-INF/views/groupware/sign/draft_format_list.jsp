<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="/webjars/jquery/2.0.0/jquery.min.js"></script>

</head>
<body>

	<h2 class="page_title">공통 양식 관리</h2>
	
	<table class="table table-hover" class="boardList">
		<thead>
			<tr class="row">
				<th class="col-sm-3">양식번호</th>
				<th class="col-sm-6">양식이름</th>
				<th class="col-sm-3">종류</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${list.size()-1 >=0}">
				<c:forEach var="i" begin="0" end="${list.size()-1}" step="1">
					<tr class="row">
						<th class="col-sm-3">${list.getDraft_format_id() }</th>
						<th class="col-sm-6">${list.getDraft_format_title() }</th>
						<th class="col-sm-3">${list.getDraft_format_type() }</th>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	
	<div class="box-footer">
		<div class="text-center">
		<ul class="pagination">
			<c:if test="${pageMaker.prev}">
				<li><a
					href="draft_list${pageMaker.makeSearch(pageMaker.startPage - 1) }">&laquo;</a></li>
			</c:if>
			<c:forEach begin="${pageMaker.startPage }"
				end="${pageMaker.endPage }" var="idx">
				<li
					<c:out value="${pageMaker.cri.page == idx?'class =active':''}"/>>
					<a href="draft_list${pageMaker.makeSearch(idx)}">${idx}</a>
				</li>
			</c:forEach>
			<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
				<li><a
					href="draft_list${pageMaker.makeSearch(pageMaker.endPage +1) }">&raquo;</a></li>
			</c:if>
		</ul>
		</div>
	</div>

	<div class="row">
		<a id="write" href="draft_format_write" class="btn btn-info col-sm-1 col-sm-push-11">양식 만들기</a>
	</div>

	<!-- <form action="noticeSearchAction.gw" method="post">
		<div class="col-xs-2">
			<select name="type" class="form-control">
				<option value="writer">글쓴이</option>
				<option value="title">제목</option>
				<option value="content">내용</option>
			</select>
		</div>
		
		<div class="col-xs-2">
			<input class="form-control" id="ex1" type="text" name="word">
		</div>
		<button type="submit" class="btn btn-default">검색</button>
	</form> -->
	
	<script type="text/javascript">
	
	$(function(){
		   $('.titleLink').on('click', function(e) {
		      e.preventDefault();
		      $('#contents').empty();	
		      $('#contents').load('/groupware/sign/'+$(this).attr('href'));
		   });

		   $('#write').click(function(e) {
		      e.preventDefault();
		      
		      $('#contents').empty();
		      $('#contents').load('/groupware/sign/'+$(this).attr('href'));
		   });
		   
		})
	</script>
	
</body>
</html>