//기초등록
$(function() {
	$("#dept").click(
			function() {
				$(".add_basic").css("display", "block");

				$(".basic_title").html("부서");
				$("#insert_id_label").html("부서번호");
				$("#insert_name_label").html("부서명");
				$("#update_id_label").html("부서번호");
				$("#update_name_label").html("부서명");
				$("#del_id_label").html("부서번호");
				$("#insert_type").val("dept");
				$("#update_type").val("dept");
				$("#del_type").val("dept");
				$(".basic_info_body").empty();
				
				$.getJSON("/hr/hr_basic/dept", function(data) {
					var str = "<tr class='basic_info_head'> <th>부서번호</th> <th>부서명</th></tr>";
					$(data).each(
							function() {
								str += "<tr class='basic_info_data'><td>" + this.dept_id + "</td>" 
									+ "<td>" + this.dept_name + "</td></tr>";
							});
					$(".basic_info_body").html(str);
				});
			});
	$("#position").click(function() {
		$(".add_basic").css("display", "block");

		$(".basic_title").html("직급");
		$("#insert_id_label").html("직급번호");
		$("#insert_name_label").html("직급명");
		$("#update_id_label").html("직급번호");
		$("#update_name_label").html("직급명");
		$("#del_id_label").html("직급번호");

		$("#insert_type").val("position");
		$("#update_type").val("position");
		$("#del_type").val("position");
		$(".basic_info_body").empty();
		$.getJSON("/hr/hr_basic/position", function(data) {
			var str = "<tr class='basic_info_head'> <th>직급번호</th> <th>직급명</th></tr>";
			$(data).each(
					function() {
						str += "<tr class='basic_info_data'><td>" + this.position_id + "</td>" 
							+ "<td>" + this.position_name + "</td>";
					});
			$(".basic_info_body").html(str);
		});
	});
	$("#job").click(function() {
		$(".add_basic").css("display", "block");

		$(".basic_title").html("직무");
		$("#insert_id_label").html("직무번호");
		$("#insert_name_label").html("직무명");
		$("#update_id_label").html("직무번호");
		$("#update_name_label").html("직무명");
		$("#del_id_label").html("직무번호");

		$("#insert_type").val("job");
		$("#update_type").val("job");
		$("#del_type").val("job");
		$(".basic_info_body").empty();
		$.getJSON("/hr/hr_basic/job", function(data) {
			var str = "<tr class='basic_info_head'> <th>직무번호</th> <th>직무명</th></tr>";
			$(data).each(
					function() {
						str += "<tr class='basic_info_data'><td>" + this.job_id + "</td>" 
							+ "<td>" + this.job_name + "</td>";
					});
			$(".basic_info_body").html(str);
		});
	});
	$("#duty").click(function() {
		$(".add_basic").css("display", "block");

		$(".basic_title").html("직책");

/*		$(".basic_info_head th:nth-child(1)").html("직책번호");
		$(".basic_info_head th:nth-child(2)").html("직책명");*/

		$("#insert_id_label").html("직책번호");
		$("#insert_name_label").html("직책명");
		$("#update_id_label").html("직책번호");
		$("#update_name_label").html("직책명");
		$("#del_id_label").html("직책번호");

		$("#insert_type").val("duty");
		$("#update_type").val("duty");
		$("#del_type").val("duty");
		$(".basic_info_body").empty();
		$.getJSON("/hr/hr_basic/duty", function(data) {
			var str = "<tr class='basic_info_head'> <th>직책번호</th> <th>직책명</th></tr>";
			$(data).each(
					function() {
						str += "<tr class='basic_info_data'><td>" + this.duty_id + "</td>" 
							+ "<td>" + this.duty_name + "</td></tr>";
					});
			$(".basic_info_body").html(str);
		});
	});

	$("#check_id").click(function() {
		var basic_id = $("#basic_id_input").val();
		var basic_type = $("#insert_type").val();
		$.ajax({
			type : "POST",
			url : "/hr/hr_basic/basic_check",
			headers : {
				"Content-Type" : "application/json",
				"X-HTTP-Method-Override" : "POST"
			},
			dataType : 'text',
			data : JSON.stringify({
				basic_id : basic_id,
				basic_type : basic_type
			}),
			success : function(data) {
				console.log("result: " + data);
				if (data == 'ok') {
					alert("사용가능");
				} else {
					alert("사용불가");
				}
			}
		})
	});

	$(".closebtn").click(function() {
		$(".add_basic").css("display", "none");
	});
});