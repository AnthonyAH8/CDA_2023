package org.example.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.entity.Employee;
import org.example.service.EmployeeService;

import java.util.List;

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeResource {

    @Inject
    EmployeeService employeeService;

    @GET
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @GET
    @Path("/{id}")
    public Employee getEmployee(@PathParam("id") int id) {
        return employeeService.getEmployee(id);
    }

    @POST
    @Path("/create")
    public Response createEmployee(Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @PUT
    @Path("/update/{id}")
    public Response updateEmployee(@PathParam("id") int id, Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    @DELETE
    @Path("/delete/{id}")
    public Response deleteEmployee(@PathParam("id") int id) {
        return employeeService.deleteEmployee(id);
    }

    @GET
    @Path("/department/{id}")
    public List<Employee> getEmployeeByDepartment(@PathParam("id") Long id) {
        return employeeService.getEmployeeByDepartment(id);
    }
}
