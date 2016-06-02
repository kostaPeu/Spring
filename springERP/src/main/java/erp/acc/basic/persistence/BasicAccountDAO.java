package erp.acc.basic.persistence;

import java.util.List;

import erp.acc.basic.domain.AccountCriteria;
import erp.acc.basic.domain.Accounts;

public interface BasicAccountDAO {

	public void accountInsert(Accounts accounts) throws Exception;

	public void accountUpdate(Accounts accounts) throws Exception;

	public void accountDelete(String account_number) throws Exception;

	public List<Accounts> accountList() throws Exception;

	public List<Accounts> listPage(int page) throws Exception;

	public List<Accounts> accountListCriteria(AccountCriteria cri) throws Exception;

	public int countPaging(AccountCriteria cri) throws Exception;
}
