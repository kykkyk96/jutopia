package com.jtp.jutopia.web.member.controller;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member")
public class MemberController {
    private Logger log = LoggerFactory.getLogger(MemberController.class);
    private final String logTitleMsg = "MemberController";

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("member/login");
        return modelAndView;
    }
}
