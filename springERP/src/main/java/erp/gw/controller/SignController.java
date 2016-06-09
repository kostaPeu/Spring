package erp.gw.controller;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import erp.gw.sign.domain.DraftFormatVO;
import erp.gw.sign.service.DraftService;


@Controller
@RequestMapping("/groupware/sign")
public class SignController {
	
	@Inject
	private DraftService service;
	
	@RequestMapping(value="/write_draft_write", method=RequestMethod.GET)
	public String draftWirte(Model model) throws Exception{		

		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/sign/draft_write.jsp");
		
		return "/main";
	}
	
	@RequestMapping("/draft_format_list")
	public String draftFormat(Model model) throws Exception{
		
		List<DraftFormatVO> list = service.listFormat();
		
		model.addAttribute("list", list);
		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/sign/draft_format_list.jsp");
		
		return "/main";
	}
	
	@RequestMapping("/draft_format_list{draft_format_id}")
	public String draftFormatView(Model model) throws Exception{
		
		//model.addAttribute("list", list);
		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/sign/draft_format_list.jsp");
		
		return "/main";
	}
}