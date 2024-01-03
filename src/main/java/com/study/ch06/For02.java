package com.study.ch06;

import java.util.Scanner;

public class For02 {
    public static void main(String[] args) {
        /*
        for문 연습 별찍기
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("별 몇줄? : ");
        int n = sc.nextInt();

        // *
        // **
        // ***
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");

        // ***
        // **
        // *
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");

        //  *
        // **
        //***
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");

        //  *
        // ***
        //*****
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");


        // 다이아몬드
        // 위쪽
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
