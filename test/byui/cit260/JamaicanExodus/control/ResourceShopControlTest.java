/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Office Payne
 */
public class ResourceShopControlTest {
    
    public ResourceShopControlTest() {
    }

    /**
     * Test of addToChest method, of class ResourceShopControl.
     */
    @Test
    public void testAddToChest() {
        System.out.println("addToChest");
        System.out.println("\tTest case 1");
        double itemWeight = 20;
        double maxWeight = 500;
        double loadedWeight = 120;
        ResourceShopControl instance = new ResourceShopControl();
        double expResult = 380;
        double result = ResourceShopControl.addToChest(itemWeight, maxWeight, loadedWeight);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    {
        System.out.println("\tTest case 2");
        double itemWeight = 500;
        double maxWeight = 500;
        double loadedWeight = 120;
        double expResult = 380;
        double result = ResourceShopControl.addToChest(itemWeight, maxWeight, loadedWeight);
        assertEquals(expResult, result, 0.0001);
   
    }
    
    {
        System.out.println("\tTest case 3");
        double itemWeight = 0;
        double maxWeight = 500;
        double loadedWeight = 120;
        double expResult = 380;
        double result = ResourceShopControl.addToChest(itemWeight, maxWeight, loadedWeight);
        assertEquals(expResult, result, 0.0001);
   
    }
    
     
    
}   
