package erp.acc.basic.persistence;

import java.util.List;

import erp.acc.basic.domain.Promissory;

public interface PromissoryDAO {

	// BASIC ACCOUNT CRUD
	public void promissoryInsert(Promissory promissory) throws Exception;

	public void promissoryUpdate(Promissory promissory) throws Exception;

	public void promissoryDelete(String note_id) throws Exception;

	public List<Promissory> promissoryList() throws Exception;

	
}
