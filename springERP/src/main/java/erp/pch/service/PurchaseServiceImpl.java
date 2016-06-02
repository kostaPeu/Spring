package erp.pch.service;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.basic.domain.Product;
import erp.common.domain.Criteria;
import erp.pch.domain.Customer;
import erp.pch.domain.GetWareHouse;
import erp.pch.domain.PurchaseListView;
import erp.pch.domain.PurchaseSearch;
import erp.pch.domain.PurchaseSearchTimeSet;
import erp.pch.domain.PurchaseVO;
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
	public List<PurchaseListView> purchaseSearch(PurchaseSearch ps) throws Exception {
		PurchaseSearchTimeSet pst = new PurchaseSearchTimeSet();
		pst.setCustomer_id(ps.getCustomer_id());
		pst.setProduct_id(ps.getProduct_id());
		pst.setWarehouse_id(ps.getWarehouse_id());
		pst.setStart_date(Timestamp.valueOf(ps.getStart_date()+" 00:00:00"));
		pst.setEnd_date(Timestamp.valueOf(ps.getEnd_date()+" 00:00:00"));
		return dao.purchaseSearch(pst);
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
	public List<PurchaseListView> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<PurchaseListView> listCriteria(Criteria cri) throws Exception {
		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return dao.countPaging(cri);
	}
}
