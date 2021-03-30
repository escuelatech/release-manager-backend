package com.escuela.releasemanager.controller;

import com.escuela.releasemanager.api.RepositoryService;
import com.escuela.releasemanager.model.ProjectModel;
import com.escuela.releasemanager.model.RepositoryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("repositories")
public class RepositoryController {

    @Autowired
    RepositoryService repositoryService;

    @GetMapping
    public ResponseEntity<List<RepositoryModel>> getProjectDetails(){
        return ResponseEntity.ok(repositoryService.getAllRepositories());

    }
}
