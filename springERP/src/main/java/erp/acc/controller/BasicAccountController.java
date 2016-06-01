package erp.acc.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import erp.acc.basic.domain.Accounts;
import erp.acc.basic.service.BasicAccountService;

@Controller
@RequestMapping("/basic/account")
public class BasicAccountController {
	
	@Inject
	private BasicAccountService service;
	
	
	@RequestMapping("/list")
	public String accountList(Model model)throws Exception{
		
		model.addAttribute("listModel", service.)
		return "/main";
	}
	
	
	//계좌등록 -JH
	@RequestMapping("/insert")
	public String accountInsert(Accounts accounts)throws Exception{
		
		service.accountInsert(accounts);
		return "redirect:/account/list";
	}
	@RequestMapping("/update")
	public String accountUpdate(Accounts accounts)throws Exception{
	service.accountUpdate(accounts);
	return "redirect:/account/list";
}
	@RequestMapping("/delete")
	public String accountDelete(String account_number )throws Exception{
		service.accountDelete(account_number);
		
	return "redirect:/account/list";
}
	
}
