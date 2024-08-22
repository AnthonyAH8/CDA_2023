package com.example.service;

import com.example.entity.Author;
import com.example.repository.AuthorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class AuthorService {

    @Inject
    AuthorRepository authorRepository;

    public List<Author> getAuthors() {
        return authorRepository.listAll();
    }

    public Author getAuthorById(Long id) {
        return authorRepository.findById(id);
    }

    @Transactional
    public Author addAuthor(Author author) {
        authorRepository.persist(author);
        return author;
    }

    @Transactional
    public Author updateAuthor(Long id, Author author) {
        Author existingAuthor = authorRepository.findById(id);
        if (existingAuthor != null) {
            existingAuthor.setName(author.getName());
            existingAuthor.setBiography(author.getBiography());
            existingAuthor.setDateOfBirth(author.getDateOfBirth());
        }else{
            throw new EntityNotFoundException("Author with id " + id + " not found");
        }
        return existingAuthor;
    }

    @Transactional
    public Author deleteAuthor(Long id) {
        Author existingAuthor = authorRepository.findById(id);
        if (existingAuthor != null) {
            authorRepository.delete(existingAuthor);
        }
        return existingAuthor;
    }
}
