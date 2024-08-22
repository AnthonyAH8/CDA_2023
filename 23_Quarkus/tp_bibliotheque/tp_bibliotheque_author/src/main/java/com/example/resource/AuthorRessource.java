package com.example.resource;

import com.example.entity.Author;
import com.example.service.AuthorService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/api/author")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthorRessource {

    @Inject
    AuthorService authorService;

    @GET
    public Response getAllAuthors() {
        return Response.ok(authorService.getAuthors()).build();
    }

    @GET
    @Path("/{id}")
    public Response getAuthorById(@PathParam("id") int id) {
        List<Author> authors = authorService.getAuthors();
        return Response.ok(authors.get(id)).build();
    }

    @POST
    @Path("/addauthor")
    public Response addAuthor(Author author) {
        Author newAuthor = authorService.addAuthor(author);
        return Response.ok(newAuthor).build();
    }

    @PUT
    @Path("/updateauthor/{id}")
    public Response updateAuthor(@PathParam("id") Long id, Author author) {
        Author updateAuthor = authorService.updateAuthor(id, author);
        return Response.ok(updateAuthor).build();
    }

    @DELETE
    @Path("/deletauthor/{id}")
    public Response deleteAuthor(@PathParam("id") Long id) {
        authorService.deleteAuthor(id);
        return Response.ok().build();
    }

}
