package com.galvanize.tmo.paspringstarter.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "id", "author", "title", "yearPublished" })
public class Book {

    private String author;
    private String title;
    private int yearPublished;
    private int id;

    public Book(int id,String author, String bookName, int yearPublished) {
        this.id = id;
        this.author = author;
        this.title = bookName;
        this.yearPublished = yearPublished;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getBookName() {
        return title;
    }

    public void setBookName(String bookName) {
        this.title = bookName;
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
