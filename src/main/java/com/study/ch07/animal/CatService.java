package com.study.ch07.animal;

public class CatService {
    boolean isEmpty(String string) {
        if(string == null) {
            return true;
        }
        return string.isBlank();
    }

    void registerCatService() {
        CatRepository catRepository = new CatRepository();
        System.out.println("데이터 전달");
        
    }


}
