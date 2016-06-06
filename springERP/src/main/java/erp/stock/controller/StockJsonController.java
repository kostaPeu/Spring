package erp.stock.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import erp.stock.domain.StockCalendar;
import erp.stock.service.StockRPService;

@RestController
@RequestMapping("/stock/rp/*")
public class StockJsonController {

	@Inject
	private StockRPService service;
	
	@RequestMapping("/calendar")
	public List<StockCalendar> stockCalendar() throws Exception{
		
		return service.stockCalendarJson();
	}
}
