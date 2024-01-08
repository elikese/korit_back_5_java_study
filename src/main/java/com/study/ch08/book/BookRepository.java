package com.study.ch08.book;

public class BookRepository {
    Book[] books;

    BookRepository(Book[] books) {
        this.books = books;
    }

    int getEmptyIndex() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                return i;
            }
        }
        return -1;
    }

    void insert(Book book) {
        books[getEmptyIndex()] = book;
    }

    Book[] getBookDatas() {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                count++;
            }
        }
        Book[] newBooks = new Book[count];

        int j = 0;

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                newBooks[j] = books[i];
                j++;
            }
        }
        return newBooks;
    }
    
}
