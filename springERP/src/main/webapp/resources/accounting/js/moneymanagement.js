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
					content += '<td><input type="checkbox"></td>';
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




