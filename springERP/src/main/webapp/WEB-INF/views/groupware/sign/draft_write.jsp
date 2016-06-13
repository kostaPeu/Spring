<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="/resources/common/ckeditor/ckeditor.js"></script>
<link rel="stylesheet" href="/resources/common/css/common.css">
<script type="text/javascript">
	$(function(){
		/* $("#searchBtn").click(function(){
			location.href = "/groupware/sign/searchPeople";
		}) */
		/* 
		$('#empSearch').on('click', function(event){
			self.location = "searchPeople"
				+ "?searchType=null"
				+ "&keyword=" + $('#emp_name_input').val();
		}); */
		
		var approvalName = '';
		var temp_approvalName = '';
		
		//인풋창 초기화
		$('#approval_SearchKey').click(function(){
			$('#searchTable').empty();
			$('#emp_name_input').val('');
		})
		//사용 버튼
		$('.useBtn').on('click',function(){
			approvalName = $('#emp_name_input').val();
			$('#approvalName').val(approvalName);
		})
		
		//emp 검색
		$('#searchBtn').click(function(){
			var e_name = $('#emp_name_input').val();
			var url = "/groupware/sign/searchPeople?e_name="+e_name;
			$('#searchTable').empty();
			$.ajax({
				url : url,
				dataType : 'json',
				success : handler
			});
		});
		
		//emp 테이블 클릭
		$('#searchTable').on('click','.getValue',function(){
		    var $thischeck = $(this).find(".approvalCheck");
		    var allCheckBox = document.getElementsByName("select_emp");
		    var approvalEmpId = '';
		    
		    $('#emp_name_input').val('');
		    approvalName = '';
		    
		    if($thischeck.is(":checked")){
		    	$thischeck.prop("checked", false);
		    } else {
		    	$thischeck.prop("checked", true);
		    }
		    
		    $.each(allCheckBox,function(index, item){
		    	if(item.checked){
		    		approvalEmpId += item.value + ", ";
		    	}
		    })
		    
		     $.each($(this).parent().find(".getValue"), function(index, item){
		    	if($(this).find(".approvalCheck").is(":checked")){
		    		/* alert("과연 이름은 무엇일까 : " + $(this).find(".getE_name").text()); */
		    		approvalName += $(this).find(".getE_name").text() + ", ";
		    	}
		    });

		    $("#approval_emp").val(approvalEmpId.substring(0, approvalEmpId.length-2));
			$('#emp_name_input').val(approvalName.substring(0, approvalName.length-2));
		})
	})
	
	function handler(data){
		var html = '<tr><th>선택</th><th>직원번호</th><th>직원이름</th><th>부서</th></tr>';	
		$.each(data, function(index, list){
			html += '<tr class="getValue"><td><input type="checkbox" class="approvalCheck" name="select_emp" value="'+list.emp_id+'"></td>';
			html += '<td>'+list.emp_id+'</td>';
			html += '<td class="getE_name">'+list.e_name+'</td>';
			html += '<td>'+list.dept_name+'</td></tr>';
		});
		$('#searchTable').append(html);
	}
</script>

</head>
<body>

	<!-- 결재자 검색 -->
	<div id="approvalSearch_modal" class="modal fade" role="dialog">
	<div class="modal-dialog">
	    <div class="modal-content">
			<div class="modal-header">
	       		<button type="button" class="close" data-dismiss="modal">&times;</button>
	       		<h4 class="modal-title">결재자 검색</h4>
	      	</div>
		      
	      	<div class="modal-body">
				
				<div class="input-group">
				  <input type="text" class="form-control" name="e_name" id="emp_name_input" placeholder="직원 이름을 입력하세요" aria-describedby="searchBtn">
				  <span class="btn btn-info input-group-addon" id="searchBtn"><span class="fa fa-search"></span></span>
				</div>
				
				<br>
	  			<table id="searchTable" class="table table-bordered table-hover text-center"></table>
				<div id="useBtnArea">
					<input type="button" class="btn btn-default center useBtn" value="사용" data-dismiss="modal">
				</div>
	      	</div>
      	
		    <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
		    </div>
	    </div>
	</div>
	</div>

	<h2 class="page_title">기안서 작성</h2>
	
	<form:form id="writeForm" action="draft_write" role="form" method="post">
		<input type="hidden" name="draft_format_id" value="${draftFormat.draft_format_id }">
		<input type="hidden" name="approval_emp" id="approval_emp" value="">
		<input type="hidden" name="draft_state" value="no">
		
		<div class="write_header content-group col-sm-12">
			<label class="control-label col-sm-1" for="draft_title">제목</label>
			<div class="col-sm-11">
				<input type="text" class="form-control" name="draft_title"
					placeholder="제목 입력" value="${draftFormat.draft_format_title }">
			</div>
		</div>
		
		<div class="content-group col-sm-12">
			<label class="control-label col-sm-1" for="draft_type">종류</label>
			<div class="col-sm-3">
				<select class="form-control" name="draft_type">
					<option value="공통" selected>공통</option>
					<option value="인사">인사</option>
					<option value="회계">회계</option>
				</select>
			</div>
			<label class="control-label col-sm-1">결재자</label>
			<div class="input-group col-sm-3">
			  <input type="text" class="form-control" name="approval" id="approvalName" placeholder="결재자를 선택하세요" aria-describedby="approval_SearchKey">
			  <span class="btn btn-info input-group-addon" id="approval_SearchKey" data-toggle="modal" data-target="#approvalSearch_modal"><span class="fa fa-search"></span></span>
			</div>
		</div>
		
		<div id="write_content content-group col-sm-12">
			<label class="control-label col-sm-1" for="draft_content">내용</label>
			<div class="col-sm-11">
				<textarea class="ckeditor" name="draft_content">${draftFormat.draft_format_content }</textarea>
			</div>
		</div>
		
		<div class="content-group col-sm-12 text-center">
			<button type="submit" class="btn btn-default">등록</button>
			<button type="button" class="btn btn-default">목록</button>
		</div>
	</form:form>
</body>
</html>