package erp.pch.service;

import java.util.List;

import erp.basic.domain.Product;
import erp.common.domain.Criteria;
import erp.pch.domain.Customer;
import erp.pch.domain.GetWareHouse;
import erp.pch.domain.PurchaseListView;
import erp.pch.domain.PurchaseSearch;
import erp.pch.domain.PurchaseVO;
import erp.sale.domain.SaleListView;

public interface PurchaseService {
	public void insertPch(PurchaseVO vo)throws Exception;
	public List<PurchaseListView> detailPch()throws Exception;
	public void delete(String buy_id)throws Exception;
	public List<Customer> customerList(String customer_id)throws Exception;
	public List<Product> productList(String product_id)throws Exception;
	public List<GetWareHouse> warehouseList(String warehouse_id)throws Exception;
	public List<PurchaseListView> purchaseSearch(PurchaseSearch ps)throws Exception;
	public List<PurchaseListView> listAll()throws Exception;
	public List<PurchaseListView> listCriteria(Criteria cri)throws Exception;
	public int listCountCriteria(Criteria cri)throws Exception;
	public void updatePurchase(PurchaseVO vo)throws Exception;
}
