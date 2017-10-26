/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import java.util.Scanner;

/**
 *
 * @author Kim
 */
class HelpMenu {

    private String menu;
    
    public HelpMenu() {
        this.menu = "\nHelp Menu"
                +"\n"
                +"\nG - Goal of the Game"
                +"\nI - Inventory"
                +"\nR - Resources"
                +"\nF - Food Levels"
                +"\nE - Exit Help Menu"
                +"\n";
    }    
    public void displayHelpMenu() {
        System.out.println(menu);
        boolean done = false;
        
        do{
        String menuOption = this.getMenuOption();
        
        if (menuOption.toUpperCase().equals("Q"))
            return;
        
        done = this.doAction (menuOption);
        
    }
        while(!done);
    }
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); 
        String value = "";
        boolean validated = false;
        
        while (!validated) {
            System.out.println("\nInput Choice");
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
            case "G": // this starts the game
                this.gameGoal();
                break;
            case "I":
                this.inventory();
                break;
            case "R":
                this.resources();
                break;
            case "F":
                this.foodLevel();
                break;
            case "E":
                this.exitHelpMenu();    
                break;
            default :
                System.out.println("\nInvalid Choice");
                break;
                
        }
        return false;
    }

    private void gameGoal() {
        System.out.println("\nGame Goal");
    }

    private void inventory() {
        System.out.println("\nInventory");
    }

    private void resources() {
        System.out.println("\nResources");
    }

    private void foodLevel() {
        System.out.println("\nFood Level");
    }

    private void exitHelpMenu() {
        System.out.println("\nExit Help Menu");
        MainMenu mainMenu = new MainMenu();
        // Main menuy object        
        mainMenu.displayMainMenu();
    }
}
        

