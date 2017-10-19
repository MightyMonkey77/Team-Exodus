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
 
    public static double addToChest(double itemWieght, double maxWieght, double loadedWieght) {
    
       if (itemWieght <= 0) { // Does not exist
        return -1;
       }   
       if (itemWieght > 500) { // Far too heavy
       return -1;
       }
             
       double availableWieght = maxWieght - loadedWieght;
       return availableWieght;
    }
    
    }
