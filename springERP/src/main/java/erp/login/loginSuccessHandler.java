package erp.login;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import erp.hr.domain.EmployeeVO;
import erp.login.persistence.LoginDao;

public class loginSuccessHandler implements AuthenticationSuccessHandler {

	private String arrive;
	
	@Inject
	private LoginDao dao;
	
	public String getArrive() {
		return arrive;
	}

	public void setArrive(String arrive) {
		this.arrive = arrive;
	}

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication auth)
			throws IOException, ServletException {
		arrive = request.getParameter(arrive);
		
		if(arrive != null){
			EmployeeVO emp = (EmployeeVO)auth.getPrincipal();
			String emp_id = emp.getEmp_id();
			try {
				dao.arrive(emp_id);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		response.sendRedirect("/");
	}
}
