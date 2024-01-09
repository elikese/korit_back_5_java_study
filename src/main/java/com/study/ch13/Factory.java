package com.study.ch13;

public class Factory {
    // 자기 자신 클래스를 스태틱 변수(변수명 : instance)로 가지고 있어야한다. (싱글톤)
    private static Factory instance;
    private final int DEFAULT_NUMBER = 20240000;
    private String factoryName;
    private int autoCount;

    // 생성자는 private으로 외부 생성을 막아준다
    private Factory() {

    }

    // 싱글톤 인스턴스 생성 메서드 : 오직 하나의 instance 생성만 가능
    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public Car produce(String model) {
        autoCount++;
        return new Car(Integer.toString(DEFAULT_NUMBER + autoCount), model);
    }

    @Override
    public String toString() {
        return "Factory{" +
                "DEFAULT_NUMBER=" + DEFAULT_NUMBER +
                ", factoryName='" + factoryName + '\'' +
                ", autoCount=" + autoCount +
                '}';
    }
}
