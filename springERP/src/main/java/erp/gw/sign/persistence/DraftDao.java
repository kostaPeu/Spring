package erp.gw.sign.persistence;

import java.util.List;

import erp.gw.sign.domain.DraftFormatVO;

public interface DraftDao {
	public List<DraftFormatVO> listFormat() throws Exception;
}
