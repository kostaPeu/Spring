package erp.stock.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import erp.stock.domain.StockRP;
import erp.stock.service.StockRPService;

@Controller
@RequestMapping("/stock/rp/*")
public class StockController {
	
	@Inject
	private StockRPService service;
	
	@RequestMapping("/insert_form")
	public String stockRpForm(Model model) throws Exception{

		model.addAttribute("list", service.productList());
		model.addAttribute("left", "stock/stock.jsp");
		model.addAttribute("contents", "stock/stock_insert.jsp");
		
		return "/main";
	}
	
	@RequestMapping("/insert")
	public String stockRpInsert(Model model, @RequestParam("product_id") String product_id, @RequestParam("stock_amount") int stock_amount,
			@RequestParam("type") String type) throws Exception{

		StockRP stock = new StockRP();
		
		stock.setProduct_id(product_id);
		stock.setInout_amount(stock_amount);
		stock.setEmp_id("aa");
		stock.setType(type);

		service.stockRPInsert(stock);
		
		return "redirect:/stock/rp/insert_form";
	}
}
