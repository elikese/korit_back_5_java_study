package com.study.ch08.member;

public class MemberRepository {

    Member[] memberArray = new Member[3];

    int insert(Member member) {
        for (int i = 0; i < memberArray.length; i++) {
            if (memberArray[i] == null) {
                memberArray[i] = member;
                break;
            }
        }
        System.out.println("저장소에 Member 저장");
        System.out.println(member.toString());
        return 1;
    }
}
