package com.study.ch08.car;

public class CarService {
    CarRepository carRepository;

    CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    boolean isEmpty() {
        return carRepository.getEmptyCount() == 0;
    }

    void append(Car car) { // 쌓이는 추가 - append 작명
        for (int i = 0; i < carRepository.cars.length; i++) {
            if (carRepository.cars[i] == null) {
                carRepository.cars[i] = car;
                System.out.println(carRepository.cars[i].toString());
                break;
            }
        }
    }
}
