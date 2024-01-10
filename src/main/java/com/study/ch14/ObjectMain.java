package com.study.ch14;

public class ObjectMain {

    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("김준일", "동래구");

        System.out.println(objectTest.toString());
        System.out.println(objectTest);

        ObjectTest objectTest1 = new ObjectTest("김준일", "동래구");

        System.out.println(objectTest.equals(objectTest1));     //값을 비교
        System.out.println(objectTest == objectTest1);          //주소를 비교

        //클래스 비교
        System.out.println(objectTest.getClass());  //객체가 생성되어있을때
        System.out.println(objectTest1.getClass()); //객체가 생성되어있을때
        System.out.println(ObjectTest.class);

        //김준일, 동래구 값이 같아서 해쉬변환을 했을 때 같은 값이 나온다.
        System.out.println(objectTest.hashCode());
        System.out.println(objectTest1.hashCode());
    }
}
