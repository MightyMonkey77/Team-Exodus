/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.control;

/**
 *
 * @author Kim Haereiti
 */
public class ConsumptionControl {
    
        
    public double consumptionRate(int pace, int distance) {
        
        double paceImpact = 50;
        double consumed = 0;

        if (pace < 0) 
        {
            System.out.println("\t'Error: Minimum  pace is 0.'");
            return 0.00;
        }
        else if(pace == 0) 
        {
            return .50;
        }
        else if(pace == 1) 
        {
            paceImpact = 1.10;
        }
        else if(pace == 2) 
        {
            paceImpact = 1.35;
        }
        else if(pace == 3) 
        {
            paceImpact = 1.60;
        }
        else if(pace == 4) 
        {
            paceImpact = 2.00;
        }
        else 
        {
            System.out.println("\t'Error: Maximum pace is 4.'");
            return 0.00;
        }
        if (distance < 0) 
        {
            System.out.println("\t'Error: Minimum distance is 0.'");
            return 0.00;
        }
        else if (distance == 0)
        {
            return .50;
        }
        else if (distance > 201) 
        {
            System.out.println("\t'Error: Maximum distance per day is 200.'");
            return 0.00;
        }
        consumed = distance * paceImpact / 100;
        return consumed;
}
} 

