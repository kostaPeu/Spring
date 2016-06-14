var express = require('express')
	,http = require('http')
	,request = require("request")
	,app = express()
	,server = http.createServer(app);

var bodyParser = require('body-parser');
app.use(bodyParser.urlencoded({     // to support URL-encoded bodies
  extended: true
})); 
	app.use(function(req, res, next) {
	  res.header("Access-Control-Allow-Origin", "*");
	  res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
	  next();
	});

	app.get('/', function(req, res, next) {
	  // Handle the get for this route
		console.log("get rewqqq");
//		$({
//				url : "localhost:8080/odm/test",
//				dataType : "html",
//				type : "POST",
//				success : function(data) {
//					console.log(data);
//			}
//		});
//		request('http://localhost:8081/odm/test', function(error, response, body){
//			if(!error && response.statusCode == 200){
//				response.send({
//					message:'데이터를 수정했습니다.'
//				})
//			}
//		})
//		var key = "SSUyMSUyNiVDMyUyNyVFNzclODclMkMlRkMlQ0ElM0QlQ0YlMDclMTZJNHolOUUlODYlRjQlQURKJUEyJTJCJTFCNCUwOVQlRTclMDclRUQlQjclOUUlRDg2";
//		var partner_key = "aCUwMmslRjAlODclOUJWdA==";
//		request({
//		    url: 'https://openhub.godo.co.kr/enamoo/goods/Goods_Search.php?key='+key+"&partner_key="+partner_key, //URL to hit
//		   // qs: {from: 'blog example', time: +new Date()}, //Query string data
//		    method: 'POST',
//		    //Lets post the following key/values as form
////		    json: {
////		        field1: 'data',
////		        field2: 'data'
////		    }
//		}, function(error, response, body){
//		    if(error) {
//		        console.log(error);
//		    } else {
//		        //console.log(body);
//		    	res.set('Content-Type', 'text/xml');
//		    	res.send(xml(body));
//		}
//		});
		//res.send('get req');
	});

	app.post('/', function(req, res, next) {
	 // Handle the post for this route
		var step = req.param('step');
		var step2 = req.param('step2');

		var key = "SSUyMSUyNiVDMyUyNyVFNzclODclMkMlRkMlQ0ElM0QlQ0YlMDclMTZJNHolOUUlODYlRjQlQURKJUEyJTJCJTFCNCUwOVQlRTclMDclRUQlQjclOUUlRDg2";
		var partner_key = "aCUwMmslRjAlODclOUJWdA==";
		var resBody= null;
		request({
		    url: 'https://openhub.godo.co.kr/enamoo/order/Order_Search.php?key='+key+"&partner_key="+partner_key+"&step="+step+"&step2="+step2, //URL to hit
		   // qs: {from: 'blog example', time: +new Date()}, //Query string data
		    //method: 'POST', 
		    //Lets post the following key/values as form
//		    json: {
//		        field1: 'data',
//		        field2: 'data'
//		    }
		}, function(error, response, body){
		    if(error) {
		        console.log(error);
		    } else {
		        //console.log(body);
//		    	res.set('Content-Type', 'text/xml');
//		    	res.send(xml(body));
		    	res.send(body);
		        console.log("성공");
		}
		});
//    	res.set('Content-Type', 'text/xml');
//    	res.send(resBody);
	});

	app.post('/get', function(req,res){
//		if(cnt===0){
//			res.send(fn_scrappingReturn("https://github.com/eigen94/kosta111MidProject"));
//			cnt += 1;
//		} else {
//			res.send(javaReult);
//		}
//
//			var key = 'SSUyMSUyNiVDMyUyNyVFNzclODclMkMlRkMlQ0ElM0QlQ0YlMDclMTZJNHolOUUlODYlRjQlQURKJUEyJTJCJTFCNCUwOVQlRTclMDclRUQlQjclOUUlRDg2';
//			$.ajax({
//			    type :"post",
//			    url : "https://openhub.godo.co.kr/enamoo/goods/Goods_Search.php?"+ key,
//			    cache : false,      
//			    dataType : 'xml',
//			    async : false,
//			    success : function(data) {
//			       alert("success");
//			/*        $(data).find('goods_data').each(function () {
//			          var name = $(this).find('goodsnm').text(); 
//			          
//			       });*/            
//			    }
//			 
//			 });
		})
//		var targetUri = req.body.uri;
//		console.log(targetUri);

server.listen(8000, function(){
	console.log('listening'+server.address().port);
});

//function scrappingResult(){
//	this.scrappedObject = [];
//}
//function scrappedObject(path, name, content){
//	this.path = path;
//	this.name = name;
//	this.content = content;
//	//this.subObject = [];
//}