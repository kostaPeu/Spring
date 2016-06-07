package erp.acc.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import erp.acc.basic.service.BasicAccountService;

@Controller
@RequestMapping("/accounting/project")
public class ProjectController {

	@Inject
	private BasicAccountService service;
	
	//카드 리스트
	@RequestMapping("/list")
	public String cardList(Model model)throws Exception{
		model.addAttribute("left", "accounting/accounting.jsp");
		model.addAttribute("contents", "accounting/basic/Project.jsp");
		return "/main";
	}
}
