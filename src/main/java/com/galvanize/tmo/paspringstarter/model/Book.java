package com.galvanize.tmo.paspringstarter.model;

public class Book {

    private String author;
    private String bookName;
    private int yearPublished;
    private int bookId;

    public Book(String author, String bookName, int yearPublished, int bookId) {
        this.author = author;
        this.bookName = bookName;
        this.yearPublished = yearPublished;
        this.bookId = bookId;
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

    public int getBookId() {
        return bookId;
    }
}
