package com.escuela.releasemanager.api.service;

import com.escuela.releasemanager.model.IssueSearchModel;
import com.escuela.releasemanager.model.ProjectModel;
import com.escuela.releasemanager.model.ResponseModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface JiraService {

    ResponseModel getAllJiraProjects();

    IssueSearchModel getProjectIssuesByLabel(String project, String labels);
}
