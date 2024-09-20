package com.example.service;

import com.example.entity.Organisation;
import com.example.repository.OrganisationRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class OrganisationService {

    @Inject
    OrganisationRepository organisationRepository;

    public List<Organisation> getAllOrganisations(){
        List<Organisation> organisations = organisationRepository.listAll();
        return organisations;
    }

    public Optional<Organisation> getOrganisationById(Long id) {
        return Optional.ofNullable(Optional.ofNullable(organisationRepository.findById(id))
                .orElseThrow(() -> new WebApplicationException("Organisation not found", 404)));
    }

    @Transactional
    public Response createOrganisation(Organisation organisation){
        validateOrganisation(organisation);
        organisationRepository.persist(organisation);
        return Response.status(Response.Status.CREATED).entity(organisation).build();
    }

    @Transactional
    public Response updateOrganisation(Organisation organisation){
        Organisation existingOrganisation = organisationRepository.findById(organisation.getId());
        if (existingOrganisation == null){
            throw new WebApplicationException("Organisation non trouvée", 404);
        }
        existingOrganisation.setName(organisation.getName());
        existingOrganisation.setWorkersNumber(organisation.getWorkersNumber());
        existingOrganisation.setArrivedAt(organisation.getArrivedAt());
        return Response.status(Response.Status.OK).entity(existingOrganisation).build();
    }

    @Transactional
    public Response deleteOrganisation(Long id){
        Organisation organisation = organisationRepository.findById(id);
        if (organisation == null){
            throw new WebApplicationException("Organisation non trouvée", 404);
        }
        organisationRepository.delete(organisation);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    private void validateOrganisation(Organisation organisation){
        if (organisation == null){
            throw new WebApplicationException("L'organisation ne peut pas être nulle");
        }
        if (organisation.getName() == null || organisation.getName().isEmpty()){
            throw new WebApplicationException("Le nom de l'organisation ne peut pas être nul");
        }
    }
}
