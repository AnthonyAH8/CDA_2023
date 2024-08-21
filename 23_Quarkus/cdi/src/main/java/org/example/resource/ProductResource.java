package org.example.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.service.ProductService;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {

    @Inject
    private ProductService productService;

    @GET
    @Path("/mysql")
    public Response getAllProductsMySQL() {
        try{
            productService.printMysqlProducts();
            return Response.ok().entity("Produits mySQL").build();
        }catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }

    @GET
    @Path("/postgres")
    public Response getAllProductsPostgres() {
        try{
            productService.printPostgresProducts();
            return Response.ok().entity("Produits mySQL").build();
        }catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }
}
