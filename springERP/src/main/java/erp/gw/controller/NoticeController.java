package erp.gw.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import erp.gw.notice.domain.NoticeVO;
import erp.hr.domain.EmployeeVO;

@Controller
@RequestMapping("/groupware/notice")
public class NoticeController {
	
	@RequestMapping(value="/notice_list", method = RequestMethod.GET)
	public void listPage() throws Exception{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		Object principal = auth.getPrincipal();
		String name="";
		if(principal != null && principal instanceof EmployeeVO){
			name = ((EmployeeVO)principal).getE_name();
		}
		
		System.out.println("name : "+name);
	}
	

}
