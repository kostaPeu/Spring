package erp.hr.persistence;

import java.util.List;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.basic.domain.ProductGroup;
import erp.hr.domain.HrBasicVo;

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

}
