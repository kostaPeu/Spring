package erp.acc.basic.persistence;

import java.util.List;

import erp.acc.basic.domain.Accounts;

public interface BasicAccountDAO {

	public void accountInsert(Accounts accounts)throws Exception;
	public void accountUpdate(Accounts accounts)throws Exception;
	public void accountDelete(String account_number)throws Exception;
	public List<Accounts> accountList()throws Exception;
}
