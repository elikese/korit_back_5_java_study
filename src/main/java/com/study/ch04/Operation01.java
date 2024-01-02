package com.study.ch04;

public class Operation01 {
    public static void main(String[] args) {
        /*
        << 연산자 >>

        산술연산자, 비교연산자, 논리연산자, 조건연산자, 복합대입연산자

         */

        System.out.println("산술연산자");
        System.out.println("1 + 1 = " + (1 + 1));
        System.out.println("1 - 1 = " + (1 - 1));
        System.out.println("1 * 1 = " + (1 * 1));
        System.out.println("1 / 1 = " + (1 / 1)); // 나누기 - 몫
        System.out.println("10 % 3 = " + (10 % 3)); // 나누기 - 나머지

        String dog01 = "강아지";
        String dog02 = "강아지";
        String dog03 = new String("강아지");

        System.out.println(System.identityHashCode(dog01));
        System.out.println(System.identityHashCode(dog02));
        System.out.println(System.identityHashCode(dog03));
        System.out.println(System.identityHashCode("강아지"));

        String a = "1111";
        int b = Integer.parseInt(a);
        System.out.println(b+1);

        String n = null;
        String m = null;
        System.out.println(System.identityHashCode(n));
        System.out.println(System.identityHashCode(m));


    }
}
