/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.control.InventoryControl;

/**
 *
 * @author Office Payne
 */
public class InventoryView extends View{
    
    public InventoryView() {
        
       super("\n"
            + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
            + "\n+                      Inventory Menu                          +"               
            + "\n+      You collect items in different areas of the map         +"
            + "\n+     Here you can Look at what Items you currently have       +" 
            + "\n+     You can use these items to help you on your journey      +"
            + "\n+   You can also drop these items if you are carrying to much  +"                                        
            + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
            + "\n+ V - View Your Inventory                                      +"
            + "\n+ U - Use Inventory Item                                       +"                                 
            + "\n+ R - Run inventory report                                     +"
            + "\n+ D - Drop Inventory Item                                      +"
            + "\n+ Q - Quit                                                     +"   
            + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
            );
    }
    
         @Override
        public boolean doAction(String value) {
            
            value = value.toUpperCase(); //convert choice to upper case
        
            switch (value){
            
            case "V"://View inventory items?
                this.viewInventoryItems();
                break;
                
            case "R"://run report on inventory items?
                this.printInventoryReport();
                break;
            
            case "U"://Use inventory item
                this.useInventoryItem();
               break;
               
            case "D"://Drop item
                this.dropInventoryItem();
                break;
        }        
            return false;
    }            

    private void viewInventoryItems() {
            System.out.println("\nInventory called YO!");          
     
             String[] items = {"Clothing", "Rations", "Fuel", "Tools", "Computer", "Calculator", "FarmTools", "Medicine" };
             InventoryControl viewSortedInventory = new InventoryControl();
             
             viewSortedInventory.inventorySort(items);
             
             for (String item : items) {
                  System.out.println(item);
        }
    }

    private void printInventoryReport() {
         System.out.println("\n Future home possibly. Not sure how to code this.");
    }

    private void useInventoryItem() {
       System.out.println("\n Just used it.");
    }

    private void dropInventoryItem() {
        
         DropItemView dropItem = new DropItemView();
         dropItem.dropInventoryItem();
    }
}
    
