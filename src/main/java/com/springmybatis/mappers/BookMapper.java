package com.springmybatis.mappers;

import com.springmybatis.model.Author;
import com.springmybatis.model.Book;

import java.util.Collection;

public interface BookMapper extends IMapper {

    Collection<Book> getBooks();

    Book getBookById(int id);

    void insertBook(Book book);

    void updateBook(Book book);

    void deleteBook(int id);

    Author getAuthorById(int id);

}
