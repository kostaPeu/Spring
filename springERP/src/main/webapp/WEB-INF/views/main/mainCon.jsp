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
	<div class="row">
		<div class="col-sm-4 pull-right">
			<h2 class="page_title">공지사항</h2>

			<table class="table table-hover" class="boardList">
				<tbody>
					<c:if test="${noticeList.size()-1 >=0}">
						<c:forEach var="i" begin="0" end="2" step="1">
							<tr>
								<td><a class="noticeTitle"
									href="notice_view?notice_id=${noticeList.get(i).getNotice_id()}">${noticeList.get(i).getNotice_title() }</a></td>
							</tr>
						</c:forEach>
					</c:if>
				</tbody>
			</table>
		<hr>
		</div>
	</div>
	
	<div class="row">
		<div class="col-sm-4 pull-right">
			<h2 class="page_title">부서 게시판</h2>

			<table class="table table-hover" class="boardList">
				<tbody>
					<c:if test="${deptBoardList.size()-1 >=0}">
						<c:forEach var="i" begin="0" end="2" step="1">
							<tr>
								<td><a class="deptTitle" href="dept_board_view?dept_board_id=${deptBoardList.get(i).getDept_board_id()}">${deptBoardList.get(i).getDept_board_title() }</a></td>
							</tr>
						</c:forEach>
					</c:if>
				</tbody>
			</table>
		</div>
	</div>
	
	
	<script type="text/javascript">
		$(function() {
			$('.noticeTitle').on('click',
					function(e) {
						e.preventDefault();
						$('#contents').empty();
						$('#contents').load(
								'/groupware/notice/' + $(this).attr('href'));
						$('#Left_Menu').empty();
						$('#Left_Menu').load('/groupware');
			});

			$('.deptTitle').on('click',
					function(e) {
						e.preventDefault();
						$('#contents').empty();
						$('#contents').load('/groupware/dept_board/' + $(this).attr('href'));
						$('#Left_Menu').empty();
						$('#Left_Menu').load('/groupware');
						
			});

		})
	</script>

</body>
</html>