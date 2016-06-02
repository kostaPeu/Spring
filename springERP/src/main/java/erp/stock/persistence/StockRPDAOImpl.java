package erp.stock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.basic.domain.Product;
import erp.stock.domain.StockRP;

@Repository
public class StockRPDAOImpl implements StockRPDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "erp.stock.mapper.stockRPMapper";
	
	@Override
	public void stockRPInsert(StockRP stock) throws Exception{
		session.insert(namespace+".stockRPInsert", stock);
	}

	@Override
	public List<Product> productList() throws Exception {
		return session.selectList(namespace+".productList");
	}

	@Override
	public int inoutMax() throws Exception {
		return session.selectOne(namespace+".inoutMax");
	}

	@Override
	public void stockUpdate(StockRP stock) throws Exception {
		session.update(namespace+".stockUpdate",stock);
	}

}
