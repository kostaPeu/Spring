package erp.acc.basic.persistence;

import java.util.List;

import erp.acc.basic.domain.MoneyManagement;

public interface MoneyManagementDAO {

	public void moneyManageMentInsert(MoneyManagement mg) throws Exception;
	public List<MoneyManagement> moneyManageMentList() throws Exception;
	
	
}
