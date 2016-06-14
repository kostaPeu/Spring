package erp.odm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/odm/*")
public class OdmController {
	
	@RequestMapping("/test")
	public String test(Model model) throws Exception{
		
		model.addAttribute("left","odm/odm.jsp");
		model.addAttribute("contents","odm/odmTest.jsp");
		
		return "/main";
	}

}
