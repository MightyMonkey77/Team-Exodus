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
public class Occupations {
    
      private String occuMenu;
        
      public Occupations() {
        
        this.occuMenu = "\n*****************************************************"
                +"\n       |             OccupationSelection                   |"
                +"\n       ****************************************************"
                +"\n        B - Banker"
                +"\n        C - Carpenter"
                +"\n        F - Farmer"
                +"\n        S - Shipwrieght"
                +"\n        E - Software Engineer"
                +"\n       *****************************************************";
        
    }
    
    public void displayOccupations() {
      
        boolean done = false;
        
        do {
            String occupationsOption = this.getOccupationsOption();
        
            //if (menuOption.toUpperCase().equals("Q"))
            //    return;
        
            done = this.doAction (occupationsOption);
        
        }
        while(!done);
    }
    private String getOccupationsOption() {
        Scanner keyboard = new Scanner(System.in); 
        String value = "";
        boolean validated = false;
        
        while (!validated) {
            System.out.println(occuMenu);
            System.out.println("\nSelect Occupation from the list.");
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() <0){
                System.out.println("\nInvalid Input");
                continue;    
            }
            break;
        }
        return value;
    }
    
    private boolean doAction(String choice){
        choice = choice.toUpperCase();
        switch(choice){
            case "B":
                this.banker();
                return false;
            case "C":
                this.carpenter();
                return true;
            case "F":
                this.farmer();
                return false;
            case "S":
                this.shipwrieght();
                return false;
            case "E":
                this.softwareEngineer();    
                return true; //see line 38,39
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

   