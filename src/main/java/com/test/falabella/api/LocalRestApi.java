package com.test.falabella.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/local")
public class LocalRestApi {
	private static final Logger logger = LogManager.getLogger(LocalRestApi.class);
	
	@RequestMapping(method = RequestMethod.GET, value="/{comuna}", produces={"application/json","application/xml"})
	public ResponseEntity<?> Get(@PathVariable("comuna") String comuna) {
		logger.info("API: getBuild");
		return null;
	}

}
