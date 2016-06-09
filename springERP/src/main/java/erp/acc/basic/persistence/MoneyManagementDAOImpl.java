package erp.acc.basic.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.acc.basic.domain.MoneyManagement;

@Repository
public class MoneyManagementDAOImpl implements MoneyManagementDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "erp.acc.mapper.MoneyManageMentMapper";
	
	@Override
	public void moneyManageMentInsert(MoneyManagement mg) throws Exception {
		session.insert(namespace +".moneyManageMentInsert", mg);
		
	}

	@Override
	public List<MoneyManagement> moneyManageMentList() throws Exception {
		return session.selectList(namespace+".moneyManageMentList");
	}

}
