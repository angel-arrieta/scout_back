package com.example.scout_back.controller;

import com.example.scout_back.entity.UserType;
import com.example.scout_back.service.UserTypeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Data
@RequestMapping("/userType")
public class UserTypeController {

    @Autowired
    private UserTypeService  userTypeService;

    @GetMapping
    public ResponseEntity<List<UserType>> getAll(){
        return ResponseEntity.ok(userTypeService.getAll());
    }
}
