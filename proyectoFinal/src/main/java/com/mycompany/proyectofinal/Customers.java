package com.mycompany.proyectofinal;

import javax.swing.JOptionPane;

public class Customers {
    String[] CustomersVector = new String[5];
    
    String ID, Name, LastName, Address, Phone;
   
    public void RequestingData() {
        for (int i = 0; i < 5; i++) {
            ID = JOptionPane.showInputDialog("Enter the ID number for customer " + (i+1));
            Name = JOptionPane.showInputDialog("Enter the name for customer " + (i+1));
            LastName = JOptionPane.showInputDialog("Enter the last name for customer " );
            Address = JOptionPane.showInputDialog("Enter the address for customer " + (i+1));
            Phone = JOptionPane.showInputDialog("Enter the telephone number for customer "+ (i+1));
            
            CustomersVector[i] = "ID: " + ID + ", Name: " + Name + ", Last Name: " + LastName + ", Address: " + Address + ", Phone: " + Phone;
        }
    }
}
    



