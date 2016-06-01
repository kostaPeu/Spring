package erp.basic.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.basic.domain.ListModelProduct;
import erp.basic.domain.Product;
import erp.basic.domain.ProductGroup;
import erp.basic.domain.ProductList;
import erp.basic.domain.Standards;
import erp.basic.persistence.BasicProductDAO;

@Service
public class BasicProductServiceImpl implements BasicProductService{

	@Inject
	private BasicProductDAO dao;
	private static final int PAGE_SIZE = 5;
	
	/*품목 그룹 목록 - MJ*/
	@Override
	public List<ProductGroup> pgroupList() throws Exception {
		return dao.pgroupList();
	}

	/*규격 목록 - MJ*/
	@Override
	public List<Standards> standardList() throws Exception {
		return dao.standardList();
	}

	/*품목 목록 + 페이징 - MJ*/
	@Override
	public ListModelProduct productList(int page) throws Exception {
		int requestPage = page;

		int totalCount = dao.totalCountProduct();
		int totalPageCount = totalCount/PAGE_SIZE;
		if(totalCount%PAGE_SIZE != 0){
			totalPageCount++;
		}
		int startPage = requestPage - (requestPage -1) % 5;
		int endPage = startPage + 4;
		if(endPage > totalPageCount){
			endPage = totalPageCount;
		}
		List<ProductList> list = dao.productList((requestPage - 1)*PAGE_SIZE);
		return new ListModelProduct(list, requestPage, totalPageCount, startPage, endPage);
	}

	/*품목 등록 - MJ*/
	@Override
	public void productInsert(Product product) throws Exception {
		dao.productInsert(product);
	}

	/*품목 수정 - MJ*/
	@Override
	public void productUpdate(Product product) throws Exception {
		dao.productUpdate(product);
	}

	/*품목 삭제 - MJ*/
	@Override
	public void productDelete(String product_id) throws Exception {
		dao.productDelete(product_id);
	}

}
