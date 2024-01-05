package com.study.ch07.member;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();

        String selectedMenu = null;


        //반복문 안에 switch 쓰려면 flag 아니면 if문
        while(true) {
            System.out.println("[[ 회원 관리 프로그램 ]]");
            System.out.println("1. 회원 등록");
            System.out.println("q. 프로그램 종료하기");

            System.out.print("메뉴 선택 >> ");
            selectedMenu = scanner.nextLine();
            
            if("1".equals(selectedMenu)) {
                boolean responseData = memberService.addMember();
                if(responseData) {
                    System.out.println("<<< 회원 등록 완료 >>>");
                } else {
                    System.out.println("<<< 회원 등록 취소 >>>");
                }
            } else if("q".equalsIgnoreCase(selectedMenu)) {
                //equalsIgnoreCase  -> 대소문자 구분x
                break;
            } else {
                System.out.println("다시 선택하세요");
            }
            System.out.println();

//            switch (selectedMenu) {
//                case "1":
//                    break;
//                case "q":
//                    break;
//                case "Q":
//                    break;
//                default:
//                    System.out.println("다시 선택하세요");
//            }

        }
        System.out.println();
        System.out.println("<<<<<< 프로그램이 종료되었습니다. >>>>>>");

    }
}
