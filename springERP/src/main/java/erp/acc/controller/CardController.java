package erp.acc.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import erp.acc.basic.domain.Card;
import erp.acc.basic.service.BasicAccountService;

@Controller
@RequestMapping("/accounting/card")
public class CardController {

	@Inject
	private BasicAccountService service;
	
	//카드 리스트
	@RequestMapping("/list")
	public String cardList(Model model)throws Exception{
		model.addAttribute("left", "accounting/accounting.jsp");
		model.addAttribute("listModel", service.cardList());
		model.addAttribute("contents", "accounting/basic/card.jsp");
		return "/main";
	}
		
	//카드등록 -JH
	@RequestMapping("/insert")
	public String cardInsert(Card card)throws Exception{
		service.cardInsert(card);
		return "redirect:/accounting/card/list";
	}
	
	//카드수정 - JH
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String cardUpdate(Card card, Model model)throws Exception{
	service.cardUpdate(card);
	return "redirect:/accounting/card/list";
}
	//카드삭제 -JH
	@RequestMapping("/delete")
	public String cardDelete(@RequestParam("cmt") String[] cmt )throws Exception{
		for (int i = 0; i < cmt.length; i++) {
			service.cardDelete(cmt[i]);
		}		
	return "redirect:/accounting/card/list";
	}
}
