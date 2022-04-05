package com.galvanize.tmo.paspringstarter.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "id", "author", "title", "yearPublished" })
public class Book {

    private String author;
    private String bookName;
    private int yearPublished;
    private int id;

    public Book(int id,String author, String bookName, int yearPublished) {
        this.id = id;
        this.author = author;
        this.bookName = bookName;
        this.yearPublished = yearPublished;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String description) {
        this.yearPublished = yearPublished;
    }

    public int getId() {
        return id;
    }
}
