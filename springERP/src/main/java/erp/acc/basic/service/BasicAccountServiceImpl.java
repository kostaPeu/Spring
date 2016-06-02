package erp.acc.basic.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.acc.basic.domain.AccountCriteria;
import erp.acc.basic.domain.Accounts;
import erp.acc.basic.persistence.BasicAccountDAO;

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
	public List<Accounts> accountListCriteria(AccountCriteria cri) throws Exception {
	return dao.accountListCriteria(cri);
	}
}
