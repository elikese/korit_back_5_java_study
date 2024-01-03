package com.study.ch06;

public class For01 {
    public static void main(String[] args) {

        // for문 - 횟수가 명료하면 사용.
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }

        // while문 - 조건이 명료하면 사용.
        int i = 0;
        while (i < 10) {
            System.out.println("i: " + i);
            i++;
        }

    }
}