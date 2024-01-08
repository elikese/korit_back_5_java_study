package com.study.ch08.car;

public class CarService {
    CarRepository carRepository; // 클래스의 멤버변수 - 틀만 만들기 때문에 초기화 하지 않아도 GC가 알아서 초기화

    CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    boolean isFull() {
        return carRepository.getEmptyIndex() == -1;
    }

    void append(Car car) { // 쌓이는 추가 - append 작명
        carRepository.insert(car);
    }

    void printCarList() {
        Car[] cars = carRepository.getCarDatas();

        if (cars.length == 0) {
            System.out.println("등록된 차량이 없습니다");
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }
}
