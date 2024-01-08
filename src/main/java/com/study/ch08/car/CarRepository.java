package com.study.ch08.car;

public class CarRepository {
    final Car[] cars; // 클래스의 멤버변수 - 틀만 만들기 때문에 초기화 하지 않아도 GC가 알아서 초기화

    CarRepository(Car[] cars) {
        this.cars = cars;
    }

    int getEmptyIndex() {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                return i;
            }
        }
        return -1; // 빈 자리 없으면 -1 리턴
    }

    void insert(Car car) { // 빈 인덱스에 car 대입
        cars[getEmptyIndex()] = car;
    }

    Car[] getCarDatas() {
        int carCount = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                carCount++;
            }
        }

        Car[] newCars = new Car[carCount];
        int j = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                newCars[j] = cars[i];
                j++;
            }
        }

        return newCars;
    }

}