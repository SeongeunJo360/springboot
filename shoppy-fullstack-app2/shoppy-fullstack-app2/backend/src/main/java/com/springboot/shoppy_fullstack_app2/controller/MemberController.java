package com.springboot.shoppy_fullstack_app2.controller;

import com.springboot.shoppy_fullstack_app2.dto.Member;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
@CrossOrigin(origins = {"http://localhost:3000", })
public class MemberController {

    @PostMapping("/signup")
    public boolean signup(@RequestBody Member member){
        boolean result = false;
        System.out.println(member.getId());
        System.out.println(member.getPwd());
        System.out.println(member.getEmail());
        System.out.println(member.getPhone());
        System.out.println(member.getClass());
        return result;
    }

    @PostMapping("/login")
    public boolean login(@RequestBody Member member) {
        boolean result = false;
        if(member.getId().equals("test") && member.getPwd().equals("1234")) {
            result = true;
        }

        return result;
    }
}
