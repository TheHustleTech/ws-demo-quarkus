package org.thehustletech.dto;

public class ResponseDTO {
  private String responseText;

  public String getResponseText() {
    return responseText;
  }

  public void setResponseText(String responseText) {
    this.responseText = responseText;
  }

  public ResponseDTO(String responseText) {
    this.responseText = responseText;
  }
}
