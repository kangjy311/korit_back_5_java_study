package com.study.ch21;

import java.util.ArrayList;
import java.util.List;

public class ExceptionMain2 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("김준일");
        nameList.add("김준이");
        nameList.add(null);
        nameList.add("김준사");

        try {
            for(int i = 0; i < 5; i++) {
                String name = nameList.get(i);
                if(name.equals("김준사")) {                //null.equals() 는 될수없음 NullPointerException
                        System.out.println("김준사를 찾음!!");
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {            //예외처리 마지막에는 Exception e 걸어줘야한다
            e.printStackTrace();
        } finally {
            System.out.println("이거는 무조건 실행됨");
        }

        System.out.println("프로그램 정상 종료");


        //예외처리
        //컴파일 실행 후에 일어나는 오류는 RuntimeException
        //문법이 틀리면 컴파일 실행 x
    }
}
