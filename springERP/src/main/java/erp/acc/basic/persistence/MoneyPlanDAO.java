package erp.acc.basic.persistence;

import java.util.List;

import erp.acc.basic.domain.MoneyPlan;
import erp.acc.basic.domain.MoneyPlanTimeSet;

public interface MoneyPlanDAO {

	public void moneyPlanInsert(MoneyPlanTimeSet plan) throws Exception;

	public void moneyPlanUpdate(MoneyPlan plan) throws Exception;

	public void moneyPlanDelete(String funds_id) throws Exception;

	public List<MoneyPlan> moneyPlanList() throws Exception;
}
