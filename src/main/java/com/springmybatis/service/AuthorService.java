package com.springmybatis.service;


import com.springmybatis.model.Author;

import java.util.Collection;

public interface AuthorService {
    Collection<Author> getAuthors();

    void addAuthor(Author author);

    void deleteAuthor(Author author);

    void updateAuthor(Author author);
}
