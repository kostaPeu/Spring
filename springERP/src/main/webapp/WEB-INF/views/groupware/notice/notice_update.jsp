<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//cdn.ckeditor.com/4.5.8/standard/ckeditor.js"></script>
</head>
<body>

	<h2 class="page_title">공지사항</h2>
	
	<form action="noticeUpdateAction.gw?notice_id=${notice.notice_id }" method="post">
	
		<div class="write_header">
			<label class="control-label col-sm-1" for="title">제목</label>
			<div class="col-sm-11">
				<input type="text" class="form-control" name="notice_title"
					placeholder="제목 입력" value="${notice.notice_title }">
			</div>
		</div>

		<div id="write_content">
			<label class="control-label col-sm-1" for="content">내용</label>
			<div class="col-sm-11">
				<textarea class="ckeditor" cols="1" name="notice_content" rows="15">
					${notice.notice_content }
				</textarea>
			</div>
		</div>

		<div id="file-upload">
			<label class="control-label col-sm-1" for="title">첨부파일</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="title" placeholder="경로">
				<button type="button" class="btn btn-default">찾기</button>
			</div>
		</div>

		<div class="col-sm-2 col-sm-push-10">
			<button type="submit" class="btn btn-default">수정</button>
			<button type="button" class="btn btn-default">목록</button>
		</div>
		
	</form>
</body>
</html>