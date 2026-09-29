package com.mycompany.inheritanceexer;

import java.util.Scanner;

public class InheritanceExer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int choice;
        
        do {
            System.out.println("Transportation Vehicle Menu");
            System.out.println("1. Create a Car");
            System.out.println("2. Create a Bus");
            System.out.println("3. Create a Truck");
            System.out.println("4. Create Aircraft (AIR)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = input.nextInt();
            input.nextLine();
            
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter brand: ");
                String brand = input.nextLine();
                
                System.out.print("Enter model: ");
                String model = input.nextLine();
                
                Vehicle vehicle;
                
            if (choice == 1) {
                vehicle = new Car(brand, model);
            } else if (choice == 2) {
                vehicle = new Bus(brand, model);
            } else if (choice == 3) {
                vehicle = new Truck(brand, model);
            } else {
                vehicle = new Aircraft(brand, model);
            }

                vehicle.displayInfo();

            } else if (choice == 5) {
                System.out.println("Exiting program...");

            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        input.close();
        }
    }

