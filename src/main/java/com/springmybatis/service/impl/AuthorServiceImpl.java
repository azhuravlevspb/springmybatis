package com.springmybatis.service.impl;

import com.springmybatis.mappers.AuthorMapper;
import com.springmybatis.model.Author;
import com.springmybatis.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorMapper authorMapper;

    public Collection<Author> getAuthors() {
        return authorMapper.getAuthors();
    }

    public void addAuthor(Author author) {
        authorMapper.insertAuthor(author);
    }

    public void deleteAuthor(Author author) {
        authorMapper.deleteAuthor(author.getId());
    }

    public void updateAuthor(Author author) {
        authorMapper.updateAuthor(author);
    }
}
