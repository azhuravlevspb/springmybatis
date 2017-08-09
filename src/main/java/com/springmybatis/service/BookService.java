package com.springmybatis.service;

import com.springmybatis.model.Book;

import java.util.Collection;

public interface BookService {

    Collection<Book> getBooks();

    boolean addBook(Book book);

    void deleteBook(int id);

    void updateBook(Book book);
}
