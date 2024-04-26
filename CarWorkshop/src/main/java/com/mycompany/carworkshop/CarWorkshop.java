package com.mycompany.carworkshop;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Aldana
 */

public class CarWorkshop {

    public static void main(String[] args) {
        
        int option = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  Select an option:
                                                                  1. Create Customers
                                                                  2. Inventory Operations
                                                                  3. Exit"""));

        switch (option) {
            case 1 -> createCustomers();
            case 2 -> inventoryOperations();
            case 3 -> System.exit(0);
            default -> JOptionPane.showMessageDialog(null, "Invalid option. Please choose again.");
        }
    }

    private static void createCustomers() {
        float ID = Float.parseFloat(JOptionPane.showInputDialog("Enter the ID number for customer "));
        String Name = JOptionPane.showInputDialog("Enter the name for customer ");
        String LastName = JOptionPane.showInputDialog("Enter the last name for customer ");
        String Address = JOptionPane.showInputDialog("Enter the address for customer ");
        String Phone = JOptionPane.showInputDialog("Enter the telephone number for customer ");

        String plate = JOptionPane.showInputDialog("Enter the vehicle's license plate number");
        String brand = JOptionPane.showInputDialog("Enter the vehicle's brand");
        String modelCar = JOptionPane.showInputDialog("Enter the vehicle's model");
        String category = JOptionPane.showInputDialog("Enter the vehicle's category");
        String km =  JOptionPane.showInputDialog("Enter the mileage (in kilometers) at which the vehicle is currently");

        Random random = new Random();
        int randomNumber = random.nextInt(900000) + 100000;
        int IDconsecutive = randomNumber;
        String TypesRepair = JOptionPane.showInputDialog("Enter the type of repair");
        String DayDate = JOptionPane.showInputDialog("Enter the date");

        Customers cus1 = new Customers(ID, Name, LastName, Address, Phone);
        cus1.ShowClient();
        Vehicles car1 = new Vehicles(plate, brand, modelCar, category, km);
        car1.showVehicle();
        Dates date1 = new Dates(IDconsecutive, TypesRepair, DayDate, ID, Name, LastName, Address, Phone);
        date1.appointment();

        JOptionPane.showMessageDialog(null, "Customer appointment #1 of the day was successfully created", "Appointment Confirmation", JOptionPane.INFORMATION_MESSAGE);
        
        Customers cus2 = new Customers(ID, Name, LastName, Address, Phone);
        cus2.ShowClient();
        Vehicles car2 = new Vehicles(plate, brand, modelCar, category, km);
        car2.showVehicle();
        Dates date2 = new Dates(IDconsecutive, TypesRepair, DayDate, ID, Name, LastName, Address, Phone);
        date2.appointment();

        JOptionPane.showMessageDialog(null, "Customer appointment #2 of the day was successfully created", "Appointment Confirmation", JOptionPane.INFORMATION_MESSAGE);
        
        Customers cus3 = new Customers(ID, Name, LastName, Address, Phone);
        cus3.ShowClient();
        Vehicles car3 = new Vehicles(plate, brand, modelCar, category, km);
        car3.showVehicle();
        Dates date3 = new Dates(IDconsecutive, TypesRepair, DayDate, ID, Name, LastName, Address, Phone);
        date3.appointment();

        JOptionPane.showMessageDialog(null, "Customer appointment #3 of the day was successfully created", "Appointment Confirmation", JOptionPane.INFORMATION_MESSAGE);
        
        Customers cus4 = new Customers(ID, Name, LastName, Address, Phone);
        cus4.ShowClient();
        Vehicles car4 = new Vehicles(plate, brand, modelCar, category, km);
        car4.showVehicle();
        Dates date4 = new Dates(IDconsecutive, TypesRepair, DayDate, ID, Name, LastName, Address, Phone);
        date4.appointment();

        JOptionPane.showMessageDialog(null, "Customer appointment #4 of the day was successfully created", "Appointment Confirmation", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void inventoryOperations() {
        Inventory inventory = new Inventory();

        int option;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  Select an option:
                                                                  1. Fill Inventory
                                                                  2. Consult Inventory
                                                                  3. Exit"""));
            switch (option) {
                case 1 -> inventory.requestDataInventory();
                case 2 -> inventory.showInventory();
                case 3 -> {
                }
                default -> JOptionPane.showMessageDialog(null, "Invalid option. Please choose again.");
            }
        } while (option != 3);
    }
}