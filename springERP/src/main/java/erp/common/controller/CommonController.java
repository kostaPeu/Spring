package erp.common.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import erp.common.domain.PageMaker;
import erp.common.domain.SearchCriteria;
import erp.common.service.CommonService;
import erp.gw.deptboard.domain.DeptBoardVO;
import erp.gw.deptboard.service.DeptBoardService;
import erp.gw.notice.domain.NoticeVO;
import erp.gw.notice.service.NoticeService;

@Controller
public class CommonController {

	@Inject
	private NoticeService noticeService;
	@Inject
	private DeptBoardService deptBoardService;
	@Inject
	private CommonService commonService;
	
	
	@RequestMapping("/main")
	public void main(@ModelAttribute("cri") SearchCriteria cri, @RequestParam(value="left", defaultValue="") String left, @RequestParam(value="contents", defaultValue="") String contents, Model model) throws Exception{
		model.addAttribute("left",left);
		model.addAttribute("contents","main/mainCon.jsp");
		mainNotice(cri, model);
		mainDeptBoard(cri, model);
	}

	@RequestMapping("/")
	public String mainT(@ModelAttribute("cri") SearchCriteria cri, @RequestParam(value="left", defaultValue="") String left, @RequestParam(value="contents", defaultValue="") String contents, Model model) throws Exception{
		model.addAttribute("left",left);
		model.addAttribute("contents","main/mainCon.jsp");
		mainNotice(cri, model);
		mainDeptBoard(cri, model);
		
		return "/main";
	}
	
	public void mainNotice(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception{
		List<NoticeVO> pList = noticeService.listSearchCriteria(cri);
		model.addAttribute("noticeList", pList);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(noticeService.listSearchCount(cri));
		model.addAttribute("pageMaker", pageMaker);
	}
	
	public void mainDeptBoard(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception{
		String dept_id=commonService.getDeptId();
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("cri", (SearchCriteria)cri);
		map.put("dept_id", (String)dept_id);
		 
		List<DeptBoardVO> dList = deptBoardService.listSearchCriteria(map);
		model.addAttribute("deptBoardList", dList);

		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(deptBoardService.listSearchCount(dept_id));
		model.addAttribute("pageMaker", pageMaker);
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
}
