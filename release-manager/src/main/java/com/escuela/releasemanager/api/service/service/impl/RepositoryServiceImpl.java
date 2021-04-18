package com.escuela.releasemanager.api.service.service.impl;

import com.escuela.releasemanager.api.service.GitRepositoryService;
import com.escuela.releasemanager.config.ReleaseManagerProperties;
import com.escuela.releasemanager.model.RepositoryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.List;

@Component
public class RepositoryServiceImpl implements GitRepositoryService {

    @Autowired
    RestTemplate restClient;

    @Autowired
    ReleaseManagerProperties properties;

    @Override
    public List<RepositoryModel> getAllRepositories() {
        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth(properties.getGithubApiUser(), properties.getGithubApiKey());
        UriComponents uriComponents = UriComponentsBuilder.fromUriString(properties.getGithubApiUrl()).path("/user/repos").build();
        ResponseEntity<RepositoryModel[]> responseEntity = restClient.exchange(uriComponents.toUriString(),
                HttpMethod.GET, new HttpEntity<>(headers), RepositoryModel[].class);
        return Arrays.asList(responseEntity.getBody());
    }
}
