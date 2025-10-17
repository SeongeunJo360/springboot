package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

    @GetMapping("/string")
    public String string() {
        System.out.println("Spring!!!");
        return "spring";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
