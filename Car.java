package com.mycompany.inheritanceexer;

public class Car extends Vehicle {

    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void displayInfo() {
        System.out.println("\nVehicle Type: Car");
        super.displayInfo();
    } 
}
