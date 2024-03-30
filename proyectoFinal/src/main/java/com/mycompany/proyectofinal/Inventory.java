package com.mycompany.proyectofinal;

import javax.swing.JOptionPane;

public class Inventory {
    String[] InventoryVector = new String[4];
    
    int IDItem,Amount;
    String NameItem;
    double UnitCoast;
    
    public void RequestingDataInventory() {
        for (int i = 0; i < 5; i++) {
            IDItem = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID of the item you want to search for"+ (i+1)));
            Amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the desired amount of the items you are looking for"+ (i+1)));
            NameItem = JOptionPane.showInputDialog("Enter the name of the item you want to search for"+ (i+1));
            UnitCoast = Double.parseDouble(JOptionPane.showInputDialog("Enter the desired amount of the items you are looking for"+ (i+1)));
            
            InventoryVector[i] = "IDItem: " + IDItem + ", Amount: " + Amount + ", NameItem: " + NameItem + ", UnitCoast: " + UnitCoast;
        }
    }
}
