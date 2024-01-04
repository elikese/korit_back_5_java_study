package com.study.ch06;

<<<<<<< HEAD
public class For02 {
    public static void main(String[] args) {
        // 0, 1, 2, 3, 4
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            if (i < 9) {
                System.out.print((i == 4) ? "\n" : ", ");
            }
        }

        System.out.println();
        System.out.println("-------------------");

        // 9, 8, 7, 6, 5
        for (int i = 9; i >= 0; i--) {
            System.out.print(i);
            if (i > 0) {
                System.out.print((i == 5) ? "\n" : ", ");
            }
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < 10; i++) {
            int rv_i = 10 - 1 - i;
            System.out.print(rv_i);
            if (rv_i % 5 != 0) {
                System.out.print(", ");
            }
            if (rv_i % 5 == 0) {
                System.out.println();
            }
=======
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
>>>>>>> 61718606a39f6d8d3f22dfa74454820f4b91f8d8
        }
    }
}
