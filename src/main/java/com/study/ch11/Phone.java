package com.study.ch11;

public class Phone {
    static int autoCount = 0; // static 변수라서 새로 인스턴스를 만들어도 이 변수는 공유하는 변수가 됨
    int serialNumber;
    Company company;

    public Phone(Company company) {
        autoCount++; // 생성자가 호출될 때 마다 클래스의 static 변수를 증가시켜줌
        this.serialNumber = 20240000;
        this.serialNumber += autoCount;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "serialNumber=" + serialNumber +
                ", company=" + company.toString() +
                '}';
    }
}
