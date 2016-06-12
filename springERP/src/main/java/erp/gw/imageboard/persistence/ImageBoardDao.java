package erp.gw.imageboard.persistence;

import erp.gw.imageboard.domain.ImageBoardReplyVO;
import erp.gw.imageboard.domain.ImageBoardVO;

public interface ImageBoardDao {
	public void insertImage(ImageBoardVO vo)throws Exception;
}
