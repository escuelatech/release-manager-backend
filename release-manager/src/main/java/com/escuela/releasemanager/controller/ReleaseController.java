package com.escuela.releasemanager.controller;

import com.escuela.releasemanager.db.models.ReleaseInfo;
import com.escuela.releasemanager.model.ResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create/release")
    ResponseEntity<?> newEmployee(@RequestBody ReleaseInfo newEmployee) {
        return ResponseEntity.ok(new ArrayList<String>());
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
