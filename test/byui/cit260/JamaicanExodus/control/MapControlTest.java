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
 * @author mikeg
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of timeTraveled method, of class MapControl.
     */
    @Test
    public void testTimeTraveled() {
        System.out.println("timeTraveled");
        System.out.println("Test Case 1");
        double rate = 10;
        double distance = 250;
        MapControl instance = new MapControl();
        double expResult = 25;
        double result = instance.timeTraveled(rate, distance);
        assertEquals(expResult, result, 0.0);
        
    }
    
    {
        System.out.println("Test Case 2");
        double rate = -1;
        double distance = 250;
        MapControl instance = new MapControl();
        double expResult = -1;
        double result = instance.timeTraveled(rate, distance);
        assertEquals(expResult, result, 0.0);
        
    }
    
    {
        System.out.println("Test Case 3");
        double rate = 10;
        double distance = -1;
        MapControl instance = new MapControl();
        double expResult = -1;
        double result = instance.timeTraveled(rate, distance);
        assertEquals(expResult, result, 0.0);
        
    }
    {
      System.out.println("Test Case 4");
        double rate = 121;
        double distance = 250;
        MapControl instance = new MapControl();
        double expResult = -1;
        double result = instance.timeTraveled(rate, distance);
        assertEquals(expResult, result, 0.0);
    }
    {
      System.out.println("Test Case 5");
        double rate = 10;
        double distance = 780;
        MapControl instance = new MapControl();
        double expResult = -1;
        double result = instance.timeTraveled(rate, distance);
        assertEquals(expResult, result, 0.0);
    
    }
    
}
