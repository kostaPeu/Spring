package erp.sale.companybuy.persistence;

import java.util.List;

import erp.sale.companybuy.domain.CompanyBuy;
import erp.sale.companybuy.domain.CompanyBuyList;

public interface CompanyBuyDAO {
	public void insertCompanyBuy(CompanyBuy cb)throws Exception;
	public List<CompanyBuyList> listCompanyBuy()throws Exception;
	public void deleteCompanyBuy(String cbuy_id)throws Exception;
	public void updateCompanyBuy(CompanyBuy cb)throws Exception;
}
