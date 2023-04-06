package com.coderabhi.mockpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/add-book")
    public ResponseEntity addBook(@RequestBody Book book){
        String message = bookService.addBook(book);
        return new ResponseEntity(message, HttpStatus.CREATED);
    }

    @PostMapping("/add-author")
    public ResponseEntity addAuthor(@RequestBody Author author){
        String message = bookService.addAuthor(author);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @GetMapping("/get-highest-number-of-pages-book")
    public ResponseEntity getHighestNumberPagesBook(){
        String bookName = bookService.getHighestNumberPagesBook();
        return new ResponseEntity<>(bookName, HttpStatus.CREATED);
    }

    @PostMapping("/update-book-pages")
    public ResponseEntity updateBookPages(@RequestParam("bookName") String bookName, @RequestParam("extraPages") int extraPages){
        bookService.updateBookPages(bookName, extraPages);
        return new ResponseEntity<>("Pages Updated Successfully", HttpStatus.CREATED);
    }


    @GetMapping("/get-top-rated-books")
    public ResponseEntity findTopRatedBooks(@RequestParam("ratings") int ratings){
        int books = bookService.findTopRatedBooks(ratings);
        return new ResponseEntity<>(books, HttpStatus.CREATED);
    }
}
