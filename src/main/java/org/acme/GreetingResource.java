package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Path("/world")
    @Produces(MediaType.TEXT_PLAIN)
    public String world() {
        return "Hello world";
    }

    // pouet
    @GET
    @Path("/toto")
    @Produces(MediaType.TEXT_PLAIN)
    public String toto() {
        return "Hello world";
    }
}