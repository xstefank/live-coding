package io.xstefank;

import io.quarkus.logging.Log;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.util.concurrent.atomic.AtomicLong;

@Path("/hello")
public class GreetingResource {
//    @Inject
//    UnusedBean unusedBean;


    @ConfigProperty(name = "test.whatever")
    String whatever;

    AtomicLong counter2 = new AtomicLong(0);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        Log.info("Hello request received. Counter:" + counter2.incrementAndGet());
        Log.info("Config value: " + whatever);
        return "Hello from PA165!";
    }
}
