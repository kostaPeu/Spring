package erp.pch.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import erp.basic.domain.Product;
import erp.pch.domain.Customer;
import erp.pch.domain.PurchaseListView;
import erp.pch.domain.PurchaseSearch;
import erp.pch.domain.PurchaseVO;
import erp.pch.domain.GetWareHouse;
import erp.pch.service.PurchaseService;

@Controller
@RequestMapping("/purchase/*")
public class PurchaseController {
	
	@Inject
	private PurchaseService service;
	
	@RequestMapping(value="purchase_add", method = RequestMethod.GET)
	public String purchase_addGET(Model model)throws Exception{
		model.addAttribute("left", "purchase/purchase.jsp");
		model.addAttribute("contents", "purchase/purchase_add.jsp");
		return "/main";
	}
	@RequestMapping(value="purchase_add", method = RequestMethod.POST)
	public String purchase_addPOST(PurchaseVO vo)throws Exception{
		service.insertPch(vo);
		return "redirect:purchase_check";
	}
	@RequestMapping("purchase_check")
	public String purchase_check(Model model)throws Exception{
		List<PurchaseListView> list = service.detailPch();
		model.addAttribute("left", "purchase/purchase.jsp");
		model.addAttribute("contents", "purchase/purchase_check.jsp");
		model.addAttribute("list", list);
		return "/main";
	}
	@RequestMapping("purchase_delete")
	public String purchase_delete(@RequestParam("array") String[] array) throws Exception{
		for(int i=0;i<array.length;i++){
			service.delete(array[i]);
		}
		return "redirect:purchase_check";
	}
	@RequestMapping("customer_id_search")
	@ResponseBody
	public List<Customer> customerIdSearch(@RequestParam("customer_id") String customer_id)throws Exception{
		return service.customerList(customer_id);
	}
	@RequestMapping("product_id_search")
	@ResponseBody
	public List<Product> productIdSearch(@RequestParam("product_id") String product_id)throws Exception{
		return service.productList(product_id);
	}
	@RequestMapping("warehouse_id_search")
	@ResponseBody
	public List<GetWareHouse> warehouseIdSearch(@RequestParam("warehouse_id") String warehouse_id)throws Exception{
		return service.warehouseList(warehouse_id);
	}
	
	@RequestMapping(value="purchase_search", method = RequestMethod.POST)
	public String purchase_searchPOST(PurchaseSearch ps ,Model model)throws Exception{
		List<PurchaseListView> list = service.purchaseSearch(ps);
		model.addAttribute("left", "purchase/purchase.jsp");
		model.addAttribute("contents", "purchase/purchase_searchList.jsp");
		model.addAttribute("list", list);
		return "/main";
	}
	@RequestMapping(value="purchase_search", method = RequestMethod.GET)
	public String purchase_searchGET(PurchaseSearch ps, Model model)throws Exception{
		model.addAttribute("left", "purchase/purchase.jsp");
		model.addAttribute("contents", "purchase/purchase_search.jsp");
		return "/main";
	}
	
	
}
