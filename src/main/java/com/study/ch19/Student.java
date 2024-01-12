package com.study.ch19;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Data

public class Student {
    private String name;
    private String address;
    private int age;

    //AllArgsConstructor
//    public Student(String name, String address, int age) {
//        this.name = name;
//        this.address = address;
//        this.age = age;
//    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private String name;
        private String address;
        private int age;

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
//            return new StudentBuilder();  하면 새로운 객체를 만들어 낸다
        }
        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }
        public StudentBuilder age(int age) {
            this.age = age;
            return  this;
        }
        public Student build() {
            return new Student(name, address, age);
        }
    }
}
