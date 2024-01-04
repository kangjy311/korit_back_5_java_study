package com.study.ch07;

public class Computer {
    String type;
    String cpu;
    String ram;
    String disk;
    
    //생성자
    //1. 클래스의 이름과 동일하다
    //2. 메소드의 형태이다
    //주소를 return한다
    Computer() {
        type = "컴퓨터";
    }
    Computer(String type) {
        this.type = type;
        //this. -> Computer();인스턴스주소의 type 에 대입
        //      -> 자기 자신의 type에 대입 . (메모리 주소)
        //
    }
    
    //변수명, 함수명 소문자로 시작
    //class 안에 정의된 함수 -> 메서드
    void showInfo() {
        System.out.println("type: " + type);
        System.out.println("cpu: " + cpu);
        System.out.println("ram: " + ram);
        System.out.println("disk: " + disk);
    }
}
