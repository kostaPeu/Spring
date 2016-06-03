$(function() {

	$('#calendar').fullCalendar({
		header : {
			left : 'prev,next today',
			center : 'title',
			right : 'month,agendaWeek,agendaDay'
		},
		defaultDate : '2016-01-12',
		selectable : true,
		selectHelper : true,
		select : function(start, end) {
			var title = prompt('Event Title:');
			var eventData;
			if (title) {
				eventData = {
					title : title,
					start : start,
					end : end
				};
				$('#calendar').fullCalendar('renderEvent', eventData, true); // stick?
																				// =
																				// true
			}
			$('#calendar').fullCalendar('unselect');
		},
		editable : true,
		eventLimit : true,
		events : [

		]
	});

});
