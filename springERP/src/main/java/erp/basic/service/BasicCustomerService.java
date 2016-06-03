package erp.basic.service;

import java.util.List;

import erp.basic.domain.Customer;

public interface BasicCustomerService {
	public void customerInsert(Customer customer)throws Exception;
	public void customerUpdate(Customer customer)throws Exception;
	public void customerDelete(String customer_id)throws Exception;
	public List<Customer> customerList()throws Exception;
	public List<Customer> getCustomer(String customer_id)throws Exception;
}
