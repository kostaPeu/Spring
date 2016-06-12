package erp.acc.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import erp.acc.basic.service.BasicAccountService;

@Controller
@RequestMapping("/accounting/diagnosis2/*")
public class DiagnosisController {

	@Inject
	private BasicAccountService service;
	
	@RequestMapping(value="DiagnosisList", method = RequestMethod.GET)
	public String diagnosisList(Model model)throws Exception{
		model.addAttribute("left", "accounting/accounting.jsp");
		/*model.addAttribute("listModel", service.diagnosisList());*/
		model.addAttribute("contents", "accounting/diagnosis/DiagnosisList.jsp");
		
		return "/main";
	}
}
