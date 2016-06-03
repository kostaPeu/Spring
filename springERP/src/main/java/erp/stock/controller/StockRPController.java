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
public class StockRPController {
	
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
	public String stockRpInsert(StockRP stock) throws Exception{

		service.stockRPInsert(stock);
		
		return "redirect:/stock/rp/insert_form";
	}
}
