<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>

	<h2 class="page_title">전체 프로젝트</h2>
	
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
			<tr class="row">
				<td class="col-sm-1">10001</td>
				<td class="col-sm-6">라면을 먹자</td>
				<td class="col-sm-2">김밥</td>
				<td class="col-sm-2">16.04.24</td>
				<td class="col-sm-1">14</td>
			</tr>
		</tbody>
	</table>

	<ul class="pager">
		<li class="previous"><a href="#">Previous</a></li>
		<li><a>1</a></li>
		<li><a>2</a></li>
		<li><a>3</a></li>
		<li class="next"><a href="#">Next</a></li>
	</ul>

	<div class="col-xs-2">
		<div class="dropdown">
			<button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">
				제목+내용 <span class="caret"></span>
			</button>
			<ul class="dropdown-menu col-xs-2">
				<li><a href="#">제목</a></li>
				<li><a href="#">내용</a></li>
				<li><a href="#">작성자</a></li>
			</ul>
		</div>
	</div>
	
	<div class="col-xs-2">
 		<input class="form-control" id="ex1" type="text">
	</div>
	
	<button type="button" class="btn btn-default">검색</button>
</body>
</html>