package erp.acc.basic.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.acc.basic.domain.Accounts;
import erp.acc.basic.persistence.BasicAccountDAO;
import erp.common.domain.Criteria;
import erp.common.domain.SearchCriteria;


@Service
public class BasicAccountServiceImpl implements BasicAccountService {

	@Inject
	private BasicAccountDAO dao;
	
	@Override
	public void accountInsert(Accounts accounts) throws Exception {
		dao.accountInsert(accounts);
	}
	@Override
	public void accountUpdate(Accounts accounts) throws Exception {
		dao.accountUpdate(accounts);
	}
	
	@Override
	public void accountDelete(String account_number) throws Exception {
		dao.accountDelete(account_number);
	}
	@Override
	public List<Accounts> accountList() throws Exception {
		return dao.accountList();
	}
	
	@Override
	public List<Accounts> listAll() throws Exception {
		return dao.listAll();
	}
	
	@Override
	public List<Accounts> listCriteria(Criteria cri) throws Exception {
		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return dao.countPaging(cri);
	}
	@Override
	public List<Accounts> listSearchCriteria(SearchCriteria cri) throws Exception {
		return dao.listSearch(cri);
	}
	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return dao.listSerachCount(cri);
	}
	
	
}
