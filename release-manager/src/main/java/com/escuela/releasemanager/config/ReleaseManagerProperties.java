package com.escuela.releasemanager.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
public class ReleaseManagerProperties {

    @Value("${release-manager.api-user}")
    private  String apiUser;

    @Value("${release-manager.api-key}")
    private  String apiKey;


    public ReleaseManagerProperties() {
    }

    public String getApiUser() {
        return apiUser;
    }

    public void setApiUser(String apiUser) {
        this.apiUser = apiUser;
    }

    public String getApiKey() {
        return apiKey;
    }


    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
