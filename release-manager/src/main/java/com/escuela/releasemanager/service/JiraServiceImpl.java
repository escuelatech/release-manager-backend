package com.escuela.releasemanager.service;

import com.escuela.releasemanager.api.JiraService;
import com.escuela.releasemanager.config.ReleaseManagerProperties;
import com.escuela.releasemanager.model.IssueModel;
import com.escuela.releasemanager.model.IssueSearchModel;
import com.escuela.releasemanager.model.ProjectModel;
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
public class JiraServiceImpl implements JiraService {


    @Autowired
    RestTemplate restClient;

    @Autowired
    ReleaseManagerProperties properties;

    @Override
    public List<ProjectModel> getAllJiraProjects() {

        ResponseEntity<ProjectModel[]> responseEntity = restClient.exchange("https://escuelatech.atlassian.net/rest/api/2/project", HttpMethod.GET, new HttpEntity<>(extractAuthHeader()), ProjectModel[].class);
        return Arrays.asList(responseEntity.getBody());
    }

    @Override
    public IssueSearchModel getProjectIssuesByLabel(String labels) {

        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("escuelatech.atlassian.net")
                .path("/rest/api/2/search").query("jql=labels in ({labels})").buildAndExpand(labels);

        ResponseEntity<IssueSearchModel> responseEntity = restClient.exchange(uriComponents.toUriString(), HttpMethod.GET, new HttpEntity<>(extractAuthHeader()), IssueSearchModel.class);
  return responseEntity.getBody();

    }


    private HttpHeaders extractAuthHeader(){
        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth(properties.getJiraApiUser(), properties.getJiraApiKey());
        return headers;
    }
}
