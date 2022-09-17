import java.util.Arrays;
import java.util.HashSet;

import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import org.eclipse.microprofile.jwt.Claims;

import io.smallrye.jwt.build.Jwt;

@Path("/jwt")
public class Users {
    @GET
    //@Path("/{nome}")
    @PermitAll
    @Produces(MediaType.TEXT_PLAIN)
    public String getJwt(@Context SecurityContext ctx) {
        return Jwt.issuer("http://localhost:8080")
                .upn("chris@teste.dev")
                .groups(new HashSet<>(Arrays.asList("User", "Admin")))
                .claim(Claims.full_name, "Christian Figueiro")
                .sign();
    }
}
