package erp.hr.controller;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import erp.hr.domain.HrBasicVo;
import erp.hr.domain.HrDeptVO;
import erp.hr.domain.HrDutyVO;
import erp.hr.domain.HrJobVO;
import erp.hr.domain.HrPositionVO;
import erp.hr.service.HrService;

@Controller
@RequestMapping("/hr")
public class HrController {
	@Inject
	private HrService service;

	// 인사 기초등록 폼 불러오기
	@RequestMapping(value = "/hr_basic")
	public String hr_basic(Model model) {
		model.addAttribute("left", "hr/hr.jsp");
		model.addAttribute("contents", "hr/hr_basic.jsp");
		return "/main";
	}
	@RequestMapping(value = "/emp")
	public String emp(Model model) {
		model.addAttribute("left", "hr/hr.jsp");
		model.addAttribute("contents", "hr/emp_info.jsp");
		return "/main";
	}
	@RequestMapping(value = "/indol")
	public String indol(Model model) {
		model.addAttribute("left", "hr/hr.jsp");
		model.addAttribute("contents", "hr/indol_info.jsp");
		return "/main";
	}
	@RequestMapping(value = "/indol_request")
	public String indol_request(Model model) {
		model.addAttribute("left", "hr/hr.jsp");
		model.addAttribute("contents", "hr/indol_request.jsp");
		return "/main";
	}
	@RequestMapping(value = "/jubis")
	public String jubis(Model model) {
		model.addAttribute("left", "hr/hr.jsp");
		model.addAttribute("contents", "hr/jubis.jsp");
		return "/main";
	}

	// 인사 기초등록 중복검사
	@RequestMapping(value = "/hr_basic/basic_check", method = RequestMethod.POST)
	public ResponseEntity<String> basic_check(@RequestBody HrBasicVo vo) {
		ResponseEntity<String> entity = null;
		int count = 0;
		String type = vo.getBasic_type();
		if (type.equals("dept")) {
			try {
				count = service.deptCheck(vo.getBasic_id());
				if (count > 0) {
					entity = new ResponseEntity<String>("no", HttpStatus.OK);
				} else {
					entity = new ResponseEntity<String>("ok", HttpStatus.OK);
				}
			} catch (Exception e) {
				entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}

		} else if (type.equals("position")) {
			try {
				count = service.positionCheck(vo.getBasic_id());
				if (count > 0) {
					entity = new ResponseEntity<String>("no", HttpStatus.OK);
				} else {
					entity = new ResponseEntity<String>("ok", HttpStatus.OK);
				}
			} catch (Exception e) {
				entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}
		} else if (type.equals("job")) {
			try {
				count = service.jobCheck(vo.getBasic_id());
				if (count > 0) {
					entity = new ResponseEntity<String>("no", HttpStatus.OK);
				} else {
					entity = new ResponseEntity<String>("ok", HttpStatus.OK);
				}
			} catch (Exception e) {
				entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}
		} else {
			try {
				count = service.dutyCheck(vo.getBasic_id());
				if (count > 0) {
					entity = new ResponseEntity<String>("no", HttpStatus.OK);
				} else {
					entity = new ResponseEntity<String>("ok", HttpStatus.OK);
				}
			} catch (Exception e) {
				entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}
		}
		return entity;
	}
	
	//인사 기초등록 등록
	@RequestMapping(value="/hr_basic/basic_insert", method = RequestMethod.POST)
	public String basicInsert(HrBasicVo vo)throws Exception{
		service.basicInsert(vo);
		return "redirect:/hr/hr_basic";
	}

	//인사 기초등록 수정
	@RequestMapping(value="/hr_basic/basic_update", method = RequestMethod.POST)
	public String basicUpdate(HrBasicVo vo)throws Exception{
		service.basicUpdate(vo);
		return "redirect:/hr/hr_basic";
	}
	
	//인사 기초등록 부서출력
	@RequestMapping(value="/hr_basic/dept", method=RequestMethod.GET)
	public ResponseEntity<List<HrDeptVO>> deptlist(){
		 ResponseEntity<List<HrDeptVO>> entity = null;
		 try {
			entity = new ResponseEntity<List<HrDeptVO>>(service.listDept(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entity;
	}
	//인사 기초등록 직급출력
	@RequestMapping(value="/hr_basic/position", method=RequestMethod.GET)
	public ResponseEntity<List<HrPositionVO>> positionlist(){
		ResponseEntity<List<HrPositionVO>> entity = null;
		try {
			entity = new ResponseEntity<List<HrPositionVO>>(service.listPosition(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entity;
	}
	//인사 기초등록 직무출력 
	@RequestMapping(value="/hr_basic/job", method=RequestMethod.GET)
	public ResponseEntity<List<HrJobVO>> joblist(){
		ResponseEntity<List<HrJobVO>> entity = null;
		try {
			entity = new ResponseEntity<List<HrJobVO>>(service.listJob(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entity;
	}
	//인사 기초등록 직책출력
	@RequestMapping(value="/hr_basic/duty", method=RequestMethod.GET)
	public ResponseEntity<List<HrDutyVO>> list(){
		ResponseEntity<List<HrDutyVO>> entity = null;
		try {
			entity = new ResponseEntity<List<HrDutyVO>>(service.listDuty(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entity;
	}
	//인사 기초등록 삭제
	@RequestMapping(value="/hr_basic/basic_del", method = RequestMethod.POST)
	public String basicDel(HrBasicVo vo)throws Exception{
		service.basicDel(vo);
		return "redirect:/hr/hr_basic";
	}
}
