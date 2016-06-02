package erp.stock.persistence;

import java.util.List;

import erp.basic.domain.Product;
import erp.stock.domain.StockRP;

public interface StockRPDAO {

	public void stockRPInsert(StockRP stock) throws Exception;

	public List<Product> productList() throws Exception;

	public int inoutMax() throws Exception;

	public void stockUpdate(StockRP stock) throws Exception;

}
