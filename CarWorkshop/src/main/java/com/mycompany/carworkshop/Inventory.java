package com.mycompany.carworkshop;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<String> inventoryList;

    public Inventory() {
        inventoryList = new ArrayList<>();
        // Inicialización con productos predeterminados
        initializeDefaultProducts();
    }

    private void initializeDefaultProducts() {
        inventoryList.add("IDItem: 001, NameItem: Tires, Amount: 10, UnitCost: 150.0");
        inventoryList.add("IDItem: 002, NameItem: Wheels, Amount: 8, UnitCost: 200.0");
        inventoryList.add("IDItem: 003, NameItem: Side Mirrors, Amount: 5, UnitCost: 50.0");
        inventoryList.add("IDItem: 004, NameItem: Sedan Doors, Amount: 4, UnitCost: 300.0");
        inventoryList.add("IDItem: 005, NameItem: Front Windows, Amount: 6, UnitCost: 100.0");
    }

    public void requestDataInventory() {
        int choice;
        do {
            choice = Integer.parseInt(JOptionPane.showInputDialog(
                    "Select an option:\n" +
                    "1. Add new product\n" +
                    "2. Modify existing product\n" +
                    "3. Exit"
            ));
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    modifyProduct();
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please choose again.");
            }
        } while (choice != 3);
    }

    private void addProduct() {
        int IDItem = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID of the new product"));
        String nameItem = JOptionPane.showInputDialog("Enter the name of the new product");
        int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of the new product"));
        double unitCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the unit cost of the new product"));

        String productInfo = "IDItem: " + IDItem + ", NameItem: " + nameItem + ", Amount: " + amount + ", UnitCost: " + unitCost;
        inventoryList.add(productInfo);
        JOptionPane.showMessageDialog(null, "Product added successfully.");
    }

    private void modifyProduct() {
        String targetProduct = JOptionPane.showInputDialog("Enter the ID of the product you want to modify");
        boolean found = false;
        for (int i = 0; i < inventoryList.size(); i++) {
            if (inventoryList.get(i).contains(targetProduct)) {
                found = true;
                int choice = JOptionPane.showOptionDialog(null,
                        "Select parameter to modify:",
                        "Modify Product",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        new String[]{"Amount", "Unit Cost", "Cancel"},
                        "Amount");

                switch (choice) {
                    case 0:
                        int newAmount = Integer.parseInt(JOptionPane.showInputDialog("Enter the new amount"));
                        updateAmount(i, newAmount);
                        break;
                    case 1:
                        double newUnitCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the new unit cost"));
                        updateUnitCost(i, newUnitCost);
                        break;
                    case 2:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option.");
                }
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Product not found.");
        }
    }

    private void updateAmount(int index, int newAmount) {
        String[] parts = inventoryList.get(index).split(",");
        parts[1] = " Amount: " + newAmount;
        inventoryList.set(index, String.join(",", parts));
        JOptionPane.showMessageDialog(null, "Amount updated successfully.");
    }

    private void updateUnitCost(int index, double newUnitCost) {
        String[] parts = inventoryList.get(index).split(",");
        parts[3] = " UnitCost: " + newUnitCost;
        inventoryList.set(index, String.join(",", parts));
        JOptionPane.showMessageDialog(null, "Unit cost updated successfully.");
    }

    public void showInventory() {
        StringBuilder inventoryInfo = new StringBuilder();
        inventoryInfo.append("Inventory:\n");
        for (String item : inventoryList) {
            inventoryInfo.append(item).append("\n");
        }
        JOptionPane.showMessageDialog(null, inventoryInfo.toString(), "Inventory Information", JOptionPane.INFORMATION_MESSAGE);
    }
}
