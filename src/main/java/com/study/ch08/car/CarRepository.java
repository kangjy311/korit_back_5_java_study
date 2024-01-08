package com.study.ch08.car;

public class CarRepository {
    final Car[] cars;

    CarRepository(Car[] cars) {
        this.cars = cars;
    }

    // getEmptyIndex, insert 코드 만들면 필요가 없어진다
//    int getEmptyCount() {
//        int emptyCount = 0;
//        for(int i = 0; i < cars.length; i++) {
//            if(cars[i] == null) {
//                emptyCount++;
//            }
//        }
//        return emptyCount;
//    }

    int getEmptyIndex() {
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] == null) {
                return i;
            }
        }
        return -1;      //비어있는 공간이 없다
    }

    void insert(Car car) {
        cars[getEmptyIndex()] = car;
    }

    //
    Car[] getCarDatas() {
        int carCount = 0;
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] != null) {
                carCount++;
            }
        }
        Car[] newCars = new Car[carCount];
        int j = 0;
        for(int i = 0; i <cars.length; i++) {
            if(cars[i] != null) {
                newCars[j] = cars[i];
                j++;
            }
        }
        return newCars;
    }   // new Car[] 힙메모리 생성, return을 newCars로 -> 소멸되지 않는다
}
