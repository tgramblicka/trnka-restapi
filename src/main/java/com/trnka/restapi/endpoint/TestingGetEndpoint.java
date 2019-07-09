package com.trnka.restapi.endpoint;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.trnka.restapi.dto.TestDto;

@Produces({MediaType.APPLICATION_JSON })
@Consumes({MediaType.APPLICATION_JSON })
@Path("testing")
public interface TestingGetEndpoint {

    @GET
    @Path("{studentId}")
    TestDto getTest(@PathParam("studentId") String studentId);

}
