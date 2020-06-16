package com.test.falabella.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/local")
public class LocalRestApi {
	private static final Logger logger = LogManager.getLogger(LocalRestApi.class);
	
	@GetMapping("/")
	public ResponseEntity<?> Get() {
		logger.info("API: getBuild");
		return null;
	}

}
