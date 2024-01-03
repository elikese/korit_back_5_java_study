package com.study.ch05;

import java.util.Scanner;

public class UserInfoMain {
    public static void main(String[] args) {
        /*
        이름: 박화목
        나이: 33
        연락처: 01091201874
        학년: 4
        주소: 부산 금정구
         */
        Scanner scanner = new Scanner(System.in);

        // 사용할 변수 먼저 선언 //
        String name = null;
        int age = 0;
        String tel = null;
        int grade = 0;
        String ad = null;

        System.out.print("이름 : ");
        name = scanner.next();

        System.out.print("나이 : ");
        age = scanner.nextInt();

        System.out.print("연락처 : ");
        tel = scanner.next();

        System.out.print("학년 : ");
        grade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("주소 : ");
        ad = scanner.nextLine();

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age + "살");
        System.out.println("연락처 : " + tel);
        System.out.println("학년 : " + grade + "학년");
        System.out.println("주소 : " + ad);

    }
}
