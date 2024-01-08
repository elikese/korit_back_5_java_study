package com.study.ch09;

public class ElectronicDeviceMain {
    public static void main(String[] args) {

        ElectronicDevice[] electronicDevices = new ElectronicDevice[10];
        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i] = i % 2 == 0 ? new Computer() : new SmartPhone();
        } // 짝수면 computer, 홀수면 smartphone 업캐스팅하여 ElectronicDevice 배열에 저장

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState(); // 업캐스팅되었지만, 오버라이딩된 함수가 호출됨 (오버라이딩된 함수가 더 우선순위가 높음)
        }

        System.out.println();

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].setPowerOn();
        }

        System.out.println();

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

        for (int i = 0; i < electronicDevices.length; i++) {
            if (electronicDevices[i] instanceof Computer) {
                Computer computer = (Computer) electronicDevices[i];
                computer.playGame();
            } else if (electronicDevices[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) electronicDevices[i];
                smartPhone.call();
            }
        }
    }
}
