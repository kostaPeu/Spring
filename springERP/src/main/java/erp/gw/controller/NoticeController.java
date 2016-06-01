package erp.gw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import erp.gw.notice.domain.NoticeVO;

@Controller
@RequestMapping("/groupware/notice")
public class NoticeController {
	
	public NoticeVO noticeVo = new NoticeVO();
	
	@RequestMapping(value="/notice_list", method = RequestMethod.GET)
	public void listPage() throws Exception{
		System.out.println("ddd");
	}
	

}
