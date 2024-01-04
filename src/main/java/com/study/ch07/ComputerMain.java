package com.study.ch07;

public class ComputerMain {
    public static void main(String[] args) {

        // 생성 : 인스턴스를 만드는 행위(동적 메모리를 할당) // 주소값을 heap에 생성
        // 생성자 호출
        Computer computer1 = new Computer();
        Computer computer2 = new Computer("노트북"); // 생성할 때 값을 주입한다라고 함

        // 패키지의 이름 ~ 클래스의 이름까지가 실제 클래스의 이름
        System.out.println(computer1);
        System.out.println(computer2);

        computer1.cpu = "i5";
        computer2.cpu = "i7";
        computer1.ram = "8GB";
        computer2.ram = "16GB";

        System.out.println(computer1.cpu);
        System.out.println(computer2.cpu);

        computer1.showInfo();
        computer2.showInfo();

        computer1.type = "데스크탑";
    }
}
