package com.study.exercise.singletone;


public class Car {
    private static Car instance;
    private String name;
    private String model;

    // 생성자 호출제한
    private Car() {

    }

    public static Car getInstance() {
        if(instance == null) {
            instance = new Car();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
