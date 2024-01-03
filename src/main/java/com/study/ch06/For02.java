package com.study.ch06;

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
        }
    }
}
