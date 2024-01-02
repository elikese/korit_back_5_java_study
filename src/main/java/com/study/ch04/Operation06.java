package com.study.ch04;

public class Operation06 {
    public static void main(String[] args) {
        /*

        조건 연산자(삼항연산자)
        a > 0 ? "양수" : a == 0 ? "0" : "음수"
        결과값들의 자료형이 같아야 한다(int로 통일 / String으로 통일 등등..)
        삼항연산자 안에 연산자사용가능

         */

        int iResult = 10 > 2 ? 1111 : 2222;
        String sResult = 10 > 2 ? "1111" : "2222";


    }

}