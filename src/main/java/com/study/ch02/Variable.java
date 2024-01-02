package com.study.ch02;

public class Variable {
    public static void main(String[] args) {
        int date = 20231229;
        double date2 = date; // 업캐스팅
        int date3 = (int)date2; // 다운캐스팅
        // 정수분은 실수분을 모두 포함하지 못함. double은 int보다 상위
        // 문자 < 정수 < 실수

        char a = '1';
        int b = a;
        double c = b;

    }
}
