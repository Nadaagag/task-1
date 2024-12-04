package com.example.demo.service;

import org.springframework.stereotype.Service;
//Marks this class as a service in the Spring Framework
@Service
public class MyService {
    public String getMessage() {
        return "Team Anti Bug";
    }
}
