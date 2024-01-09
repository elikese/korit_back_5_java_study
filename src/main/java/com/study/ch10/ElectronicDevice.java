package com.study.ch10;

/*
      [ 추상화 ]
    1. 추상 클래스 abstract class
    2. 인터페이스 interface
 */
public abstract class ElectronicDevice {
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }

    void setPowerOff() {
        powerState = false;
    }

    // 추상메소드 - 추상클래스/추상인터페이스에만 정의할 수 있음
    abstract void showDeviceState(); // 상속된 클래스는 무조건 오버라이딩하여 재정의 해야 함.
}