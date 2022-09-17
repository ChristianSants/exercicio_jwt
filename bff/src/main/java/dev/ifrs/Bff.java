package dev.ifrs;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/bff")
public class Bff {

    @Inject
    @RestClient
    BackendClient client;

    @GET
    @Path("/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    @RolesAllowed({"Admin"})
    public int sum(@PathParam("a") int a,@PathParam("b") int b) {
        return client.sum(a, b);
    }
}