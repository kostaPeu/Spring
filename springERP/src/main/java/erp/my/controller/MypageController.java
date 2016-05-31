package erp.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mypage")
public class MypageController {
	
	@RequestMapping("/my_info")
	public String mypageMain(){
		return "redirect:/?left=mypage/mypage.jsp&contents=mypage/my_info/my_info.jsp";
	}
	
}
