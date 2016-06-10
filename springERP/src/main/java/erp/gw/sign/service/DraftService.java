package erp.gw.sign.service;

import java.util.List;

import erp.gw.sign.domain.DraftFormatVO;

public interface DraftService {
	public List<DraftFormatVO> listFormat() throws Exception;
}
