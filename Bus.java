package com.mycompany.inheritanceexer;

public class Bus extends Vehicle {

    public Bus(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void displayInfo() {
        System.out.println("\nVehicle Type: Bus");
        super.displayInfo();
    }  
}
