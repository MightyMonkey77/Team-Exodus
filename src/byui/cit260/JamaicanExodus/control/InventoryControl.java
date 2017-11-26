/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.control;

//import byui.cit260.JamaicanExodus.model.Inventory;

import byui.cit260.JamaicanExodus.Exception.InventoryControlException;
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
    
    public enum Item {
    
    clothing,
    rations,
    fuel,
    tools,
    computer,
    calc,
    farmtools,
    medicine,
    chest;
    }
     
     public static Inventory[] setWeight() {
          
          Inventory[] inventoryList = new Inventory [8];
          
          Inventory clothing = new Inventory();
          clothing.setWeight(2.03);
          inventoryList[Item.clothing.ordinal()] = clothing;
          
          Inventory rations = new Inventory();
          rations.setWeight(2.03);
          inventoryList[Item.rations.ordinal()] = rations;
          
          Inventory fuel = new Inventory();
          fuel.setWeight(10.00);
          inventoryList[Item.fuel.ordinal()] = fuel;
          
          Inventory tools = new Inventory();
          tools.setWeight(6.53);
          inventoryList[Item.tools.ordinal()] = tools;
          
          Inventory computer = new Inventory();
          computer.setWeight(8.5);
          inventoryList[Item.computer.ordinal()] = computer;
          
          Inventory calc = new Inventory();
          calc.setWeight(1.01);
          inventoryList[Item.calc.ordinal()] = calc;
          
          Inventory farmtools = new Inventory();
          farmtools.setWeight(8.36);
          inventoryList[Item.farmtools.ordinal()] = farmtools;
          
          Inventory medicine = new Inventory();
          medicine.setWeight(0.75);
          inventoryList[Item.medicine.ordinal()] = farmtools;
          
          Inventory chest = new Inventory();
          chest.setWeight(10.00);
          inventoryList[Item.chest.ordinal()] = chest;          
         
          
          return inventoryList;
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
