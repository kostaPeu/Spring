package erp.hr.service;

import javax.inject.Inject;
import org.springframework.stereotype.Service;

import erp.hr.domain.HrBasicVo;
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
	
	
}
