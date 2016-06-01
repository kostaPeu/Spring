package erp.hr.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import erp.hr.domain.HrBasicVo;
import erp.hr.service.HrService;

@Controller
@RequestMapping("/hr")
public class HrController {
	@Inject
	private HrService service;
	
	//인사 기초등록 폼 불러오기
	@RequestMapping(value="/hr_basic")
	public String hr_basic(Model model){
		model.addAttribute("left", "hr/hr.jsp");
		model.addAttribute("contents", "hr/hr_basic.jsp");
		return "/main";
	}
	
	//인사 기초등록 중복검사
	@RequestMapping(value="/hr_basic/basic_check")
	public int basic_check(HrBasicVo vo) throws Exception{
		String type = vo.getBasic_type();
		int count=0;
		if(type.equals("dept")){
			count=service.deptCheck(vo.getBasic_id());
		}
		else if(type.equals("position")){
			count=service.positionCheck(vo.getBasic_id());
		}
		else if(type.equals("job")){
			count=service.jobCheck(vo.getBasic_id());
		}
		else{
			count=service.dutyCheck(vo.getBasic_id());
		}
		return count;
	}
}
