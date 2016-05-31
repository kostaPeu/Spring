package erp.basic.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.basic.domain.Product;
import erp.basic.domain.ProductGroup;
import erp.basic.domain.ProductList;
import erp.basic.domain.Standards;

@Repository
public class BasicProductDAOImpl implements BasicProductDAO{
	 
	@Inject
	private SqlSession session;

	private static String namespace = "erp.basic.mapper.BasicProductMapper";

	@Override
	public List<ProductGroup> pgroupList() throws Exception {
		return session.selectList(namespace + ".pgroupList");
	}

	@Override
	public List<Standards> standardList() throws Exception {
		return session.selectList(namespace+".standardList");
	}

	@Override
	public int totalCountProduct() throws Exception {
		return session.selectOne(namespace+".totalCountProduct");
	}

	@Override
	public List<ProductList> productList(int startRow) throws Exception{
		return session.selectList(namespace+".productList", new RowBounds(startRow,5));
	}

	@Override
	public void productInsert(Product product) throws Exception {
		session.insert(namespace+".productInsert", product);
	}

	@Override
	public void productUpdate(Product product) throws Exception {
		session.update(namespace+".productUpdate", product);
	}

	@Override
	public void productDelete(String product_id) throws Exception {
		session.delete(namespace+".productDelete", product_id);
	}

}
