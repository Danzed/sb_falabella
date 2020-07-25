package com.test.falabella.api;

import javax.annotation.PostConstruct;

import com.test.falabella.service.impl.LocalServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/local")
@Slf4j
public class LocalRestApi {

	@Autowired
	LocalServiceImpl localService;

	@RequestMapping(method = RequestMethod.GET, value = "/{comuna}")
	public String Get(@PathVariable("comuna") String comuna) {
		log.info("API: getBuild");
		return "Hola Mundo";
	}

	@PostConstruct
	public void GetAndSaveLocal() {
		log.info("API: INIT PostConstruct");

		localService.GetAndSaveLocalApi();
	}

}