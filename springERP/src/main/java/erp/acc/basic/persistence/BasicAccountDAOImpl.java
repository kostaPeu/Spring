package erp.acc.basic.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.acc.basic.domain.Accounts;
import erp.acc.basic.domain.Card;
import erp.common.domain.Criteria;
import erp.common.domain.SearchCriteria;


@Repository
public class BasicAccountDAOImpl implements BasicAccountDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "erp.acc.mapper.BasicAccountMapper";

	// 계좌추가 - JH
	@Override
	public void accountInsert(Accounts accounts) throws Exception {
		session.insert(namespace + ".accountInsert", accounts);

	}

	// 계좌내용 수정 -JH
	@Override
	public void accountUpdate(Accounts accounts) throws Exception {
		session.update(namespace + ".accountUpdate", accounts);

	}

	// 계좌삭제 - JH
	@Override
	public void accountDelete(String account_number) throws Exception {
		session.delete(namespace + ".accountDelete", account_number);
	}

	// 계좌리스트 - JH
	@Override
	public List<Accounts> accountList() throws Exception {
		return session.selectList(namespace + ".accountList");
	}

	// 페이징 list
	@Override
	public List<Accounts> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}

	@Override
	public List<Accounts> listCriteria(Criteria cri) throws Exception {
		return session.selectList(namespace + ".listCriteria", null,
				new RowBounds(cri.getPageStart(), cri.getPerPageNum()));
	}

	@Override
	public int countPaging(Criteria cri) throws Exception {
		return session.selectOne(namespace + ".countPaging", cri);
	}

	@Override
	public List<Accounts> listSearch(SearchCriteria cri) throws Exception {
		return session.selectList(namespace+".listSearch", cri, new RowBounds(cri.getPageStart(), cri.getPerPageNum()));
	}
	
	@Override
	public int listSerachCount(SearchCriteria cri) throws Exception {
		return session.selectOne(namespace + ".listSearchCount", cri);
	}

	//신용카드 추가
	@Override
	public void cardInsert(Card card) throws Exception {
		session.insert(namespace + ".cardInsert", card);
		
	}

	//신용카드 수정
	@Override
	public void cardUpdate(Card card) throws Exception {
		session.update(namespace + ".cardUpdate", card);
		
	}

	//신용카드 삭제
	@Override
	public void cardDelete(String card_number) throws Exception {
		session.delete(namespace + ".cardDelete", card_number);
		
	}

	//신용카드 리스트
	@Override
	public List<Card> cardList() throws Exception {
		return session.selectList(namespace + ".cardList");
	}

}
