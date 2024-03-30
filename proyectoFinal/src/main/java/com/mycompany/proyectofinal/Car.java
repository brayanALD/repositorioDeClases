package com.mycompany.proyectofinal;

import javax.swing.JOptionPane;

public class Car {
    String[] CarVector = new String[5];
    
    String Plate, Brand, ModelCar, Category; 
    int Km;
    
    public void RequestingDataCar() {
        for (int i = 0; i < 5; i++) {
            Plate = JOptionPane.showInputDialog("Enter the vehicle's license plate number"  + (i+1));
            Brand = JOptionPane.showInputDialog("Enter the vehicle's brand"  + (i+1));
            ModelCar = JOptionPane.showInputDialog("Enter the vehicle's model"  + (i+1));
            Category = JOptionPane.showInputDialog("Enter the vehicle's category"  + (i+1));
            Km = Integer.parseInt(JOptionPane.showInputDialog("Enter the mileage (in kilometers) at which the vehicle is currently."  + (i+1)));
            
            CarVector[i] = "Plate: " + Plate + ", Brand: " + Brand + ", ModelCar: " + ModelCar + ", Category: " + Category + ", Km: " + Km;
        }
    }    
}
