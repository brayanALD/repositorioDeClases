package com.mycompany.proyectofinal.Classes;

import javax.swing.JOptionPane;

public class ClassCustomer {
    String ID, Name, LastName, Address, Phone;
    
    
    public String ID() {
        return ID;
    }
    public String Name() {
        return Name;
    }
    public String LastName() {
        return LastName;
    }   
    public String Address() {
        return Address;
    }   
    public String Phone() {
        return Phone;
    }
     
    public void RequestingCustomerData(){
        ID = JOptionPane.showInputDialog("Enter the ID number: ");
        Name = JOptionPane.showInputDialog("Enter the name: ");
        LastName = JOptionPane.showInputDialog("Enter the last name: ");
        Address = JOptionPane.showInputDialog("Enter the address: ");
        Phone = JOptionPane.showInputDialog("Enter the telephone number: ");
    }
}
