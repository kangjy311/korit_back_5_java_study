package com.study.ch19;

public class StudentMain {
    public static void main(String[] args) {
        Student student = Student.builder().name("김").address("부산").age(30).build();
        System.out.println(student);
    }
}
