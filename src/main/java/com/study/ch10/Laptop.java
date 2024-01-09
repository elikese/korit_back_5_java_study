package com.study.ch10;

public class Laptop implements Power {

    @Override
    public void setPowerOn() {
        System.out.println("전원 켜짐");
    }

    @Override
    public void setPowerOff() {
        System.out.println("전원 꺼짐");
    }

}