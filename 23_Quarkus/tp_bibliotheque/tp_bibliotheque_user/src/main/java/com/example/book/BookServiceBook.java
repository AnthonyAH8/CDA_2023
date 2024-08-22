package com.example.book;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.awt.print.Book;

@Path("/api/authorbook")
@RegisterRestClient(configKey = "tp_bibliotheque_book")
public interface BookServiceBook {

    @GET
    @Path("/{id}")
    Book getBook(@PathParam("id") int id);

}
