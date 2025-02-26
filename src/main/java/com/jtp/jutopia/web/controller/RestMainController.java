package com.jtp.jutopia.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestMainController {

	@GetMapping("/")
    public String mainPage() {
        return "main";
    }
	@GetMapping("/index")
    public String indexPage() {
        return "index";
    }
}
