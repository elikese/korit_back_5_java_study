package com.study.ch07;

public class Student01 {
    //    String address;
    final String address;
    String name;
    int age;
    // 생성자 (constructor)
    // 매개변수의 값은 args (arguments)라고 함

    // NoArgsConstructor (가지고 오는 값이 없음)
//    Student01() {
//
//    }

    // AllArgsConstructor (클래스의 모든 데이터 가져옴)
    Student01(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // RequiredArgsConstructor (final 선언된 변수들만 받아오는 생성자)
    Student01(String address) {
        this.address = address;
    }

}
