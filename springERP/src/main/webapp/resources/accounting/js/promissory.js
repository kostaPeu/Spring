function sumDate() {

}

// 데이트 피커
$(function() {
	$("#datepicker").datepicker(
			{
				dateFormat : 'yy-mm-dd',
				prevText : '이전 달',
				nextText : '다음 달',
				monthNames : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월',
						'9월', '10월', '11월', '12월' ],
				monthNamesShort : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월',
						'8월', '9월', '10월', '11월', '12월' ],
				dayNames : [ '일', '월', '화', '수', '목', '금', '토' ],
				dayNamesShort : [ '일', '월', '화', '수', '목', '금', '토' ],
				dayNamesMin : [ '일', '월', '화', '수', '목', '금', '토' ],
				showMonthAfterYear : true,
				changeMonth : true,
				changeYear : true,
				yearSuffix : '년'
			});
});

/*$(function() {
	$("#datepicker2").datepicker(
			{
				dateFormat : 'yy-mm-dd',
				prevText : '이전 달',
				nextText : '다음 달',
				monthNames : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월',
						'9월', '10월', '11월', '12월' ],
				monthNamesShort : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월',
						'8월', '9월', '10월', '11월', '12월' ],
				dayNames : [ '일', '월', '화', '수', '목', '금', '토' ],
				dayNamesShort : [ '일', '월', '화', '수', '목', '금', '토' ],
				dayNamesMin : [ '일', '월', '화', '수', '목', '금', '토' ],
				showMonthAfterYear : true,
				changeMonth : true,
				changeYear : true,
				yearSuffix : '년'
			});
});*/

//만기일자 계산
$(function() {
	var reddate = '';
	$('#datepicker').change(function() {
		reddate = new Date($('input[name=red_date]').val());
		if (reddate != null) {
			reddate.setDate(reddate.getDate() + 90);
			var year = reddate.getFullYear();
			var month = reddate.getMonth()+1;
			var day = reddate.getDate();			
			if (("" + month).length == 1) { month = "0" + month; }
	        if (("" + day).length   == 1) { day   = "0" + day;   }	        
			var exdate = new Date($('input[name=ex_date]').val(""+year+"-"+month+"-"+day))				
		} 
	})
});
