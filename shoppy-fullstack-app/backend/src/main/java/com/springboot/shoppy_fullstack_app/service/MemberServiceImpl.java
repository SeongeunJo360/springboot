package com.springboot.shoppy_fullstack_app.service;System.out.println("-- memberRepository save --");
        System.out.println(member.getId());

import com.springboot.shoppy_fullstack_app.dto.Member;
import com.springboot.shoppy_fullstack_app.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public boolean idCheck(String id) {
        boolean result = false;
        int count=memberRepository.findById(id);
        if(count==0)result=true;
        return result;
    }
    @Override
    public void signup(Member member) {
        memberRepository.save(member);
    }
}
