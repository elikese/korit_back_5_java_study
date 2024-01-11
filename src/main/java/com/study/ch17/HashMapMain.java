package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {

    public static void main(String[] args) {
        HashMap<String, String > map = new HashMap<>();

        map.put("1번학생", "이동윤"); // map은 순서가 없음
        map.put("2번학생", "삼동윤");
        map.put("3번학생", "사동윤");
        map.put("4번학생", "오동윤");
        map.put("5번학생", "오동윤"); // 키값이 있어서 중복 가능

//        map.put("username", "dongyoon"); // 이런식으로 사용가능
//        map.put("password", "7212");
//        map.put("name", "이동윤");
//        map.put("email", "dongyoon7212@naver.com");

//        System.out.println(map.get("password"));

        System.out.println(map);
        System.out.println(map.get("3번학생")); // 키값이 있어서 get 가능
    }
}