package erp.my.myinfo.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.hr.domain.EmployeeVO;
import erp.my.myinfo.persistence.MyInfoDao;

@Service
public class MyInfoServiceImpl implements MyInfoService {
	
	@Inject
	private MyInfoDao dao;

	@Override
	public EmployeeVO selectEmpInfo(int emp_id) {
		return dao.selectEmpInfo(emp_id);
	}

}
