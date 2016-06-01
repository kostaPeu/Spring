package erp.my.myinfo.persistence;

import erp.hr.domain.EmployeeVO;

public interface MyInfoDao {
	public EmployeeVO selectEmpInfo(int emp_id);
}
