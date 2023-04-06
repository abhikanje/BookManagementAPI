package com.coderabhi.mockpractice;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class BookRepository {
    private HashMap<String, Book> book_db;
    private HashMap<String, Author> author_db;

    public BookRepository(){
        this.book_db = new HashMap<>();
        this.author_db = new HashMap<>();
    }

    public String addBook(Book book){
        if(book_db.containsKey(book.getBookName())){
            return "Book already present in data base";
        }

        book_db.put(book.getBookName(), book);
        return "Book added successfully";
    }

    public String addAuthor(Author author){
        if(author_db.containsKey(author.getName())){
            return "Author already present in data base";
        }

        author_db.put(author.getName(), author);
        return "Author added successfully";
    }

    public String getHighestNumberPagesBook(){
        String bookName = "";
        int maxPages = 0;
        for(Book book : book_db.values()){
            if(book.getPages() > maxPages){
                maxPages = book.getPages();
                bookName = book.getBookName();
            }
        }

        return bookName;
    }

    // Que - add extra pages into current pages of given book
    public void updateBookPages(String bookName, int extraPages){
        int oldPages = book_db.get(bookName).getPages();
        book_db.get(bookName).setPages(oldPages+extraPages);
    }

    // Que - total number of books whose author have ratings more than X.
    public int findTopRatedBooks(int ratings){

        int topRatedAuthorBooks = 0;
        for(Book book : book_db.values()){
            String authorName = book.getAuthorName();
            if(author_db.get(authorName).getRatings() > ratings){
                topRatedAuthorBooks++;
            }
        }
        return topRatedAuthorBooks;
    }
}
