package com.study.ch08.car;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String selectedMenu = null;
        boolean loopFlag = true;

        Car[] cars = new Car[3];

        while (loopFlag) {
            System.out.println("자동차 관리 프로그램");
            System.out.println("1. 자동차 등록");
            System.out.println("2. 자동차 조회");
            System.out.println("q. 프로그램 종료");
            System.out.println("메뉴선택 >>> ");
            selectedMenu = scanner.nextLine();

            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램 종료 중...");
                loopFlag = false;
            } else if ("1".equals(selectedMenu)) {
                System.out.println("<<< 자동차 등록 페이지 >>>");
                String model = null;
                String color = null;

                System.out.println("모델명 >>>");
                model = scanner.nextLine();
                System.out.println("색상 >>>");
                color = scanner.nextLine();

                Car car = new Car(model, color);
                for (int i = 0; i < cars.length; i++) {
                    if (cars[i] == null) {
                        cars[i] = car;
                        break;
                    }
                }
                System.out.println(cars[0]);


            } else if ("2".equals(selectedMenu)) {
                System.out.println("<<< 자동차 조회 페이지 >>>");
                System.out.println(cars[0].toString());

            } else {
                System.out.println("다시 입력하세요");
            }

        }
        System.out.println("프로그램 종료되었습니다");

    }
}
