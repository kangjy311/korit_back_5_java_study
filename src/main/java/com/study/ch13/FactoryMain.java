package com.study.ch13;

import java.util.Scanner;

public class FactoryMain {
    /*
    shift + f6 파일명수정
    f5 복사
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FactoryService1 factoryService1 = new FactoryService1(scanner);
        FactoryService2 factoryService2 = new FactoryService2(scanner);

        factoryService1.create();
        factoryService2.create();

    }
}
