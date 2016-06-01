package erp.hr.controller;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import erp.hr.domain.HrBasicVo;
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
					entity = new ResponseEntity<String>("ok", HttpStatus.OK);
				} else {
					entity = new ResponseEntity<String>("no", HttpStatus.OK);
				}
			} catch (Exception e) {
				entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}

		} else if (type.equals("position")) {
			try {
				count = service.positionCheck(vo.getBasic_id());
				if (count > 0) {
					entity = new ResponseEntity<String>("ok", HttpStatus.OK);
				} else {
					entity = new ResponseEntity<String>("no", HttpStatus.OK);
				}
			} catch (Exception e) {
				entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}
		} else if (type.equals("job")) {
			try {
				count = service.jobCheck(vo.getBasic_id());
				if (count > 0) {
					entity = new ResponseEntity<String>("ok", HttpStatus.OK);
				} else {
					entity = new ResponseEntity<String>("no", HttpStatus.OK);
				}
			} catch (Exception e) {
				entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}
		} else {
			try {
				count = service.dutyCheck(vo.getBasic_id());
				if (count > 0) {
					entity = new ResponseEntity<String>("ok", HttpStatus.OK);
				} else {
					entity = new ResponseEntity<String>("no", HttpStatus.OK);
				}
			} catch (Exception e) {
				entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}
		}
		return entity;
	}
}
