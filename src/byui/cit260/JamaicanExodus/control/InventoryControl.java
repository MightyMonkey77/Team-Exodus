/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.control;

//import byui.cit260.JamaicanExodus.model.Inventory;

import byui.cit260.JamaicanExodus.Exception.InventoryControlException;
import byui.cit260.JamaicanExodus.JamaicanExodus;
import byui.cit260.JamaicanExodus.model.Game;
import byui.cit260.JamaicanExodus.model.Inventory;
import byui.cit260.JamaicanExodus.model.InventoryItems;
import byui.cit260.JamaicanExodus.view.ShopItemView;
import java.util.Scanner;


/**
 *
 * @author Office Payne
 */
public class InventoryControl {
    
     public void inventorySort( String  x [ ] )  {
     
            int i, j;
            String temp;

            for ( i = 0;  i < x.length - 1;  i++ )
            {
                for ( j = i + 1;  j < x.length;  j++ )
                {  
                         if ( x [ i ].compareToIgnoreCase( x [ j ] ) > 0 )
                          {                                             // ascending sort
                                      temp = x [ i ];
                                      x [ i ] = x [ j ];    // swapping
                                      x [ j ] = temp; 
                                      
                           } 
                   } 
             } 
      } 
    /**
    Get Inventory item weights. 
     * @return 
     * @throws byui.cit260.JamaicanExodus.Exception.InventoryControlException 
     */
    public double calcGetWeight()  {
        
        Game game = JamaicanExodus.getCurrentGame();
        Inventory[] inventoryList = game.getInventory();
        
        double totalWeight = 0.0;
         for (Inventory inventoryList1 : inventoryList) {
             double weight = inventoryList1.getWeight();
             double quantity = inventoryList1.getQuantity();
             totalWeight =  weight;
         }
        return totalWeight;
          
        
    }    
    public double calcInventoryAmount() throws InventoryControlException {

       Scanner in = new Scanner(System.in); // Ask for user input on quantity.
       int x = 1;
              
       do {
           try{
             System.out.println("Enter quantity ");  
             double quantity = in.nextInt();
             // Need to have this call from item selected by user. 
             double chosenItemWeight = ShopItemView.totalWeight;
             double limit = 500.00;
             if (calcGetWeight() + chosenItemWeight > limit) {
                throw new InventoryControlException();
             } else {
              System.out.println("You have enough room.");
             }
             double totalWeight = (quantity * chosenItemWeight);
                if (totalWeight < 500) {
               
                }

             System.out.println("\n that weighs " + totalWeight+ " Pounds"); 
             x = 2;
       }
         catch(InventoryControlException e) {  
                System.out.println("If over current reamianing weight, cannot purchase.");
      
         }
          
       }while(x==1);
         return 0;
    }

     public static Inventory[] getItemDatabase() throws InventoryControlException {
     
         Inventory[] inventoryList = new Inventory[8];
         inventoryList = JamaicanExodus.getCurrentGame().getInventory();
         return inventoryList;
     
     }
     // Setting the get the items from the enum.
     public static Inventory getInventoryStuff(InventoryItems items) throws InventoryControlException {
         Inventory[] item = getItemDatabase();
         Inventory itemList = item[items.ordinal()];
         return itemList;
     }
     // Found from group three. Was going far to complicated.
     public static void addInventory(InventoryItems items, int quantity) throws InventoryControlException {
     
            Inventory item = getInventoryStuff(items);
            item.setQuantity(item.getQuantity() + quantity);
                       
     }
     // Simplest way to subtract inventory. Thankyou stackoverflow.com 
     public static void subtractFromInventory(InventoryItems items, int quantity) throws InventoryControlException {
       
            Inventory item = getInventoryStuff(items); 
            item.setQuantity(item.getQuantity() - quantity);
    }
     
    public static void addWeight(InventoryItems items, double weight) throws InventoryControlException {
    
            Inventory item = getInventoryStuff(items);
            item.setWeight(item.getWeight() + weight);
    }
    
    public static void subtractWeight(InventoryItems items, double weight) throws InventoryControlException {
    
            Inventory item = getInventoryStuff(items);
            item.setWeight(item.getWeight() - weight);
    }
     
    public static String InvToQuantityPrice() throws InventoryControlException {
        
        
        String output = "";
        String name;
        double inStock;
        double price;
        double value;
        int i = 0;
        Inventory[] inventory = getItemDatabase();
        if (inventory == null) 
            throw new InventoryControlException("Can not display inventory because player inventory is null. "
                    + "Please start new game to fix problem.");
        for (Inventory item : inventory) {
                name = item.getInventoryItems().name();
                inStock = item.getQuantity();
                price = item.getInventoryItems().getCost();
                value = inStock * price;
                output += "\n* " + i + " - " + name + ": Quantity owned: " + inStock + ", Price: $" + price ;
                i++;
        }
        return output;
        
     
    
    }
     


}
