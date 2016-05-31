package erp.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import erp.hr.domain.EmployeeVO;

@Controller
@RequestMapping("/mypage")
public class MypageController {
	
	@RequestMapping(value="/my_info")
	public String mypageMain(Model model){
		EmployeeVO e = new EmployeeVO();
		e.setEmp_id("1234");
		e.setE_name("borami");
		model.addAttribute("employee", e);
		model.addAttribute("left", "mypage/mypage.jsp");
		model.addAttribute("contents", "mypage/my_info/my_info.jsp");
		return "/main";
	}
}
