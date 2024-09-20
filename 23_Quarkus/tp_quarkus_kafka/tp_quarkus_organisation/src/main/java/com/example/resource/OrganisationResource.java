package com.example.resource;

import com.example.entity.Organisation;
import com.example.service.OrganisationService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.Optional;

@Path("/organisation")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OrganisationResource {

    @Inject
    OrganisationService organisationService;

    @GET
    public List<Organisation> getAllOrganisations(){
        return organisationService.getAllOrganisations();
    }

    @GET
    @Path("/{id}")
    public Optional<Organisation> getOrganisationById(@PathParam("id") long id) {
        return organisationService.getOrganisationById(id);
    }

    @POST
    @Path("/create")
    public Response createOrganisation(Organisation organisation) {
        return organisationService.createOrganisation(organisation);
    }

    @PUT
    @Path("/update/{id}")
    public Response updateOrganisation(@PathParam("id") long id, Organisation organisation) {
        return organisationService.updateOrganisation(organisation);
    }

    @DELETE
    @Path("/delete/{id}")
    public Response deleteOrganisation(@PathParam("id") long id){
        return organisationService.deleteOrganisation(id);
    }
}
