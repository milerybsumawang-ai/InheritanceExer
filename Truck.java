package com.mycompany.inheritanceexer;

public class Truck extends Vehicle {

    public Truck(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void displayInfo() {
        System.out.println("\nVehicle Type: Truck");
        super.displayInfo();
    } 
}
