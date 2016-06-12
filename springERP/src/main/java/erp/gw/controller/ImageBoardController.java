package erp.gw.controller;

import java.io.File;
import java.util.Map;

import javax.inject.Inject;

import org.apache.wicket.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import erp.gw.imageboard.domain.ImageBoardVO;
import erp.gw.imageboard.service.ImageBoardService;

@Controller
@RequestMapping("/groupware/image_board/*")
public class ImageBoardController {

	@Inject
	private ImageBoardService service;
	
	@RequestMapping(value="imageboard_list", method=RequestMethod.GET)
	public String imageList(Model model)throws Exception{
		model.addAttribute("left", "groupware/groupware.jsp");
		model.addAttribute("contents", "groupware/image_board/imageboard_list.jsp");
		return "/main";
	}
	@RequestMapping("imageAdd")
	public String imageAdd(MultipartHttpServletRequest request, Model model)throws Exception{
		Map<String, MultipartFile> files = request.getFileMap();
		CommonsMultipartFile cmf = (CommonsMultipartFile) files.get("excelFile");
		String path ="c:/upload/"+cmf.getOriginalFilename();
		File file = new File(path);
		cmf.transferTo(file);
		
		ImageBoardVO vo = new ImageBoardVO();
		vo.setImgfile_name(path);
		vo.setEmp_id("1");
		service.insertImage(vo);
		return "/main";
	}
	/*@RequestMapping("excelUp")
	public String purchase_ExcelUp(MultipartHttpServletRequest request, Model model)throws Exception{
		
		Map<String, MultipartFile> files = request.getFileMap();
		CommonsMultipartFile cmf = (CommonsMultipartFile) files.get("excelFile");
		
		String path ="c:/upload/"+cmf.getOriginalFilename();
		File file = new File(path);
		cmf.transferTo(file);
		service.uploadExcel(path);
		return "redirect:purchase_check";
	}*/
}
