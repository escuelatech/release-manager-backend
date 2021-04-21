package com.escuela.releasemanager.api.service.service.impl;

import com.escuela.releasemanager.api.service.JiraService;
import com.escuela.releasemanager.config.ReleaseManagerProperties;
import com.escuela.releasemanager.model.IssueSearchModel;
import com.escuela.releasemanager.model.ProjectModel;
import com.escuela.releasemanager.model.ResponseModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;

@Component
public class JiraServiceImpl implements JiraService {

    public JiraServiceImpl(RestTemplate restClient,ReleaseManagerProperties properties){
        this.restClient=restClient;
        this.properties=properties;
    }

    RestTemplate restClient;
    ReleaseManagerProperties properties;

    @Override
    public ResponseModel getAllJiraProjects() {
        UriComponents uriComponents = UriComponentsBuilder.fromUriString(properties.getJiraApiUrl()).path("/rest/api/2/project").build();
        ResponseEntity<ProjectModel[]> responseEntity = restClient.exchange(uriComponents.toUriString(), HttpMethod.GET,
                new HttpEntity<>(extractAuthHeader()), ProjectModel[].class);
        ResponseModel responseModel = new ResponseModel();
        responseModel.setData(Arrays.asList(responseEntity.getBody()));
        return responseModel;
    }

    @Override
    public IssueSearchModel getProjectIssuesByLabel(String project, String labels) {
        UriComponents uriComponents = UriComponentsBuilder.fromUriString(properties.getJiraApiUrl())
                .path("/rest/api/2/search").query("jql=project={project} AND labels in ({labels})").buildAndExpand(project, labels);
        ResponseEntity<IssueSearchModel> responseEntity = restClient.exchange(uriComponents.toUriString(),
                        HttpMethod.GET, new HttpEntity<>(extractAuthHeader()), IssueSearchModel.class);
        return responseEntity.getBody();
    }

    private HttpHeaders extractAuthHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth(properties.getJiraApiUser(), properties.getJiraApiKey());
        return headers;
    }
}
