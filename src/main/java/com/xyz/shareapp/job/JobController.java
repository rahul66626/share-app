package com.xyz.shareapp.job;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.shareapp.controller.CacheController;
import com.xyz.shareapp.sevice.StockService;

@RestController
@RequestMapping("/job")
public class JobController {
	
	@Autowired
	private StockService stockService;

private Logger logger = (Logger) LoggerFactory.getLogger(CacheController.class);
	
	@GetMapping("/time")
	public String getExecutionTime() {
		logger.info("Job Triggered and executing.");
		stockService.stockJob();
		return "Job Completed time is "+new Date();
	}
}
