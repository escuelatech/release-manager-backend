package com.escuela.releasemanager.service;

import com.escuela.releasemanager.model.ProjectModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {

    List<ProjectModel> getAllProjects();
}
