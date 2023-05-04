package io.xstefank;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.util.concurrent.atomic.AtomicInteger;

@Path("/hello")
public class GreetingResource {

    @ConfigProperty(name = "test.property")
    String test;

    private AtomicInteger counter = new AtomicInteger(0);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        System.out.println(test);
        return "Hello from Bern JUG";
    }

    @GET
    @Path("/counter2")
    public void counter() {
        System.out.println("sadfasdf");
        System.out.println(counter.incrementAndGet() + " sdfdsaf");
    }


}
