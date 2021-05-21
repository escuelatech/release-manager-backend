package com.escuela.releasemanager.controller;

import com.escuela.releasemanager.api.service.JiraService;
import com.escuela.releasemanager.model.IssueSearchModel;
import com.escuela.releasemanager.model.ProjectModel;
import com.escuela.releasemanager.model.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("jira")
public class JiraController {

    @Autowired
    JiraService jiraService;

    @GetMapping("/getall")
    public ResponseEntity<ResponseModel> getProjectDetails() {
        return ResponseEntity.ok(jiraService.getAllJiraProjects());
    }

    @GetMapping("/getall/issues")
    public ResponseEntity<IssueSearchModel> getProjectIssuesByLabel(@RequestParam(name = "project") String project,
                                                                    @RequestParam(name = "labels") String labels) {
        return ResponseEntity.ok(jiraService.getProjectIssuesByLabel(project, labels));
    }

    @GetMapping("/release/issues/bylabel/{project}/{label}")
    public ResponseEntity<IssueSearchModel> getProjectReleaseIssuesByLabel(@PathVariable String project,
                                                                    @PathVariable String label) {
        return ResponseEntity.ok(jiraService.getProjectIssuesByLabel(project, label));
    }
}
