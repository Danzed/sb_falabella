package com.test.falabella;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.test.falabella.api.LocalRestApi;
import com.test.falabella.api.models.Local;
import com.test.falabella.entity.LocalEntity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class FalabellaApplication {
	
	private static final Logger logger = LogManager.getLogger(FalabellaApplication.class);

	public static void main(String[] args) {
		logger.info("INIT: Initialise Applications");
		SpringApplication.run(FalabellaApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		logger.info("INIT: Init Rest Template API");
		return builder.build();
	}
//
	@Bean
	public Boolean run(RestTemplate restTemplate) throws Exception {
		logger.info("INIT: Init Consumer API Local");
		
		logger.info("INIT: Configure MediaType");
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));        
		messageConverters.add(converter);  
		restTemplate.setMessageConverters(messageConverters);
		
		logger.info("INIT: Consumer API Local");
		ResponseEntity<Local[]> response = restTemplate.getForEntity(
				"https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region=7", Local[].class);
		
//		MapperManager mapperManager = new MapperManager();		
		
		Local[] locales = response.getBody();
		
//		LocalEntity localEntity = mapperManager.map(locales[0], LocalEntity.class);
//		logger.info("INIT: Finish Consumer API Local " + localEntity.getComuna_nombre());
		return true;

	}

}
