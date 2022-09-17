package dev.ifrs;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.quarkus.oidc.token.propagation.AccessToken;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * To use it via injection.
 *
 * {@code
 *     @Inject
 *     @RestClient
 *     MyRemoteService myRemoteService;
 *
 *     public void doSomething() {
 *         Set<MyRemoteService.Extension> restClientExtensions = myRemoteService.getExtensionsById("io.quarkus:quarkus-rest-client");
 *     }
 * }
 */

@AccessToken
@RegisterRestClient(baseUri = "http://localhost:8082/backend")
public interface BackendClient {

    @GET
    @Path("/{a}/{b}")
    @RolesAllowed({ "User" })
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)  
    public int getSum(@PathParam("a") int a,@PathParam("b") int b);
    
}
