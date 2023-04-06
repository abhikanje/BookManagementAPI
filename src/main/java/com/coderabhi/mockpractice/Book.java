package com.coderabhi.mockpractice;

public class Book {

    private String bookName;
    private String authorName;
    private int pages;

    public Book() {
    }

    public Book(String authorName, int pages, String bookName) {
        this.authorName = authorName;
        this.pages = pages;
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
