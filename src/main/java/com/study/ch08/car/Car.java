package com.study.ch08.car;

public class Car {
    String model;
    String color;

    // NoArgsConstructor
    Car() {

    }

    // AllArgsConstructor
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    
    //AllArgs 생성자 만들고 NoArgs쓰려면 NoArgs 선언 해줘야 함


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
