package com.dev.spring5webapp.controllers;

import com.dev.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jakez on 19/02/2018.
 */

@Controller
public class BookController {

    private BookRepository bookRepository;

    // Spring will do autowiring
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        // Spring will internally pass Model object
        model.addAttribute("books", bookRepository.findAll());

        // this string is used for view in thymeleaf
        return "books";
    }
}
