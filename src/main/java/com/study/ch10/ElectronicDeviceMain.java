package com.study.ch10;

public class ElectronicDeviceMain {
    public static void main(String[] args) {

        // 추상클래스는 생성자로 인스턴스 생성 불가능
        // ElectronicDevice electronicDevice = new ElectronicDevice(); (불가능)

        // 익명클래스로 추상클래스 구현(추상 메소드를 재정의) // 재사용안하는 일회용(임시)클래스
        ElectronicDevice electronicDevice = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("첫번째 기기 상태확인");
            }
        };

        ElectronicDevice electronicDevice2 = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("두번째 기기 상태확인");
            }
        };

        RemoteController remoteController = new RemoteController();

        ElectronicDevice[] electronicDevices = new ElectronicDevice[3];
        electronicDevices[0] = electronicDevice; // 업캐스팅임 (익명클래스)
        electronicDevices[1] = electronicDevice2; // 업캐스팅임 (익명클래스)
        electronicDevices[2] = remoteController;

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }
    }
}
