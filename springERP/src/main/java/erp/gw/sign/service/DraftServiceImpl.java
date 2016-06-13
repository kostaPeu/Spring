package erp.gw.sign.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import erp.common.service.CommonService;
import erp.gw.sign.domain.ApprovalVO;
import erp.gw.sign.domain.DraftFormatVO;
import erp.gw.sign.domain.DraftVO;
import erp.gw.sign.domain.DraftViewVO;
import erp.gw.sign.domain.PersonViewVO;
import erp.gw.sign.domain.ReferenceVO;
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
	public List<DraftVO> selectDraftEmpId(String emp_id) throws Exception {
		return dao.selectDraftEmpId(emp_id);
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
	public String insertApproval(String[] strarr) throws Exception {
		List<ApprovalVO> list = new ArrayList<ApprovalVO>();
		String draft_id = dao.currvalDraft()+"";
		for(int i=0; i<strarr.length; i++){
			System.out.println("결재자 아이디를 얻어보쟝" + i + " : " + strarr[i]);
			ApprovalVO approval = new ApprovalVO();
			approval.setDraft_id(draft_id);
			approval.setEmp_id(strarr[i]);
			list.add(approval);
		}
		for(int i=0; i<list.size(); i++){
			dao.insertApproval(list.get(i));
		}
		return draft_id;
	}

	@Override
	public String insertReference(String[] strarr) throws Exception {
		List<ReferenceVO> list = new ArrayList<ReferenceVO>();
		String draft_id = dao.currvalDraft()+"";
		for(int i=0; i<strarr.length; i++){
			System.out.println("참조자 아이디를 얻어보쟝" + i + " : " + strarr[i]);
			ReferenceVO reference = new ReferenceVO();
			reference.setDraft_id(dao.currvalDraft()+"");
			reference.setEmp_id(strarr[i]);
			list.add(reference);
		}
		for(int i=0; i<list.size(); i++){
			dao.insertReference(list.get(i));
		}
		return draft_id;
	}

	@Override
	public String getEname(String emp_id) throws Exception {
		return dao.getEname(emp_id);
	}

	
	@Override
	public List<DraftViewVO> draftViewList() throws Exception {
		List<DraftVO> draftList = dao.listDraft();
		List<DraftViewVO> draftViewList = new ArrayList<DraftViewVO>();
		
		for(int i=0; i<draftList.size(); i++){
			List<String> ap_empId_list = dao.selectApprovalDraft(draftList.get(i).getDraft_id());
			List<String> re_empId_list = dao.selectReferenceDraft(draftList.get(i).getDraft_id());
			
			List<String> ap_eName_list = new ArrayList<String>();
			List<String> re_eName_list = new ArrayList<String>();
			
			for(int j=0; j<ap_empId_list.size(); j++){
				ap_eName_list.add(dao.getEname(ap_empId_list.get(j)));
			}
			for(int j=0; j<re_empId_list.size(); j++){
				re_eName_list.add(dao.getEname(re_empId_list.get(j)));
			}
			
			System.out.println(ap_eName_list.toString());
			System.out.println("나옴?111");
			System.out.println(re_eName_list.toString());
			System.out.println("나옴?222");
			DraftViewVO draftView = new DraftViewVO();
			
			draftView.setDraft_id(draftList.get(i).getDraft_id());
			draftView.setDraft_title(draftList.get(i).getDraft_title());
			draftView.setDraft_content(draftList.get(i).getDraft_content());
			draftView.setDraft_type(draftList.get(i).getDraft_type());
			draftView.setDraft_date(draftList.get(i).getDraft_date());
			draftView.setE_name(dao.getEname(draftList.get(i).getEmp_id()));
			draftView.setDraft_state(draftList.get(i).getDraft_state());
			draftView.setApproval(ap_eName_list);
			draftView.setReference(re_eName_list);
			
			System.out.println(draftView.toString());
			draftViewList.add(draftView);
		}
		
		System.out.println("이야압! 간다! ");
		System.out.println(draftViewList.toString());
		return draftViewList;
	}

	
	// 내 결재관리 리스트
	@Override
	public List<DraftViewVO> myDraftViewList() throws Exception {
		
		List<DraftVO> draftList = new ArrayList<DraftVO>();
		List<DraftViewVO> draftViewList = new ArrayList<DraftViewVO>();
		
		// 결재자, 참조자에 내이름 있으면 가져오기
		List<String> ap_draftId_list = dao.selectApprovalEmpId(CommonService.getEmployeeId());
		List<String> re_draftId_list = dao.selectReferenceEmpId(CommonService.getEmployeeId());
		
		System.out.println("ap_draftId_list : " + ap_draftId_list);
		System.out.println("re_draftId_list : " + re_draftId_list);
		
		
		// 결재자에 내가 있는 기안서 목록에 추가하기
		for(int i=0; i<ap_draftId_list.size(); i++){
			draftList.add(dao.selectDraft(ap_draftId_list.get(i)));
			System.out.println("포문을찍어보쟝111 : " + i + ap_draftId_list.get(i));
		}

		
		// 참조라인에서 결재라인에 중복되지 않는것만 기안서 목록에 추가하기
		for(int i=0;i<re_draftId_list.size();i++){
			boolean check = true;
			for(int j=0;j<draftList.size();j++){
				if(re_draftId_list.get(i).equals(draftList.get(j).getDraft_id())){
					System.out.println("같을때:"+draftList.get(j).getDraft_id() +":" +re_draftId_list.get(i));
					check = false;
					break;
				}
			}
			if(check){
				draftList.add(dao.selectDraft(re_draftId_list.get(i)));
				System.out.println("다를때:"+":"+re_draftId_list.get(i));
			}
		}
		
		System.out.println("11111111111111111111111111");
		for(int i=0; i<draftList.size(); i++){
			System.out.println(draftList.get(i).getDraft_id());
		}
		
		// 내가 쓴 기안서 목록 가져오기
		List<DraftVO> myDraftList = dao.selectDraftEmpId(CommonService.getEmployeeId());
		
		System.out.println("9999 9 99  9 9 9 9 9 9 9 9 999 9 9 9 999999999999999");
		System.out.println(myDraftList.size());
		System.out.println(draftList.size());
		System.out.println("7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7");

		int myDraftListSize = myDraftList.size();
		int draftListSize = draftList.size();
		
		// 내가 쓴 글들 중에서 참조라인, 결재라인에서 불러온 것들과 중복되지 않는것만 기안서 목록에 추가하기
		for(int i=0;i<myDraftListSize;i++){
			boolean check = true;
			for(int j=0;j<draftListSize;j++){
				if(myDraftList.get(i).getDraft_id().equals(draftList.get(j).getDraft_id())){
					System.out.println("같을때:"+draftList.get(j).getDraft_id() +":" +myDraftList.get(i).getDraft_id());
					check = false;
					break;
				}
			}
			if(check){
				draftList.add(dao.selectDraft(myDraftList.get(i).getDraft_id()));
				System.out.println("다를때:"+":"+myDraftList.get(i).getDraft_id());
			}
		}
		
		System.out.println("12341234123412341234123412341234");
		for(int i=0; i<draftList.size(); i++){
			System.out.println(draftList.get(i).getDraft_id());
		}
		
		
		for(int i=0; i<draftList.size(); i++){
			List<String> ap_empId_list = dao.selectApprovalDraft(draftList.get(i).getDraft_id());
			List<String> re_empId_list = dao.selectReferenceDraft(draftList.get(i).getDraft_id());
			
			List<String> ap_eName_list = new ArrayList<String>();
			List<String> re_eName_list = new ArrayList<String>();
			
			for(int j=0; j<ap_empId_list.size(); j++){
				ap_eName_list.add(dao.getEname(ap_empId_list.get(j)));
			}
			for(int j=0; j<re_empId_list.size(); j++){
				re_eName_list.add(dao.getEname(re_empId_list.get(j)));
			}
			
			System.out.println(ap_eName_list.toString());
			System.out.println("나옴?111");
			System.out.println(re_eName_list.toString());
			System.out.println("나옴?222");
			DraftViewVO draftView = new DraftViewVO();
			
			draftView.setDraft_id(draftList.get(i).getDraft_id());
			draftView.setDraft_title(draftList.get(i).getDraft_title());
			draftView.setDraft_content(draftList.get(i).getDraft_content());
			draftView.setDraft_type(draftList.get(i).getDraft_type());
			draftView.setDraft_date(draftList.get(i).getDraft_date());
			draftView.setE_name(dao.getEname(draftList.get(i).getEmp_id()));
			draftView.setDraft_state(draftList.get(i).getDraft_state());
			draftView.setApproval(ap_eName_list);
			draftView.setReference(re_eName_list);
			
//			System.out.println("hohohohoho");
//			System.out.println(draftView.toString());
			draftViewList.add(draftView);
//			System.out.println("hohohohoho22222");
//			System.out.println(draftViewList.toString() + i);
//			System.out.println("hoho333333333");
		}
		
		System.out.println("이야압! 간다! 되라되라 !! ");
		System.out.println(draftViewList.toString());
		return draftViewList;
	}

}
