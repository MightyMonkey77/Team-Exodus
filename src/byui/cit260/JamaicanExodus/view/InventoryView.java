/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.Exception.InventoryControlException;
import byui.cit260.JamaicanExodus.JamaicanExodus;
import byui.cit260.JamaicanExodus.model.Inventory;
import static byui.cit260.JamaicanExodus.model.Inventory.getInventoryReport;
import java.util.logging.Level;
import java.util.logging.Logger;


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
                
            case "R":{
                try {
                    //run report on inventory items?
                    this.printInventoryReport();
                } catch (InventoryControlException ex) {
                    Logger.getLogger(InventoryView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;
            
            case "U"://Use inventory item
                this.useInventoryItem();
               break;
               
            case "D"://Drop item
                this.dropInventoryItem();
                break;
        }        
            return true;
    }            

    private void viewInventoryItems() {
        ChestView chestView = new ChestView();
        chestView.displayChestView();             
    }  
   
    private void useInventoryItem() {
        System.out.println("\n Just used it.");
    }

    private void dropInventoryItem() {
         DropItemControl dropItem = new DropItemControl();
         dropItem.dropInventoryItem();
    }

    private void printInventoryReport() throws InventoryControlException {
        // Get name and path to save the file
        this.console.println("\n Enter a valid path name to save the file.");
        // Set it to the filePath
        String filePath = this.getInput();
        // Specified file where it is to be saved
        InventoryReport.report(getInventoryReport(), filePath);    }


    
}

    

    

   

    
