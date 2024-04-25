package io.xstefank;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.concurrent.atomic.AtomicInteger;

@Path("/hello")
public class GreetingResource {

    private AtomicInteger counterish = new AtomicInteger();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        System.out.println(counterish.incrementAndGet());
        return "Hello from Mixit!";
    }
}
