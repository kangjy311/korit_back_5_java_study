package com.study.ch09;

public class Computer extends ElectronicDevice{
    String cpu;
    int ram;

    void playGame() {
        System.out.println("PC 게임을 합니다");
    }

    // 오버라이드 (상속된 놈을 업캐스팅 하고)
    void showDeviceState() {
//        System.out.println("컴퓨터 전원 상태: " + ((powerState) ? "켜짐" : "꺼짐"));
        System.out.print("컴퓨터 ");
        super.showDeviceState();
    }

}
