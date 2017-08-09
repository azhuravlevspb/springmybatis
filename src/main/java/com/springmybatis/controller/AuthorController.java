package com.springmybatis.controller;

import com.springmybatis.model.Author;
import com.springmybatis.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@RequestMapping(value = "/data/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    Collection<Author> getAuthors() {
        return authorService.getAuthors();
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    String addAuthor(@RequestParam Author author) {
        authorService.addAuthor(author);
        return "success";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody
    void editAuthor(@RequestParam Author author) {
        authorService.updateAuthor(author);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public @ResponseBody
    void deleteAuthor(@RequestParam Author author) {
        authorService.deleteAuthor(author);
    }
}
