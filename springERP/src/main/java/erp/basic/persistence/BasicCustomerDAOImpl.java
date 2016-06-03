package erp.basic.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.basic.domain.Customer;

@Repository
public class BasicCustomerDAOImpl implements BasicCustomerDAO {
	@Inject
	private SqlSession session;

	private static String namespace = "erp.basic.mapper.basicCustomerMapper";
	@Override
	public void customerInsert(Customer customer) throws Exception {
		session.insert(namespace+".insertCustomer", customer);
	}

	@Override
	public void customerUpdate(Customer customer) throws Exception {
		session.update(namespace+".customerUpdapte", customer);
	}

	@Override
	public void customerDelete(String customer_id) throws Exception {
		session.delete(namespace+".customerDelete", customer_id);
	}

	@Override
	public List<Customer> customerList() throws Exception {
		return session.selectList(namespace+".customerList");
	}
	@Override
	public List<Customer> getCustomer(String customer_id) throws Exception {
		return session.selectList(namespace+".getCustomer", customer_id);
	}

}
