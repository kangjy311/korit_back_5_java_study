package com.study.ch12.a;

public class Student {
    /*
    default, protected 같은 패키지만 사용 가능
    private 같은 클래스만 사용 가능
     */
    private String name;
    private String address;

    public Student() {

    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void test() {
        System.out.println(add(10, 20));
        System.out.println(add(20, 30));
        System.out.println(add(40, 50));
    }
    private int add(int a, int b) {
        return  a + b;
    }
}
