package erp.basic.test;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import erp.basic.service.BasicProductService;
import erp.pch.domain.GetCustomer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class basic_customerTEST {
	
	@Inject
	private BasicProductService service;
	
	@Test
	public void test()throws Exception {
		GetCustomer c = new GetCustomer();
		c.setBankbook_check("a");
		c.setCheckman("a");
		c.setCopy_bankbook("c");
		c.setCustomer_address("c");
		c.setCustomer_email("c");
		c.setCustomer_fax("c");
		c.setCustomer_id("customer_id_13");
		c.setCustomer_name("c");
		c.setPhone_number("c");
		c.setRepre_name("c");
		service.customerInsert(c);
	}

}
