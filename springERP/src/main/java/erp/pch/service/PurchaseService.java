package erp.pch.service;

import java.util.List;

import erp.pch.domain.Customer;
import erp.pch.domain.PurchaseListView;
import erp.pch.domain.PurchaseSearch;
import erp.pch.domain.PurchaseVO;

public interface PurchaseService {
	public void insertPch(PurchaseVO vo)throws Exception;
	public List<PurchaseListView> detailPch()throws Exception;
	public void delete(String buy_id)throws Exception;
	public List<Customer> customerList(String customer_id)throws Exception;
<<<<<<< HEAD
	public List<Product> productList(String product_id)throws Exception;
	public List<GetWareHouse> warehouseList(String warehouse_id)throws Exception;
	public List<PurchaseListView> purchaseSearch(PurchaseSearch ps)throws Exception;
=======
>>>>>>> branch 'master' of https://github.com/kostaPeu/Spring.git
}
