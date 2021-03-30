package com.escuela.releasemanager.controller;

import com.escuela.releasemanager.model.ProjectModel;
import com.escuela.releasemanager.api.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("projects/")
public class ProjectController {


    @Autowired
    ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<ProjectModel>> getProjectDetails(){
        return ResponseEntity.ok(projectService.getAllProjects());

    }
}
