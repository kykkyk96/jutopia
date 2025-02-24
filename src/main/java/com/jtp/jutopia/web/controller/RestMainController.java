package com.jtp.jutopia.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RestMainController {
    
    @GetMapping("/index")
    public String test() {
        return "index";
    }
    
}
