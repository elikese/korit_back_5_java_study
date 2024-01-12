package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public class MemberMain {
    public static void main(String[] args) { // main으로 예외처리를 미루면 JVM이 처리한다.
        ArrayList<Member> members = new ArrayList<>();
        members.add(Member.builder().name("a").build());
        members.add(Member.builder().name("b").build());
        members.add(Member.builder().name("c").build());
        members.add(Member.builder().name("d").build());

        MemberService memberService = new MemberServiceImpl();
        try {
            memberService.printMemberList(members);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }
}