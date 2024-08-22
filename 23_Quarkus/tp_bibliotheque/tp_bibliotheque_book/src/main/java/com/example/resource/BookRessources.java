package com.example.resource;

import com.example.entity.Book;
import com.example.service.BookService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/api/book")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookRessources {

    @Inject
    BookService bookService;

    @GET
    public List<Book> getAllBooks() {
        return bookService.getBooks();
    }

    @GET
    @Path("/{id}")
    public Book getBookById(@PathParam("id") Long id) {
        return bookService.getBookById(id);
    }

    @POST
    @Path("/addbook")
    public Book addBook(Book book) {
        return bookService.addBook(book);
    }

    @PUT
    @Path("/updateproduct/{id}")
    public Book updateBook(@PathParam("id") Long id, Book book) {
        return bookService.updateBook(book);
    }

    @DELETE
    @Path("/deletebook/{id}")
    public void deleteBook(@PathParam("id") Long id) {
        bookService.deleteBook(id);
    }

}
