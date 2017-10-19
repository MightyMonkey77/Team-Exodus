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
        double itemWieght = 0.0;
        double maxWieght = 0.0;
        double loadedWieght = 0.0;
        double expResult = 0.0;
        double result = ResourceShopControl.addToChest(itemWieght, maxWieght, loadedWieght);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
