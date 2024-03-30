package com.mycompany.proyectofinal;

import javax.swing.JOptionPane;

public class Date {
    String[] DateVector = new String[5];
    
    int IDconsecutive;
    String ID, plate, TypesRepair,day;
    
    public void RequestingDataDate() {
        for (int i = 0; i < 5; i++) {
            IDconsecutive = Integer.parseInt(JOptionPane.showInputDialog("Enter the mileage (in kilometers) at which the vehicle is currently."  + (i+1)));
            ID = JOptionPane.showInputDialog("Enter the vehicle's license plate number"  + (i+1));
            plate = JOptionPane.showInputDialog("Enter the vehicle's brand"  + (i+1));
            TypesRepair = JOptionPane.showInputDialog("Enter the vehicle's model"  + (i+1));
            day = JOptionPane.showInputDialog("Enter the vehicle's category"  + (i+1));            
            
            DateVector[i] = "IDconsecutive: " + IDconsecutive + ", ID: " + ID + ", plate: " + plate + ", TypesRepair: " + TypesRepair + ", day: " + day;
    
        }
    }
}
