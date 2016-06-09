package erp.common.service;

import java.util.List;

import erp.common.domain.MessageCriteria;
import erp.common.domain.MessageVO;
import erp.hr.domain.EmployeeViewVO;

public interface MessageService {

	List<MessageVO> getMessageList(MessageCriteria cri);

	int messageListCount(MessageCriteria cri);

	void messageDelete(String string);

	List<EmployeeViewVO> getEmpID(String e_name);

	void sendMessage(MessageVO vo);
}
