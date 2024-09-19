package org.example.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;
import org.example.entity.Department;
import org.example.repository.DepartmentRepository;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class DepartmentService {

    @Inject
    DepartmentRepository departmentRepository;

    public Department getDepartmentById(Long id) {
        return Optional.ofNullable(departmentRepository.findById(id))
                .orElseThrow(() -> new WebApplicationException("Département non trouvé", 404));
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.listAll();
    }

    @Transactional
    public Response createDepartment(Department department) {
        validateDepartment(department);
        departmentRepository.persist(department);
        return Response.status(Response.Status.CREATED).entity(department).build();
    }

    @Transactional
    public Response updateDepartment(Department department) {
        Department existingDepartment = departmentRepository.findById(department.getId());
        if (existingDepartment == null) {
            throw new WebApplicationException("Département non trouvé", 404);
        }
        existingDepartment.setName(department.getName());
        existingDepartment.setOrganisation(department.getOrganisation());
        departmentRepository.persist(existingDepartment);
        return Response.status(Response.Status.OK).entity(existingDepartment).build();
    }

    @Transactional
    public Response deleteDepartment(Long id) {
        Department department = departmentRepository.findById(id);
        if (department == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        departmentRepository.delete(department);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    private void validateDepartment(Department department) {
        if (department == null) {
            throw new WebApplicationException("Le département ne peut pas être nul", 400);
        }
        if (department.getName() == null || department.getName().isEmpty()) {
            throw new WebApplicationException("Le nom du département ne peut pas être nul ou vide", 400);
        }
    }
}
