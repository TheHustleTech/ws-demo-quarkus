package org.thehustletech.dto;

public class AlbumDTO {

  private Integer userId;
  private Integer id;
  private String title;

  public AlbumDTO(Integer userId, Integer id, String title) {
    this.userId = userId;
    this.id = id;
    this.title = title;
  }

  public Integer getUserId() {
    return userId;
  }

  public Integer getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
