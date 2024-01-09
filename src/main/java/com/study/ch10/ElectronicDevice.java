package com.study.ch10;

/*
    [ 추상화 ]
    1. 추상 클래스 abstract class
    - 공통점을 뽑아낸다
    - abstract class 생성할 수 없다 -> 구현하면 생성 가능
    - 일반메소드랑 추상메소드 생성가능
    
    2. 인터페이스 interface
    - 기본적으로 다 추상메소드임.
    - 변수선언이 불가능하다
    - 무조건 상수 (상수는 대문자)
    - static 상수 값을 가짐
    - 다중 상속 가능
 */
//ctrl + I : implement 단축키
public abstract class ElectronicDevice {
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }

    void setPowerOff() {
        powerState = false;
    }

    // 추상 메소드 (인터페이스와 추상클래스에서만 정의 가능) (일반 클래스에서는 정의할 수 없음)
    abstract void showDeviceState();

    
}
