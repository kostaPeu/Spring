package erp.sale.companybuy.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.sale.companybuy.domain.CompanyBuy;
import erp.sale.companybuy.domain.CompanyBuyList;
import erp.sale.companybuy.persistence.CompanyBuyDAO;

@Service
public class CompanyBuyServiceImpl implements CompanyBuyService {

	@Inject
	private CompanyBuyDAO dao;
	
	@Override
	public void insertCBuy(CompanyBuy cb) throws Exception {
		dao.insertCompanyBuy(cb);		
	}

	@Override
	public List<CompanyBuyList> listCBuy() throws Exception {
		return dao.listCompanyBuy();
	}

	@Override
	public void deleteCBuy(String cbuy_id) throws Exception {
		dao.deleteCompanyBuy(cbuy_id);
	}

	@Override
	public void updateCBuy(CompanyBuy cb) throws Exception {
		dao.updateCompanyBuy(cb);
	}

}
