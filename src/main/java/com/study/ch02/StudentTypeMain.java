package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {
        /*
            이름, 학년, 주소를 저장할 수 있는 StudentType 클래스를 만드시오.
         */

        StudentType stu = new StudentType();
        stu.name = "김준일";
        stu.studentYear = 1;
        stu.address ="부산 동래구";

        System.out.println("이름은 " + stu.name + " " + stu.studentYear + "학년이고 " + "사는 곳은 " + stu.address + "입니다." );

        int a = 10;
        double b = a;

        Person p = stu;     //업캐스팅
        StudentType junil2 = (StudentType) p;   //다운캐스팅

//        Person 전주환 = new Person();
//        StudentType 전주환학생 = (StudentType) 전주환;

        StudentType 전주환학생 = new StudentType();
        Person 전주환사람 = 전주환학생;
        StudentType 전주환학생2 = (StudentType) 전주환사람;


    }
}
