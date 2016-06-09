package erp.acc.basic.service;

import java.util.List;

import erp.acc.basic.domain.MoneyManagement;

public interface MoneyManagementService {

	public void moneyManageMentInsert(MoneyManagement mg)throws Exception;
	public List<MoneyManagement> moneyManageMentList() throws Exception;
}
