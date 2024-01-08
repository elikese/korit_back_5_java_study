package com.study.ch08.book;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[3];
        BookRepository bookRepository = new BookRepository(books);
        BookService bookService = new BookService(bookRepository);

        boolean flag = true;

        while (flag) {
            System.out.println("<<< 도서 관리 시스템 >>>");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 목록 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>> ");
            String selectMenu = scanner.nextLine();

            if ("1".equals(selectMenu)) {
                String title;
                String author;

                if (!bookService.isEmpty()) {
                    System.out.println("-------------------------------");
                    System.out.println("책을 등록할 수 없습니다 : 공간없음");
                    System.out.println("-------------------------------");
                    continue;
                }

                System.out.print("책 제목 입력 >>> ");
                title = scanner.nextLine();
                System.out.print("책 저자 입력 >>> ");
                author = scanner.nextLine();

                Book book = new Book(title, author);
                bookService.Append(book);

            } else if ("2".equals(selectMenu)) {
                bookService.printRegisteredBook();

            } else if ("q".equalsIgnoreCase(selectMenu)) {
                System.out.println("프로그램 종료");
                flag = false;
            } else {
                System.out.println("잘못 입력하셨습니다");
            }

        }
        System.out.println("프로그램이 종료되었습니다");
    }
}
