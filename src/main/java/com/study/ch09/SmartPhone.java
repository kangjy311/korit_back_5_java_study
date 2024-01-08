package com.study.ch09;

public class SmartPhone extends ElectronicDevice{
    String model;
    String color;
    
    void call() {
        System.out.println("전화 연결을 시도합니다");
    }

    // 오버라이드 (상속된 놈을 업캐스팅 하고)
//    void showDeviceState() {
//        System.out.println("스마트폰 전원 상태: " + ((powerState) ? "켜짐" : "꺼짐"));
//    }

    /*
    ctrl + o : 오버라이드 단축키
     */

    @Override   //@로 시작하면 어노테이션
    void showDeviceState() {
        super.showDeviceState();
    }
}
