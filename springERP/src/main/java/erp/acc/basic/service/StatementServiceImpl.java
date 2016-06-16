package erp.acc.basic.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.acc.basic.domain.Statement;
import erp.acc.basic.persistence.StatementDAO;

@Service
public class StatementServiceImpl implements StatementService {

	@Inject
	private StatementDAO dao;

	@Override
	public List<Statement> StatementAllList() throws Exception {
		return dao.StatementAllList();
	}

	@Override
	public List<Statement> StatementCashSalesList() throws Exception {
		return dao.StatementCashSalesList();
	}

	@Override
	public List<Statement> StatementPromissorySalesList() throws Exception {
		return dao.StatementPromissorySalesList();
	}

	@Override
	public List<Statement> StatementCashPurchaseList() throws Exception {
		return dao.StatementCashPurchaseList();
	}

	@Override
	public List<Statement> StatementPromissoryPurchaseList() throws Exception {
		return dao.StatementPromissoryPurchaseList();
	}

}
