package com.example.demo.controller;

import com.example.demo.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(Member member){
        String result = "";
        if(member.getId().equals("hong")
                && member.pass().equals("1234")) result = "succ";

        return "login"; //view name: succ.html
    }
}
