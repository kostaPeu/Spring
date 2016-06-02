package erp.sale.service;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.common.domain.Criteria;
import erp.sale.domain.SaleListView;
import erp.sale.domain.SaleSearch;
import erp.sale.domain.SaleSearchTimeSet;
import erp.sale.domain.SaleVO;
import erp.sale.persistence.SaleDAO;

@Service
public class SaleServiceImpl implements SaleService {
	
	@Inject
	private SaleDAO dao;
	
	@Override
	public void insertSale(SaleVO vo) throws Exception {
		dao.addSale(vo);
	}

	@Override
	public List<SaleListView> listSale() throws Exception {
		return dao.listSale();
	}

	@Override
	public void deleteSale(String sell_id) throws Exception {
		dao.removeSale(sell_id);
	}
	@Override
	public void updateSale(SaleVO vo) throws Exception {
		dao.updateSale(vo);		
	}

	@Override
	public List<SaleListView> saleSearchList(SaleSearch ss) throws Exception {
		SaleSearchTimeSet sst = new SaleSearchTimeSet();
		sst.setCustomer_id(ss.getCustomer_id());
		sst.setProduct_id(ss.getProduct_id());
		sst.setWarehouse_id(ss.getWarehouse_id());
		sst.setStart_date(Timestamp.valueOf(ss.getStart_date()+" 00:00:00"));
		sst.setEnd_date(Timestamp.valueOf(ss.getEnd_date()+" 00:00:00"));
		return dao.searchSale(sst);
	}

	@Override
	public List<SaleListView> listAll() throws Exception {
		return dao.listAll();
	}
	@Override
	public List<SaleListView> listCriteria(Criteria cri) throws Exception {
		return dao.listCriteria(cri);
	}
	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return dao.countPaging(cri);
	}

}
