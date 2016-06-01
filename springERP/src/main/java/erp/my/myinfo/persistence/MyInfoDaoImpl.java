package erp.my.myinfo.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.hr.domain.EmployeeVO;

@Repository
public class MyInfoDaoImpl implements MyInfoDao{

	private static String namespace ="springERP.mypage.mapper.mypageMapper";
	
	@Inject
	private SqlSession session;
	
	@Override
	public EmployeeVO selectEmpInfo(int emp_id) {
		return session.selectOne(namespace + ".selectEmpInfo", emp_id);
	}

}
