package com.study.exercise.singletone;

public class CarMain {
    public static void main(String[] args) {
        Car.getInstance().setModel("중국산");
        Car.getInstance().setName("쓰레기");

        Car.getInstance().getModel();
        Car.getInstance().getName();
    }


}
