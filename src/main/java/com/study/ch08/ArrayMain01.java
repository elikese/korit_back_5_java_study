package com.study.ch08;

import java.util.Scanner;

public class ArrayMain01 {
    public static void main(String[] args) {

        // 배열(Array)
        int[] numArray; // 선언
        numArray = new int[3]; // 값(주소) 대입..실제데이터는 heap/ 주소값(변수명)은 stack 위치

        System.out.println(numArray);

        System.out.println(numArray[0]);
        numArray[0] = 10;
        System.out.println(numArray[0]);
        numArray[1] = 20;
        numArray[2] = 30;

        Scanner scanner = new Scanner(System.in);
        System.out.println("인덱스: ");
        int index = scanner.nextInt();

        System.out.println(numArray[index]);
    }
}
