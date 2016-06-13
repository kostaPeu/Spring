//프로젝트 예산설정
$(function() {
	$('#updateBtn').click(function() {
		var val = '';
		$("input[name=number_box]:checked").each(function() {
			val = $(this).val();
		});
		if (val == "") {
			alert("설정할 내용을 체크해주세요.");
			return false;
		} else {
			$('#updateProj_id').val(val);
			alert(val);
		}
	});
});

// 체크박스 선택,해제
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
 //작은 검색창 인풋창 초기화
$(function() {
	$('#account_numbers').click(function() {
		$('#m_searchTable').empty();
		$('#search_account_number').val('');
	})
	// 작은 검색창 사용버튼
	$('.useBtn').click(function() {
		var accountName = $('#search_account_number').val();
		$('#account_number').val(accountName);
	})
	// 작은 검생창 테이블 클릭
	$('#m_searchTable').click(function() {
		var accountName = $(this).find('.getAccountName').text();
		$('#search_account_number').val(accountName);
	})

	// 검색창 검색
	$('#warehouseID').click(function() {
		var account_id = $('#search_account_number').val();
		var url = "accountList.ac?account_detail=" + account_id;
		$('#m_searchTable').empty();
		$.ajax({
			url : url,
			dataType : 'json',
			success : handler
		});
	});
	function handler(data) {
		var html = '<tr><th>계좌번호</th><th>계좌명</th><th>계정정보</th></tr>';
		$.each(data, function(index, list) {
			html += '<tr class="getValue"><td class="getAccountName">'
					+ list.account_number + '</td>';
			html += '<td>' + list.account_name + '</td>';
			html += '<td>' + list.account_detail;
			+'</td>';
		});
		$('#m_searchTable').append(html);
	}
})