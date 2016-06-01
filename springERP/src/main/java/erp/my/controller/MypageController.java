package erp.my.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import erp.hr.domain.EmployeeVO;

@Controller
@RequestMapping("/mypage")
public class MypageController {
	
	@RequestMapping(value="/my_info")
	public String mypageMain(HttpServletRequest request,Model model){
		HttpSession session = request.getSession();
		EmployeeVO employee = (EmployeeVO)session.getAttribute("employee");
		
		model.addAttribute(employee);
		model.addAttribute("left", "mypage/mypage.jsp");
		model.addAttribute("contents", "mypage/my_info/my_info.jsp");
		return "/main";
	}
}