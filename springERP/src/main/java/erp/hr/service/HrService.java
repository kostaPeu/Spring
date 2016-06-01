package erp.hr.service;

import erp.hr.domain.HrBasicVo;

public interface HrService {
	public int deptCheck(String b_id) throws Exception;
	public int positionCheck(String b_id)throws Exception;
	public int jobCheck(String b_id)throws Exception;
	public int dutyCheck(String b_id)throws Exception;
}
