package org.thehustletech.service;

import javax.inject.Singleton;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.thehustletech.dto.AlbumDTO;
import org.thehustletech.dto.ToDoDTO;

@Singleton
public class DemoService {

  @RestClient private ExternalService externalService;

  public ToDoDTO getToDoDataFromExternalService() {
    ToDoDTO toDo = externalService.getToDo(1);
    return toDo;
  }

  public AlbumDTO getAlbumDataFromExternalService() {
    AlbumDTO album = externalService.getAlbum(1);
    return album;
  }
}
