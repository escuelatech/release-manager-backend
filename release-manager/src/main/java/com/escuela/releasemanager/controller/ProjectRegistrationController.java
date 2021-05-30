package com.escuela.releasemanager.controller;

import com.escuela.releasemanager.db.models.ProjectRegistration;
import com.escuela.releasemanager.jpa.repositories.ProjectRegistrationRepository;
import com.escuela.releasemanager.model.ProjectModel;
import com.escuela.releasemanager.model.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/project")
public class ProjectRegistrationController {

    @Autowired
    ProjectRegistrationRepository projectRegistrationRepository;

    @GetMapping("/getall")
    public ResponseEntity<List<ProjectRegistration>> getProjectDetails() {
        return ResponseEntity.ok(projectRegistrationRepository.findAll());
    }

    @PostMapping("/register")
    public ResponseEntity<ResponseModel> register(@RequestBody ProjectRegistration projectRegistration) {
        projectRegistrationRepository.save(projectRegistration);
        return ResponseEntity.ok(new ResponseModel());
    }

}
