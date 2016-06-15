package erp.acc.basic.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.acc.basic.domain.Accounts;
import erp.acc.basic.domain.Diagnosiss;
import erp.acc.basic.persistence.SearchDAO;
import erp.basic.domain.Customer;
import erp.gw.projectboard.domain.ProjectsVO;
import erp.hr.domain.EmployeeViewVO;
import erp.hr.domain.HrDeptVO;

@Service
public class SearchServcieImpl implements SearchService {

	@Inject
	SearchDAO dao;
	
	
	@Override
	public List<Diagnosiss> diagnosisList() throws Exception {
		return dao.diagnosisList();
	}

	@Override
	public List<Diagnosiss> diagnosisNumberSearch(int diagnosis_number) throws Exception {
		return dao.diagnosisNumberSearch(diagnosis_number);
	}

	@Override
	public List<EmployeeViewVO> searchEmp_idList(String emp_id) throws Exception {
		return dao.searchEmp_idList(emp_id);
	}

	@Override
	public List<EmployeeViewVO> EmpList() throws Exception {
		return dao.EmpList();
	}

	@Override
	public List<Accounts> accountList() throws Exception {
		return dao.accountList();
	}

	@Override
	public List<Accounts> accountListId(int account_id) throws Exception {
		return dao.accountListId(account_id);
			}

	@Override
	public List<HrDeptVO> listDept() throws Exception {
		return dao.listDept();
	}

	@Override
	public List<ProjectsVO> projectList() throws Exception {
		return dao.projectList();
	}
	
	@Override
	public List<ProjectsVO> projectProj_idList(int proj_id) throws Exception {
		
		return dao.projectProj_idList(proj_id);
	}

	@Override
	public List<Customer> customerList() throws Exception {
		return dao.customerList();
	}

	@Override
	public List<Customer> customerIdList(String customer_id) throws Exception {
		return dao.customerIdList(customer_id);
	}

}
