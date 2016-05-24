<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String left = request.getParameter("left");
	String contents = request.getParameter("contents");
	if(left == null){
		left = "";
	}
	if(contents == null){
		contents = "";
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>POWER ERP</title>

<script src="resources/common/js/main.js" type="text/javascript"></script>
<script src="/webjars/jquery/2.0.0/jquery.min.js"></script>
<script src="/webjars/bootstrap/3.3.6/dist/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<link rel="stylesheet" href="resources/common/css/main.css">
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">

</head>
<body id="body_html" class="font-dotum">
	<!-- top -->

	<!-- logo start -->
	<div class="erp-global-nav-qm">
		<div class="qm-company-logo col-sm-2" >
			<a href="main.jsp"></a>
		</div>
		<div class="hello pull-right">
			<span class="delicious-spam">
				<a id = "a-in-spam" href="./main.jsp?left=./mypage/view/mypage.jsp"></a>님 환영합니다.
				<a href="logoutAction.gw" class="btn btn-default">로그아웃</a>
			</span>
		</div>
	</div>

	<!--logo end-->
		
	<!-- topMenuBar start-->
	<div id="Top-Menu" class="erp-global-nav">
		<ul>
			<li class=""><a href="./main.jsp?left=./basic/view/basic.jsp">기초관리</a>
			<li class=""><a	href="./main.jsp?left=./purchase/view/purchase.jsp">구매관리</a></li>
			<li class=""><a	href="./main.jsp?left=./sale/view/sale.jsp">판매관리</a></li>
			<li class=""><a	href="./main.jsp?left=./odm/view/odm.jsp">주문/배송관리</a></li>
			<li class=""><a	href="./main.jsp?left=./stock/view/stock.jsp">재고관리</a></li>
			<li class=""><a	href="./main.jsp?left=./accounting/view/Accounleft.jsp">회계관리</a></li>
			<li class=""><a href="./main.jsp?left=./hr/view/hr_side.jsp">인사관리</a></li>
			<li class=""><a href="./main.jsp?left=./groupware/view/groupware.jsp">그룹웨어</a></li>
			<li class=""><a href="./main.jsp?left=./mypage/view/mypage.jsp">마이페이지</a></li>
		</ul>
	</div>
	<!-- topMenuBar end -->
	<%-- <div id="Left_Menu" class="show erp-local-nav">
		<jsp:include page="<%=left%>"></jsp:include>
	</div>

	<div class="container" id="contents">
		<jsp:include page="<%=contents%>"></jsp:include>
	</div> --%>
</body>
</html>
