package erp.hr.service;

import java.util.List;

import javax.inject.Inject;
import org.springframework.stereotype.Service;

import erp.hr.domain.HrBasicVo;
import erp.hr.domain.HrDeptVO;
import erp.hr.domain.HrDutyVO;
import erp.hr.domain.HrJobVO;
import erp.hr.domain.HrPositionVO;
import erp.hr.persistence.HrDAO;

@Service
public class HrServiceImpl implements HrService {
	
	@Inject
	private HrDAO dao;

	@Override
	public int deptCheck(String b_id)throws Exception {
		return dao.deptChecker(b_id);
	}

	@Override
	public int positionCheck(String b_id)throws Exception {
		return dao.positionChecker(b_id);
	}

	@Override
	public int jobCheck(String b_id)throws Exception {
		return dao.jobChecker(b_id);
	}

	@Override
	public int dutyCheck(String b_id)throws Exception {
		return dao.dutyChecker(b_id);
	}

	@Override
	public void basicInsert(HrBasicVo vo) {
		String type = vo.getBasic_type();
		if(type.equals("dept")){
			dao.deptInsert(vo);
		}
		else if(type.equals("position")){
			dao.positionInsert(vo);
		}
		else if(type.equals("job")){
			dao.jobInsert(vo);
		}
		else{
			dao.dutyInsert(vo);
		}
	}

	@Override
	public void basicUpdate(HrBasicVo vo) {
		String type = vo.getBasic_type();
		if(type.equals("dept")){
			dao.updateDept(vo);
		}
		else if(type.equals("position")){
			dao.updatePosition(vo);
		}
		else if(type.equals("job")){
			dao.updateJob(vo);
		}
		else{
			dao.updateDuty(vo);
		}
	}

	@Override
	public List<HrDeptVO> listDept() throws Exception {
		return dao.deptList();
	}

	@Override
	public List<HrPositionVO> listPosition() throws Exception {
		return dao.positionList();
	}

	@Override
	public List<HrJobVO> listJob() throws Exception {
		return dao.jobList();
	}

	@Override
	public List<HrDutyVO> listDuty() throws Exception {
		return dao.dutyList();
	}

	@Override
	public void basicDel(HrBasicVo vo) {
		String type = vo.getBasic_type();
		String b_id = vo.getBasic_id();
		if(type.equals("dept")){
			dao.delDept(b_id);
		}
		else if(type.equals("position")){
			dao.delPosition(b_id);
		}
		else if(type.equals("job")){
			dao.delJob(b_id);
		}
		else{
			dao.delDuty(b_id);
		}
	}
	
	
}
