package com.escuela.releasemanager.controller;

import com.escuela.releasemanager.db.models.ReleaseInfo;
import com.escuela.releasemanager.model.ResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserRegistrationController {

    @GetMapping("/getall")
    ResponseEntity<List<?>> getAllUsers() {
        return ResponseEntity.ok(new ArrayList<String>());
    }

    @PostMapping("/register")
    ResponseEntity<?> registerUser(@RequestBody Object newEmployee) {
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
