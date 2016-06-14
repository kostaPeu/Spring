package erp.acc.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import erp.acc.basic.domain.Diagnosiss;
import erp.acc.basic.service.BasicAccountService;
import erp.acc.basic.service.DiagnosissService;

@Controller
@RequestMapping("/accounting/diagnosis2/*")
public class DiagnosisController {

	@Inject
	private DiagnosissService service;
	
	@RequestMapping(value="DiagnosisList", method = RequestMethod.GET)
	public String diagnosisList(Model model)throws Exception{
		model.addAttribute("left", "accounting/accounting.jsp");
		model.addAttribute("listModel", service.diagnosisList());
		model.addAttribute("contents", "accounting/diagnosis/DiagnosisList.jsp");
		
		return "/main";
	}
	
	@RequestMapping("Diagnosislist")
	@ResponseBody
	public List<Diagnosiss> diagnosisList2()throws Exception{
		return service.diagnosisList();
	}
	

	
	
}
