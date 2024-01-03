package com.study.ch06;

public class For01 {
    public static void main(String[] args) {

        //for - 반복횟수 정해져있고 일정한 간격으로 증가되면서 반복 (반복횟수 중심)
        //while - (조건 중심)

        for(int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }

        int i = 0;
        while(i < 10) {
            System.out.println("i: " + i);
            i++;
        }
    }
}
