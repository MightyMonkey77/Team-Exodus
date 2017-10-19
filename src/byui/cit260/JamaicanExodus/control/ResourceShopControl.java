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
public class ResourceShopControl {
 
    public static double addToChest(double itemWeight, double maxWeight, double loadedWeight) {
    
      
         
       if (itemWeight > 500) { // Far too heavy
       return -1;
       }
       if (itemWeight < 0) { // Does not exist
       return -1;
       }
             
       double availableWeight = maxWeight - loadedWeight;
       return availableWeight;
    }
    
    }
