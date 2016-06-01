package erp.hr.service;

import javax.inject.Inject;
import org.springframework.stereotype.Service;
import erp.hr.persistence.HrDAO;

@Service
public class HrServiceImpl implements HrService {
	
	@Inject
	private HrDAO dao;
	
	
}
