package com.springmybatis.model;


public class Book{

    private int id;

    private String name;

   // private Author author;

    private int author_id;

    private int price;


    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }*/

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }
}
