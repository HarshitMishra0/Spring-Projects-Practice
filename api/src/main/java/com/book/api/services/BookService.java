package com.book.api.services;

import com.book.api.entities.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private static List<Book> list = new ArrayList<>();

    static {
        list.add(new Book(2,"James Clear", "Atomic Habits", 600));
        list.add(new Book(3,"afe dsf", "fa df", 500));
        list.add(new Book(4,"adsfr", "dafs dfs", 800));
    }

    //get all books

    public List<Book> getAllBooks(){
        return list;
    }

    //get single book by id
    public Book getBookById(int id){
        list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }


}
