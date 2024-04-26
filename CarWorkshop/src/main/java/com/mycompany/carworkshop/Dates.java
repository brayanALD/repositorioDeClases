package com.mycompany.carworkshop;

import javax.swing.JOptionPane;
import java.util.Random;

public class Dates extends Customers {
    private int IDconsecutive;
    private String TypesRepair;
    private String DayDate;

    public Dates(int IDconsecutive, String TypesRepair, String DayDate, float ID, String Name, String LastName, String Address, String Phone) {
        super(ID, Name, LastName, Address, Phone);
        this.IDconsecutive = IDconsecutive;
        this.TypesRepair = TypesRepair;
        this.DayDate = DayDate;
    }

    
    
    public int getIDconsecutive() {
        return IDconsecutive;
    }

    public void setIDconsecutive() {
        Random random = new Random();
        int randomNumber = random.nextInt(900000) + 100000;
        this.IDconsecutive = randomNumber;
    }

    public String getTypesRepair() {
        return TypesRepair;
    }

    public void setTypesRepair() {
        this.TypesRepair = JOptionPane.showInputDialog("Enter the type of repair");
    }

    public String getDayDate() {
        return DayDate;
    }

    public void setDayDate() {
        this.DayDate = JOptionPane.showInputDialog("Enter the date");
    }

    public void appointment(){
        System.out.println("appointment id is: " + IDconsecutive +
                "\nthe ID is: " + ID +
                "\nthe type of repair is: " + TypesRepair +
                "\nthe date of the appointment is: " + DayDate +
                "\n");
    }
}