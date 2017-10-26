/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.control;

/**
 *
 * @author Office Payne
 */
public class InventoryControl {
    
    public double hasMoney(double price, double quantity){
    
        if (quantity < 0 || quantity > 20) {
            return -1; 
        }
            
        if (price < 0 ) {
            return -1;
        }
        
        double totalItemPrice = quantity * price;
        return totalItemPrice;
    } 
   
    
}

