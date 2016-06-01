package erp.sale.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import erp.sale.domain.SaleListView;
import erp.sale.domain.SaleVO;
import erp.sale.service.SaleService;

@Controller
@RequestMapping("/sale/*")
public class SaleController {
	
	@Inject
	private SaleService service;
	
	@RequestMapping(value="sale_add", method=RequestMethod.GET)
	public String saleAddGET(Model model)throws Exception{
		model.addAttribute("left", "sale/sale.jsp");
		model.addAttribute("contents", "sale/sale_add.jsp");
		return "/main";
	}
	@RequestMapping(value="sale_add", method=RequestMethod.POST)
	public String saleAddPOST(SaleVO vo,Model model)throws Exception{
		service.insertSale(vo);
		return "redirect:sale_check";
	}
	@RequestMapping(value="sale_check")
	public String saleList(Model model)throws Exception{
		List<SaleListView> list = service.listSale();
		model.addAttribute("left", "sale/sale.jsp");
		model.addAttribute("contents", "sale/sale_check.jsp");
		model.addAttribute("list", list);
		return "/main";
	}
}
