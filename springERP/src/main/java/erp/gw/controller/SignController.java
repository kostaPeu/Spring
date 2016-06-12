package erp.gw.controller;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import erp.common.service.CommonService;
import erp.gw.sign.domain.DraftFormatVO;
import erp.gw.sign.domain.DraftVO;
import erp.gw.sign.domain.PersonViewVO;
import erp.gw.sign.service.DraftService;


@Controller
@RequestMapping("/groupware/sign")
public class SignController {
	
	@Inject
	private DraftService service;
	
	// 기안서작성 눌렀을때 뜨는 공통양식 리스트
	@RequestMapping("/format_select_list")
	public String selectFormat(Model model) throws Exception{
		
		List<DraftFormatVO> list = service.listFormat();
		
		model.addAttribute("list", list);
		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/sign/format_select_list.jsp");
		
		return "/main";
	}
	
	
	// 공통양식 선택없이 기안서 작성페이지로
	@RequestMapping(value="/draft_write", method=RequestMethod.GET)
	public String draftWirte(Model model) throws Exception{		

		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/sign/draft_write.jsp");
		
		return "/main";
	}
	
	// 공통양식 골라서 기안서 작성페이지로
	@RequestMapping("/draft_write{draft_format_id}")
	public String selectFormat(@PathVariable("draft_format_id") String draft_format_id, Model model) throws Exception{
		
		DraftFormatVO draftFormat = service.selectFormat(draft_format_id);
		
		model.addAttribute("draftFormat", draftFormat);
		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/sign/draft_write.jsp");
		
		return "/main";
	}
	
	// 기안서 등록
	@RequestMapping(value="/draft_write", method=RequestMethod.POST)
	public String insertDraft(@RequestParam("approval_emp") String approval_emp, DraftVO draft, Model model) throws Exception{
		
		draft.setEmp_id(CommonService.getEmployeeId());
		
		System.out.println(draft.toString());
		service.insertDraft(draft);
		
		String[] strarr = approval_emp.replaceAll("\\s", "").split(",");
		
		service.insertApproval(strarr);
		
		model.addAttribute("draft", draft);
		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/sign/draft_view.jsp");
		return "/main";
	}
		
	
	
	// 공통양식 작성페이지로
	@RequestMapping("/draft_format_write")
	public void newFormat(Model model) throws Exception{
		System.out.println("/draft_format_write 들어옴");
	}
	
	
	// 공통양식 수정페이지로
	@RequestMapping("/format_write{draft_format_id}")
	public String editFormat(@PathVariable("draft_format_id") String draft_format_id, Model model) throws Exception{
		
		DraftFormatVO draftFormat = service.selectFormat(draft_format_id);
		
		model.addAttribute("draftFormat", draftFormat);
		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/sign/draft_write.jsp");
		return "/main";
	}
	
	// 공통양식 등록
	@RequestMapping(value="/draft_format_write", method=RequestMethod.POST)
	public String insertFormat(DraftFormatVO draftFormat ,Model model) throws Exception{
		System.out.println("과연.... : "+draftFormat);
		service.insertFormat(draftFormat);
		System.out.println("/draft_format_write POST 들어옴22222");
		
		return "redirect:/groupware/sign/draft_format_list";
	}
	
	// 공통양식 리스트
	@RequestMapping("/draft_format_list")
	public String draftFormat(Model model) throws Exception{
		System.out.println("/draft_format_list 도 들어와땅 > <");
		List<DraftFormatVO> list = service.listFormat();
		
		model.addAttribute("list", list);
		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/sign/draft_format_list.jsp");
		
		System.out.println("/draft_format_list 도 들어와땅 > <222");
		return "/main";
	}
	
	
	// 공통양식 상세
	@RequestMapping("/draft_format_list{draft_format_id}")
	public String draftFormatView(Model model) throws Exception{
		
		//model.addAttribute("list", list);
		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/sign/draft_format_list.jsp");
		
		return "/main";
	}
	
	
	
	
	// 내 결재 관리 리스트
	@RequestMapping("/my_draft_list")
	public String myDraft(Model model) throws Exception{
		
		List<DraftVO> list = service.selectlistDraft(CommonService.getEmployeeId());
		
		model.addAttribute("list", list);
		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/sign/draft_list.jsp");
		
		return "/main";
	}
	
	// 기안서 리스트
	@RequestMapping("/all_draft_list")
	public String allDraft(Model model) throws Exception{
		
		List<DraftVO> list = service.listDraft();
		
		model.addAttribute("list", list);
		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/sign/draft_list.jsp");
		
		return "/main";
	}
	
	// 기안서 상세보기
	@RequestMapping("/draft_view{draft_id}")
	public String draftView(@PathVariable("draft_id") String draft_id ,Model model) throws Exception{
		
		DraftVO draft = service.selectDraft(draft_id);
		
		model.addAttribute("draft", draft);
		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/sign/draft_view.jsp");
		return "/main";
	}
	
	// 직원 검색하기
	@ResponseBody
	@RequestMapping("/searchPeople")
	public List<PersonViewVO> eNameSearch(@RequestParam("e_name") String e_name)throws Exception{
		return service.enameSearchList(e_name);
	}
	
}