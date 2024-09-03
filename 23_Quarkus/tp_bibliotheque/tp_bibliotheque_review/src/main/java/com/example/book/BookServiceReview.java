package com.example.book;

import com.example.dto.BookDto;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/api/reviewbook")
@RegisterRestClient(configKey = "tp_bibliotheque_book")
public interface BookServiceReview {
    @GET
    @Path("/{id}")
    BookDto getBook(@PathParam("id") String id);
}
