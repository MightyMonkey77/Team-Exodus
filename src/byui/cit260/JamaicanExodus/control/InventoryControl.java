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
import byui.cit260.JamaicanExodus.enums.Item;
import byui.cit260.JamaicanExodus.model.Inventory;
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
     */
    public void calcGetWeight() throws InventoryControlException {
        
        Game game = JamaicanExodus.getCurrentGame();
        Inventory[] inventoryList = game.getInventory();
               
        Inventory inventoryItem = inventoryList[Item.clothing.ordinal()]; 
        double clothingWeight = inventoryItem.getWeight();
        
        
    }    
    public void calcInventoryAmount() throws InventoryControlException {

       Scanner in = new Scanner(System.in); // Ask for user input on quantity.
       int x = 1;
              
       do {
           try{
             System.out.println("Enter quantity ");  
             double quantity = in.nextInt();
             double weightPerItem = inventory.setWeight(inventoryList[Item.ordinal()]);
             // Not sure have tried many ways.                         
             double totalWeight = (quantity * weightPerItem);
                if (totalWeight < 500) {
                System.out.println("You have enough room.");
                }

             System.out.println("\n that weighs " + totalWeight+ " Pounds"); 
             x = 2;
       }
         catch(Exception InventoryException) {  
                System.out.println("If over current reamianing weight, cannot purchase.");
       return;
         }
          
       }while(x==1);
    }



}
