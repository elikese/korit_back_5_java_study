package com.study.ch03;

public class Function02 {

    // 매개변수x, 리턴x
    public static void fx01() {
        // void -> 비어있는, 공허한
        System.out.println("fx01 함수 실행");
        System.out.println();
    }

    // 매개변수o, 리턴x
    public static void fx02(int age, String name) {
        System.out.println("fx02 함수 실행");
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println();
    }

    // 매개변수의 자료형이 다르기 때문에 같은 이름의 메서드 정의가 가능하다 (메서드의 오버로딩)
    public static void fx02(String name, int age) {
        System.out.println("fx02 함수 실행");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println();
    }

    // 매개변수x, 리턴o
    public static int fx03() {
        System.out.println("fx03 함수 실행");
        return 100;
    }

    // 매개변수o, 리턴o
    public static String fx04(String name, int age) {
        return name + ", " + age;
    }

    public static void main(String[] args) {
        fx01();
        fx02(33, "박화목");
        fx02("박화목", 33);
        int num = fx03();
        System.out.println(fx03());
        String result = fx04("박화목", 33);
        System.out.println(result);
    }
}
