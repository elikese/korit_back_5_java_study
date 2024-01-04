package com.study.ch07;

public class Computer {
    String type;
    String cpu;
    String ram;
    String disk;

    // 생성자
    //  1. 클래스의 이름과 동일하다
    //  2. 메소드의 형태이다 -> 오버로딩이 가능하다
    //  3. 언제나 주소값을 리턴한다.
    Computer() {
        type = "컴퓨터";
    }

    // 생성자 오버로딩
    Computer(String type) {
        this.type = type;
    }

    //class 안에 정의된 함수 : 메서드 -> 자바는 모두 class 내에서 정의됨(모든 함수는 메서드)
    void showInfo() {
        System.out.println("type: " + type);
        System.out.println("cpu: " + cpu);
        System.out.println("ram: " + ram);
        System.out.println("disk: " + disk);
    }
}
