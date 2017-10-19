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
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    @Test
    public void testHasMoney() {
        System.out.println("Do you have enough money to buy the item(s)");
        
        double price = 2.50;
        double quantity = 5;
        InventoryControl instance = new InventoryControl();
        double expResults = 12.50;
        double result = instance.hasMoney(price,quantity);
        assertEquals(expResults, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
    }

  
    }
    
