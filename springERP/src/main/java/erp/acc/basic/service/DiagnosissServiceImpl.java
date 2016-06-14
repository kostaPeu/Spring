package erp.acc.basic.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.acc.basic.domain.Diagnosiss;
import erp.acc.basic.persistence.DiagnosissDAO;

@Service
public class DiagnosissServiceImpl implements DiagnosissService {

	@Inject
	private DiagnosissDAO dao;
	
	@Override
	public void diagnosisInsert(Diagnosiss diagnosiss) throws Exception {
		dao.diagnosisInsert(diagnosiss);
		
	}

	@Override
	public void diagnosisUpdate(Diagnosiss diagnosiss) throws Exception {
		dao.diagnosisUpdate(diagnosiss);
	}

	@Override
	public void diagnosisDelete(String diagnosis_number) throws Exception {
		dao.diagnosisDelete(diagnosis_number);
		
	}

	@Override
	public List<Diagnosiss> diagnosisList() throws Exception {
		return dao.diagnosisList();
	}

}
