package com.study.ch05;

public class If01 {
    public static void main(String[] args) {
        // 조건문
        int i = 3;

        if (i > 3) {
            System.out.println("i가 3보다 큽니다");
            System.out.println("if문 종료");
        } else {
            if (i == 3) {
                System.out.println("i가 3입니다");
            } else {
                System.out.println("i가 3보다 크지 않습니다");
            }
            // else 뒤에 if ~ else구문 2개가 오므로 else if 불가(중괄호 생략불가)
            if (i == 3) {
                System.out.println("i가 3입니다");
            } else {
                System.out.println("i가 3보다 크지 않습니다");
            }
        }


        String tempStr = i > 3 ? print("i가 3보다 큽니다") : "";
    }

    public static String print(String str) {
        System.out.println(str);
        return str;
    }
}
