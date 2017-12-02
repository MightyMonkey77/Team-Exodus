/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.Exception.InventoryControlException;
import byui.cit260.JamaicanExodus.JamaicanExodus;
import byui.cit260.JamaicanExodus.enums.Item;
import byui.cit260.JamaicanExodus.model.Inventory;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Office Payne
 */
public class ShopItemView extends View {
    
    public static Inventory[] inventoryList;
    // adding totalWeight for return as a temp file to hold the total wieght 
    //gained from this to be used later to verify wieght to go into chest.
    public double totalWeights = 0.0; 

    public ShopItemView() {
        super ("\n **************************************************"
                + "\n             Choose your item                       "
                + "\n****************************************************"
                + "\n 1 - Clothing"
                + "\n 2 - Rations"
                + "\n 3 - Fuel"
                + "\n 4 - Tools"
                + "\n 5 - Computer"
                + "\n 6 - Calculator"
                + "\n 7 - Farm Tools"
                + "\n 8 - Medicine"
                + "\n*****************************************************");
    
    }

    public void setTotalWeights(double totalWeights) {
        this.totalWeights = totalWeights;
    }
        
    @Override
    public boolean doAction(String choice) {
    
        choice = choice.toUpperCase();
        switch(choice) {
            case "1":
        {
            try {
                this.clothing();
            } catch (InventoryControlException ex) {
                Logger.getLogger(ShopItemView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "2":
        {
            try {
                this.rations();
            } catch (InventoryControlException ex) {
                Logger.getLogger(ShopItemView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "3":
        {
            try {
                this.fuel();
            } catch (InventoryControlException ex) {
                Logger.getLogger(ShopItemView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "4":
        {
            try {
                this.tools();
            } catch (InventoryControlException ex) {
                Logger.getLogger(ShopItemView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "5":
        {
            try {
                this.computer();
            } catch (InventoryControlException ex) {
                Logger.getLogger(ShopItemView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "6":
        {
            try {
                this.calculater();
            } catch (InventoryControlException ex) {
                Logger.getLogger(ShopItemView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "7":
        {
            try {
                this.farmTools();
            } catch (InventoryControlException ex) {
                Logger.getLogger(ShopItemView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "8":
        {
            try {
                this.medicine();
            } catch (InventoryControlException ex) {
                Logger.getLogger(ShopItemView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            default:
                System.out.println("\n Invalid Choice");
                return false;     
        }
            return true;
    }

    private double clothing() throws InventoryControlException{
        
       double clothingWeight = 2.15;
       Scanner keyboard = new Scanner(System.in);
       int clothingQuantity = JamaicanExodus.getCurrentGame().getInventory()[Item.clothing.ordinal()].getQuantity();
        boolean done = false;
        do {
            System.out.print("\nPlease enter the Quantity: ");
            String quantity = keyboard.nextLine();
            clothingQuantity = Integer.parseInt(quantity);
            done = true;
        } while (!done);
        // get the axle quantity entered from keyboard
        // trim off leading and trailing blanks
        Inventory item = JamaicanExodus.getCurrentGame().getInventory()[Item.clothing.ordinal()]; // get item from array
        int newQuantity = item.getQuantity() + clothingQuantity; // adds orginal to entered quantity
        item.setQuantity(newQuantity); // sets new amount of inventory item
        JamaicanExodus.getCurrentGame().getInventory()[Item.clothing.ordinal()] = item; // good practice - sets updated inventory item to inventory array
        
        double totalWeight = clothingWeight * newQuantity;
        
                
        System.out.println("\nYou have purchased " + newQuantity + /*Inventory.getDescription() +*/ " items. With a total weight of :" + totalWeight);
        return totalWeight;
    }

    private double rations()throws InventoryControlException {
        
       double rationsWeight = 2.03;
       Scanner keyboard = new Scanner(System.in);
       int rationsQuantity = JamaicanExodus.getCurrentGame().getInventory()[Item.rations.ordinal()].getQuantity();
        boolean done = false;
        do {
            System.out.print("\nPlease enter the Quantity: ");
            String quantity = keyboard.nextLine();
            rationsQuantity = Integer.parseInt(quantity);
            done = true;
        } while (!done);
        // get the axle quantity entered from keyboard
        // trim off leading and trailing blanks
        Inventory item = JamaicanExodus.getCurrentGame().getInventory()[Item.rations.ordinal()]; // get item from array
        int newQuantity = item.getQuantity() + rationsQuantity; // adds orginal to entered quantity
        item.setQuantity(newQuantity); // sets new amount of inventory item
        JamaicanExodus.getCurrentGame().getInventory()[Item.rations.ordinal()] = item; // good practice - sets updated inventory item to inventory array
        
        double totalWeight = rationsWeight * newQuantity;
        
                
        System.out.println("\nYou have purchased " + newQuantity + /*Inventory.getDescription() +*/ " items. With a total weight of :" + totalWeight);
        return totalWeight;
    }

    private double fuel()throws InventoryControlException {
        
       double fuelWeight = 10.00;
       Scanner keyboard = new Scanner(System.in);
       int fuelQuantity = JamaicanExodus.getCurrentGame().getInventory()[Item.fuel.ordinal()].getQuantity();
        boolean done = false;
        do {
            System.out.print("\nPlease enter the Quantity: ");
            String quantity = keyboard.nextLine();
            fuelQuantity = Integer.parseInt(quantity);
            done = true;
        } while (!done);
        // get the axle quantity entered from keyboard
        // trim off leading and trailing blanks
        Inventory item = JamaicanExodus.getCurrentGame().getInventory()[Item.fuel.ordinal()]; // get item from array
        int newQuantity = item.getQuantity() + fuelQuantity; // adds orginal to entered quantity
        item.setQuantity(newQuantity); // sets new amount of inventory item
        JamaicanExodus.getCurrentGame().getInventory()[Item.fuel.ordinal()] = item; // good practice - sets updated inventory item to inventory array
        
        double totalWeight = fuelWeight * newQuantity;
        
                
        System.out.println("\nYou have purchased " + newQuantity + /*Inventory.getDescription() +*/ " items. With a total weight of :" + totalWeight);
        return totalWeight;
    }

    private double tools() throws InventoryControlException{
        
       double toolsWeight = 6.53;
       Scanner keyboard = new Scanner(System.in);
       int toolsQuantity = JamaicanExodus.getCurrentGame().getInventory()[Item.tools.ordinal()].getQuantity();
        boolean done = false;
        do {
            System.out.print("\nPlease enter the Quantity: ");
            String quantity = keyboard.nextLine();
            toolsQuantity = Integer.parseInt(quantity);
            done = true;
        } while (!done);
        // get the axle quantity entered from keyboard
        // trim off leading and trailing blanks
        Inventory item = JamaicanExodus.getCurrentGame().getInventory()[Item.tools.ordinal()]; // get item from array
        int newQuantity = item.getQuantity() + toolsQuantity; // adds orginal to entered quantity
        item.setQuantity(newQuantity); // sets new amount of inventory item
        JamaicanExodus.getCurrentGame().getInventory()[Item.tools.ordinal()] = item; // good practice - sets updated inventory item to inventory array
        
        double totalWeight = toolsWeight * newQuantity;
        
                
        System.out.println("\nYou have purchased " + newQuantity + /*Inventory.getDescription() +*/ " items. With a total weight of :" + totalWeight);
        return totalWeight;
    }

    private double computer() throws InventoryControlException{
       double computerWeight = 8.50;
       Scanner keyboard = new Scanner(System.in);
       int computerQuantity = JamaicanExodus.getCurrentGame().getInventory()[Item.computer.ordinal()].getQuantity();
        boolean done = false;
        do {
            System.out.print("\nPlease enter the Quantity: ");
            String quantity = keyboard.nextLine();
            computerQuantity = Integer.parseInt(quantity);
            done = true;
        } while (!done);
        // get the axle quantity entered from keyboard
        // trim off leading and trailing blanks
        Inventory item = JamaicanExodus.getCurrentGame().getInventory()[Item.computer.ordinal()]; // get item from array
        int newQuantity = item.getQuantity() + computerQuantity; // adds orginal to entered quantity
        item.setQuantity(newQuantity); // sets new amount of inventory item
        JamaicanExodus.getCurrentGame().getInventory()[Item.computer.ordinal()] = item; // good practice - sets updated inventory item to inventory array
        
        double totalWeight = computerWeight * newQuantity;
        
                
        System.out.println("\nYou have purchased " + newQuantity + /*Inventory.getDescription() +*/ " items. With a total weight of :" + totalWeight);
        return totalWeight;
    }

    private double calculater() throws InventoryControlException{
       
       double calcWeight = 1.01;
       Scanner keyboard = new Scanner(System.in);
       int calcQuantity = JamaicanExodus.getCurrentGame().getInventory()[Item.calc.ordinal()].getQuantity();
        boolean done = false;
        do {
            System.out.print("\nPlease enter the Quantity: ");
            String quantity = keyboard.nextLine();
            calcQuantity = Integer.parseInt(quantity);
            done = true;
        } while (!done);
        // get the axle quantity entered from keyboard
        // trim off leading and trailing blanks
        Inventory item = JamaicanExodus.getCurrentGame().getInventory()[Item.calc.ordinal()]; // get item from array
        int newQuantity = item.getQuantity() + calcQuantity; // adds orginal to entered quantity
        item.setQuantity(newQuantity); // sets new amount of inventory item
        JamaicanExodus.getCurrentGame().getInventory()[Item.calc.ordinal()] = item; // good practice - sets updated inventory item to inventory array
        
        double totalWeight = calcWeight * newQuantity;
        
                
        System.out.println("\nYou have purchased " + newQuantity + /*Inventory.getDescription() +*/ " items. With a total weight of :" + totalWeight);
        return totalWeight;    
    }

    private double farmTools() throws InventoryControlException{
        
       double farmToolsWeight = 8.36;
       Scanner keyboard = new Scanner(System.in);
       int farmToolsQuantity = JamaicanExodus.getCurrentGame().getInventory()[Item.farmtools.ordinal()].getQuantity();
        boolean done = false;
        do {
            System.out.print("\nPlease enter the Quantity: ");
            String quantity = keyboard.nextLine();
            farmToolsQuantity = Integer.parseInt(quantity);
            done = true;
        } while (!done);
        // get the axle quantity entered from keyboard
        // trim off leading and trailing blanks
        Inventory item = JamaicanExodus.getCurrentGame().getInventory()[Item.farmtools.ordinal()]; // get item from array
        int newQuantity = item.getQuantity() + farmToolsQuantity; // adds orginal to entered quantity
        item.setQuantity(newQuantity); // sets new amount of inventory item
        JamaicanExodus.getCurrentGame().getInventory()[Item.farmtools.ordinal()] = item; // good practice - sets updated inventory item to inventory array
        
        double totalWeight = farmToolsWeight * newQuantity;
        
                
        System.out.println("\nYou have purchased " + newQuantity + /*Inventory.getDescription() +*/ " items. With a total weight of :" + totalWeight);
        return totalWeight;
    }

    private double medicine() throws InventoryControlException{
           
       double medicineWeight = 2.03;
       Scanner keyboard = new Scanner(System.in);
       int medicineQuantity = JamaicanExodus.getCurrentGame().getInventory()[Item.medicine.ordinal()].getQuantity();
        boolean done = false;
        do {
            System.out.print("\nPlease enter the Quantity: ");
            String quantity = keyboard.nextLine();
            medicineQuantity = Integer.parseInt(quantity);
            done = true;
        } while (!done);
        // get the axle quantity entered from keyboard
        // trim off leading and trailing blanks
        Inventory item = JamaicanExodus.getCurrentGame().getInventory()[Item.medicine.ordinal()]; // get item from array
        int newQuantity = item.getQuantity() + medicineQuantity; // adds orginal to entered quantity
        item.setQuantity(newQuantity); // sets new amount of inventory item
        JamaicanExodus.getCurrentGame().getInventory()[Item.medicine.ordinal()] = item; // good practice - sets updated inventory item to inventory array
        
        double totalWeight = medicineWeight * newQuantity;
        
                
        System.out.println("\nYou have purchased " + newQuantity + /*Inventory.getDescription() +*/ " items. With a total weight of :" + totalWeight);
        return totalWeight;
    }
    
    
}
