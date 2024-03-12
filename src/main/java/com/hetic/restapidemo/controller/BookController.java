package com.hetic.restapidemo.controller;

import com.hetic.restapidemo.dto.Book;
import com.hetic.restapidemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("")
    public Book create(@RequestBody Book book) {
        return bookService.save(book);
    }

    @GetMapping("")
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Book> findById(@PathVariable Long id){
        return bookService.findById(id);
    }

    @DeleteMapping("/{id}")
    public Long deleteById(@PathVariable Long id){
        bookService.deleteById(id);
        return id;
    }
}
