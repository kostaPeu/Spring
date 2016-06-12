package erp.gw.imageboard.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.gw.imageboard.domain.ImageBoardReplyVO;
import erp.gw.imageboard.domain.ImageBoardVO;

@Repository
public class ImageBoardDaoImpl implements ImageBoardDao {
	
	@Inject
	private SqlSession session;	
	private final String namespace = "springERP.gw.mapper.imageMapper";
	
	@Override
	public void insertImage(ImageBoardVO vo) throws Exception {
		session.insert(namespace+".insertImage", vo);
	}
}
