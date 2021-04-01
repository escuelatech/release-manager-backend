package com.escuela.releasemanager.controller;

import com.escuela.releasemanager.model.ProjectModel;
import com.escuela.releasemanager.api.JiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("jira")
public class JIraController {


    @Autowired
    JiraService jiraService;

    @GetMapping("/getall")
    public ResponseEntity<List<ProjectModel>> getProjectDetails(){
        return ResponseEntity.ok(jiraService.getAllJiraProjects());

    }
}
