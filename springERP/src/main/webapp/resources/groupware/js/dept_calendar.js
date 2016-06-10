$(function(){
	var lists = [];
	function listAjax() {
		$.ajax({
			url : "/groupware/dept_board/getCalendar",
			type : "post",
			dataType : "JSON",
			async : false,
			success : function(data) {
				lists = [];
				$.each(data, function(index, list) {
					var json = {};
					
					json.title = list.schedule_name;
					json.content = list.schedule_content;
					json.start = list.start_schedule_date;
					json.end = list.end_schedule_date;
				
					lists.push(json);
				});
			}
		});

	}
	listAjax();
	$('#calendar').fullCalendar({
			height : 520,
			header : {
			left : 'today',
			center : 'prev title next',
			right : ''
		//right: 'month,agendaWeek,agendaDay'
		},
		events : lists,
		droppable : true, // this allows things to be dropped onto the calendar
		drop : function(start) {

		},
		editable: true,
		eventDrop : function(event, delta, revertFunc) {

			var date = event.start.format('YYYY-MM-DD');
			if (confirm("선택한 날짜로 변경하시겠습니까?")) {
				$.ajax({
					url : '/stock/rp/update',
					type : 'post',
					async : false,
					data : {
						inout_id : event.id,
						inout_date : date
					},
					success : function(data) {
						if (data == 0) {
							alert('실패');
						}

						listAjax();

						$('#calendar').fullCalendar('removeEvents');
						$('#calendar').fullCalendar('addEventSource', lists);
						$('#calendar').fullCalendar('rerenderEvents');
					}
				});
			}
		},
		dayClick : function(date) {
			$('#addModal').modal('show');
			
			$("#addBtn").on('click', function() {
				
				var product_id = $('#product_id').val();
				var inout_amount = $('#inout_amount').val();
				var type = $('#type').val();
				var day = date.format("YYYY-MM-DD");
				
				$.ajax({
					url : '/stock/rp/insert',
					type : 'post',
					async : false,
					data : {
						product_id : product_id,
						inout_amount : inout_amount,
						inout_type : type,
						inout_date : day
					},
					success : function(data) {

						if (data == 0) {
							alert('실패');
						}
						$('#addModal').modal('hide');

						listAjax();

						$('#calendar').fullCalendar('removeEvents');
						$('#calendar').fullCalendar('addEventSource', lists);
						$('#calendar').fullCalendar('rerenderEvents');
					}
				});
				$('#addBtn').unbind('click');
			});
		},
		eventLimit : true, // allow "more" link when too many events
		eventClick : function(calEvent, jsEvent, view) {
			
			$(".modal-title").text(calEvent.title);
			$.each(lists, function(index, s) {
				if (calEvent.id == s.id) {

					$('#product_name').text(s.product_name);
					$('#amount').text(s.inout_amount);
					$('#warehouse_name').text(s.warehouse_name);
					$('#stock_amount').text(s.stock_amount);
					$('#e_name').text(s.e_name);
				}
			});
			$('#showModal').modal('show');
		}
	});

});