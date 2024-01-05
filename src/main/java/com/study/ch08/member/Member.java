package com.study.ch08.member;

public class Member {
    String code;
    String name;
    int age;
    String address;

    // 멤머 allArgsConstructor 정의
    Member(String code, String name, int age, String address) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() { // 클래스 데이터 출력
        return "Member{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
