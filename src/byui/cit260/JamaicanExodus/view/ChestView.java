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
class ChestView {

    public ChestView() {
        
        String[] items = {"Clothing", "Rations", "Fuel", "Tools", "Computer", "Calculater", "Farm Tools", "Medicine", "Cedar Chest"};
       //String[] quantity = {"" + Inventory.setQuantity};
       InventoryControl viewSortedInventory = new InventoryControl();
             
       viewSortedInventory.inventorySort(items);
            
       for ( int i = 0;  i < items.length;  i++ )
       this.console.println( items [ i ] );  
    }

    void displayChestView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
