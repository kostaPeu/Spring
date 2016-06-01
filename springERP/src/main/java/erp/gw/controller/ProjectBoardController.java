package erp.gw.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import erp.gw.projectboard.domain.PageMaker;
import erp.gw.projectboard.domain.SearchCriteria;
import erp.gw.projectboard.service.ProjectBoardService;

@Controller
@RequestMapping("/groupware/project_board")
public class ProjectBoardController {
	
	@Inject
	private ProjectBoardService service;
	
	@RequestMapping(value="/pb_myproject_list", method=RequestMethod.GET)
	public void myProjectList(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception{		

		model.addAttribute("list", service.listSearchCriteria(cri));

		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.listSearchCount(cri));
		model.addAttribute("pageMaker", pageMaker);
	}
}
