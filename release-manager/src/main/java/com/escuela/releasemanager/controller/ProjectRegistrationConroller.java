package com.escuela.releasemanager.controller;

import com.escuela.releasemanager.model.ProjectModel;
import com.escuela.releasemanager.model.ResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mapping")
public class ProjectRegistrationConroller {

    @GetMapping("/getall")
    public ResponseEntity<ResponseModel> getProjectDetails() {
        return ResponseEntity.ok(new ResponseModel());
    }

}
