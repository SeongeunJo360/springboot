package com.springboot.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    @GetMapping("/login")
    public String login(){
        return "login";     //로그인 화면, view name --> templates
    }

    @
}
