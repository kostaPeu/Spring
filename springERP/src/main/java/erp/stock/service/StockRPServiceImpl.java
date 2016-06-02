package erp.stock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import erp.basic.domain.Product;
import erp.stock.domain.StockRP;
import erp.stock.persistence.StockRPDAO;

@Service
public class StockRPServiceImpl implements StockRPService {

	@Inject
	private StockRPDAO dao;
	
	@Transactional
	@Override
	public void stockRPInsert(StockRP stock) throws Exception {
		int max = dao.inoutMax();
		stock.setInout_id("rp_"+(max+1));

		System.out.println(stock.getEmp_id());
		System.out.println(stock.getInout_amount());
		System.out.println(stock.getInout_id());
		System.out.println(stock.getType());
		System.out.println(stock.getProduct_id());
		
		dao.stockRPInsert(stock);
		dao.stockUpdate(stock);
		
	}

	@Override
	public List<Product> productList() throws Exception {
		return dao.productList();
	}

}
