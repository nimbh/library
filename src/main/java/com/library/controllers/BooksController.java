package com.library.controllers;


import com.library.dao.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BooksController {

    private final BookDAO bookDAO;

    @Autowired
    public BooksController(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @GetMapping()
    public String index_book(Model model){
        model.addAttribute("books", bookDAO.index_book());
        return "books/indexBook";
    }

    @GetMapping("/{id}")
    public String show_book(@PathVariable("id") int id, Model model){
        model.addAttribute("book", bookDAO.show_book(id));
        return "books/showBook";
    }






}
