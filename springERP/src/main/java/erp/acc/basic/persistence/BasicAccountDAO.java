package erp.acc.basic.persistence;

import erp.acc.basic.domain.Accounts;

public interface BasicAccountDAO {

	public void accountInsert(Accounts accounts)throws Exception;
	public void accountUpdate(Accounts accounts)throws Exception;
	public void accountDelete(Accounts accounts)throws Exception;
	
}
