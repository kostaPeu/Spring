package erp.acc.basic.persistence;

import java.util.List;

import erp.acc.basic.domain.Accounts;
import erp.acc.basic.domain.Diagnosiss;
import erp.basic.domain.Customer;
import erp.gw.projectboard.domain.ProjectsVO;
import erp.hr.domain.EmployeeViewVO;
import erp.hr.domain.HrDeptVO;

public interface SearchDAO {

	//계정관리
	public List<Diagnosiss> diagnosisList() throws Exception;

	public List<Diagnosiss> diagnosisNumberSearch(int diagnosis_number) throws Exception;

	//직원
	public List<EmployeeViewVO> searchEmp_idList(String emp_id) throws Exception;

	public List<EmployeeViewVO> EmpList() throws Exception;
	
	
	//계좌
	public List<Accounts> accountList() throws Exception;
	
	public List<Accounts>accountListId(int account_id)throws Exception;
	
	//부서
	public List<HrDeptVO> listDept()throws Exception;
	
	//프로젝트
	public List<ProjectsVO> projectList()throws Exception;
	public List<ProjectsVO> projectProj_idList(int proj_id)throws Exception;
	
	//거래처
	
	public List<Customer> customerList() throws Exception;
	public List<Customer> customerIdList(String customer_id) throws Exception;
	
}
