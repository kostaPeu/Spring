<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="_csrf" content="${_csrf.token}"/>
<meta name="_csrf_header" content="${_csrf.headerName}"/>
<script src="/resources/common/js/csrf.js" type="text/javascript"></script>

<script src="/resources/groupware/js/draft_list.js"></script>

</head>
<body>
	<h2 class="page_title">기안서 목록</h2>
	
	<ul id="myDraftTab" class="nav nav-tabs nav-justified tab-css">
	  <li role="presentation" class="active"><a href="#" class="btn btn-default myWriteList">결재받을 기안서</a></li>
	  <li role="presentation"><a href="#" class="btn btn-default myApReList">결재할 기안서</a></li>
	</ul>
	
	<table id="myWriteList" class="table table-hover" class="boardList">
		<thead>
			<tr class="row">
				<th class="col-sm-1">기안서 번호</th>
				<th class="col-sm-2">제목</th>
				<th class="col-sm-1">종류</th>
				<th class="col-sm-1">작성자</th>
				<th class="col-sm-2">작성 일자</th>
				<th class="col-sm-2">결재자</th>
				<th class="col-sm-2">참조자</th>
				<th class="col-sm-1">진행상황</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${myWriteList.size()-1 >=0}">
				<c:forEach var="i" begin="0" end="${myWriteList.size()-1}" step="1">
					<tr class="row">
						<td class="col-sm-1">${myWriteList.get(i).draft_id }</td>
						<td class="col-sm-2"><a href="draft_view${myWriteList.get(i).draft_id }">${myWriteList.get(i).draft_title }</a></td>
						<td class="col-sm-1">${myWriteList.get(i).draft_type }</td>
						<td class="col-sm-1">${myWriteList.get(i).e_name }</td>
						<td class="col-sm-2">${myWriteList.get(i).draft_date }</td>
						<td class="col-sm-2">
							<c:forEach var="j" begin="0" end="${myWriteList.get(i).approval.size()-1}" step="1">
								${myWriteList.get(i).approval.get(j) }
							</c:forEach>
						</td>
						<td class="col-sm-2">
							<c:forEach var="k" begin="0" end="${myWriteList.get(i).reference.size()-1}" step="1">
								${myWriteList.get(i).reference.get(k) }
							</c:forEach>
						</td>
						<td class="col-sm-1">${myWriteList.get(i).draft_state }</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	
	<table id="myApReList" class="table table-hover" class="boardList">
		<thead>
			<tr class="row">
				<th class="col-sm-1">기안서 번호</th>
				<th class="col-sm-2">제목</th>
				<th class="col-sm-1">종류</th>
				<th class="col-sm-1">작성자</th>
				<th class="col-sm-2">작성 일자</th>
				<th class="col-sm-2">결재자</th>
				<th class="col-sm-2">참조자</th>
				<th class="col-sm-1">진행상황</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${myApReList.size()-1 >=0}">
				<c:forEach var="i" begin="0" end="${myApReList.size()-1}" step="1">
					<tr class="row">
						<td class="col-sm-1">${myApReList.get(i).draft_id }</td>
						<td class="col-sm-2"><a href="draft_view${myApReList.get(i).draft_id }">${myApReList.get(i).draft_title }</a></td>
						<td class="col-sm-1">${myApReList.get(i).draft_type }</td>
						<td class="col-sm-1">${myApReList.get(i).e_name }</td>
						<td class="col-sm-2">${myApReList.get(i).draft_date }</td>
						<td class="col-sm-2">
							<c:forEach var="j" begin="0" end="${myApReList.get(i).approval.size()-1}" step="1">
								${myApReList.get(i).approval.get(j) }
							</c:forEach>
						</td>
						<td class="col-sm-2">
							<c:forEach var="k" begin="0" end="${myApReList.get(i).reference.size()-1}" step="1">
								${myApReList.get(i).reference.get(k) }
							</c:forEach>
						</td>
						<td class="col-sm-1">${myApReList.get(i).draft_state }</td>
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
	
</body>
</html>