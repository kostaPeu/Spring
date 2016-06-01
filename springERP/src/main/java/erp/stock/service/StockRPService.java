package erp.stock.service;

import java.util.List;

import erp.basic.domain.Product;
import erp.stock.domain.StockRP;

public interface StockRPService {

	public void stockRPInsert(StockRP stock) throws Exception;

	public List<Product> productList() throws Exception;

}
