//입출금보고서 탭 클릭 이벤트
$(function() {
	$("#first-tab").on('click', function() {
		if ($('#first-tabs').css('display') == 'none') {
			$('#second-tabs').css('display', 'none');
			$('#first-tabs').css('display', 'block');
			
		}
			
		$("#second-tab").on('click', function() {
			if ($('#second-tabs').css('display') == 'none') {
				$('#first-tabs').css('display', 'none');
				$('#second-tabs').css('display', 'block');
				
			}			
		})
	})
});

