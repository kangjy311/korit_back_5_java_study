package com.study.ch05;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {

        int x = -5;
        int y = -2;
        if(x == 0 || y == 0) {
            System.out.println("오류");
        } else if(x > 0 && y > 0) {
            System.out.println("1사분면");
        } else if(x < 0 && y > 0) {
            System.out.println("2사분면");
        } else if(x < 0 && y < 0) {
            System.out.println("3사분면");
        } else if(x > 0 && y < 0) {
            System.out.println("4사분면");
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int x1 = 0;
        int y1 = 0;
        System.out.print("x1과 y1을 입력해주세요(띄어쓰기로 구분): ");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();

        if(x1 == 0 || y1 == 0) {
            System.out.println("오류");
        } else if(x1 > 0 && y1 > 0) {
            System.out.println("1사분면");
        } else if(x1 < 0 && y1 > 0) {
            System.out.println("2사분면");
        } else if(x1 < 0 && y1 < 0) {
            System.out.println("3사분면");
        } else if(x1 > 0 && y1 < 0) {
            System.out.println("4사분면");
        }
    }
}
