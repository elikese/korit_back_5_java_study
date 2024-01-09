package com.study.ch10;

public class RemoteController extends ElectronicDevice {
// 추상클래스 상속받음 >> 추상메소드 재정의 필요 ( 자동 : ctrl + i )

    @Override
    void showDeviceState() {
        System.out.println("리모컨의 상태를 확인합니다");
    }

}