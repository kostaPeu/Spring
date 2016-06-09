package erp.common.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import erp.common.domain.MessageCriteria;
import erp.common.domain.MessageVO;
import erp.hr.domain.EmployeeVO;
import erp.hr.domain.EmployeeViewVO;

@Repository
public class CommonDAOImpl implements CommonDAO {
	@Inject
	private SqlSession session;
	
	private static String namespace = "erp.common.mapper.CommonMapper";

	@Override
	public List<MessageVO> getMessageList(MessageCriteria cri) {
		return session.selectList(namespace + ".getMessageList", cri, new RowBounds(cri.getPageStart(), cri.getPerPageNum()));
	}

	@Override
	public int messageListCount(MessageCriteria cri) {
		return session.selectOne(namespace + ".messageListCount", cri);
	}

	@Override
	public void msgDel(String string) {
		session.delete(namespace + ".msgDel", string);
	}

	@Override
	public List<EmployeeViewVO> getEmpID(String e_name) {
		return session.selectList(namespace + ".getEmpID", e_name);
	}

	@Override
	public void sendMessage(MessageVO vo) {
		System.out.println(vo.getTitle());
		System.out.println(vo.getContents());
		System.out.println("vv"+vo.getSend_id());
		System.out.println(vo.getReceive_id());
		System.out.println(vo.getReceive_check());
		session.insert(namespace + ".sendMessage", vo);
	}
}
