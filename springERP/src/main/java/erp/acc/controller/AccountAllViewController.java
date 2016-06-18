package erp.acc.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import erp.acc.basic.service.AccountAllViewService;

@Controller
@RequestMapping("/accountAllview/*")
public class AccountAllViewController {

	@Inject
	private AccountAllViewService service;
	
	@RequestMapping("print")
	public String print(Model model)throws Exception{
		model.addAttribute("left", "accounting/accounting.jsp");
		model.addAttribute("contents", "accounting/print/print.jsp");
		return "/main";
	}

	//손익계산서 검색설정
	@RequestMapping(value="incomeSearch", method=RequestMethod.GET)
	public String incomeSearchGET(Model model)throws Exception{
		model.addAttribute("left", "accounting/accounting.jsp");		
		model.addAttribute("contents", "accounting/print/income_search.jsp");
		return "/main";		
	}
	
	//손익계산서
	@RequestMapping(value="incomeSearch", method=RequestMethod.POST)
	public String incomeSearchPOST(Model model)throws Exception{
		model.addAttribute("left", "accounting/accounting.jsp");		
		model.addAttribute("contents", "accounting/print/income_statement.jsp");
		return "/main";		
	}
	
	@RequestMapping(value="income", method=RequestMethod.GET)
	public String incomeStatementGET(Model model)throws Exception{
		model.addAttribute("left", "accounting/accounting.jsp");		
		model.addAttribute("contents", "accounting/print/income_statement.jsp");
		return "/main";
	}
	
	/*
	@RequestMapping(value="income", method=RequestMethod.POST)
	public String incomeStatementPOST(Model model)throws Exception{
		model.addAttribute("left", "accounting/accounting.jsp");		
		model.addAttribute("contents", "accounting/print/income_statement.jsp");
		return "/main";
	}*/
}
