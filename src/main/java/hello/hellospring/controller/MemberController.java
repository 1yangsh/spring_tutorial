package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired // dependency injection = member controller가 생성이 될 때, spirng bin에 등록되어있는 memberService 객체를 넣어준다
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
