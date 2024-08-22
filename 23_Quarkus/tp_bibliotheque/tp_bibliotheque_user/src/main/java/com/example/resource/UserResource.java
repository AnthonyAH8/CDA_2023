package com.example.resource;

import com.example.entity.User;
import com.example.service.UserService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/api/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    UserService userService;

    @GET
    public Response getAllUsers() {
        return Response.ok(userService.getUsers()).build();
    }

    @GET
    @Path("/{id}")
    public Response getUserById(@PathParam("id") int id) {
       List<User> users = userService.getUsers();
       return Response.ok(users.get(id)).build();

    }

    @POST
    @Path("/adduser")
    public Response addUser(User user) {
        User newUser = userService.addUser(user);
        return Response.ok(newUser).build();
    }

    @PUT
    @Path("/updateuser/{id}")
    public Response updateUser(@PathParam("id") Long id, User user) {
        User updateUser = userService.updateUser(id,user);
        return Response.ok(updateUser).build();
    }

    @DELETE
    @Path("/deleteuser/{id}")
    public Response deleteUser(@PathParam("id") Long id) {
        userService.deleteUser(id);
        return Response.ok().build();
    }

}
