package com.study.ch03;

public class Function02 {
    
    // 매개변수x, 리턴x
    public static void fx01() {
        // void -> 비어있는, 공허한
        System.out.println("fx01 함수 실행");
        System.out.println();
    }

    //함수의 오버로딩 -함수명이 같더라도 매개변수의 자료형이 다르면 새로운 함수로 정의가능
    //함수 매개변수(자료형)로 구분
    public static void fx02(int age, String name) {
        System.out.println("fx02 함수 실행");
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println();
    }
    public static void fx02(String name, int age) {
        System.out.println("fx02 함수 실행");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println();
    }

    public static int fx03() {
        System.out.println("fx03 함수 실행");
        return 100;
    }

    public static String fx04(String name, int age) {
        return name + ", " + age;
    }

    public static void main(String[] args) {
        fx01();
        fx02(31, "김준일");
        fx02("김준이", 31);
        int num = fx03();
        System.out.println(fx03());
        String result = fx04("김준일", 31);
        System.out.println(result);
    }
}
