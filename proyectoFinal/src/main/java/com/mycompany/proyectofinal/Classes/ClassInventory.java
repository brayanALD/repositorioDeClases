package com.mycompany.proyectofinal.Classes;

import javax.swing.JOptionPane;

public class ClassInventory {
    //This was done by Santiago, he could not upload it to the repository due to problems with the PC.
     int IDItem,Amount;
    String NameItem;
    double UnitCoast;
    public int IDItem(){
        return IDItem;
    }
    public int Amount(){
        return Amount;
    }
    public String NameItem(){
        return NameItem;
    }
    public double UnitCoast(){
        return UnitCoast;
    }
    public void Inventory(){
        IDItem = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID of the item you want to search for"));
        Amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the desired amount of the items you are looking for"));
        NameItem = JOptionPane.showInputDialog("Enter the name of the item you want to search for");
        UnitCoast = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the desired amount of the items you are looking for"));

    }
}
