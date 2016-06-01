package erp.pch.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import erp.sale.domain.SaleListView;
import erp.sale.domain.SaleVO;
import erp.sale.persistence.SaleDAO;
import erp.sale.service.SaleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class SaleTest {
	
	@Inject
	private SaleService service;
	
	/*@Test
	public void insertSaleTest()throws Exception{
		SaleVO sale = new SaleVO();
		sale.setCustomer_id("customer_id_01");
		sale.setPay_type("aa");
		sale.setProduct_id("product_id_1");
		sale.setSell_amount(100);
		sale.setSell_id("113");
		sale.setSell_price(100);
		sale.setWarehouse_id("warehouse_id_02");
		
		service.addSale(sale);
	}*/
	/*@Test
	public void listSaleTest()throws Exception{
		List<SaleListView> list = service.listSale();
		System.out.println(list);
	}*/
	
	/*@Test
	public void deleteSaleTest()throws Exception{
		service.deleteSale("113");
	}*/
	@Test
	public void updateSaleTest()throws Exception{
		SaleVO sale = new SaleVO();
		sale.setPay_type("1a2a3a4");
		sale.setSell_amount(50000);
		sale.setSell_id("12");
		sale.setSell_price(58977);
		service.updateSale(sale);
	}
}
