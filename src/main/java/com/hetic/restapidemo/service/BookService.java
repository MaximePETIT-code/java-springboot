package com.hetic.restapidemo.service;

import com.hetic.restapidemo.dto.Book;
import com.hetic.restapidemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public Optional<Book> findById(@PathVariable Long id){
        return bookRepository.findById(id);
    }

    public Long deleteById(@PathVariable Long id){
        bookRepository.deleteById(id);
        return id;
    }
    
}
