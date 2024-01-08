package com.study.ch08.book;

public class BookService {
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    boolean isFull() {
        return bookRepository.getEmptyIndex() == -1;
    }
    void append(Book book) {
        bookRepository.insert(book);
    }
}
