package erp.acc.basic.service;

import java.util.List;

import erp.acc.basic.domain.Statements;

public interface StatementService {

	List<Statements> StatementAllList() throws Exception;

	List<Statements> StatementCashSalesList() throws Exception;
	List<Statements> StatementPromissorySalesList() throws Exception;

	List<Statements> StatementCashPurchaseList() throws Exception;
	List<Statements> StatementPromissoryPurchaseList() throws Exception;
}
