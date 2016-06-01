package erp.stock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stock/rp/*")
public class StockController {
	
	@RequestMapping("/insert")
	public String stockRpInsert(Model model){
		model.addAttribute("left", "stock/stock.jsp");
		model.addAttribute("contents", "stock/stock_insert.jsp");
		
		return "/main";
	}

}
