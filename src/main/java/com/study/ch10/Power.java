package com.study.ch10;

public interface Power {
    // interface >> 추상메서드만 가질 수 있다 // 멤버 변수를 가질 수 없다 // 상수는 선언가능(초기화 한 변수)
    // 추상클래스는 다중구현 X / 인터페이스는 다중구현 O
    String ERROR_CODE = "-9999"; // 상수: 전체 대문자 //

    void setPowerOn();

    void setPowerOff();

    // interface 에서는 default 선언시 일반 메서드 정의 가능
    default void test() {

    }
}