<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8' />
<meta name="_csrf" content="${_csrf.token}"/>
<meta name="_csrf_header" content="${_csrf.headerName}"/>
<script src="/resources/common/js/csrf.js" type="text/javascript"></script>

<!-- full Calendar js,css경로 -->
<link href='/resources/common/css/fullcalendar.css' rel='stylesheet' />
<link href='/resources/common/css/fullcalendar.print.css' rel='stylesheet' media='print' /> 
<!-- <script src='/resources/common/js/jquery.min.js'></script>  -->
<script src="/resources/common/js/moment.min.js"></script>
<script src='/resources/common/js/jquery-ui.custom.min.js'></script> 
<script src="/resources/common/js/fullcalendar.js"></script>


<!-- custom js,css경로 -->
<link href='/resources/groupware/css/gw_dept_calendar.css' rel='stylesheet'>
<script src='/resources/stock/js/stock_search_calendar.js'></script>
</head>
<body>

		<div id='calendar'></div>
		
</body>
</html>