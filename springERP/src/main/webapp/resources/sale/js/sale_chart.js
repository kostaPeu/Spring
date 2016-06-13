$(function () {
	var tlists = [];
	var plists = [];
	var customer_id;
	function productAjax(customer_id){
		$.ajax({
			url : "/sale/product_chart?customer_id="+customer_id,
			type : "post",
			dataType : "JSON",
			async : false,
			success : function(data) {
				plists = [];

				var total  = 0;
				$.each(data, function(index,p){
					total += p.total_price;
				});

				$.each(data, function(index, p){
					var json = [];
					var y = parseFloat((p.total_price / total * 100).toFixed(2));
					
					json.name = p.product_id;
					json.y = y;
					json.push(p.product_id);
					json.push(y);
					plists.push(json);
				});
			}
		});
	}
		
	$.ajax({
		url : "/sale/customer_chart",
		type : "post",
		dataType : "JSON",
		async : false,
		success : function(data) {
			console.log(data);
			lists = [];
			tlists = [];
			var total = 0;
			$.each(data, function(index, c) {
				total += c.total;
			});

			$.each(data, function(index, c) {
				var json = {};
				var pjson = {};
				var y = parseFloat((c.total / total * 100).toFixed(2));

				pjson.name = c.customer_id;
				pjson.id = c.customer_id;
				
				productAjax(c.customer_id);
				pjson.data = plists;
				
				json.name = c.customer_id;
				json.y = y;
				json.drilldown = c.customer_id;

				lists.push(json);
				tlists.push(pjson);
			});
		}
	});
    // Create the chart
    $('#container').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: '거래처별 판매금액 정산'
        },
        xAxis: {
            type: 'category'
        },
        yAxis: {
            title: {
                text: '거래처별 판매금액 비율'
            }

        },
        legend: {
            enabled: false
        },
        plotOptions: {
            series: {
                borderWidth: 0,
                dataLabels: {
                    enabled: true,
                    format: '{point.y:.1f}%'
                }
            }
        },

        tooltip: {
            headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
            pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.2f}%</b> of total<br/>'
        },

        series: [{
            name: '거래처별',
            colorByPoint: true,
            data:lists
        }],
        drilldown: {
            series: tlists
        }
    });
});