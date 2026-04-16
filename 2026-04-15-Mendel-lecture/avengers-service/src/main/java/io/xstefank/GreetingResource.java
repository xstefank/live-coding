package io.xstefank;

import io.quarkus.logging.Log;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Path("/avenger")
public class GreetingResource {

    private static final AtomicLong counter = new AtomicLong();

//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello() {
////        Log.info(?"Counter: " + counter.incrementAndGet());
//        Log.info("hello");
//        Log.debug("Hello World!");
//        Log.trace("Hello World!");
//        return "Hello from Mendel!";
//    }

    @POST
    @Transactional
    public Avenger create() {
        Avenger avenger = new Avenger();
        avenger.name = "Mendel";
        avenger.civilName = "Mendel";
        avenger.snapped = true;

        avenger.persist();

        return avenger;
    }

    @GET
    public List<Avenger> findAll() {
        return Avenger.listAll();
    }

}
