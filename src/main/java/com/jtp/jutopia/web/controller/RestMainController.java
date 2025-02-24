package com.jtp.jutopia.web.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class RestMainController {
    
    @GetMapping("/api/data")
    public String test() {
        return "hello";
    }
    
}
