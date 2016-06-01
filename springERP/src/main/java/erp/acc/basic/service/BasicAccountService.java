package erp.acc.basic.service;

import erp.acc.basic.domain.Accounts;

public interface BasicAccountService {

	//통장계좌
	public void accountInsert(Accounts accounts)throws Exception;
	public void accountUpdate(Accounts accounts)throws Exception;
	public void accountDelete(String account_number)throws Exception;
	
	
	
}
