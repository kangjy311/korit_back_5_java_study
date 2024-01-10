package com.study.ch15;

import lombok.AllArgsConstructor;

@AllArgsConstructor


public class SendData<T> {      //제네릭 (T:타입 자료형 R: 리턴 자료형 E: 요소) 여러개 받을수있다
    private int code;
//    private Object data;
    //Object를 쓰면 다운캐스팅을 해야될때 다 해줘야 함
    private T data;

    public void send() {
        System.out.println("[ 데이터 전송 ]");
        System.out.println("code: " + code);
        System.out.println("data: " + data);

    }
}
