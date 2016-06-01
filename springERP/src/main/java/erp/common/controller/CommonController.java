package erp.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommonController {
	
	@RequestMapping("/main")
	public void mainTest(@RequestParam(value="left", defaultValue="mypage/mypage.jsp") String left, @RequestParam(value="contents", defaultValue="mypage/my_info/my_info.jsp") String contents, Model model){
		model.addAttribute("left",left);
		model.addAttribute("contents",contents);
	}
	
	@RequestMapping("/basic")
	public String leftBasic(Model model){
		model.addAttribute("left","basic/basic.jsp");
		return "/main";
	}
	
	@RequestMapping("/purchase")
	public String leftPurchase(Model model){
		model.addAttribute("left","purchase/purchase.jsp");
		return "/main";
	}
	
	@RequestMapping("/sale")
	public String leftSale(Model model){
		model.addAttribute("left","sale/sale.jsp");
		return "/main";
	}
	
	@RequestMapping("/odm")
	public String leftOdm(Model model){
		model.addAttribute("left","odm/odm.jsp");
		return "/main";
	}
	
	@RequestMapping("/stock")
	public String leftStock(Model model){
		model.addAttribute("left","stock/stock.jsp");
		return "/main";
	}
	
	@RequestMapping("/accounting")
	public String leftAcc(Model model){
		model.addAttribute("left","accounting/accounting.jsp");
		return "/main";
	}
	
	@RequestMapping("/hr")
	public String leftHr(Model model){
		model.addAttribute("left","hr/hr.jsp");
		return "/main";
	}
	
	@RequestMapping("/groupware")
	public String leftGroupware(Model model){
		model.addAttribute("left","groupware/groupware.jsp");
		return "/main";
	}
	
	@RequestMapping("/mypage")
	public String leftMypage(Model model){
		System.out.println("hoho");
		model.addAttribute("left","mypage/mypage.jsp");
		return "/main";
	}
}
