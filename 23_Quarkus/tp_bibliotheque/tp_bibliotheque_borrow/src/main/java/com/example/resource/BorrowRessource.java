package com.example.resource;

import com.example.entity.Borrow;
import com.example.service.BorrowService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/api/borrow")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BorrowRessource {

    @Inject
    BorrowService borrowService;

    @GET
    public Response getBorrow() {
        return Response.ok(borrowService.getBorrowedBooks()).build();
    }

    @GET
    @Path("/{id}")
    public Response getBorrowById(@PathParam("id") int id) {
        List<Borrow> borrows = borrowService.getBorrowedBooks();
        return Response.ok(borrows.get(id)).build();
    }

    @POST
    @Path("/addborrow")
    public Response addBorrow(Borrow borrow) {
        Borrow newBorrow = borrowService.createBorrow(borrow);
        return Response.ok(newBorrow).build();
    }

    @PUT
    @Path("/updateborrow/{id}")
    public Response updateBorrow(Borrow borrow, @PathParam("id") Long id) {
        Borrow updateBorrow = borrowService.updateBorrow(id, borrow);
        return Response.ok(updateBorrow).build();
    }
}
