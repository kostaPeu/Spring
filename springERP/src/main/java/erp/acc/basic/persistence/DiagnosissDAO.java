package erp.acc.basic.persistence;

import java.util.List;

import erp.acc.basic.domain.Diagnosiss;

public interface DiagnosissDAO {

	public void diagnosisInsert(Diagnosiss diagnosiss) throws Exception;

	public void diagnosisUpdate(Diagnosiss diagnosiss) throws Exception;

	public void diagnosisDelete(String diagnosis_number) throws Exception;

	public List<Diagnosiss> diagnosisList() throws Exception;
}
