package erp.pch.persistence;


import java.util.List;

import erp.pch.domain.Customer;
import erp.pch.domain.PurchaseListView;
import erp.pch.domain.PurchaseVO;

public interface PurchaseDAO {
	public void addPch(PurchaseVO vo)throws Exception;
	public List<PurchaseListView> readPch()throws Exception;
	public void removePch(String buy_id)throws Exception;
	public List<Customer> customerList(String customer_id)throws Exception;
}
