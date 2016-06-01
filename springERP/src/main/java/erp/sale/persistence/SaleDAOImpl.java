package erp.sale.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.sale.domain.SaleListView;
import erp.sale.domain.SaleVO;

@Repository
public class SaleDAOImpl implements SaleDAO {
	
	@Inject
	private SqlSession sqlSession;
	private static String namespace = "springERP.sale.mapper.saleMapper";
	@Override
	public void addSale(SaleVO vo) throws Exception {
		sqlSession.insert(namespace+".insertSale", vo);
	}
	@Override
	public List<SaleListView> listSale() throws Exception {
		return sqlSession.selectList(namespace+".saleList");
	}
	@Override
	public void removeSale(String sell_id) throws Exception {
		sqlSession.delete(namespace+".deleteSale", sell_id);
	}
	@Override
	public void updateSale(SaleVO vo) throws Exception {
		sqlSession.update(namespace+".updateSale", vo);
	}

}
