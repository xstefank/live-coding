package io.xstefank;

import io.quarkus.logging.Log;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.concurrent.atomic.AtomicLong;

@Path("/hello2")
public class GreetingResource2 {

    AtomicLong counter2 = new AtomicLong(0);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        Log.info("Hello request received. Counter:" + counter2.incrementAndGet());
        return "Hello from PA165!";
    }
}
