package erp.basic.persistence;

import java.util.List;

import erp.basic.domain.Customer;

public interface BasicCustomerDAO {

	public void customerInsert(Customer customer)throws Exception;
	public void customerUpdate(Customer customer)throws Exception;
	public void customerDelete(String customer_id)throws Exception;
	public List<Customer> customerList()throws Exception;
	public List<Customer> getCustomer(String customer_id)throws Exception;
}
