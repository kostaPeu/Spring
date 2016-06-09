package erp.login.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
@Repository
public class LoginDao {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "erp.login.loginMapperr";
	
	public void arrive(String emp_id) throws Exception {
		session.update(namespace + ".arrive", emp_id);
	}

	public void leave(String emp_id) throws Exception {
		session.update(namespace + ".leave", emp_id);
	}
}
