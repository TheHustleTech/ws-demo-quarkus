package org.thehustletech.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.thehustletech.dto.AlbumDTO;
import org.thehustletech.dto.ToDoDTO;

@RegisterRestClient
public interface ExternalService {

  @Path("/todos/{id}")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  ToDoDTO getToDo(@PathParam("id") Integer id);

  @Path("/albumsss/{id}")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Retry(maxRetries = 3)
  @Fallback(fallbackMethod = "getDefaultAlbum")
  AlbumDTO getAlbum(@PathParam("id") Integer id);

  default AlbumDTO getDefaultAlbum(Integer id){
    return new AlbumDTO(9999,9999,"Default");
  }
}
