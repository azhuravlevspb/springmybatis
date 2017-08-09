package com.springmybatis.service.impl;


import com.springmybatis.mappers.BookMapper;
import com.springmybatis.model.Book;
import com.springmybatis.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public Collection<Book> getBooks() {

        return bookMapper.getBooks();
    }

    public boolean addBook(Book book) {
        bookMapper.insertBook(book);
        return true;
    }

    public void deleteBook(int id) {
        bookMapper.deleteBook(id);
    }

    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }
}
