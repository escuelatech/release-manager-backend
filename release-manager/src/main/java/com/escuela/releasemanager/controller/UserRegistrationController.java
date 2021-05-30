package com.escuela.releasemanager.controller;

import com.escuela.releasemanager.db.models.RegisterUser;
import com.escuela.releasemanager.db.models.ReleaseInfo;
import com.escuela.releasemanager.jpa.repositories.UserRepository;
import com.escuela.releasemanager.model.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class UserRegistrationController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/getall")
    ResponseEntity<ResponseModel> getAllUsers() {
        ResponseModel responseModel=new ResponseModel();
        responseModel.setData(userRepository.findAll());
        return ResponseEntity.ok(responseModel);
    }

    @PostMapping("/register")
    ResponseEntity<?> registerUser(@RequestBody RegisterUser registerUser) {
        userRepository.save(registerUser);
        ResponseModel responseModel=new ResponseModel();
        responseModel.setData("Success");
        responseModel.setResponseCode("200");
//        return ResponseEntity.ok(responseModel);
        return ResponseEntity.ok(responseModel);
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
