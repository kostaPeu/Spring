<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Custom CSS -->
<script src="./groupware/js/gw_js.js"></script>
</head>
<body>
		<div class="erp-local-nav-title">그룹웨어</div>
		<div class="erp-local-nav">
			<ul class="local">
				<li><a href="noticeListAction.gw">공지사항</a></li>
				
				<li><a data-toggle="collapse" href="./groupware/view/depboard/dep_board_list.jsp #dep_board">부서게시판</a>
					<ul id="dep_board" class="collapse">
						<li><a href="./groupware/view/depboard/dep_board_list.jsp">부서 게시판</a></li>
						<li><a href="depFileListAction.gw">공유 폴더</a></li>
						<li><a id="gw_cal" href="./groupware/view/depboard/dep_calendar.jsp">부서 일정</a></li> 
					</ul>
				</li>
				
				<li><a data-toggle="collapse" href="./groupware/view/sign/sign_alldraft_list.jsp #dep_sign">전자결재</a>
					<ul id="dep_sign" class="collapse">
						<li><a href="./groupware/view/sign/sign_writedraft_write.jsp">기안서 작성</a></li>
						<li><a href="./groupware/view/sign/sign_mydraft_list.jsp">내 결재 관리</a></li>
						<li><a href="./groupware/view/sign/sign_alldraft_list.jsp">기안서 통합 관리</a></li>
						<li><a href="./groupware/view/sign/sign_draftformat_list.jsp">공통 양식 관리</a></li>
					</ul>
				</li>
				
				<li><a href="./main.jsp?left=./groupware/view/groupware.jsp&contents=./groupware/view/imageboard/imageboard_list.jsp">이미지게시판</a></li>
				<li><a data-toggle="collapse" href="./groupware/view/projectboard/pb_allproject_list.jsp #dep_project">프로젝트게시판</a>
	               <ul id="dep_project" class="collapse">
	                  <li><a href="./groupware/view/projectboard/pb_allproject_list.jsp">전체 프로젝트</a></li>
	                  <li><a href="./groupware/view/projectboard/pb_myproject_list.jsp">내 프로젝트</a></li>
	               </ul>
          		</li>
			</ul>
		</div>
</body>
</html>