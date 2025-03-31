package com.example.scout_back.service;

import com.example.scout_back.entity.UserType;
import com.example.scout_back.repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTypeService {

    @Autowired
    private UserTypeRepository userTypeRepository;

    public List<UserType> getAll(){
        return userTypeRepository.findAll();
    }
}
