package com.BookAPI.bookAPI.component;

import com.BookAPI.bookAPI.model.Book;
import com.BookAPI.bookAPI.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    BookService service;

    @Override
    public void run(String... args) throws Exception {
        service.addBook(new Book("Clean code", "Martin", false,2008));
        service.addBook(new Book("Clean", "fake Martin", false,2010));
    }
}
