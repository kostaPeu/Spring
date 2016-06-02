package erp.sale.companybuy.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.sale.companybuy.domain.CompanyBuy;
import erp.sale.companybuy.domain.CompanyBuyList;

@Repository
public class CompanyBuyDAOImpl implements CompanyBuyDAO {

	private static String namespace = "springERP.sale.mapper.saleMapper";
	@Inject
	private SqlSession session;
	
	
	@Override
	public void insertCompanyBuy(CompanyBuy cb) throws Exception {
		session.insert(namespace+".insertCbuy", cb);
	}

	@Override
	public List<CompanyBuyList> listCompanyBuy() throws Exception {
		return session.selectList(namespace+".cBuyList");
	}

	@Override
	public void deleteCompanyBuy(String cbuy_id) throws Exception {
		session.delete(namespace+".deleteCbuy", cbuy_id);
	}

	@Override
	public void updateCompanyBuy(CompanyBuy cb) throws Exception {
		session.update(namespace+".updateCbuy", cb);
	}
}
