package com.springboot.shoppy_fullstack_app.repository;

import com.springboot.shoppy_fullstack_app.dto.Member;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository //jdbcTemplateMemberRepository
public class JdbcTemplateMemberRepository implements MemberRepository {
    //반드시 오버라이드를 해야한다. 빨간줄은 오버라이드를 안해서이다.
    private final JdbcTemplate jdbcTemplate;

    public JdbcTemplateMemberRepository(DataSource dataSource) {
        this.jdbcTemplate=new JdbcTemplate(dataSource); //커넥센 생성
    }


    @Override
    public void save(Member member) {
        System.out.println("-- memberRepository save --");
        System.out.println(member.getId());
        //jdbcTemplate 객체를 이용하여 DB의 member 테이블에 insert
        String sql = "insert into member(id,pwd,name,phone) values (?,?,?,?)";
    }
}
`