package erp.common.persistence;

import java.util.List;

import erp.common.domain.MessageCriteria;
import erp.common.domain.MessageVO;
import erp.hr.domain.EmployeeVO;
import erp.hr.domain.EmployeeViewVO;

public interface CommonDAO {

	List<MessageVO> getMessageList(MessageCriteria cri);

	int messageListCount(MessageCriteria cri);

	void msgDel(String string);

	List<EmployeeViewVO> getEmpID(String e_name);

	void sendMessage(MessageVO vo);

}
