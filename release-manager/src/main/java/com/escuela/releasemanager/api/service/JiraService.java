package com.escuela.releasemanager.api.service;

import com.escuela.releasemanager.model.IssueSearchModel;
import com.escuela.releasemanager.model.ProjectModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface JiraService {

    List<ProjectModel> getAllJiraProjects();

    IssueSearchModel getProjectIssuesByLabel(String project, String labels);
}
