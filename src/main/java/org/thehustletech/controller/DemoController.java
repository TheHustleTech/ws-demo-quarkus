package org.thehustletech.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.thehustletech.dto.ResponseDTO;
import org.thehustletech.dto.ToDoDTO;
import org.thehustletech.service.DemoService;

@Path("/test")
public class DemoController {

  @ConfigProperty(name = "demo.greeting", defaultValue = "hello")
  private String responseText;

  @Inject private DemoService demoService;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    return "hello";
  }

  @GET
  @Path("/json")
  @Produces(MediaType.APPLICATION_JSON)
  public ResponseDTO respond() {
    return new ResponseDTO(responseText);
  }

  @GET
  @Path("/external")
  @Produces(MediaType.APPLICATION_JSON)
  public ToDoDTO getExternalData() {
    ToDoDTO dataFromExternalService = demoService.getDataFromExternalService();
    return dataFromExternalService;
  }
}
