package erp.acc.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import erp.acc.basic.domain.MoneyPlan;
import erp.acc.basic.service.MoneyPlanService;

@Controller
@RequestMapping("/accounting/moneyPlan")
public class MoneyPlanController {

	@Inject
	private MoneyPlanService service;

	// 자금계획 리스트
	@RequestMapping("/list")
	public String moneyPlanList(Model model) throws Exception {
		model.addAttribute("left", "accounting/accounting.jsp");
		model.addAttribute("listModel", service.moneyPlanList());
		model.addAttribute("contents", "accounting/moneyPlan/MoneyPlan_view.jsp");
		return "/main";
	}

	// 자금계획등록 -JH
	@RequestMapping("/insert")
	public String moneyPlanInsert(MoneyPlan plan) throws Exception {
		service.moneyPlanInsert(plan);
		return "redirect:/accounting/moneyPlan/list";
	}

	// 자금계획수정 - JH
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String moneyPlanUpdate(MoneyPlan plan, Model model) throws Exception {
		service.moneyPlanUpdate(plan);
		return "redirect:/accounting/moneyPlan/list";
	}

	// 자금계획삭제 -JH
	@RequestMapping("/delete")
	public String moneyPlanDelete(@RequestParam("cmt") String[] cmt) throws Exception {
		for (int i = 0; i < cmt.length; i++) {
			service.moneyPlanDelete(cmt[i]);
		}
		return "redirect:/accounting/moneyPlan/list";
	}
}
