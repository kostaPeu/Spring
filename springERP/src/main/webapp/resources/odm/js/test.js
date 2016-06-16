var express = require('express')
	,http = require('http')
	,request = require("request")
	,app = express()
	,server = http.createServer(app)
	,url = require('url');

var bodyParser = require('body-parser');
app.use(bodyParser.urlencoded({     // to support URL-encoded bodies
  extended: true
})); 

app.use(function(req, res, next) {
	res.header("Access-Control-Allow-Origin", "*");
	res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, x-csrf-token, Accept");
	next();
});
var key = "SSUyMSUyNiVDMyUyNyVFNzclODclMkMlRkMlQ0ElM0QlQ0YlMDclMTZJNHolOUUlODYlRjQlQURKJUEyJTJCJTFCNCUwOVQlRTclMDclRUQlQjclOUUlRDg2";
var partner_key = "aCUwMmslRjAlODclOUJWdA==";
	app.get('/', function(req, res, next) {
	  // Handle the get for this route
//		request('http://localhost:8081/odm/test', function(error, response, body){
//			if(!error && response.statusCode == 200){
//				response.send({
//					message:'데이터를 수정했습니다.'
//				})
//			}
//		})
	});

	app.post('/godo_register', function(req, res, next){
		var sell_id = req.param('sell_id');
		var data_url = "http://kostaseo.iptime.org:8000/register/xml?sell_id="+sell_id;
		//var data_url = url.parse("http://kostaseo.iptime.org:8000/sale/xmltest?sell_id="+sell_id);
		//var data_url = url.format("kostaseo.iptime.org:8081/sale/xmltest?sell_id="+sell_id);
		//var data_url = "kostaseo.iptime.org:8000/sale/xmltest?sell_id="+sell_id;
		console.log("서버성공! "+sell_id);
		console.log(data_url);
		//res.send(sell_id);
		
		request({
		    url: 'https://openhub.godo.co.kr/enamoo/goods/Goods_Insert.php?key='+key+"&partner_key="+partner_key+"&data_url="+data_url, //URL to hit
		}, function(error, response, body){
		    if(error) {
		        console.log(error);
		    } else {
		        console.log(body);
//		        res.set('Content-Type', 'text/xml');
//		    	res.send(xml(body));
//		        res.setHeader('Content-Type', 'text/xml');
		        res.write(body);
		        res.end();
		    	console.log("성공");
		    	
		}
		});
		
	});
	app.post('/', function(req, res, next) {
	 // Handle the post for this route
	});

	app.post('/orderCollect', function(req, res, next) {
		 // Handle the post for this route
			var step = req.param('step');
			var step2 = req.param('step2')
			
			var resBody= null;
			request({
			    url: 'https://openhub.godo.co.kr/enamoo/order/Order_Search.php?key='+key+"&partner_key="+partner_key+"&step="+step+"&step2="+step2, //URL to hit
			   // qs: {from: 'blog example', time: +new Date()}, //Query string data
			    //method: 'POST', 
			    //Lets post the following key/values as form
//			    json: {
//			        field1: 'data',
//			        field2: 'data'
//			    }
			}, function(error, response, body){
			    if(error) {
			        console.log(error);
			    } else {
			        //console.log(body);
//			    	res.set('Content-Type', 'text/xml');
//			    	res.send(xml(body));
			    	res.send(body);
			        console.log("성공");
			}
			});
		});

	app.post('/get', function(req,res){
		
	});

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