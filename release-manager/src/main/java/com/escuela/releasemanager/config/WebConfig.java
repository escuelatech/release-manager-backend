package com.escuela.releasemanager.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebConfig {

    @Autowired
    ReleaseManagerProperties properties;

    @Bean("restClient")
    @Primary
    public RestTemplate restClient() {
        RestTemplate restTemplate = new RestTemplateBuilder()
                .basicAuthentication(properties.getApiUser(), properties.getApiKey()).build();
        return restTemplate;
    }

}
