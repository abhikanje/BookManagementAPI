package com.coderabhi.mockpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public String addBook(Book book){
        return bookRepository.addBook(book);
    }

    public String addAuthor(Author author){
        return bookRepository.addAuthor(author);
    }

    public String getHighestNumberPagesBook(){
        return bookRepository.getHighestNumberPagesBook();
    }


    public void updateBookPages(String bookName, int extraPages){
        bookRepository.updateBookPages(bookName, extraPages);
    }


    public int findTopRatedBooks(int ratings){
        return bookRepository.findTopRatedBooks(ratings);
    }

}
