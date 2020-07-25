package com.test.falabella.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.test.falabella.MapperManager;
import com.test.falabella.entity.LocalEntity;
import com.test.falabella.model.Local;
import com.test.falabella.repository.LocalRepository;
import com.test.falabella.service.ILocalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyExtractors;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class LocalServiceImpl implements ILocalService {

    @Autowired
    private LocalRepository localRepository;

    private final WebClient webClient;

    public LocalServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://farmanet.minsal.cl")
                .filter(contentTypeInterceptor())
                .build();
    }

    private ExchangeFilterFunction contentTypeInterceptor() {
        return ExchangeFilterFunction.ofResponseProcessor(clientResponse -> 
            Mono.just(
                    ClientResponse
                        .from(clientResponse) //clientResponse  is immutable, so,we create a clone. but from() only clones headers and status code
                        .headers(headers -> headers.remove(HttpHeaders.CONTENT_TYPE)) //override the content type
                        .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                        .build()));
    }

    @Override
    public void GetAndSaveLocalApi() {
        log.info("LOCALSERVICE: Init Consumer API Local");

        Mono<Local[]> localResponse = this.webClient.get().uri("/maps/index.php/ws/getLocalesRegion?id_region=7").retrieve().bodyToMono(Local[].class).log();
        log.info("LOCALSERVICE: " + localResponse.block());

        // log.info("INIT: Configure MediaType");
        // List<HttpMessageConverter<?>> messageConverters = new
        // ArrayList<HttpMessageConverter<?>>();
        // MappingJackson2HttpMessageConverter converter = new
        // MappingJackson2HttpMessageConverter();
        // converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        // messageConverters.add(converter);
        // restTemplate.setMessageConverters(messageConverters);

        // log.info("INIT: Consumer API Local");
        // ResponseEntity<Local[]> response = restTemplate.getForEntity(
        // "https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region=7",
        // Local[].class);
        // log.info("INIT: Finish Consumer API Local ");
        // MapperManager mapperManager = new MapperManager();

        // Local[] locales = response.getBody();
        // log.info("INIT: Init Save Entity Local Foreach Mapper");
        // Arrays.asList(locales).forEach((x) -> {
        // localRepository.save(mapperManager.map(x, LocalEntity.class));
        // });
        // log.info("INIT: Finish Save Entity Local Foreach Mapper");
    }

}