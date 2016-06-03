<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8' />
<!-- full Calendar js,css경로 -->
<link href='/resources/common/css/fullcalendar.css' rel='stylesheet' />
<link href='/resources/common/css/fullcalendar.print.css' rel='stylesheet' media='print' /> 
<script src='/resources/common/js/moment.min.js'></script>
<script src='/resources/common/js/fullcalendar.min.js'></script> 
<script src='/resources/common/js/jquery-ui.custom.min.js'></script> 

<!-- custom js,css경로 -->
<link href='/resources/stock/css/stock_search.css' rel='stylesheet'>
<script src='/resources/stock/js/stock_search_calendar.js'></script>
</head>
<body>
<div id='wrap'>

		<div id='external-events'>
			<h4>Draggable Events</h4>
			<div class='fc-event'>aa</div>
			<div class='fc-event'>bb</div>
<!-- 			<p>
				<input type='checkbox' id='drop-remove' />
				<label for='drop-remove'>remove after drop</label>
			</p> -->
		</div>

		<div id='calendar'></div>

		<div style='clear:both'></div>

	</div>
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">
      
    <div class="modal-content">
	<div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">중복확인(품목코드)</h4>
      </div>
      <div class="modal-body">
			<div class="col-sm-10">
				<input type="text" class="form-control" name="product_id" id="search_product">
			</div>
			<div class="col-sm-2">
				<button type="button" class="btn btn-info btn-sm" id="search_id"><span class="fa fa-search"></span></button>
			</div>
			<br><br><br>
  				<table id="searchTable" class="table table-bordered">
				</table>
				<div id="useBtnArea">
					<input type="button" id="useBtn" class="btn btn-default center" value="사용">
				</div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
</body>
</html>
