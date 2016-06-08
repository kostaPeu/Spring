package erp.stock.controller;

import java.util.concurrent.ExecutionException;

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
		model.addAttribute("contents", "stock/stock_search_calendar.jsp");
		
		return "/main";
	}
	
//	@RequestMapping("/insert")
//	public String stockRpInsert(StockRP stock, Model model) throws Exception{
//
//		System.out.println("controller : "+stock.getInout_type());
//		System.out.println("controller : "+stock.getInout_date());
//		service.stockRPInsert(stock);
//		
//		model.addAttribute("list", service.productList());
//		model.addAttribute("left", "stock/stock.jsp");
//		model.addAttribute("contents", "stock/stock_search_calendar.jsp");
//		
//		return "/main";
//	}
	
	@RequestMapping("/update")
	public String stockRPupdate(StockRP stock, Model model) throws Exception{
		
		service.stockRPUpdate(stock);
		
		model.addAttribute("list", service.productList());
		model.addAttribute("left", "stock/stock.jsp");
		model.addAttribute("contents", "stock/stock_search_calendar.jsp");
		
		return "/main";
	}
/*	@RequestMapping("/test")
	public String stockTest(Model model) throws Exception{
		
		model.addAttribute("list", service.productList());
		model.addAttribute("left", "stock/stock.jsp");
		model.addAttribute("contents", "stock/stock_search_calendar.jsp");
		
		return "/main";
	}*/
}
