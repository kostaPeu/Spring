package erp.common.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/")
	public String mainTest(@RequestParam(value="left", defaultValue="basic/basic.jsp") String left, @RequestParam(value="contents", defaultValue="") String contents, Model model){
		model.addAttribute("left",left);
		model.addAttribute("contents",contents);
		return "/main";
	}
	
	@RequestMapping("/login")
	public String login(){
		
		return "/login";
	}
}
