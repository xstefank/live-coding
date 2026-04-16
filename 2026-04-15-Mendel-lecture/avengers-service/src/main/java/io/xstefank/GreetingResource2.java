package io.xstefank;

import io.quarkus.logging.Log;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.concurrent.atomic.AtomicLong;

@Path("/hello2")
public class GreetingResource2 {

    private static final AtomicLong counter = new AtomicLong();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
//        Log.info(?"Counter: " + counter.incrementAndGet());
        Log.info("hello");
        Log.debug("Hello World!");
        Log.trace("Hello World!");
        return "Hello from Mendel!";
    }
}
