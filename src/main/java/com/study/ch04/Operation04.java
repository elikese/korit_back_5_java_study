package com.study.ch04;

public class Operation04 {
    public static void main(String[] args) {
        /*
         << 문제 >>

         연도가 주어졌을 때, 윤년이면 true, 아니면 false를 출력하는 프로그램 작성
         윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때 이다.

         ex) 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
         1900년은 100의 배수이자 400의 배수는 아니지 때문에 윤년이 아니다.
         하지만, 2000년은 400의 배수이기 때문에 윤년이다.

         연도는 0보다 크고, 4001보다 작은 자연수이다.

         */

        int year = 2024;

        boolean a = year > 0 && year < 4001;
        boolean b = year % 4 == 0;
        boolean c = year % 100 != 0 || year % 400 == 0;

        System.out.println(a && b && c);


    }

}
