package com.mycompany.carworkshop;

import javax.swing.JOptionPane;

public class Customers {
    float ID;
    private String Name;
    private String LastName;
    private String Address;
    private String Phone;

    public Customers(float ID, String Name, String LastName, String Address, String Phone) {
        this.ID = ID;
        this.Name = Name;
        this.LastName = LastName;
        this.Address = Address;
        this.Phone = Phone;
    }

    public float getID() {
        return ID;
    }

    public void setID(float ID) {
        this.ID = Float.parseFloat(JOptionPane.showInputDialog("Enter the ID number for customer "));
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = JOptionPane.showInputDialog("Enter the name for customer ");
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = JOptionPane.showInputDialog("Enter the last name for customer ");
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = JOptionPane.showInputDialog("Enter the address for customer ");
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = JOptionPane.showInputDialog("Enter the telephone number for customer ");
    }
    
    public void ShowClient(){
        System.out.println("the client ID is: "+ ID +
                "\nThe client's name is: " + Name +
                "\nThe client's last name is: " + LastName +
                "\nthe address is: " + Address +
                "\nThe phone number is: " + Phone +
                "\n");
    
    }
    
}
