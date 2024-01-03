package com.study.ch06;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        //break는 즉시 중단, flag는 조건문까지 다시 가서 중단
        //break while문 하나만 중단
        while(flag) {
            System.out.print("입력: ");
            int inputValue = scanner.nextInt();

            System.out.println("입력한 번호: " + inputValue);
            if(inputValue == 0) {
                System.out.println("프로그램을 종료합니다.");
                flag = false;
            } else if(inputValue == 1) {
                System.out.println("1번으로 들어왔습니다.");
                //flag2 = false써서 다시 while문 반복할때 true선언 해줘야함
                boolean flag2 = true;
                while(flag2) {
                    System.out.print("1번에서 입력: ");
                    inputValue = scanner.nextInt();

                    System.out.println("입력한 번호: " + inputValue);
                    if(inputValue == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        flag = false;
                        flag2 = false;
                        //break;
                        // break;는 안의 while만 멈추고 flag = false;가 바깥 while문 멈춤
                        // 바깥 while의 조건이 flag가 true일 때 반복
                    } else if(inputValue == -1) {
                        System.out.println("뒤로가기");
                        flag2 = false;
                    } else if(inputValue == 1) {
                        System.out.println("1번에서 1번으로 들어왔습니다.");
                    } else if(inputValue == 2) {
                        System.out.println("1번에서 2번으로 들어왔습니다.");
                    } else {
                        System.out.println("다시입력하세요");
                    }
                    System.out.println();
                }
            } else if(inputValue == 2) {
                System.out.println("2번으로 들어왔습니다.");
            } else {
                System.out.println("다시입력하세요");
            }
            System.out.println();
        }

    }
}
