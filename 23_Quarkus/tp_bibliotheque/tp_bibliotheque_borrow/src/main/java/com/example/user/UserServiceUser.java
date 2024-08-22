package com.example.user;

import com.example.dto.UserDto;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/api/userborrow")
@RegisterRestClient(configKey = "tp_bibliotheque_user")
public interface UserServiceUser {
    @GET
    @Path("/{id}")
    UserDto getUserById(@PathParam("id") Long id);
}
