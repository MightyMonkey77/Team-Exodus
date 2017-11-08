/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import java.util.Scanner;



/**
 *
 * @author Office Payne
 */
public class Occupations extends View {
             
    
        
      public Occupations() {
        
        super( "\n       ****************************************************"
                +"\n       |             OccupationSelection                   |"
                +"\n       ****************************************************"
                +"\n        B - Banker"
                +"\n        C - Carpenter"
                +"\n        F - Farmer"
                +"\n        S - Shipwrieght"
                +"\n        E - Software Engineer"
                +"\n        Q - Quit"
                +"\n       *****************************************************");
        
    }
    
  
    
      @Override
    public boolean doAction(String choice){
        choice = choice.toUpperCase();
        switch(choice){
            case "B":
                this.banker();
                return true;
            case "C":
                this.carpenter();
                return true;
            case "F":
                this.farmer();
                return true;
            case "S":
                this.shipwrieght();
                return true;
            case "E":
                this.softwareEngineer();    
                return true;                      
            default :
                System.out.println("\nInvalid Choice");
                return false;
        }
        
    }

    private void banker() {
        System.out.println("Banker chosen");
    }

    private void carpenter() {
        System.out.println("Carpenter chosen");
    }

    private void farmer() {
        System.out.println("Farmer chosen");
    }

    private void shipwrieght() {
        System.out.println("Shipwrieght chosen");
    }

    private void softwareEngineer() {
       System.out.println("Software Engineer chosen"); 
     }
    
    
}    

   