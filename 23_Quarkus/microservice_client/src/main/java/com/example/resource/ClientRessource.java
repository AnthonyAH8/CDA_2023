package com.example.resource;

import com.example.entity.Client;
import com.example.service.ClientService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/api/client")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClientRessource {

    @Inject
    ClientService clientService;

    @GET
    public List<Client> getClients() {
        return clientService.getAllClients();
    }

    @POST
    @Path("/addclient")
    public Response addClient(Client client) {
        Client newClient = clientService.createClient(client.getName(), client.getEmail(), client.getPhoneNumber());
        return Response.ok(newClient).status(201).build();
    }

    @PUT
    @Path("/updateclient/{id}")
    public Response updateClient(@PathParam("id") int id, String name, String email, String phoneNumber) {
        Client updateClient = clientService.updateClient(id, name, email, phoneNumber);
        return Response.ok(updateClient).build();
    }

    @DELETE
    @Path("/deleteclient/{id}")
    public Response deleteClient(@PathParam("id") int id) {
        clientService.deleteClient(id);
        return Response.noContent().build();
    }

    @GET
    @Path("/{id}")
    public Response getClientById(@PathParam("id") int id) {
        List<Client> clients = clientService.getAllClients();
        for (Client client : clients) {
            if (client.getId() == id) {
                return Response.ok(client).build();
            }else {
                throw new WebApplicationException(Response.Status.NOT_FOUND);
            }
        }
        return Response.noContent().build();
    }
}
