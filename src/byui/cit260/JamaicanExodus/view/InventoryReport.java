/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.Exception.InventoryControlException;
import byui.cit260.JamaicanExodus.model.Inventory;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Office Payne
 */
class InventoryReport {

    static void report(Inventory inventoryReport, String filePath) throws InventoryControlException { 

        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(inventoryReport); // write the game object out to file
        }
        catch(Exception e) {
            throw new InventoryControlException(e.getMessage());
        } 
    }

  
    }
    

