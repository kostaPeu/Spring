package erp.gw.sign.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.gw.sign.domain.DraftFormatVO;
import erp.gw.sign.persistence.DraftDao;

@Service
public class DraftServiceImpl implements DraftService {
	
	@Inject
	private DraftDao dao;

	@Override
	public List<DraftFormatVO> listFormat() throws Exception {
		System.out.println("hoho");
		return dao.listFormat();
	}
}
