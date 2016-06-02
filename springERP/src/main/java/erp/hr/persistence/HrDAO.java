package erp.hr.persistence;

import java.util.List;

import erp.hr.domain.HrBasicVo;
import erp.hr.domain.HrDeptVO;
import erp.hr.domain.HrDutyVO;
import erp.hr.domain.HrJobVO;
import erp.hr.domain.HrPositionVO;

public interface HrDAO {
	public int deptChecker(String b_id)throws Exception;
	public int positionChecker(String b_id)throws Exception;
	public int jobChecker(String b_id)throws Exception;
	public int dutyChecker(String b_id)throws Exception;
	public void deptInsert(HrBasicVo vo);
	public void positionInsert(HrBasicVo vo);
	public void jobInsert(HrBasicVo vo);
	public void dutyInsert(HrBasicVo vo);
	public void updateDept(HrBasicVo vo);
	public void updatePosition(HrBasicVo vo);
	public void updateJob(HrBasicVo vo);
	public void updateDuty(HrBasicVo vo);
	public List<HrDeptVO> deptList();
	public List<HrPositionVO> positionList();
	public List<HrJobVO> jobList();
	public List<HrDutyVO> dutyList();
	public void delDept(String b_id);
	public void delPosition(String b_id);
	public void delJob(String b_id);
	public void delDuty(String b_id);
}
