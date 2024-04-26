package com.mycompany.carworkshop;

import javax.swing.JOptionPane;

public class Vehicles {
    private String Plate;
    private String Brand;
    private String ModelCar;
    private String Category;
    private String Km;

    public Vehicles(String Plate, String Brand, String ModelCar, String Category, String Km) {
        this.Plate = Plate;
        this.Brand = Brand;
        this.ModelCar = ModelCar;
        this.Category = Category;
        this.Km = Km;
    }

    public String getPlate() {
        return Plate;
    }

    public void setPlate(String Plate) {
        this.Plate = JOptionPane.showInputDialog("Enter the vehicle's license plate number");
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = JOptionPane.showInputDialog("Enter the vehicle's brand");
    }

    public String getModelCar() {
        return ModelCar;
    }

    public void setModelCar(String ModelCar) {
        this.ModelCar = JOptionPane.showInputDialog("Enter the vehicle's model");
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        this.Category = JOptionPane.showInputDialog("Enter the vehicle's category");
    }

    public String getKm() {
        return Km;
    }

    public void setKm(String Km) {
        this.Km = JOptionPane.showInputDialog("Enter the mileage (in kilometers) at which the vehicle is currently");
    }
    
    
    public void showVehicle(){
        System.out.println("the vehicle license plate is: " + Plate +
                "\nthe vehicle brand is: " + Brand +
                "\nvehicle model is: " + ModelCar +
                "\nits category is: " + Category +
                "\nyour mileage is: " + Km +
                "\n");
    }
}
