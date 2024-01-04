package com.study.ch07;

public class UserMain {
    public static void main(String[] args) {

        User01 user1 = new User01("aaa", "1234");
        User01 user2 = new User01("bbb", "1234", "홍길동", "korea@korea.com");

        user1.showInfo();
        System.out.println("---------------------");

        user2.showInfo();
        System.out.println("---------------------");

        user1.setName("김씨");
        user1.setEmail("google@gmail.com");

        user1.showInfo();
        System.out.println("---------------------");

        user2.showInfo();
    }
}
