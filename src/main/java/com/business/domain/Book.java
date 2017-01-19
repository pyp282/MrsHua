package com.business.domain;

/**
 * Created by pei on 2016/5/31.
 */
public class Book {
    private int bid;
    private String bookname;
    private String bookauthor;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bookname='" + bookname + '\'' +
                ", bookauthor='" + bookauthor + '\'' +
                '}';
    }
}
