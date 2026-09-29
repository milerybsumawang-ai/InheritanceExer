package com.mycompany.inheritanceexer;

public class Aircraft extends Vehicle {

    public Aircraft(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void displayInfo() {
        System.out.println("\nVehicle Type: Aircraft");
        super.displayInfo();
    }  
}
