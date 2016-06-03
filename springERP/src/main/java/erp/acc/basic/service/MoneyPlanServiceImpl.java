package erp.acc.basic.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.acc.basic.domain.MoneyPlan;
import erp.acc.basic.persistence.MoneyPlanDAO;

@Service
public class MoneyPlanServiceImpl implements MoneyPlanService {

	@Inject
	private MoneyPlanDAO dao;
	
	@Override
	public void moneyPlanInsert(MoneyPlan plan) throws Exception {
		dao.moneyPlanInsert(plan);
		
	}

	@Override
	public void moneyPlanUpdate(MoneyPlan plan) throws Exception {
		dao.moneyPlanUpdate(plan);
		
	}

	@Override
	public void moneyPlanDelete(String funds_id) throws Exception {
		dao.moneyPlanDelete(funds_id);
		
	}

	@Override
	public List<MoneyPlan> moneyPlanList() throws Exception {
		return dao.moneyPlanList();
	}

}
