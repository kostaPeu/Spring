package erp.acc.basic.service;

import java.util.List;

import erp.acc.basic.domain.Accounts;
import erp.common.domain.Criteria;
import erp.common.domain.SearchCriteria;


public interface BasicAccountService {

	// 통장계좌
	public void accountInsert(Accounts accounts) throws Exception;

	public void accountUpdate(Accounts accounts) throws Exception;

	public void accountDelete(String account_number) throws Exception;

	public List<Accounts> accountList() throws Exception;

	// 페이징
	public List<Accounts> listAll()throws Exception;
	
	public List<Accounts> listCriteria(Criteria cri) throws Exception;

	public int listCountCriteria(Criteria cri) throws Exception;

	public List<Accounts> listSearchCriteria(SearchCriteria cri) throws Exception;

	public int listSearchCount(SearchCriteria cri) throws Exception;
}
