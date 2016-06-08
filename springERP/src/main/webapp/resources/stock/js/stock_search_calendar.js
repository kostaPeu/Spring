var lists = [];
$(function(){
		/* initialize the external events
		-----------------------------------------------------------------*/
/*		$('#external-events .fc-event').each(function() {
			// store data so the calendar knows to render an event upon drop
			$(this).data('event', {
				id: $.trim($(this).text()), // use the element's text as the event title
				stick: true // maintain when user navigates (see docs on the renderEvent method)
			});

			$(this).data('event', function(){
				alert($.trim($(this).text()));
				id = $.trim($(this).text());
			});
			
			// make the event draggable using jQuery UI
			$(this).draggable({
				zIndex: 999,
				revert: true,      // will cause the event to go back to its
				revertDuration: 0 //  original position after the drag
			});

		});*/


		/* initialize the calendar
		-----------------------------------------------------------------*/
	alert("ajax알림");
			$.ajax({
				url : "/stock/rp/calendar",
				type : "post",
				dataType : "json",
				success : function(data) {
					$.each(data, function(index, p) {
						var json = {};

						if(p.inout_type == "in"){
							json.id = p.inout_id;
							json.title = p.product_id+" 입고";
							json.start = p.inout_date;
							json.end = p.inout_date;
							json.product_name = p.product_name;
							json.inout_amount = p.inout_amount;
							json.warehouse_name = p.warehouse_name;
							json.stock_amount = p.stock_amount;
							json.e_name = p.e_name;
							
							lists.push(json);
						}
						else if(p.inout_type == "out"){
							json.id = p.inout_id;
							json.title = p.product_id+" 출고";
							json.start = p.inout_date;
							json.end = p.inout_date;
							json.product_name = p.product_name;
							json.inout_amount = p.inout_amount;
							json.warehouse_name = p.warehouse_name;
							json.stock_amount = p.stock_amount;
							json.e_name = p.e_name;
							
							lists.push(json);
						}
					});
				}
			});
});
$(function(){
	alert("캘린더alert");
	$('#calendar').fullCalendar({
					header: {
						left: 'today',
						center: 'prev title next',
						right:''
						//right: 'month,agendaWeek,agendaDay'
					},
					events: lists,
					editable: true,
					droppable: true, // this allows things to be dropped onto the calendar
					drop: function(start) {

					},
				    eventDrop: function(event, delta, revertFunc) {
				    		
				    	var date =event.start.format('YYYY-MM-DD');
					        if (confirm("선택한 날짜로 변경하시겠습니까?")) {
					        	alert("2");
					        	$(location).attr('href','/stock/rp/update?inout_id='+event.id+'&inout_date='+date);
					        	//revertFunc();
					        }
					 },
					selectable: true,
					selectHelper: true,
					select: function(start, end) {
						$('#addModal').modal('show');
						$("#addBtn").on('click',function(){
								var product_id = $('#product_id').val();
								var inout_amount = $('#inout_amount').val();
								var type = $('#type').val();
								var date = start.format("YYYY-MM-DD");
								
								$.ajax({
									url : '/stock/rp/insert' ,
									type : 'post',
									dataType : 'json',
									data : {
										product_id : product_id,
										inout_amount : inout_amount ,
										inout_type : type,
										inout_date : date
									},
									success : function (data){
										alert("a");
											if(data == 0){
												alert("d");
											//	$('#calendar').fullCalendar( 'rerenderEvents' );
												$('#calendar').fullCalendar( 'refetchEvents' )

											}
											
									}
								})
//						$('#calendar').fullCalendar('renderEvent', eventData, true); // stick? = true
						
						$(location).attr('href','/stock/rp/insert?product_id='+product_id+'&inout_amount='+inout_amount+'&inout_type='+type+'&inout_date='+date);
						});
						
					},
					editable: true,
					eventLimit: true, // allow "more" link when too many events
					eventClick: function (calEvent, jsEvent, view) {

//			            $("#addModal").modal({
//			                autoOpen: false,
//
//			            });

			            $(".modal-title").text(calEvent.title);
			            $.each(lists, function(index,s){
			            	if(calEvent.id == s.id){

			            		alert(s.product_name);
			            		alert(s.inout_amount);
			            		alert(s.warehouse_name);
			            		alert(s.stock_amount);
			            		alert(e_name);
			            		$('#product_name').text(s.product_name);
			            		$('#inout_amount').text(s.inout_amount);
			            		$('#warehouse_name').text(s.warehouse_name);
			            		$('#stock_amount').text(s.stock_amount);
			            		$('#e_name').text(s.e_name);
			            	}
			            });
			            $('#showModal').modal('show');
					}
					});

});