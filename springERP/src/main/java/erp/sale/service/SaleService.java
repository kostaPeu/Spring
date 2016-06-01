package erp.sale.service;

import java.util.List;

import erp.sale.domain.SaleListView;
import erp.sale.domain.SaleVO;

public interface SaleService {
	public void insertSale(SaleVO vo)throws Exception;
	public List<SaleListView> listSale()throws Exception;
	public void deleteSale(String sell_id)throws Exception;
	public void updateSale(SaleVO vo)throws Exception;
}
