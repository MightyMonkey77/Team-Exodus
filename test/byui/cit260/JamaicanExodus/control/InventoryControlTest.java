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

   

    /**
     * Test of calcChestWeight method, of class InventoryControl.
     */
    @Test
    public void testCalcChestWeight() {
        System.out.println("calcChestWeight");
        double weight = 500.00;
        double clothing =2.03 ;
        double chest = 10.00;
        double rations = 1.05;
        double fuel = 10.00;
        double tools = 6.53;
        double computer = 8.5;
        double calc = 1.01;
        double farmtools = 8.36;
        double medicine = 0.75;
        InventoryControl instance = new InventoryControl();
        double expResult = 48.23;
        double result = instance.calcChestWeight(weight, clothing, chest, rations, fuel, tools, computer, calc, farmtools, medicine);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
