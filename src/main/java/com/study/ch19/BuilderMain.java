package com.study.ch19;

public class BuilderMain {

    public static void main(String[] args) {
//        Car car = new Car("아반떼", "블랙");

        //변수가 10개라는 가정 하에 2개만

//        Car.CarBuilder carBuilder = new Car.CarBuilder();
        Car.CarBuilder carBuilder = Car.builder();
        Car car2 = carBuilder.build();

        //builder (스태틱), 객체 생성
        Car car = Car.builder()
                .color("블랙")
                .model("아반떼")
                .build();
        //

        System.out.println(car);
    }
}
