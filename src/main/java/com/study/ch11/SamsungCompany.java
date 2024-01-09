package com.study.ch11;

public class SamsungCompany {

    //static -> 스택메모리 할당
    // 하나의 메모리 공간을 공유한다
    static String name = "삼성";

    static void showCompanyInfo() {
        System.out.println("회사명: " + name);
    }
}
