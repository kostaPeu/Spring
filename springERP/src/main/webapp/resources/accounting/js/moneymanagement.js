//입출금보고서 탭 클릭 이벤트
$(function() {
	$("#first-tab").on('click', function() {
		$('#second-tabs').css('display', 'none');
		$('#first-tabs').css('display', 'block');
	})
	$("#second-tab").on('click', function() {
		$('#first-tabs').css('display', 'none');
		$('#second-tabs').css('display', 'block');
	})
});


//자금계획 조회 ajax 처리
$(function() {
	$("#moneyplanselect").click(function() {
		$('#cardInfos').empty();
		$.ajax({
			url : '/accounting/moneymanagement/allList',
			dataType : 'json',
			success : function(data) {
				var content = "";
				$.each(data, function(index, list) {
					content += '<tr>';
					content += '<td><input type="checkbox" name="number_box"></td>';
					content += '<td>' + list.typelist + '</td>';
					content += '<td>' + list.start_date + '</td>';
					content += '<td>' + list.periods + '</td>';
					content += '<td>' + list.funds_id + '</td>';
					content += '<td>' + list.sums + '</td>';
					content += '<td>' + list.account_number + '</td>';
					content += '<td>' + list.customer_id + '</td>';
					content += '<td>' + list.remarks + '</td>';
					content += '</tr>';
				})
				$('#cardInfos').append(content);
			}
		})
	});
});

//체크박스 선택,해제
$(function() {
	$('#checkAll').click(function() {
		if (this.checked) {
			$('input[name=number_box]').each(function() {
				$(this).prop('checked', true);
			});
		} else {
			$('input[name=number_box').each(function() {
				$(this).prop('checked', false);
			});
		}
	});
})


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



