package com.escuela.releasemanager.service;

import com.escuela.releasemanager.client.JiraClient;
import com.escuela.releasemanager.model.ProjectModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProjectServiceImpl implements ProjectService {


    @Autowired
    JiraClient jiraClient;

    @Override
    public List<ProjectModel> getAllProjects() {
        return jiraClient.getAllProjects();
    }
}
