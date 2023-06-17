package io.xstefank;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    public String hello() {
        return "Ahoj z RESTEasy Reactive";
    }

//    @GET
//    public List<Avenger> getAll() {
//        return Avenger.listAll();
//    }
//
//    @POST
//    @Path("/create")
//    @Transactional
//    public Avenger create(Avenger avenger) {
//        avenger.persist();
//        return avenger;
//    }
}
