package erp.sale.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.sale.domain.SaleListView;
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

}
