package com.escuela.releasemanager.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebConfig {

    @Bean("restClient")
    @Primary
    public RestTemplate restClient() {
        return new RestTemplate();
    }

}
