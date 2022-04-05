package com.galvanize.tmo.paspringstarter.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "id", "author", "title", "yearPublished" })
public class Book {

    private String author;
    private String title;
    private int yearPublished;
    private int id;

    public Book(int id,String author, String title, int yearPublished) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public int getId() {
        return id;
    }
}
