package com.example.demo.controller;

import com.example.demo.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//Marks the class as a controller in Spring.
//It tells Spring that this class handles HTTP requests and returns responses in JSON or plain text.
@RestController
public class MyController {

    private final MyService myService;

    // Constructor-based dependency injection
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/message")
    public String getMessage() {
        return myService.getMessage();
    }
}
