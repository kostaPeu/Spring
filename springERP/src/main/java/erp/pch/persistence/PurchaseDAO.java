package erp.pch.persistence;


import java.util.List;

import erp.pch.domain.Customer;
import erp.pch.domain.PurchaseListView;
import erp.pch.domain.PurchaseSearch;
import erp.pch.domain.PurchaseVO;

public interface PurchaseDAO {
	public void addPch(PurchaseVO vo)throws Exception;
	public List<PurchaseListView> readPch()throws Exception;
	public void removePch(String buy_id)throws Exception;
	public List<Customer> customerList(String customer_id)throws Exception;
<<<<<<< HEAD
	public List<Product> productList(String product_id)throws Exception;
	public List<GetWareHouse> warehouseList(String warehouse_id)throws Exception;
	public List<PurchaseListView> purchaseSearch(PurchaseSearch ps)throws Exception;
=======
>>>>>>> branch 'master' of https://github.com/kostaPeu/Spring.git
}
