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
public class SpeedTest {
    
    public SpeedTest() {
    }

    /**
     * Test of getRate method, of class Speed.
     */
    @Test
    public void testGetRate() {
        System.out.println("getRate");
        System.out.println("Test Case 1");
        int time = 6;
        int distance = 90;
        Speed instance = new Speed();
        int expResult = 15;
        int result = instance.getRate(time, distance);
        assertEquals(expResult, result);
       
    }
    {
        System.out.println("Test Case 2");
        int time = -1;
        int distance = 90;
        Speed instance = new Speed();
        int expResult = -1;
        int result = instance.getRate(time, distance);
        assertEquals(expResult, result);
    }
        {
        System.out.println("getRate");
        System.out.println("Test case 3");
        int time = 35;
        int distance = -1;
        Speed instance = new Speed();
        int expResult = -1;
        int result = instance.getRate(time, distance);
        assertEquals(expResult, result);
       
    }
        {
        System.out.println("getRate");
        System.out.println("Test case 4");
        int time = -9;
        int distance = 104;
        Speed instance = new Speed();
        int expResult = -1;
        int result = instance.getRate(time, distance);
        assertEquals(expResult, result);
        System.out.println(expResult);
        System.out.println(result);
    }

}
