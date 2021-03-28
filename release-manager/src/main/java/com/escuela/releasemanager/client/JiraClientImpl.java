package com.escuela.releasemanager.client;

import com.escuela.releasemanager.model.ProjectModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class JiraClientImpl implements JiraClient {

    @Autowired
    RestTemplate restClient;

    @Override
    public List<ProjectModel> getAllProjects() {

        List<ProjectModel> projectModelList;

        ResponseEntity<ProjectModel[]> responseEntity = restClient.getForEntity("https://escuelatech.atlassian.net/rest/api/2/project", ProjectModel[].class);
        return Arrays.asList(responseEntity.getBody());
    }
}
