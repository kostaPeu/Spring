package erp.acc.basic.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.acc.basic.domain.Accounts;

@Repository
public class BasicAccountDAOImpl implements BasicAccountDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "erp.acc.mapper.BasicAccountMapper";
	
	//계좌추가 - JH
	@Override
	public void accountInsert(Accounts accounts) throws Exception {
		session.insert(namespace+".accountInsert", accounts);

	}

	//계좌내용 수정 -JH
	@Override
	public void accountUpdate(Accounts accounts) throws Exception {
		session.update(namespace+".accountUpdate", accounts);

	}

	//계좌삭제 - JH
	@Override
	public void accountDelete(String account_number) throws Exception {
		session.delete(namespace+".accountDelete", account_number);
	}

	//계좌리스트 - JH
	@Override
	public List<Accounts> accountList() throws Exception {
		return session.selectList(namespace+".accountList");
	}

	

}
