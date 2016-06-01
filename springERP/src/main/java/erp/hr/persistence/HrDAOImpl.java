package erp.hr.persistence;

import java.util.List;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.basic.domain.ProductGroup;
import erp.hr.domain.HrBasicVo;
import erp.hr.domain.HrDeptVO;
import erp.hr.domain.HrDutyVO;
import erp.hr.domain.HrJobVO;
import erp.hr.domain.HrPositionVO;

@Repository
public class HrDAOImpl implements HrDAO {

	
	@Inject
	private SqlSession session;
	
	private static String namespace = "erp.hr.mapper.HrMapper";

	@Override
	public int deptChecker(String b_id) throws Exception{
		return session.selectOne(namespace + ".deptChecker", b_id);
	}

	@Override
	public int positionChecker(String b_id) throws Exception{
		return session.selectOne(namespace + ".positionChecker", b_id);
	}

	@Override
	public int jobChecker(String b_id) throws Exception{
		return session.selectOne(namespace + ".jobChecker", b_id);
	}

	@Override
	public int dutyChecker(String b_id) throws Exception{
		return session.selectOne(namespace + ".dutyChecker", b_id);
	}

	@Override
	public void deptInsert(HrBasicVo vo) {
		session.insert(namespace + ".deptInsert", vo);
	}

	@Override
	public void positionInsert(HrBasicVo vo) {
		session.insert(namespace + ".positionInsert", vo);
	}

	@Override
	public void jobInsert(HrBasicVo vo) {
		session.insert(namespace + ".jobInsert", vo);
	}

	@Override
	public void dutyInsert(HrBasicVo vo) {
		session.insert(namespace + ".dutyInsert", vo);
	}

	@Override
	public void updateDept(HrBasicVo vo) {
		session.update(namespace + ".updateDept", vo);
	}

	@Override
	public void updatePosition(HrBasicVo vo) {
		session.update(namespace + ".updatePosition", vo);
	}

	@Override
	public void updateJob(HrBasicVo vo) {
		session.update(namespace + ".updateJob", vo);
	}

	@Override
	public void updateDuty(HrBasicVo vo) {
		session.update(namespace + ".updateDuty", vo);
	}

	@Override
	public List<HrDeptVO> deptList() {
		return session.selectList(namespace + ".deptList");
	}

	@Override
	public List<HrPositionVO> positionList() {
		return session.selectList(namespace + ".positionList");
	}

	@Override
	public List<HrJobVO> jobList() {
		return session.selectList(namespace + ".jobList");
	}

	@Override
	public List<HrDutyVO> dutyList() {
		return session.selectList(namespace + ".dutyList");
	}

	@Override
	public void delDept(String b_id) {
		session.delete(namespace + ".delDept", b_id);
	}

	@Override
	public void delPosition(String b_id) {
		session.delete(namespace + ".delPosition", b_id);
	}

	@Override
	public void delJob(String b_id) {
		session.delete(namespace + ".delJob", b_id);
	}

	@Override
	public void delDuty(String b_id) {
		session.delete(namespace + ".delDuty", b_id);
	}

}
