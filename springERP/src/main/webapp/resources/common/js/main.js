//팝업창 클릭이벤트
$(function(){
	$('#newAdd').click(function(){
		$('.newAddCard').css("display","block")
	});
	$('#closeBtn').click(function(){
		$('.newAddCard').css("display","none")
	});
	
	$("#btn-footer-Close").click(function() {
		$('.newAddCard').css("display","none")
	});	
});

