package com.escuela.releasemanager.service;

import com.escuela.releasemanager.api.ProjectService;
import com.escuela.releasemanager.config.ReleaseManagerProperties;
import com.escuela.releasemanager.model.ProjectModel;
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
public class ProjectServiceImpl implements ProjectService {


    @Autowired
    RestTemplate restClient;

    @Autowired
    ReleaseManagerProperties properties;

    @Override
    public List<ProjectModel> getAllProjects() {

        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth(properties.getApiUser(), properties.getApiKey());
        ResponseEntity<ProjectModel[]> responseEntity = restClient.exchange("https://escuelatech.atlassian.net/rest/api/2/project", HttpMethod.GET, new HttpEntity<>(headers), ProjectModel[].class);
        return Arrays.asList(responseEntity.getBody());
    }
}
