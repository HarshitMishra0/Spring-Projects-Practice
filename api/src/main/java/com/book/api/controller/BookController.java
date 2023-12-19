package com.book.api.controller;

import com.book.api.entities.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/books")
    public Book getBooks(){
        Book book = new Book();

        book.setId(1);
        book.setAuthor("Harshit");
        book.setName("Way of Life");
        book.setPrice(499);


        return book;


    }
}
