package erp.acc.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import erp.acc.basic.service.StatementService;

@Controller
@RequestMapping("/StateMent/*")
public class StatementController {

	@Inject
	private StatementService service;
	
	@RequestMapping(value = "StatementPurchaseList", method=RequestMethod.GET)
	public String StatementPurchaseListGET(Model model)throws Exception{
		model.addAttribute("left", "accounting/accounting.jsp");
		model.addAttribute("contents", "accounting/Statement/Statement_purchaseList.jsp");
		return "/main";
	}
	
	@RequestMapping(value = "StatementPurchaseList", method=RequestMethod.POST)
	public String StatementPurchaseListPOST(Model model)throws Exception{
		model.addAttribute("left", "accounting/accounting.jsp");
		model.addAttribute("listModel", service.StatementAllList());
		model.addAttribute("contents", "accounting/Statement/Statement_purchaseList.jsp");		
		return "/main";
	}
	
	@RequestMapping(value = "StatementSalesList", method=RequestMethod.GET)
	public String StatementSalesListGET(Model model)throws Exception{
		model.addAttribute("left", "accounting/accounting.jsp");
		model.addAttribute("contents", "accounting/Statement/Statemnet_SalesList.jsp");
		
		return "/main";		
	}
	
	@RequestMapping(value = "StatementSalesList", method=RequestMethod.POST)
	public String StatementSalesListPOST(Model model)throws Exception{
		model.addAttribute("left", "accounting/accounting.jsp");
		model.addAttribute("listModel", service.StatementAllList());
		
		model.addAttribute("contents", "accounting/Statement/Statement_purchaseList.jsp");			
		return "/main";
	}
	
	
}
