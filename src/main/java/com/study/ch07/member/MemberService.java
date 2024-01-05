package com.study.ch07.member;

import java.util.Scanner;

public class MemberService {

    String inputValue(String label) {
        Scanner scanner = new Scanner(System.in);
        String value = null;

        while (true) {
            System.out.print(label + "(입력취소 : exit) >>> ");
            label = scanner.nextLine();
            if (!label.isBlank()) {
                break;
            }
        }
        return label;
    }

    boolean addMember() {
        String name = null;
        String code = null;
        String age = null;
        String address = null;

        System.out.println("<<< 회원 등록 >>>");
        code = inputValue("회원코드");
        if ("exit".equalsIgnoreCase(code)) {
            return false;
        }
        name = inputValue("이름");
        if ("exit".equalsIgnoreCase(name)) {
            return false;
        }
        age = inputValue("나이");
        if ("exit".equalsIgnoreCase(age)) {
            return false;
        }
        address = inputValue("주소");
        if ("exit".equalsIgnoreCase(address)) {
            return false;
        }

        Member member = new Member(code, name, Integer.parseInt(age), address);

        MemberRepository memberRepository = new MemberRepository();

        return memberRepository.insert(member) > 0; // insert가 된다면 리턴이 ture
    }
}
