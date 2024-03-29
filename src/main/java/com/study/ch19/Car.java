package com.study.ch19;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
// 빌드업 패턴
public class Car {
    private String model;
    private String color;

    public Car() {

    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // 빌더 메소드 생성(스태틱으로 접근)
    public static CarBuilder builder() {
        return new CarBuilder();
    }

    // 카빌더 클래스 생성(내부 클래스) - 스태틱 메소드로 전달받아 접근 따라서 스태틱
    public static class CarBuilder{
        private String color;
        private String model;

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(color, model);
        }
    }
}
