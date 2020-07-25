package com.test.falabella;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class FalabellaApplication {

	public static void main(String[] args) {
		log.info("INIT: Initialise Applications");
		SpringApplication.run(FalabellaApplication.class, args);
	}

}
