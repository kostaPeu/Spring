package erp.gw.sign.service;

import java.util.List;

import erp.gw.sign.domain.DraftFormatVO;
import erp.gw.sign.domain.DraftVO;
import erp.gw.sign.domain.DraftViewVO;
import erp.gw.sign.domain.PersonViewVO;

public interface DraftService {
	//기안서
	public void insertDraft(DraftVO draft) throws Exception;
	public DraftVO selectDraft(String draft_id) throws Exception;
	public List<DraftVO> selectDraftEmpId(String emp_id) throws Exception;
	public List<DraftVO> listDraft() throws Exception;
	public List<DraftViewVO> draftViewList() throws Exception;
	public List<DraftViewVO> myDraftViewList() throws Exception;
	public List<PersonViewVO> enameSearchList(String e_name) throws Exception;
	public String insertApproval(String[] strarr) throws Exception;
	public String insertReference(String[] strarr) throws Exception;
	public String getEname(String emp_id) throws Exception;

	// 공통양식
	public List<DraftFormatVO> listFormat() throws Exception;
	public DraftFormatVO selectFormat(String draft_format_id) throws Exception;
	public void insertFormat(DraftFormatVO draftFormat) throws Exception;
}
