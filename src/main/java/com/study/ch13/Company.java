package com.study.ch13;

/**
 * Company 클래스를 싱글톤을 적용하여 구현하시오.
 *
 * 1. 유일한 객체 하나만 만들어야 할 때
 * 2.
 */
public class Company {
    private static Company instance;        // 자기 자신 클래스를 static 변수(변수명: instance)로 가지고 있어야한다.
    private String name;

    private Company() {                     // 생성자는 private로 외부생성을 막아준다.

    }
    public static Company getInstance() {   // instance  주소를 돌려준다
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
