package com.study.ch08;

import java.util.Scanner;

public class ArrayMain01 {
    public static void main(String[] args) {
        // 자료형 변수 =(대입) 값;

        // 자료형[] 변수 = new 값[];
        // (생성) new : 힙메모리 할당 ,메모리 공간 대여 -> 동적 메모리 할당

        // 배열은 크기를 조절할 수 없다. -> 늘리려면 무조건 새로만들어서 옮겨야 한다
        // int[] aArray = new int[3]  배열3- 3의 메모리 공간을 만들었다


        int num1 = 10;
        int num2 = 20;

        // 배열(Array) []
        int[] numArray;             // 선언    (스택메모리 할당)
        numArray = new int[3];      // 값(주소) 대입

        System.out.println(numArray);

        System.out.println(numArray[0]);

        numArray[0] = 10;
        System.out.println(numArray[0]);
        numArray[1] = 20;
        numArray[2] = 30;

        Scanner scanner = new Scanner(System.in);
        System.out.println("인덱스: ");
        int index = scanner.nextInt();

        System.out.println(numArray[index]);
    }
}
