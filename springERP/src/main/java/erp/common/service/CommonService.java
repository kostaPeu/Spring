package erp.common.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import erp.hr.domain.EmployeeVO;

public class CommonService {
	
	// 시큐리티에서 현재 로그인한사람 emp_id 불러오는것
	public static String getEmployeeId(){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Object principal = auth.getPrincipal();
		String emp_id = "";
		if(principal != null && principal instanceof EmployeeVO){
			emp_id = ((EmployeeVO)principal).getEmp_id();
		}
		return emp_id;
	}
}
