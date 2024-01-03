package com.study.ch05;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // 표준입력(System.in) <--> 표준출력(System.out)
        Scanner scanner = new Scanner(System.in);

        System.out.print("a : ");
        int a = scanner.nextInt();

        System.out.print("b : ");
        int b = scanner.nextInt();

        System.out.print("c : ");
        int c = scanner.nextInt();

        System.out.print("제목 : ");
        scanner.nextLine();
        String title = scanner.nextLine();

        // next는 띄어쓰기까지 버퍼값을 입력값으로 구분

        System.out.println(title + " : " + (a + b + c));
        scanner.close();
    }
}