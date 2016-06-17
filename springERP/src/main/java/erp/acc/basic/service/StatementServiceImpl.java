package erp.acc.basic.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.acc.basic.domain.Statements;
import erp.acc.basic.persistence.StatementDAO;

@Service
public class StatementServiceImpl implements StatementService {

	@Inject
	private StatementDAO dao;

	@Override
	public List<Statements> StatementAllList() throws Exception {
		return dao.StatementAllList();
	}

	@Override
	public List<Statements> StatementCashSalesList() throws Exception {
		return dao.StatementCashSalesList();
	}

	@Override
	public List<Statements> StatementPromissorySalesList() throws Exception {
		return dao.StatementPromissorySalesList();
	}

	@Override
	public List<Statements> StatementCashPurchaseList() throws Exception {
		return dao.StatementCashPurchaseList();
	}

	@Override
	public List<Statements> StatementPromissoryPurchaseList() throws Exception {
		return dao.StatementPromissoryPurchaseList();
	}

}
