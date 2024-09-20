package org.example.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.entity.Department;
import org.example.service.DepartmentService;

import java.util.List;

@Path("/department")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DepartmentResource {

    @Inject
    DepartmentService departmentService;

    @GET
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GET
    @Path("/{id}")
    public Department getDepartmentById(@PathParam("id") long id) {
        return departmentService.getDepartmentById(id);
    }

    @POST
    @Path("/create")
    public Response createDepartment(Department department) {
        return departmentService.createDepartment(department);
    }

    @PUT
    @Path("/update/{id}")
    public Response updateDepartment(@PathParam("id") long id, Department department) {
        return departmentService.updateDepartment(department);
    }

    @DELETE
    @Path("/delete/{id}")
    public Response deleteDepartment(@PathParam("id") long id) {
        return departmentService.deleteDepartment(id);
    }

}
