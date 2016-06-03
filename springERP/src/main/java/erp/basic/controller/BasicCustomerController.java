package erp.basic.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import erp.basic.domain.Customer;
import erp.basic.service.BasicCustomerService;

@Controller
@RequestMapping("/basic/customer/*")
public class BasicCustomerController {
	
	@Inject
	private BasicCustomerService service;
	
	@RequestMapping("list")
	public String customerList(Model model)throws Exception{
		
		model.addAttribute("left","basic/basic.jsp");
		model.addAttribute("contents","basic/basic_customerList.jsp");
		model.addAttribute("list", service.customerList());
		return "/main";
	}
	@RequestMapping("getCustomer")
	@ResponseBody
	public List<Customer> getCustomer(@RequestParam("customer_id") String customer_id,Model model)throws Exception{
		return service.getCustomer(customer_id);
	}
	@RequestMapping("update")
	public String customerUpdate(Customer customer)throws Exception{
		service.customerUpdate(customer);
		return "redirect:/basic/customer/list";
	}
	@RequestMapping("insert")
	public String customerInsert(Customer customer)throws Exception{
		service.customerInsert(customer);
		return "redirect:/basic/customer/list";
	}
	@RequestMapping("delete")
	public String customerDelete(@RequestParam("checks") String customer_id)throws Exception{
		service.customerDelete(customer_id);
		return "redirect:/basic/customer/list";
	}
}
