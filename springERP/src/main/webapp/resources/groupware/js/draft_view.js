$(function(){
	
	$('#printBtn').click(function(){
		var draft_id = $(this).val();
		var newWindow = window.open('printPop'+draft_id, '프린트하기', 'width=800, height=1000, menubar=no, status=no, toolbar=no');
	});

})