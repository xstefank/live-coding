package io.xstefank;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/avenger")
public class AvengerResource {

    @GET
    public List<Avenger> getAvengers() {
        return Avenger.listAll();
    }

    @Transactional
    @POST
    public Avenger createAvenger(Avenger avenger) {
        avenger.persist();
        return avenger;
    }


    @POST
    @Path("/new")
    public Avenger newAvenger() {
        Avenger avenger = new Avenger();
        avenger.name = "Spider Man";
        avenger.civilName = "Peter Parker";
        avenger.snapped = true;
        avenger.persist();
        return avenger;
    }
}
