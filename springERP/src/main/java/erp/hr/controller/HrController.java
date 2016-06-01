package erp.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import erp.hr.domain.HrBasicVo;

@Controller
@RequestMapping("/hr")
public class HrController {
	@RequestMapping(value="/hr_basic")
	public String hr_basic(Model model){
		model.addAttribute("left", "hr/hr.jsp");
		model.addAttribute("contents", "hr/hr_basic.jsp");
		return "/main";
	}
	@RequestMapping(value="/basic_check")
	public String basic_check(HrBasicVo vo){
		return "asd";
	}
}
