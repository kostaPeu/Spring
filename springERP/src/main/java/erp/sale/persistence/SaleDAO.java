package erp.sale.persistence;

import java.util.List;

import erp.sale.domain.SaleListView;
import erp.sale.domain.SaleVO;

public interface SaleDAO {
	public void addSale(SaleVO vo)throws Exception;
	public List<SaleListView> listSale()throws Exception;
	public void removeSale(String sell_id)throws Exception;
	public void updateSale(SaleVO vo)throws Exception;
}
