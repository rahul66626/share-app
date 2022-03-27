package com.xyz.shareapp.sevice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.shareapp.controller.CacheController;
import com.xyz.shareapp.domain.StockMaster;
import com.xyz.shareapp.util.DataUtil;

@Service
public class StockService {
	
	@Autowired
	private DataUtil du;
	
	private Logger logger = (Logger) LoggerFactory.getLogger(StockService.class);
	
	public List<StockMaster> getStocks(){
		logger.info("In getStocks Method");
		return du.getAllStocks();
	}
	
	public void stockJob() {
		logger.info("In stockJob Method");
		List<StockMaster> stockList = du.getItStocks();
		logger.info("stockList size is "+CacheController.mainMap.size());
		logger.info("stockList size is "+stockList.size());
		for(StockMaster stk : stockList) {
			CacheController.mainMap.put(stk.getName(), stk.getFullName());
		}
		logger.info("Job Completed size is "+CacheController.mainMap.size());
	}
}
