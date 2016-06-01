package erp.pch.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.basic.domain.Product;
import erp.pch.domain.Customer;
import erp.pch.domain.PurchaseListView;
import erp.pch.domain.PurchaseSearch;
import erp.pch.domain.PurchaseVO;
import erp.pch.domain.GetWareHouse;
import erp.pch.persistence.PurchaseDAO;

@Service
public class PurchaseServiceImpl implements PurchaseService{

	@Inject
	private PurchaseDAO dao;
	
	@Override
	public void insertPch(PurchaseVO vo) throws Exception {
		dao.addPch(vo);
	}

	@Override
	public List<PurchaseListView> detailPch() throws Exception {
		return dao.readPch();
	}

	@Override
	public void delete(String buy_id) throws Exception {
		dao.removePch(buy_id);
	}

	@Override
	public List<Customer> customerList(String customer_id) throws Exception {
		return dao.customerList(customer_id);
	}

	@Override
	public List<Product> productList(String product_id) throws Exception {
		return dao.productList(product_id);
	}

	@Override
	public List<GetWareHouse> warehouseList(String warehouse_id) throws Exception {
		return dao.warehouseList(warehouse_id);
	}

	@Override
	public List<PurchaseListView> purchaseSearch(PurchaseSearch ps) throws Exception {
		return dao.purchaseSearch(ps);
	}
}
