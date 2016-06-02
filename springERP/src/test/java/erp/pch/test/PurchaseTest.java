package erp.pch.test;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import erp.pch.domain.PurchaseListView;
import erp.pch.domain.PurchaseSearch;
import erp.pch.domain.PurchaseVO;
import erp.pch.persistence.PurchaseDAO;
import erp.pch.service.PurchaseService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class PurchaseTest {
	
	@Inject
	private PurchaseService service;
	
	
	@Test
	public void purchaseSearch()throws Exception{
		PurchaseSearch ps = new PurchaseSearch();
		ps.setStart_date("2016-05-05");
		ps.setEnd_date("2016-06-05");
		//ps.setCustomer_id("customer_id_02");
		//ps.setProduct_id("product_id_3");
	//	ps.setWarehouse_id("warehouse_id_05");
		List<PurchaseListView> list = service.purchaseSearch(ps);
		System.out.println(list);
	}
	/*@Test
	public void insertTest() throws Exception {
		PurchaseVO vo = new PurchaseVO();
		vo.setBuy_amount(1);
		vo.setBuy_id("1c2c3c");
		vo.setBuy_price(1);
		vo.setCustomer_id("customer_id_01");
		vo.setEmp_id("2");
		vo.setPay_type("aa");
		vo.setProduct_id("product_id_3");
		vo.setWarehouse_id("warehouse_id_01");
		service.insertPch(vo);
	}
	/*@Test
	public void detailTest()throws Exception{
		List<PurchaseListView> list = dao.readPch();
		System.out.println(list);
	}*/
	/*@Test
	public void deleteTest()throws Exception{
		dao.removePch("aa");
	}*/
}
