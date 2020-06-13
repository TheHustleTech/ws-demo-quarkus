package org.thehustletech.service;

import javax.inject.Singleton;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.thehustletech.dto.ToDoDTO;

@Singleton
public class DemoService {

  @RestClient
  private ExternalService externalService;

  public ToDoDTO getDataFromExternalService(){
    ToDoDTO toDo = externalService.getToDo(1);
    return toDo;
  }

}
