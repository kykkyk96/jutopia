package com.jtp.jutopia.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestMainController {

	@GetMapping("/index")
    public String indexPage() {
        return "index";
    }
}
