package com.study.ch13;

public class Car {
    private final String serialNumber;
    private final String model;

    public Car(String serialNumber, String model) {
        this.serialNumber = serialNumber;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "serialNumber='" + serialNumber + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

}
