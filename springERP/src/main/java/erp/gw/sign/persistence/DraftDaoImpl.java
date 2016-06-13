package erp.gw.sign.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.gw.sign.domain.ApprovalVO;
import erp.gw.sign.domain.DraftFormatVO;
import erp.gw.sign.domain.DraftVO;
import erp.hr.domain.EmployeeViewVO;

@Repository
public class DraftDaoImpl implements DraftDao {

	private static String namespace = "springERP.gw.mapper.draftMapper";
	
	@Inject
	private SqlSession session;
	
	@Override
	public List<DraftFormatVO> listFormat() throws Exception {
		return session.selectList(namespace + ".listFormat");
	}

	@Override
	public DraftFormatVO selectFormat(String draft_format_id) throws Exception {
		return session.selectOne(namespace + ".selectFormat", draft_format_id);
	}

	@Override
	public void insertDraft(DraftVO draft) throws Exception {
		System.out.println("dao실행한다!!");
		session.insert(namespace + ".insertDraft", draft);
		System.out.println("dao실행해따!!!!");
	}

	@Override
	public void insertFormat(DraftFormatVO draftFormat) throws Exception {
		session.insert(namespace + ".insertFormat", draftFormat);
	}

	@Override
	public List<DraftVO> selectlistDraft(String emp_id) throws Exception {
		return session.selectList(namespace + ".selectlistDraft", emp_id);
	}

	@Override
	public List<DraftVO> listDraft() throws Exception {
		return  session.selectList(namespace + ".listDraft");
	}

	@Override
	public DraftVO selectDraft(String draft_id) throws Exception {
		return session.selectOne(namespace + ".selectDraft", draft_id);
	}

	@Override
	public List<EmployeeViewVO> enameSearchList(String e_name) throws Exception {
		System.out.println("enameSearchList dao실행한다!!");
		return session.selectList(namespace + ".enameSearchList", "%" + e_name + "%");
	}

	// 결재자 추가
	@Override
	public void insertApproval(ApprovalVO approval) throws Exception {
		session.insert(namespace + ".insertApproval", approval);
	}

	@Override
	public int currvalDraft() throws Exception {
		return session.selectOne(namespace + ".currvalDraft");
	}

}
