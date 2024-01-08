package com.study.ch08.book;

import com.study.ch08.car.CarRepository;

public class BookRepository {
    final Book[] books;

    public BookRepository(Book[] books) {
        this.books = books;
    }
    int getEmptyIndex() {
        for(int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                return i;
            }
        }
        return -1;
    }

    void insert(Book book) {
        books[getEmptyIndex()] = book;
    }
}
