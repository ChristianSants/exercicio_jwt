package dev.ifrs;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/getSum")
public class Backend {
    @GET
    @Path("/{a}/{b}")
    @RolesAllowed({ "User" })
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public int getSum(@PathParam("a") int a,@PathParam("b") int b) {
        return a + b;
    }
}