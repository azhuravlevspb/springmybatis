package com.springmybatis.controller;

import com.springmybatis.model.Book;
import com.springmybatis.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@Controller
@RequestMapping(value = "/data/books")
public class BooksController {

    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    Collection<Book> getBooks() {
        return bookService.getBooks();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.OK)
    public void editBook(@RequestBody Book book) {
        bookService.updateBook(book);
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public void deleteBook(@PathVariable(value = "id") final String id) {
        bookService.deleteBook(Integer.parseInt(id));
    }

}