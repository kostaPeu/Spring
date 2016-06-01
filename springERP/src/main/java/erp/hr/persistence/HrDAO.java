package erp.hr.persistence;

import erp.hr.domain.HrBasicVo;

public interface HrDAO {
	public int deptChecker(String b_id)throws Exception;
	public int positionChecker(String b_id)throws Exception;
	public int jobChecker(String b_id)throws Exception;
	public int dutyChecker(String b_id)throws Exception;
}
