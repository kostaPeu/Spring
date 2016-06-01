package erp.acc.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import erp.acc.basic.service.BasicAccountService;

@Controller
@RequestMapping("/basic")
public class BasicAccountController {
	
	@Inject
	private BasicAccountService service;
	
}
