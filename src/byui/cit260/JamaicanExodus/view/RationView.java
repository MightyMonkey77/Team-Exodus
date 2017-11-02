/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import java.util.Scanner;

/**
 *
 * @author mikeg
 */
public class RationView {
 
    
        public String rationView;
        public RationView() {
            
        this.rationView = "\n ration Menu"
                +"\n"
                +"\n 0 - eating air"
                +"\n 1 - crumbs"
                +"\n 2 - still hungry"
                +"\n 3 - stuffed"
                +"\n H - Help Menu"
                +"\n M - Main Menu"
                +"\n";
    }    
        public void displayRationView() 
    {
        boolean done = false;    
            do
            {
                String rationViewOption = this.getRationViewOption();
                
                done = this.doAction (rationViewOption);
            }
            while(!done);
    }
        private String getRationViewOption()
    {
        Scanner keyboard = new Scanner(System.in); 
        String value = "";
        boolean validated = false;
        
        while (!validated) 
        {
            System.out.println(rationView);
            System.out.println("\n How many do you wish to eat? ");
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() <0)
            {
                System.out.println("\n *Invalid Input*");
                continue;    
            }
            break;
        }
        return value;
}

    private boolean doAction(String choice) {
            choice = choice.toUpperCase();
        switch(choice){
            case "0":
                this.eatingAir();
                return true;
            case "1":
                this.crumbs();
                return true;
            case "2":
                this.stillHungry();
                return true;
            case "3":
                this.stuffed();
                return true;
            case "H":
                 this.helpMenu();
                 return true;
            case "M":
                this.mainMenu();
                return true;
            default :
                System.out.println("\nInvalid Choice");
                return false;
        }
        //return true;
    }

    private void eatingAir() {
       System.out.println("Want to starve do you!");  
    }

    private void crumbs() {
       System.out.println("Small meal.");
    }

    private void stillHungry() {
       System.out.println("Need more food?");
    }

    private void stuffed() {
       System.out.println("Most food one could have.");
    }

    private void helpMenu() {
        HelpMenu helpMenu = new HelpMenu();
        helpMenu.displayHelpMenu();
    }

    private void mainMenu() {
        MainMenu mainMenu = new MainMenu();       
        mainMenu.displayMainMenu();
    }
    
}