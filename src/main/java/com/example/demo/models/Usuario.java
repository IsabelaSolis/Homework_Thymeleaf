package com.example.demo.models;

public class Usuario {
  private String name;
  private String lastName;
  private String semester;
  
  public Usuario(String name, String lastName, String semester) {
      this.name = name;
      this.lastName = lastName;
      this.semester= semester;
  }
  
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getLastName() {
	return lastName;
  }
  public void setLastName(String lastName) {
	this.lastName = lastName;
  }
  public String getSemester() {
	return semester;
  }
  public void setSemester(String semester) {
	this.semester = semester;
  }
}
