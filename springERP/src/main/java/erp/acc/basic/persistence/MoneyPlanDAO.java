package erp.acc.basic.persistence;

import java.util.List;

import erp.acc.basic.domain.MoneyPlan;

public interface MoneyPlanDAO {

	public void moneyPlanInsert(MoneyPlan plan) throws Exception;

	public void moneyPlanUpdate(MoneyPlan plan) throws Exception;

	public void moneyPlanDelete(String funds_id) throws Exception;

	public List<MoneyPlan> moneyPlanList() throws Exception;
}
