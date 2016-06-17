package erp.acc.basic.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.acc.basic.domain.Statements;

@Repository
public class StatementDAOImpl implements StatementDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "erp.acc.mapper.Statement";
	@Override
	public List<Statements> StatementAllList() throws Exception {
		return session.selectList(namespace+".StatementAllList");
	}
	@Override
	public List<Statements> StatementCashSalesList() throws Exception {
		return session.selectList(namespace+".StatementCashSalesList");
	}
	@Override
	public List<Statements> StatementPromissorySalesList() throws Exception {
		return session.selectList(namespace+".StatementPromissorySalesList");
	}
	@Override
	public List<Statements> StatementCashPurchaseList() throws Exception {
		return session.selectList(namespace+".StatementCashPurchaseList");
	}
	@Override
	public List<Statements> StatementPromissoryPurchaseList() throws Exception {
		return session.selectList(namespace+".StatementPromissoryPurchaseList");
	}
	
	
	

}
