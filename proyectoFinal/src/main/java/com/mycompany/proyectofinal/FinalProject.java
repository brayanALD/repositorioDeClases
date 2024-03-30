package com.mycompany.proyectofinal;

public class FinalProject {

    public static void main(String[] args) {
       
        Customers CustomersManager = new Customers();
        CustomersManager.RequestingData();

        System.out.println("Customer data stored:");
        for (int i = 0; i < CustomersManager.CustomersVector.length; i++) {
            System.out.println("Customer " + (i + 1) + ": " + CustomersManager.CustomersVector[i]);
        }
        
        Car carManager = new Car();
        carManager.RequestingDataCar();
        
        System.out.println("Vehicle data stored:");
        for (int i = 0; i < carManager.CarVector.length; i++) {
            System.out.println("Vehicle " + (i + 1) + ": " + carManager.CarVector[i]);            
        }
        Date dateManager = new Date();
        dateManager.RequestingDataDate();
        
        System.out.println("Data of the stored dates:");
        for (int i = 0; i < dateManager.DateVector.length; i++) {
            System.out.println("dates " + (i + 1) + ": " + dateManager.DateVector[i]);
        }
        Inventory inventoryManager = new Inventory();
        inventoryManager.RequestingDataInventory();
        
        System.out.println("Inventory data stored:");
        for (int i = 0; i < inventoryManager.InventoryVector.length; i++) {
            System.out.println("Inventory " + (i + 1) + ": " + inventoryManager.InventoryVector[i]);
        }
        
    }
}
        

