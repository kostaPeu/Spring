package erp.gw.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/groupware/sign")
public class SignController {
	
	@RequestMapping(value="/write_draft_write", method=RequestMethod.GET)
	public String draftWirte(Model model) throws Exception{		

		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/sign/draft_write.jsp");
		
		return "/main";
	}
}