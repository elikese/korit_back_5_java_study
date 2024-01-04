package com.study.ch06;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("별 몇줄? : ");
        int starLine = sc.nextInt();

        /*
        for문 연습 별찍기
         */

        // *
        // **
        // ***
        for (int i = 0; i < starLine; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");

        // ***
        // **
        // *
        for (int i = 0; i < starLine; i++) {
            for (int j = 0; j < starLine - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");

        //  *
        // **
        //***
        for (int i = 0; i < starLine; i++) {
            for (int j = 0; j < starLine - (1 + i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (1 + i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");

        //***
        // **
        //  *
        for (int i = 0; i < starLine; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starLine - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");

        //  *
        // ***
        //*****
        for (int i = 0; i < starLine; i++) {
            for (int j = 0; j < starLine - 1 - i; j++) {
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
        for (int i = 0; i < starLine; i++) {
            for (int j = 0; j < starLine - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽
        for (int i = starLine - 2; i >= 0; i--) {
            for (int j = 0; j < starLine - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
