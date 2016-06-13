package erp.gw.sign.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.gw.sign.domain.ApprovalVO;
import erp.gw.sign.domain.DraftFormatVO;
import erp.gw.sign.domain.DraftVO;
import erp.gw.sign.domain.PersonViewVO;
import erp.gw.sign.persistence.DraftDao;
import erp.hr.domain.EmployeeViewVO;

@Service
public class DraftServiceImpl implements DraftService {
	
	@Inject
	private DraftDao dao;

	@Override
	public List<DraftFormatVO> listFormat() throws Exception {
		System.out.println("hoho");
		return dao.listFormat();
	}

	@Override
	public DraftFormatVO selectFormat(String draft_format_id) throws Exception {
		return dao.selectFormat(draft_format_id);
	}

	@Override
	public void insertDraft(DraftVO draft) throws Exception {
		System.out.println("insertDraft 서비스 한당 > <");
		System.out.println(draft.toString());
		dao.insertDraft(draft);
	}

	@Override
	public void insertFormat(DraftFormatVO draftFormat) throws Exception {
		dao.insertFormat(draftFormat);
	}

	@Override
	public List<DraftVO> selectlistDraft(String emp_id) throws Exception {
		return dao.selectlistDraft(emp_id);
	}

	@Override
	public List<DraftVO> listDraft() throws Exception {
		return dao.listDraft();
	}

	@Override
	public DraftVO selectDraft(String draft_id) throws Exception {
		return dao.selectDraft(draft_id);
	}

	@Override
	public List<PersonViewVO> enameSearchList(String e_name) throws Exception {
		
		List<EmployeeViewVO> e_list = dao.enameSearchList(e_name);
		List<PersonViewVO> list = new ArrayList<PersonViewVO>();
		
		for(int i=0; i<e_list.size(); i++){
			PersonViewVO personView = new PersonViewVO();
			personView.setEmp_id(e_list.get(i).getEmp_id());
			personView.setE_name(e_list.get(i).getE_name());
			personView.setE_email(e_list.get(i).getE_email());
			personView.setDept_name(e_list.get(i).getDept_name());
			personView.setPosition_name(e_list.get(i).getPosition_name());
			personView.setJob_name(e_list.get(i).getJob_name());
			personView.setDuty_name(e_list.get(i).getDuty_name());
			
			list.add(personView);
		}
		return list;
	}

	// 결재자 추가
	@Override
	public void insertApproval(String[] strarr) throws Exception {
		
		List<ApprovalVO> list = new ArrayList<ApprovalVO>();
		
		for(int i=0; i<strarr.length; i++){
			System.out.println("아이디를 얻어보쟝" + i + " : " + strarr[i]);
			ApprovalVO approval = new ApprovalVO();
			approval.setDraft_id(dao.currvalDraft()+"");
			approval.setEmp_id(strarr[i]);
			list.add(approval);
		}
		
		for(int i=0; i<list.size(); i++){
			dao.insertApproval(list.get(i));
		}
	}

}
