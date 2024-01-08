package com.study.ch08.book;

public class BookService {
    BookRepository bookRepository;

    BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    boolean isEmpty() {
        return bookRepository.getEmptyIndex() != -1;
    }

    void Append(Book book) {
        bookRepository.insert(book);
    }

    void printRegisteredBook() {
        Book[] books = bookRepository.getBookDatas();
        if (books.length == 0) {
            System.out.println("등록된 차량이 없습니다");
        } else {
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i].toString());
            }
        }
    }
}