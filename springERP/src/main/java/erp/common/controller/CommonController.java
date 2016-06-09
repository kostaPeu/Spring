package erp.common.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import erp.common.domain.MessageCriteria;
import erp.common.domain.MessageVO;
import erp.common.domain.PageMakerMessage;
import erp.common.service.MessageService;
import erp.hr.domain.EmployeeVO;
import erp.hr.domain.EmployeeViewVO;
import erp.hr.domain.SearchCriteriaHR;

@Controller
public class CommonController {
	@Inject
	private MessageService service;
	
	@RequestMapping("/main")
	public void mainTest(@RequestParam(value="left", defaultValue="") String left, @RequestParam(value="contents", defaultValue="") String contents, Model model){
		model.addAttribute("left",left);
		model.addAttribute("contents",contents);
	}
	
	@RequestMapping("/basic")
	public String leftBasic(Model model){
		model.addAttribute("left","basic/basic.jsp");
		return "/main";
	}
	
	@RequestMapping("/purchase")
	public String leftPurchase(Model model){
		model.addAttribute("left","purchase/purchase.jsp");
		return "/main";
	}
	
	@RequestMapping("/sale")
	public String leftSale(Model model){
		model.addAttribute("left","sale/sale.jsp");
		return "/main";
	}
	
	@RequestMapping("/odm")
	public String leftOdm(Model model){
		model.addAttribute("left","odm/odm.jsp");
		return "/main";
	}
	
	@RequestMapping("/stock")
	public String leftStock(Model model){
		model.addAttribute("left","stock/stock.jsp");
		return "/main";
	}
	
	@RequestMapping("/accounting")
	public String leftAcc(Model model){
		model.addAttribute("left","accounting/accounting.jsp");
		return "/main";
	}
	
	@RequestMapping("/hr")
	public String leftHr(Model model){
		model.addAttribute("left","hr/hr.jsp");
		return "/main";
	}
	
	@RequestMapping("/groupware")
	public String leftGroupware(Model model){
		model.addAttribute("left","groupware/groupware.jsp");
		return "/main";
	}
	
	@RequestMapping("/mypage")
	public String leftMypage(Model model){
		System.out.println("hoho");
		model.addAttribute("left","mypage/mypage.jsp");
		return "/main";
	}
	
	@RequestMapping("/login")
	public String login(){
		
		return "/login";
	}
	
	@RequestMapping(value="/message", method = RequestMethod.GET)
	public String emp_print(@ModelAttribute("cri") MessageCriteria cri, String emp_id, Model model) {
		cri.setEmp_id(emp_id);
		model.addAttribute("list", service.getMessageList(cri));
		
		PageMakerMessage pageMaker = new PageMakerMessage();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.messageListCount(cri));
		pageMaker.setEmp_id(emp_id);
		model.addAttribute("pageMaker", pageMaker);
		return "message";
	}
	@RequestMapping("/message/message_delete")
	public String emp_delete(@ModelAttribute("cri") MessageCriteria cri, @RequestParam("array") String[] array, RedirectAttributes rtts) throws Exception{
		for(int i=0;i<array.length;i++){
			try {
				service.messageDelete(array[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		rtts.addAttribute("page", cri.getPage());
		rtts.addAttribute("perPageNum", cri.getPerPageNum());
		rtts.addAttribute("searchType", cri.getSearchType());
		rtts.addAttribute("keyword", cri.getKeyword());
		rtts.addAttribute("emp_id", cri.getEmp_id());
		
		return "redirect:/message";
	}
	@RequestMapping(value="/message/getEmpID", method = RequestMethod.POST)
	public ResponseEntity<List<EmployeeViewVO>> getEmp(@RequestBody EmployeeVO vo){
		ResponseEntity<List<EmployeeViewVO>> entity = null;
		try {
			entity = new ResponseEntity<List<EmployeeViewVO>>(service.getEmpID(vo.getE_name()), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<List<EmployeeViewVO>>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	@RequestMapping("/message/sendForm")
	public String sendForm(@RequestParam("emp_id") String emp_id, Model model){
		model.addAttribute("emp_id",emp_id);
		return "message_insert";
	}	
	
	@RequestMapping(value="/message/send_message", method = RequestMethod.POST)
	public String send_message(MessageVO vo)throws Exception{
		service.sendMessage(vo);
		return "redirect:/message";
	}
}
