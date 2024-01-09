package com.study.ch10;

public interface Power {
//    boolean powerState;   // 변수 선언 불가능
//    boolean powerState = false;     // 초기화하면 가능

    //상수는 대문자로
    String ERROR_CODE = "-9999";

    void setPowerOn();
    void setPowerOff();
    
    //default 붙이면 일반 메소드
    default void test() {
        
    }
    
}
