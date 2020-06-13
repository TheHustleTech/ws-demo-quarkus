package org.thehustletech.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.thehustletech.dto.ToDoDTO;

@Path("/todos")
@RegisterRestClient
public interface ExternalService {

  @Path("/{id}")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  ToDoDTO getToDo(@PathParam("id") Integer id);
}
