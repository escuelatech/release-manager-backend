package com.escuela.releasemanager.service;

import com.escuela.releasemanager.api.GitRepositoryService;
import com.escuela.releasemanager.config.ReleaseManagerProperties;
import com.escuela.releasemanager.model.RepositoryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

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
        ResponseEntity<RepositoryModel[]> responseEntity = restClient.exchange("https://api.github.com/user/repos", HttpMethod.GET, new HttpEntity<>(headers), RepositoryModel[].class);
        return Arrays.asList(responseEntity.getBody());
    }
}
