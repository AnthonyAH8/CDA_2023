package org.example.departement;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.example.dto.DepartmentDto;

@Path("/departments")
@RegisterRestClient(configKey = "department-service")
public interface DepartmentService {
    @GET
    @Path("/{id}")
    DepartmentDto getDepartmentById(@PathParam("id") int id);
}
