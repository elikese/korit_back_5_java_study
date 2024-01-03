package com.study.ch03;

public class Function01 {
    public static void main(String[] args) {
        System.out.println(1 + 2 * 3 - 2 * 3);
        System.out.println(fx1(1, 2, 3, 2, 3)); // 함수 호출(콜)
        fx2("박화목");
    }

    // 자주 재사용하는 경우 or 코드가 길어지고 더러워지는 경우 사용
    // 함수 정의
    static int fx1(int a, int b, int c, int d, int e) {
        return a + b * c - d * e;
    }

    static void fx2(String name) {
        System.out.println("이름은 " + name + " 입니다.");
    }
}