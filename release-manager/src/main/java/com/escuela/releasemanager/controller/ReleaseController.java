package com.escuela.releasemanager.controller;

import com.escuela.releasemanager.db.models.ReleaseInfo;
import com.escuela.releasemanager.jpa.repositories.ReleaseRepository;
import com.escuela.releasemanager.model.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("jira")
public class ReleaseController {

//    @GetMapping("/employees")
//    ResponseEntity<List<?>> all() {
//        return ResponseEntity.ok(new ArrayList<String>());
//    }

    @Autowired
    ReleaseRepository releaseRepository;


    @PostMapping("/create/release")
    ResponseEntity<ResponseModel> newEmployee(@RequestBody ReleaseInfo releaseInfo) {
        releaseRepository.save(releaseInfo);
        ResponseModel responseModel=new ResponseModel();
        responseModel.setData("Success");
        responseModel.setResponseCode("200");
        return ResponseEntity.ok(responseModel);
    }

    @GetMapping("/get/all/releases")
    ResponseEntity<?> getAllReleases() {
        return ResponseEntity.ok(releaseRepository.findAll());
    }

//    @PutMapping("/employees/{id}")
//    ResponseEntity<Object> replaceEmployee(@RequestBody Object newEmployee, @PathVariable Long id) {
//        return ResponseEntity.ok(new ArrayList<String>());
//    }
//
//    @DeleteMapping("/employees/{id}")
//    void deleteEmployee(@PathVariable Long id) {
//    }
}
