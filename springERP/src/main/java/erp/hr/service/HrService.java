package erp.hr.service;

import java.util.List;

import erp.hr.domain.HrBasicVo;
import erp.hr.domain.HrDeptVO;
import erp.hr.domain.HrDutyVO;
import erp.hr.domain.HrJobVO;
import erp.hr.domain.HrPositionVO;

public interface HrService {
	public int deptCheck(String b_id) throws Exception;
	public int positionCheck(String b_id)throws Exception;
	public int jobCheck(String b_id)throws Exception;
	public int dutyCheck(String b_id)throws Exception;
	public void basicInsert(HrBasicVo vo);
	public void basicUpdate(HrBasicVo vo);
	public List<HrDeptVO> listDept()throws Exception;
	public List<HrPositionVO> listPosition()throws Exception;
	public List<HrJobVO> listJob()throws Exception;
	public List<HrDutyVO> listDuty()throws Exception;
	public void basicDel(HrBasicVo vo);
}
