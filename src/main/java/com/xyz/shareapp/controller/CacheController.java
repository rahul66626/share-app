package com.xyz.shareapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cache")
public class CacheController {
	
	public static Map<String,String> mainMap = new HashMap<String,String>();
	private Logger logger = (Logger) LoggerFactory.getLogger(CacheController.class);
	
	@GetMapping("/add/{key}/{value}")
	public ResponseEntity<String> pushToCache(@PathVariable String key,@PathVariable String value) {
		logger.info("Adding values to cache");
		if(null != key && !key.isEmpty()) {
			logger.info("Adding values to cache key is not null");
			mainMap.put(key, value);
			return ResponseEntity.ok()
					.header("Cache Name", "mainMap")
			        .body("Data Added to Cache");
		}
		logger.info("Adding values to cache key is null");
		return ResponseEntity.ok()
		        .header("Cache Name", "mainMap")
		        .header("size", String.valueOf(mainMap.size()))
		        .body("Data Failed to Add in Cache");
	}
		
	@GetMapping("/display")
	public ResponseEntity<Map<String,String>> getFromCache() {
		logger.info("Displays values in cache");
		return ResponseEntity.ok()
				.header("Cache Name", "mainMap")
		        .header("size", String.valueOf(mainMap.size()))
		        .body(mainMap);
	}
	
	@RequestMapping("/logs")
    public String index() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        return "Howdy! Check out the Logs to see the output...";
    }
	
	
	

}
