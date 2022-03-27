package com.xyz.shareapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.shareapp.domain.StockMaster;
import com.xyz.shareapp.sevice.StockService;

@RestController
@RequestMapping("/stock")
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	private Logger logger = (Logger) LoggerFactory.getLogger(StockController.class);
	
	@GetMapping("/getstocks")
	public ResponseEntity<List<StockMaster>> getFromCache() {
		logger.info("Displaying all stocks");
		return ResponseEntity.ok()
		        .body(stockService.getStocks());
	}
}
