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
 * @author Kim Haereiti
 */
public class ConsumptionControlTest {
    
    public ConsumptionControlTest() {
    }

    /**
     * Test of consumptionRate method, of class ConsumptionControl.
     */
    @Test
    public void testConsumptionRate() {
        
    {
        System.out.println("Valid Case");
        System.out.println("\tPace 2, Distance 150");
        int pace = 2;
        int distance = 150;
        ConsumptionControl instance = new ConsumptionControl();
        double expResult = 2.025;
        double result = instance.consumptionRate(pace, distance);
        assertEquals(expResult, result, 0.00000);   
    }
    {
        System.out.println("Error Case");
        System.out.println("\tPace 1, Distance 500");
        int pace = 1;
        int distance = 500;
        ConsumptionControl instance = new ConsumptionControl();
        double expResult = 0.00;
        double result = instance.consumptionRate(pace, distance);
        assertEquals(expResult, result, 0.00000); 
    }
    {
        System.out.println("Error Case");
        System.out.println("\tPace 5, Distance 100");
        int pace = 5;
        int distance = 100;
        ConsumptionControl instance = new ConsumptionControl();
        double expResult = 0.00;
        double result = instance.consumptionRate(pace, distance);
        assertEquals(expResult, result, 0.00000); 
    }
    {
        System.out.println("Error Case");
        System.out.println("\tPace 1, Distance -100");
        int pace = 1;
        int distance = -100;
        ConsumptionControl instance = new ConsumptionControl();
        double expResult = 0.00;
        double result = instance.consumptionRate(pace, distance);
        assertEquals(expResult, result, 0.00000); 
    }
    {
        System.out.println("Error Case");
        System.out.println("\tPace -1, Distance 100");
        int pace = -1;
        int distance = 100;
        ConsumptionControl instance = new ConsumptionControl();
        double expResult = 0.00;
        double result = instance.consumptionRate(pace, distance);
        assertEquals(expResult, result, 0.00000); 
    }
    {
        System.out.println("Boundary Case");
        System.out.println("\tPace 0, Distance 0");
        int pace = 0;
        int distance = 0;
        ConsumptionControl instance = new ConsumptionControl();
        double expResult = 0.50;
        double result = instance.consumptionRate(pace, distance);
        assertEquals(expResult, result, 0.00000); 
    }
    {
        System.out.println("Boundary Case");
        System.out.println("\tPace 0, Distance 1");
        int pace = 0;
        int distance = 1;
        ConsumptionControl instance = new ConsumptionControl();
        double expResult = 0.50;
        double result = instance.consumptionRate(pace, distance);
        assertEquals(expResult, result, 0.00000); 
    }
    {
        System.out.println("Boundary Case");
        System.out.println("\tPace 4, Distance 0");
        int pace = 4;
        int distance = 0;
        ConsumptionControl instance = new ConsumptionControl();
        double expResult = 0.50;
        double result = instance.consumptionRate(pace, distance);
        assertEquals(expResult, result, 0.00000); 
    }
    {
        System.out.println("Boundary Case");
        System.out.println("\tPace 4, Distance 200");
        int pace = 4;
        int distance = 200;
        ConsumptionControl instance = new ConsumptionControl();
        double expResult = 4.00;
        double result = instance.consumptionRate(pace, distance);
        assertEquals(expResult, result, 0.00000); 
    }
}
}
    

