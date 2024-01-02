package com.study.ch04;

public class Operation03 {
    public static void main(String[] args) {
        /*
        << 연산자 >>

        산술연산자, 비교연산자, 논리연산자, 조건연산자, 복합대입연산자

         */

        /*
        논리연산자

        &&(AND/곱)
        ||(OR/합)
        !(NOT/부정)

        true(1)
        false(0)

        true && false ==> false
        ture && true ==> true
        true || false ==> true
        false || false ==> false
        !false ==> true
        !true ==> false


         */
        System.out.println("논리연산자");
        System.out.println(505 % 5 == 0 && 505 % 50 != 0);
        System.out.println(!(505 % 5 == 0 || 505 % 50 == 0));
        int age = 30;

        System.out.println(age < 40 && age > 20 && age != 30); // 비교대상을 언제나 연산자 앞으로 작성


    }
}
