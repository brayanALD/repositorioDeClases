package com.mycompany.proyectofinal.Classes;


import javax.swing.JOptionPane;

public class ClassDate {
    int IDconsecutive;
    String ID, plate, TypesRepair,day;
    
    public int IDconsecutive() {
        return IDconsecutive;
    }
    public String day() {
        return day;
    }
    public String ID() {
        return ID;
    }
    public String plate() {
        return plate;
    }
    public String typesRepair() {
        return TypesRepair;
    }
    
    public void RequestingDate(){
        IDconsecutive = Integer.parseInt(JOptionPane.showInputDialog("enter the day of the appointment"));
        day =JOptionPane.showInputDialog("enter the date you want to have the appointment");
        ID =JOptionPane.showInputDialog("enter the ID");
        plate = JOptionPane.showInputDialog("");
        TypesRepair = JOptionPane.showInputDialog("");
    }
}
