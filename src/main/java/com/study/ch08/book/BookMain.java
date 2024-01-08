package com.study.ch08.book;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        //책제목, 저자
        Scanner scanner = new Scanner(System.in);
        String selectNum = null;
        boolean flag = true;

        String title = null;
        String author = null;
        Book[] books = new Book[3];
        BookRepository bookRepository = new BookRepository(books);
        BookService bookService = new BookService(bookRepository);


        while(flag) {
            System.out.println("책 관리 프로그램");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("입력 >> ");

            selectNum = scanner.nextLine();
            if("q".equalsIgnoreCase(selectNum)) {
                System.out.println("프로그램이 종료되었습니다.");
                flag = false;

            } else if("1".equals(selectNum)) {
                System.out.println("책 등록 페이지");
                if(bookService.isFull()) {
                    System.out.println("등록할 수 없습니다");
                    continue;
                }

                System.out.print("책 제목 >> ");
                title = scanner.nextLine();
                System.out.print("책 저자 >> ");
                author = scanner.nextLine();

                Book book = new Book(title, author);
                bookService.append(book);

            } else if("2".equals(selectNum)) {
                System.out.println("책 조회 페이지");
                for(int i = 0; i < books.length; i++) {
                    System.out.print("[" + i + "]" + " >> ");
                    if(books[i] == null) {
                        System.out.println(" - ");
                        continue;
                    }
                    System.out.println(books[i].toString());
                }

            } else {
                System.out.println("다시 입력하세요");

            }

        }
        System.out.println("< 프로그램 종료 >");

    }
}
