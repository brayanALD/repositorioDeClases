package com.mycompany.proyectofinal.Classes;

import javax.swing.JOptionPane;

public class ClassCar {
    String Plate, Brand, ModelCar, Category; 
    int Km;
    //This was done by Santiago, he could not upload it to the repository due to problems with the PC.
    public String Plate(){
        return Plate;
    }
    public String Brand(){
        return Brand;
    }
    public String ModelCar(){
        return ModelCar;
    }
    public String Category(){
        return Category;
    }
    public int Km(){
        return Km;
    }
    public void CarInformation(){
        Plate = JOptionPane.showInputDialog("Enter your car's license plate");
        Brand = JOptionPane.showInputDialog("Enter your vehicle makeEnter the make of your vehicle");
        ModelCar = JOptionPane.showInputDialog("Enter your vehicle model");
        Category = JOptionPane.showInputDialog("Enter if your vehicle is for repair or maintenance");
        Km = Integer.parseInt(JOptionPane.showInputDialog("Enter your vehicle's mileage"));
    }
}
