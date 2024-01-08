package com.study.ch08.car;

public class CarRepository {
    final Car[] cars;

    CarRepository(Car[] cars) {
        this.cars = cars;
    }

    int getEmptyCount() {
        int emptyCount = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                emptyCount++;
            }
        }
        return emptyCount;
    }
}
