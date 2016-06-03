package erp.acc.basic.service;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.acc.basic.domain.MoneyPlan;
import erp.acc.basic.domain.MoneyPlanTimeSet;
import erp.acc.basic.persistence.MoneyPlanDAO;

@Service
public class MoneyPlanServiceImpl implements MoneyPlanService {

	@Inject
	private MoneyPlanDAO dao;

	@Override
	public void moneyPlanInsert(MoneyPlan plan) throws Exception {
		MoneyPlanTimeSet set = new MoneyPlanTimeSet();
		set.setTypelist(plan.getTypelist());
		set.setFunds_id(plan.getFunds_id());
		set.setRepeat_unit(plan.getRepeat_unit());
		set.setStart_date(Timestamp.valueOf(plan.getStart_date() + "00:00:00"));
		set.setPeriod(Timestamp.valueOf(plan.getPeriod() + "23:59:59"));
		set.setDept_id(plan.getDept_id());
		set.setProj_id(plan.getProj_id());
		set.setAccount_number(plan.getAccount_number());
		set.setDiagnosis_number(plan.getDiagnosis_number());
		set.setCustomer_id(plan.getCustomer_id());
		set.setSums(plan.getSums());
		set.setRemarks(plan.getRemarks());
		dao.moneyPlanInsert(set);

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
