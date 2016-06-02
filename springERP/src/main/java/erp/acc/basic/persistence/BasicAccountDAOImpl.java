package erp.acc.basic.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.acc.basic.domain.Accounts;
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

}
