<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/resources/odm/css/odm.css" rel="stylesheet"> 
<!-- <script src="/resources/odm/js/orderList.js"></script>-->
<script type="text/javascript">
$(function(){
	function statusAjax(ordno){
		alert(step+" and "+step2);
		 $.ajax({
			url : "http://localhost:8000/orderStatus",
			type : "post",
			data : {
				ordno : ordno,
				step : step,
				step2 : step2
			},
			success : function(data){
				alert(data);
				listsAjax(status);
			},
			error : function(){
				alert("주문 상태변경 실패!");
			}
		});  
	}

	function listsAjax(status){
		alert(step+" and "+step2);
		$('#tbody').empty();
		$.ajax({
			url : "http://localhost:8000/orderCollect",
			// cache : false,
			type : "post",
			async: false,
			dataType : 'xml',
			data : {
				step : step,
				step2 : step2
			},
			success : function(data) {
				console.log(data);
				var orderList = [];
				
				$(data).find('order_data').each(function() {
					var html = '';
					var json = {};
	
					var ono = $(this).find('ordno').text();
					var ordno = ono.slice(0, ono.length/2);
					var orddt = $(this).find('orddt').text();
					var nameOrder = $(this).find('nameOrder').text();
					var settleprice = $(this).find('settleprice').text();
					var phoneOrder = $(this).find('phoneOrder').text();	

					json.ordno = ordno;
					json.orddt = orddt;
					json.nameOrder = nameOrder;
					json.settlepric = settleprice;
					
					orderList.push(json);
					
					html += '<tr class="tablecenter">';
					html += '<td><input type="checkbox" class="orderChecked" name="orderRow" value="'+ordno+'"></td>';
					html += '<td>'+ordno+'</td>';
					html += '<td>'+orddt+'</td>';
					html += '<td>'+nameOrder+'</td>';
					html += '<td>'+settleprice+'</td>';
					html += '<td>'+phoneOrder+'</td>';
					html += '</tr>';
					
					$('#tbody').append(html);
	
				});
				if(status == "odm1"){
					$('#Btn').empty();
					var html = '';
					
					html += '<input type="button" id="confirmBtn" class="btn btn-default" value="입금처리">';
					
					$('#Btn').append(html);
				}
				if(status == 'odm2'){
					$('#Btn').empty();
					var html = '';
					
					html += '<input type="button" id="readyBtn" class="btn btn-default" value="배송준비">';
					html += '<input type="button" id="addBtn" class="btn btn-default" value="송장등록">';
					
					$('#Btn').append(html);
				}
		    }, 
		    error : function(){
		    	alert("실패");
		    }
	
		 });
	}
	
	alert("<c:out value='${checks}'/>");  
	var step = 0;
	var step2 = 0;
	var status = "odm1";
	
		$("#status").on("change", function(){
			
			if($(this).val() == "odm1"){
				step = 0;
				step = 0;
				status = "odm1";
			}
			if($(this).val() == "odm2"){
				step = 1;
				step2 = 0;
				status = "odm2";
			}
			listsAjax(status);
		}); 
		
		if("<c:out value='${checks}'/>" == 'godo'){
			listsAjax(status);
		}
		$('#Btn').on('click','#confirmBtn',function(){
			$('input[name=orderRow]:checked').each(function(){
				var ordno = $(this).val();
	 			 statusAjax(ordno);
			});
		});
		$('#Btn').on('click','#readyBtn',function(){
			$('input[name=orderRow]:checked').each(function(){
				var ordno = $(this).val();
	 			 statusAjax(ordno);
			});
			});
		});
		$('#Btn').on('click','#addBtn',function(){
			$('input[name=orderRow]:checked').each(function(){
				$('input[name=orderRow]:checked').each(function(){
					$.ajax({
						url : "http://localhost:8000/orderStatus",
						type : "post",
						data : {
							ordno : $(this).val(),
							step : 3,
							step2 : 0
						},
						success : function(data){
							alert(data);
							listsAjax(status);
						},
						error : function(){
							alert("송장등록 상태변경 실패!");
						}
					});
			});
		});
		
});
</script>
</head>
<body>
<div id="a"></div>
	<h2 class="page_title">주문리스트</h2>
	<select id="status" class="form-control">
		<option value="odm1">주문접수</option>
		<option value="odm2">입금확인</option>
	</select>
	<hr>
	<table id="odmTable" class="table table-bordered table-hover">
		<thead>
			<tr>
				<th><input type="checkbox"></th>
				<th>주문번호</th>
				<th>주문일시</th>
				<th>주문자명</th>
 				<th>결제금액</th>
 				<th>연락처</th>
			</tr>
		</thead>
		<tbody id="tbody">
		</tbody>
	</table>
	<div class="buttongroup" id="Btn">
<!-- 		<input type="button" id="checkBtn" class="btn btn-default" value="발주확인"> -->
<!-- 		<input type="button" id="confirmBtn" class="btn btn-default" value="입금처리">
		<input type="button" id="addBtn" class="btn btn-default" value="송장등록">
		<input type="button" id="sendBtn" class="btn btn-default" value="송장전송"> -->
	</div>
</body>
</html>