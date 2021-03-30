package com.escuela.releasemanager.api;

import com.escuela.releasemanager.model.ProjectModel;
import com.escuela.releasemanager.model.RepositoryModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RepositoryService {

    List<RepositoryModel> getAllRepositories();
}
