package erp.gw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/groupware/image_board/*")
public class ImageBoardController {

	@RequestMapping(value="imageboard_list", method=RequestMethod.GET)
	public String imageList(Model model)throws Exception{
		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/image_board/imageboard_list.jsp");
		return "/main";
	}
}
