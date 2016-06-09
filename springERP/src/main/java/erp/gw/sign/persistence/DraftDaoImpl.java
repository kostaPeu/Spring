package erp.gw.sign.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.gw.sign.domain.DraftFormatVO;

@Repository
public class DraftDaoImpl implements DraftDao {

	private static String namespace = "springERP.gw.mapper.draftMapper";
	
	@Inject
	private SqlSession session;
	
	@Override
	public List<DraftFormatVO> listFormat() throws Exception {
		return session.selectList(namespace + ".listFormat");
	}

}
