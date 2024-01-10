package com.study.ch13.book;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;


        while (flag) {
            System.out.println("<<< 도서 관리 시스템 >>>");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 목록 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>> ");
            String selectMenu = scanner.nextLine();

            if ("1".equals(selectMenu)) {
                Book book = new Book();
                System.out.print("제목 입력>>>");
                book.setTitle(scanner.nextLine());
                System.out.print("저자 입력>>>");
                book.setAuthor(scanner.nextLine());

                for (int i = 0; i < BookRepository.books.length; i++) {
                    if (BookRepository.books[i] == null) {
                        BookRepository.books[i] = book;
                        break;
                    }
                }
            } else if ("2".equals(selectMenu)) {
                for (int i = 0; i < BookRepository.books.length; i++) {
                    if (BookRepository.books[i] != null) {
                        System.out.println(BookRepository.books[i].toString());
                    } else {
                        System.out.println("null");
                    }
                }
            } else if ("q".equalsIgnoreCase(selectMenu)) {
                flag = false;

            } else {
                System.out.println("잘못 입력하셨습니다");
            }
        }
        System.out.println("프로그램이 종료되었습니다");
    }
}
