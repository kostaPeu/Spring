package erp.stock.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import erp.stock.domain.StockRP;
import erp.stock.service.StockRPService;

@Controller
@RequestMapping("/stock/rp/*")
public class StockController {
	
	@Inject
	private StockRPService service;
	
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String stockRpForm(Model model) throws Exception{

		model.addAttribute("list", service.productList());
		model.addAttribute("left", "stock/stock.jsp");
		model.addAttribute("contents", "stock/stock_insert.jsp");
		
		return "/main";
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String stockRpInsert(Model model, StockRP stock) throws Exception{

		service.stockRPInsert(stock);
		
		model.addAttribute("list", service.productList());
		model.addAttribute("left", "stock/stock.jsp");
		model.addAttribute("contents", "stock/stock_insert.jsp");
		
		return "/main";
	}

}
