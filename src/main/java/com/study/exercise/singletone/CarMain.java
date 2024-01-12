package com.study.exercise.singletone;

public class CarMain {
    public static void main(String[] args) {
        Car.getInstance().setModel("BMW X5");
        Car.getInstance().setName("남의차");

        System.out.println(Car.getInstance().getInfo());
    }


}
