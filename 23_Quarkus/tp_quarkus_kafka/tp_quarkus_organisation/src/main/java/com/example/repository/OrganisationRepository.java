package com.example.repository;

import com.example.entity.Organisation;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class OrganisationRepository implements PanacheRepository<Organisation> {

}
