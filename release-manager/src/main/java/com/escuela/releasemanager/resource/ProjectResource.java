package com.escuela.releasemanager.resource;

import com.escuela.releasemanager.config.ReleaseManagerProperties;
import com.escuela.releasemanager.model.ProjectModel;
import com.escuela.releasemanager.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping("projects/")
public class ProjectResource {


    @Autowired
    ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<ProjectModel>> getProjectDetails(){
        return ResponseEntity.ok(projectService.getAllProjects());

    }
}
