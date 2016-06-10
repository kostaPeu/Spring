package erp.acc.basic.service;

import java.util.List;

import erp.acc.basic.domain.MoneyManagement;
import erp.acc.basic.domain.MoneyPlanTimeSet;

public interface MoneyManagementService {

	public void moneyManageMentInsert(MoneyManagement mg)throws Exception;
	public List<MoneyManagement> moneyManageMentList() throws Exception;
	
	public void moneyPlanInsert(MoneyPlanTimeSet set)throws Exception;
	public List<MoneyPlanTimeSet> monseyPlanAllList()throws Exception;
	
}
