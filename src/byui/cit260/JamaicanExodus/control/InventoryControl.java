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
    public double calcGetWeight()  {
        
        Game game = JamaicanExodus.getCurrentGame();
        Inventory[] inventoryList = game.getInventory();
        
        double totalWeight = 0.0;
        for(int i = 0; i<inventoryList.length; i++) {
            double weight = inventoryList[i].getWeight();
            int quantity = inventoryList[i].getQuantity();
            totalWeight = totalWeight + weight;
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
             double chosenItemWeight = 2000.00;
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
         catch(Exception InventoryException) {  
                System.out.println("If over current reamianing weight, cannot purchase.");
      
         }
          
       }while(x==1);
         return 0;
    }



}
