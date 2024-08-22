package com.example.service;

import com.example.entity.Book;
import com.example.repository.BookRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class BookService {

    @Inject
    BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.listAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id);
    }

    @Transactional
    public Book addBook(Book book) {
        bookRepository.persist(book);
        return book;
    }

    @Transactional
    public Book updateBook(Book book) {
        Book bookToUpdate = bookRepository.findById(book.getId());
        bookToUpdate.setTitle(book.getTitle());
        bookToUpdate.setIsbn(book.getIsbn());
        return bookToUpdate;
    }

    @Transactional
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
