package erp.basic.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import erp.basic.domain.Product;
import erp.basic.service.BasicProductService;

@RestController
@RequestMapping("/basic/product/*")
public class ProductJsonController {

	@Autowired
	private BasicProductService service;
	
	@RequestMapping("/codeJson")
	public List<Product> productCodeJson(@RequestParam("searchKey") String searchKey) throws Exception{
		System.out.println("Json 호출");
		System.out.println(searchKey);
		String word = "%"+searchKey+"%";
		System.out.println(word);
		//List<Product> list = service.productCodeJson(word);
				
		return service.productCodeJson(word);
	}
}
