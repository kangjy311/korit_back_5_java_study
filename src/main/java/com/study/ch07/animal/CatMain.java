package com.study.ch07.animal;

import java.util.Scanner;

public class CatMain {
    public static void main(String[] args) {

        CatService catService = new CatService();
        Scanner scanner = new Scanner(System.in);
        String catName = null;
        String catSpecies = null;
        int catAge = 0;


        System.out.println("등록 프로그램");

        System.out.println("이름 >> ");
        catName = scanner.nextLine();
        if(catService.isEmpty(catName)) {
            System.out.println("이름을 다시 입력하세요.");
            return;
        }

        System.out.println("종류 >> ");
        catSpecies = scanner.nextLine();
        if(catService.isEmpty(catSpecies)) {
            System.out.println("이름을 다시 입력하세요.");
            return;
        }

        System.out.println("나이 >> ");
        catAge = scanner.nextInt();

        Cat cat = new Cat(catName, catSpecies, catAge);

    }
}
