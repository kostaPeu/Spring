<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8' />
<!-- full Calendar js,css경로 -->
<link href='/resources/common/css/fullcalendar.css' rel='stylesheet' />
<link href='/resources/common/css/fullcalendar.print.css' rel='stylesheet' media='print' /> 
<script src='/resources/common/js/moment.min.js'></script>
<script src='/resources/common/js/fullcalendar.min.js'></script> 
<!-- <script src='/resources/common/js/jquery-ui.custom.min.js'></script> -->
<!-- <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/2.7.3/fullcalendar.min.js"></script>
<link href='https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/2.7.3/fullcalendar.min.css' rel='stylesheet'/>
<link href='https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/2.7.3/fullcalendar.print.css' rel='stylesheet'/> -->
<!-- custom js,css경로 -->
<link href='/resources/stock/css/stock_search.css' rel='stylesheet'>
<script src='/resources/stock/js/stock_search_calendar.js'></script>
<script type='text/javascript'>
$(function(){
	$('#calendar').fullCalendar({
		header: {
			left: 'prev,next today',
			center: 'title',
			right: 'month,basicWeek,basicDay'
		},
		defaultDate: '2016-05-12',
		editable: true,
		eventLimit: true, // allow "more" link when too many events
		events: [
			{
				title: 'All Day Event',
				start: '2016-05-01'
			},
			{
				title: 'Long Event',
				start: '2016-05-07',
				end: '2016-05-10'
			},
			{
				id: 999,
				title: 'Repeating Event',
				start: '2016-05-09T16:00:00'
			},
			{
				id: 999,
				title: 'Repeating Event',
				start: '2016-05-16T16:00:00'
			},
			{
				title: 'Conference',
				start: '2016-05-11',
				end: '2016-05-13'
			},
			{
				title: 'Meeting',
				start: '2016-05-12T10:30:00',
				end: '2016-05-12T12:30:00'
			},
			{
				title: 'Lunch',
				start: '2016-05-12T12:00:00'
			},
			{
				title: 'Meeting',
				start: '2016-05-12T14:30:00'
			},
			{
				title: 'Happy Hour',
				start: '2016-05-12T17:30:00'
			},
			{
				title: 'Dinner',
				start: '2016-05-12T20:00:00'
			},
			{
				title: 'Birthday Party',
				start: '2016-05-13T07:00:00'
			},
			{
				title: 'Click for Google',
				url: 'http://google.com/',
				start: '2016-05-28'
			}
		]
	});
	
});
</script>
<style>

	body {
		margin: 40px 10px;
		padding: 0;
		font-family: "Lucida Grande",Helvetica,Arial,Verdana,sans-serif;
		font-size: 14px;
	}

	#calendar {
		max-width: 900px;
		margin: 0 auto;
	}

</style>
</head>
<body>

	<div id='calendar'></div>
<!-- <div id="fullcalendar"></div> -->
<div id="dialog" title="My dialog" style="display:none">
    <form>
        <fieldset>
            <label for="Id">Id</label>
            <input type="text" name="name" id="name" class="text ui-widget-content ui-corner-all">
            <label for="Id">Title</label>
            <input type="text" name="title" id="title" class="text ui-widget-content ui-corner-all">
        </fieldset>
    </form>
</div>
</body>
</html>
