package com.study.ch08.car;

public class CarService {
    CarRepository carRepository;
    
    //외부에서 carRepository를 받아와서 주입한다
    CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    boolean isFull() {
//카레파지터리
//        int emptyCount = 0;
//        for(int i = 0; i < carRepository.cars.length; i++) {
//            if(carRepository.cars[i] == null) {
//                emptyCount++;
//            }
//        }
        
//        return carRepository.getEmptyCount() == 0;
        return carRepository.getEmptyIndex() == -1;     //getEmptyCount 지우고
    }

    void append(Car car) {
//        for(int i = 0; i < cars.length; i++) {
//            if(cars[i] == null) {   // 인덱스 비었는지 확인
//                cars[i] = car;     //비어있는 인덱스
//                break;
//            }
//        }
        carRepository.insert(car);
    }

    void printCarList() {
        Car[] cars = carRepository.getCarDatas();
        if(cars.length == 0) {
            System.out.println("등록된 차량이 없습니다");
            return;
        }
        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }
}
