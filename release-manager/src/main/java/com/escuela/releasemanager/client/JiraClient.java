package com.escuela.releasemanager.client;

import com.escuela.releasemanager.model.ProjectModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface JiraClient {

    List<ProjectModel> getAllProjects();
}
