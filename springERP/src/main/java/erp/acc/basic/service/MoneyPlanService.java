package erp.acc.basic.service;

import java.util.List;

import erp.acc.basic.domain.MoneyPlan;

public interface MoneyPlanService {
	
	public void moneyPlanInsert(MoneyPlan plan) throws Exception;

	public void moneyPlanUpdate(MoneyPlan plan) throws Exception;

	public void moneyPlanDelete(String funds_id) throws Exception;

	public List<MoneyPlan> moneyPlanList() throws Exception;
}