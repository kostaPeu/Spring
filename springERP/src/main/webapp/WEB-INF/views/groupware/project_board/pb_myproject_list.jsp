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

	<h2 class="page_title">내 프로젝트</h2>
	
	<table class="table table-hover">
		<thead>
			<tr class="row">
				<th class="col-sm-1">글번호</th>
				<th class="col-sm-3">제목</th>
				<th class="col-sm-2">작성자</th>
				<th class="col-sm-2">총기간</th>
				<th class="col-sm-2">시작일</th>
				<th class="col-sm-2">종료일</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${list.size()-1 >=0}">
				<c:forEach var="i" begin="0" end="${list.size()-1}" step="1">
					<tr class="row">
						<td class="col-sm-1">${list.get(i).getProj_id()}</td>
					 	<td class="col-sm-3"><a href="#">${list.get(i).getProj_name() }</a></td>
						<td class="col-sm-2">테스트</td>
<%-- 						<td class="col-sm-2">${e_name_list.get(i)}</td>
 --%>						<td class="col-sm-2"><fmt:formatDate value="${list.get(i).getProj_period() }"
								pattern="yyyy-MM-dd" /></td>
								<td class="col-sm-2"><fmt:formatDate value="${list.get(i).getProj_start_date() }"
								pattern="yyyy-MM-dd" /></td>
								<td class="col-sm-2"><fmt:formatDate value="${list.get(i).getProj_end_date() }"
								pattern="yyyy-MM-dd" /></td>
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
									href="pb_myproject_list${pageMaker.makeSearch(pageMaker.startPage - 1) }">&laquo;</a></li>
							</c:if>

							<c:forEach begin="${pageMaker.startPage }"
								end="${pageMaker.endPage }" var="idx">
								<li
									<c:out value="${pageMaker.cri.page == idx?'class =active':''}"/>>
									<a href="pb_myproject_list${pageMaker.makeSearch(idx)}">${idx}</a>
								</li>
							</c:forEach>

							<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
								<li><a
									href="pb_myproject_list${pageMaker.makeSearch(pageMaker.endPage +1) }">&raquo;</a></li>
							</c:if>

						</ul>
					</div>

				</div>

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