package org.thehustletech.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class DemoController {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    return "hello";
  }

  @GET
  @Path("/json")
  @Produces(MediaType.APPLICATION_JSON)
  public ResponseDTO respond(){
    return new ResponseDTO("Hello");
  }
}