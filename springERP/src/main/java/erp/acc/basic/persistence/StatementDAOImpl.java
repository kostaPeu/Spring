package erp.acc.basic.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.acc.basic.domain.Statement;

@Repository
public class StatementDAOImpl implements StatementDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "erp.acc.mapper.Statement";
	@Override
	public List<Statement> StatementAllList() throws Exception {
		return session.selectList(namespace+".StatementAllList");
	}
	@Override
	public List<Statement> StatementCashSalesList() throws Exception {
		return session.selectList(namespace+".StatementCashSalesList");
	}
	@Override
	public List<Statement> StatementPromissorySalesList() throws Exception {
		return session.selectList(namespace+".StatementPromissorySalesList");
	}
	@Override
	public List<Statement> StatementCashPurchaseList() throws Exception {
		return session.selectList(namespace+".StatementCashPurchaseList");
	}
	@Override
	public List<Statement> StatementPromissoryPurchaseList() throws Exception {
		return session.selectList(namespace+".StatementPromissoryPurchaseList");
	}
	
	
	

}
