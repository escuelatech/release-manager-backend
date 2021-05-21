package com.escuela.releasemanager.controller;

import com.escuela.releasemanager.db.models.ProjectRegistration;
import com.escuela.releasemanager.model.ProjectModel;
import com.escuela.releasemanager.model.ResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectRegistrationConroller {

    @GetMapping("/getall")
    public ResponseEntity<ResponseModel> getProjectDetails() {
        return ResponseEntity.ok(new ResponseModel());
    }

    @PostMapping("/register")
    public ResponseEntity<ResponseModel> register(@RequestBody ProjectRegistration projectRegistration) {
        return ResponseEntity.ok(new ResponseModel());
    }

}
