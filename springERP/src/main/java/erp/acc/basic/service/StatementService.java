package erp.acc.basic.service;

import java.util.List;

import erp.acc.basic.domain.Statement;

public interface StatementService {

	List<Statement> StatementAllList() throws Exception;

	List<Statement> StatementCashSalesList() throws Exception;
	List<Statement> StatementPromissorySalesList() throws Exception;

	List<Statement> StatementCashPurchaseList() throws Exception;
	List<Statement> StatementPromissoryPurchaseList() throws Exception;
}
