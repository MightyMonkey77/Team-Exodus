/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.control;

/**
 *
 * @author mikeg
 */

import java.util.Scanner;

// Distance = Speed * Time
public class DistanceTravelled {
    public static void main( String [] arg) {
        Scanner scanner = new Scanner( System.in) ;
        double travellingSpeed = -1;
        int timeTravelled = 0;
        double distanceTravelled;
        
        while( travellingSpeed <0){
            System.out.println( "Please enter your speed");
            travellingSpeed = scanner.nextDouble();
    }
        
        while( travellingSpeed >3){
            System.out.println( "Please enter your speed");
            travellingSpeed = scanner.nextDouble();
    }
        
        timeTravelled = scanner.nextInt();
        
        System.out.println( "Time\tDistance Travelled\n----\t---------" );
            for( int time = 1; time <= timeTravelled; time++ ){
            distanceTravelled = ( time * travellingSpeed );
            System.out.println( time + "\t" + distanceTravelled);
            }
            {
            
        }
    }
}
