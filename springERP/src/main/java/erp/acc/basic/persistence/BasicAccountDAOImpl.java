package erp.acc.basic.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.acc.basic.domain.Accounts;

@Repository
public class BasicAccountDAOImpl implements BasicAccountDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "erp.basic.mapper.BasicAccountMapper";
	
	@Override
	public void accountInsert(Accounts accounts) throws Exception {
		session.insert(namespace+".accountInsert", accounts);

	}

	@Override
	public void accountUpdate(Accounts accounts) throws Exception {
		session.update(namespace+".accountUpdate", accounts);

	}

	@Override
	public void accountDelete(Accounts accounts) throws Exception {
		session.delete(namespace+".accountDelete", accounts);
		
	}

}
