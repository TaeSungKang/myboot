package com.example.myboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {
    @GetMapping("/echo")
    public String echo(String name) {
        return "Hello, " + name;
    }

    @GetMapping("/members")
    public List<Member> list() {
        Member mem1 = new Member(1, "AAA", "aaa@gmail.com");
        Member mem2 = new Member(2, "BBB", "bbb@gmail.com");
        Member mem3 = new Member(3, "CCC", "ccc@gmail.com");

        List<Member> members = new ArrayList<Member>();
        members.add(mem1);
        members.add(mem2);
        members.add(mem3);
        members.add(new Member(4, "DDD", "ddd@gmail.com"));

        return members;
    }
}
