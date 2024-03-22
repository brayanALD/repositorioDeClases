package com.mycompany.proyectofinal.Classes;

import javax.swing.JOptionPane;

public class ClassAdmiDate {
    //This was done by Santiago, he could not upload it to the repository due to problems with the PC.
   String ActiveClients,DeliveredClients,RepairMaintenance;
   
   public String ActiveClients(){
       return ActiveClients;
   }
   public String DeliveredClients(){
       return DeliveredClients;
   }
   public String RepairMaintenance(){
       return RepairMaintenance;
   }
   public void Date(){
    ActiveClients = JOptionPane.showInputDialog("Enter the customer's name");
    RepairMaintenance = JOptionPane.showInputDialog("Enter the vehicle's license plate to check if it is under repair or maintenance");

       }
    }