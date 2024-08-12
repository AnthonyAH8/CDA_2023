package com.example.exercice_gestion_bibliotheque.controller;


import com.example.exercice_gestion_bibliotheque.annotation.LogAnnotation;
import com.example.exercice_gestion_bibliotheque.annotation.PerformanceAnnotation;
import com.example.exercice_gestion_bibliotheque.entity.Book;
import com.example.exercice_gestion_bibliotheque.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PerformanceAnnotation
    @LogAnnotation
    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.saveBook(book));
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") int id) {
        return ResponseEntity.ok(bookService.getBookById(id));
    }

}
