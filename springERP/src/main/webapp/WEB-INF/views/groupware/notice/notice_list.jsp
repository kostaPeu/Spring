<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

	<h2 class="page_title">공지사항</h2>
	
	<c:if test="${coin != '' || coin ne null}">
	
		<c:if test="${coin eq '0'}">
			<script type="text/javascript">
				alert("삭제 권한이 없습니다.");
			</script>
		</c:if>
		
		<c:if test="${coin eq '1'}">
			<script type="text/javascript">
				alert("삭제 완료.");
			</script>
		</c:if>
		
	</c:if>
	
	<table class="table table-hover">
		<thead>
			<tr class="row">
				<th class="col-sm-1">글번호</th>
				<th class="col-sm-6">제목</th>
				<th class="col-sm-2">작성자</th>
				<th class="col-sm-2">작성일</th>
				<th class="col-sm-1">조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${list.size()-1 >=0}">
				<c:forEach var="i" begin="0" end="${list.size()-1}" step="1">
					<tr class="row">
						<td class="col-sm-1">${list.get(i).getNotice_id()}</td>
					 	<td class="col-sm-6"><a href="noticeViewAction.gw?notice_id=${list.get(i).getNotice_id()}">${list.get(i).getNotice_title() }</a></td>
						<td class="col-sm-2">${e_name_list.get(i)}</td>
						<td class="col-sm-2"><fmt:formatDate value="${list.get(i).getNotice_date() }"
								pattern="yyyy-MM-dd" /></td>
						<td class="col-sm-1">${list.get(i).getNotice_hit()}</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
<%-- 
	<jsp:include page="../../paging.jsp" flush="true">
	    <jsp:param name="firstPageNo" value="${paging.firstPageNo}" />	
	    <jsp:param name="prevPageNo" value="${paging.prevPageNo}" />
	   	<jsp:param name="startPageNo" value="${paging.startPageNo}" />
	    <jsp:param name="pageNo" value="${paging.pageNo}" />
	    <jsp:param name="endPageNo" value="${paging.endPageNo}" />
	    <jsp:param name="nextPageNo" value="${paging.nextPageNo}" />
		    <jsp:param name="finalPageNo" value="${paging.finalPageNo}" />
	</jsp:include>
 --%>
	<div class="row">
		<a href="./main.jsp?left=./groupware/view/groupware.jsp&contents=./groupware/view/notice/notice_write.jsp"	class="btn btn-info col-sm-1 col-sm-push-11">글쓰기</a>
	</div>


	<form action="noticeSearchAction.gw" method="post">
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
	</form>
	
</body>
</html>