package com.mycompany.inheritanceexer;

public class Vehicle {
  private String brand;
  private String model;
  
  public Vehicle (String brand, String model) {
      this.brand = brand;
      this.model = model;
  }
  
  public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
