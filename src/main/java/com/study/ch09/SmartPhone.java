package com.study.ch09;

public class SmartPhone extends ElectronicDevice {
    String model;
    String color;

    void call() {
        System.out.println("전화 연결을 시도합니다");
    }

    @Override
        //@로 시작하면 어노테이션이라고 함. 재정의 확인용
    void showDeviceState() {
        super.showDeviceState();
    }
}
