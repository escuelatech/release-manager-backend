package com.escuela.releasemanager.api.service;

import com.escuela.releasemanager.model.ProjectModel;
import com.escuela.releasemanager.model.RepositoryModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GitRepositoryService {

    List<RepositoryModel> getAllRepositories();
}
