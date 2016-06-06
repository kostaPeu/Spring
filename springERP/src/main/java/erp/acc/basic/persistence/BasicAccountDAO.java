package erp.acc.basic.persistence;

import java.util.List;

import erp.acc.basic.domain.Accounts;
import erp.acc.basic.domain.Card;
import erp.common.domain.Criteria;
import erp.common.domain.SearchCriteria;



public interface BasicAccountDAO {

	// BASIC ACCOUNT CRUD
	public void accountInsert(Accounts accounts) throws Exception;

	public void accountUpdate(Accounts accounts) throws Exception;

	public void accountDelete(String account_number) throws Exception;

	public List<Accounts> accountList() throws Exception;

	// BASIC ACCOUNT PAGE
	public List<Accounts> listAll() throws Exception;
	
	public List<Accounts> listCriteria(Criteria cri) throws Exception;
	
	public int countPaging(Criteria cri) throws Exception;

	public int listSerachCount(SearchCriteria cri) throws Exception;

	public List<Accounts> listSearch(SearchCriteria cri) throws Exception;
	
	// CARD CRUD
	
	public void cardInsert(Card card) throws Exception;

	public void cardUpdate(Card card) throws Exception;

	public void cardDelete(String card_number) throws Exception;

	public List<Card> cardList() throws Exception;

	
	//PROJECT

}
