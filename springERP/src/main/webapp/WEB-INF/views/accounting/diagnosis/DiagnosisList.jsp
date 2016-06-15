<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="_csrf" content="${_csrf.token}" />
<meta name="_csrf_header" content="${_csrf.headerName}" />


<script src="/resources/accounting/js/jquery.treetable.js" type="text/javascript"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script src="/resources/accounting/js/jquery-3.0.0.js" type="text/javascript"></script>

<script src="/resources/accounting/js/di.js" type="text/javascript"></script>


<link rel="stylesheet" href="/resources/accounting/css/jquery.treetable.css">
<script type="text/javascript">

(function(i, s, o, g, r, a, m) {
  i['GoogleAnalyticsObject'] = r;
  i[r] = i[r] || function() {
    (i[r].q = i[r].q || []).push(arguments)
  }, i[r].l = 1 * new Date();
  a = s.createElement(o),
          m = s.getElementsByTagName(o)[0];
  a.async = 1;
  a.src = g;
  m.parentNode.insertBefore(a, m)
})(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');

ga('create', 'UA-43342702-1', 'maxazan.github.io');
ga('send', 'pageview');

(function() {
	$("#Card").treetable();
	$.extend($.fn.treegrid.defaults, {
    expanderExpandedClass: 'glyphicon glyphicon-chevron-down',
    expanderCollapsedClass: 'glyphicon glyphicon-chevron-right'
});
})





</script>
</head>
<body>

	<h2 class="page_title">계정등록</h2>
	<div class="mainContents">	
		<div class="container-fluid">
			<div class="table-responsive">
				<table class="table table-bordered table-hover table-striped tree"
					id="Card">
					<thead id="diagnosisHeader">
						<tr class="mainTable">
							<th class="center" style="width: 20px"><input
								type="checkbox"></th>
							<th style="width: 375px;">[계정코드]계정명</th>
							<th style="width: 55px;">계정</th>
							<th style="width: 55px;">대차구분</th>
							<th style="width: 53px;">계정종류</th>
							<th style="width: 53px;">평가구분</th>
							<th style="width: 53px;">사용구분</th>
							<th style="width: 45px;">비고</th>
						</tr>
					</thead>
					<tbody id="diagnosisContents">
						<tr class="treegrid-1">
							<td>Root node</td>
							<td>Additional info</td>
						</tr>
						<tr class="treegrid-2 treegrid-parent-1">
							<td>Node 1-1</td>
							<td>Additional info</td>
						</tr>
						<tr class="treegrid-3 treegrid-parent-1">
							<td>Node 1-2</td>
							<td>Additional info</td>
						</tr>
						<tr class="treegrid-4 treegrid-parent-3">
							<td>Node 1-2-1</td>
							<td>Additional info</td>
						</tr>


					</tbody>
				</table>
			</div>
		</div>
	</div>
	
	  <table class="table tree table-bordered table-striped table-condensed">
                <tr class="treegrid-1">
                    <td>Root node 1</td><td>Additional info</td>
                </tr>
                <tr class="treegrid-2 treegrid-parent-1">
                    <td>Node 1-1</td><td>Additional info</td>
                </tr>
                <tr class="treegrid-3 treegrid-parent-1">
                    <td>Node 1-2</td><td>Additional info</td>
                </tr>
                <tr class="treegrid-4 treegrid-parent-3">
                    <td>Node 1-2-1</td><td>Additional info</td>
                </tr>
                <tr class="treegrid-5">
                    <td>Root node 2</td><td>Additional info</td>
                </tr>
                <tr class="treegrid-6 treegrid-parent-5">
                    <td>Node 2-1</td><td>Additional info</td>
                </tr>
                <tr class="treegrid-7 treegrid-parent-5">
                    <td>Node 2-2</td><td>Additional info</td>
                </tr>
                <tr class="treegrid-8 treegrid-parent-7">
                    <td>Node 2-2-1</td><td>Additional info</td>
                </tr>        
            </table>	
	
	


	<div class="buttongroup">
		<button type="button" class="btn btn-default">신규등록</button>
		<button id="updateBtn" type="button" class="btn btn-default">수정</button>
		<input type="button" id="deleteBtn" class="btn btn-default" value="삭제">
	</div>
	</div>
	-->
</body>
</html>