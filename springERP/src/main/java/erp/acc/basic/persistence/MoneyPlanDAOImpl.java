package erp.acc.basic.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.acc.basic.domain.MoneyPlan;
import erp.acc.basic.domain.MoneyPlanTimeSet;

@Repository
public class MoneyPlanDAOImpl implements MoneyPlanDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "erp.acc.mapper.MoneyPlanMapper";

	@Override
	public void moneyPlanInsert(MoneyPlanTimeSet plan) throws Exception {
		session.insert(namespace + ".moneyPlanInsert", plan);
		
	}

	@Override
	public void moneyPlanUpdate(MoneyPlan plan) throws Exception {
		session.update(namespace + ".moneyPlanUpdate", plan);
		
	}

	@Override
	public void moneyPlanDelete(String funds_id) throws Exception {
		session.delete(namespace + ".moneyPlanDelete", funds_id);
		
	}

	@Override
	public List<MoneyPlan> moneyPlanList() throws Exception {
		return session.selectList(namespace + ".moneyPlanList");
	}



}
