package com.study.ch16;

import java.util.ArrayList;

public class StudentListMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("김준일", 31));
        students.add(new Student("김준이", 32));
        students.add(new Student("김준삼", 33));
        students.add(new Student("김준사", 34));

        System.out.println(students);
        for(int i = 0; i <students.size(); i++) {
            Student student = students.get(i);
            student.setAge(student.getAge()+ 1);
//            students.get(i).setAge(students.get(i).getAge() + 1);
        }
        //향상된 for 문 - 처음부터 끝까지 반복해야될 때 씀
        for(Student student : students) {
            student.setAge(student.getAge() + 1);
        }

        System.out.println(students);

        Student[] studentArray = new Student[4];
        for(int i = 0; i < studentArray.length; i++) {
            studentArray[i] = new Student("김준일" , 31);
        }
        int i = 0;      //향상된 for문으로는 배열에 넣는건 안쓴다
        for(Student student : studentArray) {
            studentArray[i] = new Student("김준일", 31);
            i++;
        }

        for(Student student : studentArray) {
            System.out.println(student);
        }

//        students.get(0) = new Student("김준일", 31);     값에 값을 넣는 것과 같음
        students.set(0, new Student("김준일", 31));



    }
}
