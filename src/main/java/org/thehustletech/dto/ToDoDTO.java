package org.thehustletech.dto;

public class ToDoDTO {
  private String userId;
  private Integer id;
  private String title;
  private Boolean completed;

  public ToDoDTO(String userId, Integer id, String title, Boolean completed) {
    this.userId = userId;
    this.id = id;
    this.title = title;
    this.completed = completed;
  }

  public String getUserId() {
    return userId;
  }

  public Integer getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public Boolean getCompleted() {
    return completed;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }
}
