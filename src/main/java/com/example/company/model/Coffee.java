package com.example.company.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Coffee {

  private Long id;
  private String title;
  private String description;

  Coffee() {}

  public Coffee(String title, String description) {

    this.title = title;
    this.description = description;
  }

  public Long getId() {
    return this.id;
  }

  public String getTitle() {
    return this.title;
  }

  public String getDescription() {
    return this.description;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Coffee{" + "id=" + this.id + ", name='" + this.title + '\'' + ", role='" + this.description + '\'' + '}';
  }
}
