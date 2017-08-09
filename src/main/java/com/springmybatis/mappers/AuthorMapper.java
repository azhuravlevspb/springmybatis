package com.springmybatis.mappers;

import com.springmybatis.model.Author;

import java.util.Collection;

public interface AuthorMapper extends IMapper {

    Collection<Author> getAuthors();

    Author getAuthorById(int id);

    void insertAuthor(Author author);

    void updateAuthor(Author author);

    void deleteAuthor(int id);
}
