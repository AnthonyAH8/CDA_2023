package com.example.author;

import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/api/bookauthor")
@RegisterRestClient(configKey = "tp_bibliotheque_author")
public interface AuthorServiceAuthor {

}
