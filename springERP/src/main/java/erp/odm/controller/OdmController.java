package erp.odm.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import erp.sale.domain.Goods_data;

@Controller
@RequestMapping("/odm/*")
public class OdmController {
	
	@RequestMapping("/test")
	public String test(Model model) throws Exception{
		
		model.addAttribute("left","odm/odm.jsp");
		model.addAttribute("contents","odm/odmTest.jsp");
		
		return "/main";
	}
	
	@RequestMapping("/odm_collectForm")
	public String odm_collectForm(Model model) throws Exception{
		
//		Date date = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//		
//		String day = sdf.format(date);
//		
//		System.out.println(day);
//		
//		model.addAttribute("day", day);
		model.addAttribute("left","odm/odm.jsp");
		model.addAttribute("contents","odm/odm_orderCollect.jsp");
		
		return "/main";
	}
	
	@RequestMapping("/orderCollect")
	public String orderCollect(@RequestParam(value="checks", defaultValue="") String checks, Model model) throws Exception{
		
		model.addAttribute("checks", checks);
		model.addAttribute("left","odm/odm.jsp");
		model.addAttribute("contents","odm/odm_orderList.jsp");
		
		return "/main";
	}

}
