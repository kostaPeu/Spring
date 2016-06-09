package erp.gw.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import erp.gw.sign.domain.DraftFormatVO;
import erp.gw.sign.service.DraftService;


@Controller
@RequestMapping("/groupware/sign")
public class SignController {
	
	private DraftService service;
	
	@RequestMapping(value="/write_draft_write", method=RequestMethod.GET)
	public String draftWirte(Model model) throws Exception{		

		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/sign/draft_write.jsp");
		
		return "/main";
	}
	
	@RequestMapping(value="/draft_format_list")
	public String draftFormat(Model model) throws Exception{		
		System.out.println("컨트롤러 시작쿠!!!");
		List<DraftFormatVO> list = service.listFormat();
		System.out.println(list.toString());
		
		model.addAttribute("list", list);
		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/sign/draft_format_list.jsp");
		
		return "/main";
	}
}