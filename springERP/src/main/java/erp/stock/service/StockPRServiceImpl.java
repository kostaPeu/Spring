package erp.stock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.basic.domain.Product;
import erp.basic.persistence.BasicProductDAO;
import erp.stock.domain.StockRP;
import erp.stock.persistence.StockRPDAO;

@Service
public class StockPRServiceImpl implements StockRPService {

	@Inject
	private StockRPDAO dao;
	
	@Override
	public void stockRPInsert(StockRP stock) throws Exception {
		int max = dao.inoutMax();
		stock.setInout_id("rp_"+(max+1));
		dao.stockRPInsert(stock);
	}

	@Override
	public List<Product> productList() throws Exception {
		return dao.productList();
	}

}
