package com.study.ch14;

import java.util.Objects;
import java.util.Scanner;

/**
 * * Object 클래스
 * - 모든 클래스는 object가 최상위에서 상속받고 있음 (extends Object 가 생략되어있음)
 *
 * * equals
 *
 * * hashCode
 * - 주소값 비교
 * - 틀이 달라도 값이 같으면 똑같이 나온다
 *
 * 기존의 메소드들에 s가 붙으면 도구로 쓰인다 (일반적으로 static)
 */

public class ObjectTest {

//    @Override
//    public String toString() {
//        return "toString 메소드 테스트";
//    }

    private String name;
    private String address;

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectTest that = (ObjectTest) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
