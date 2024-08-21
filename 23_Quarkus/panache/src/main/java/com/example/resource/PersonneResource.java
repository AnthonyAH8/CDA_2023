package com.example.resource;

import com.example.entity.Personne;
import com.example.repository.PersonneRepository;
import com.example.service.PersonneService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.Optional;

@Path("/personne")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonneResource {

    @Inject
    PersonneService personneService;

    @Inject
    PersonneRepository personneRepository;

    @GET
    public List<Personne> getAll() {
        return personneService.getAllPersonne();
    }

    @GET
    @Path("/{id}")
    public Response getPersonneById(@PathParam("id") int id) {
        Optional<Personne> personne = personneService.getPersonneById((long) id);
        if (personne.isPresent()) {
            return Response.ok(personne.get()).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/rechercher")
    public Response getPersonne(@QueryParam("prenom") String prenom) {
        List<Personne> personnes = personneService.getPersonne(prenom);
        return Response.ok(personnes).build();
    }

    @GET
    @Path("/nomprenom")
    public Response getPersonneNomprenom(@QueryParam("prenom") String prenom, @QueryParam("nom") String nom) {
        List<Personne> personnes = personneRepository.findByPrenomAndNom(prenom, nom);
        return Response.ok(personnes).build();
    }

    @GET
    @Path("/age")
    public Response getPersonneAge(@QueryParam("age") int age) {
        List<Personne> personnes = personneRepository.findByAge(age);
        return Response.ok(personnes).build();
    }

    @GET
    @Path("/between")
    public Response getPersonneBetween(@QueryParam("minage") int minage, @QueryParam("maxage") int maxage) {
        List<Personne> personnes = personneRepository.findByAgeBetween(minage, maxage);
        return Response.ok(personnes).build();
    }

    @GET
    @Path("/contains")
    public Response getNameContains(@QueryParam("nom") String nom) {
        List<Personne> personnes = personneRepository.findByNameContaining(nom);
        return Response.ok(personnes).build();
    }

    @POST
    @Path("/addpersonne")
    public Response addPersonne(Personne personne) {
        Personne savedPersonne = personneService.addPerson(personne);
        return Response.status(Response.Status.CREATED).entity(savedPersonne).build();
    }
}

