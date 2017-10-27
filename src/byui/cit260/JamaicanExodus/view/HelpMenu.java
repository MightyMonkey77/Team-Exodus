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
        this.menu = "\n Help Menu"
                +"\n"
                +"\n G - Goal of the Game"
                +"\n I - Inventory"
                +"\n R - Resources"
                +"\n F - Food Levels"
                +"\n E - Exit Help Menu"
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
            System.out.println("\n Input Choice");
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() <0){
                System.out.println("\n *Invalid Input*");
                continue;    
            }
            break;
        }
        return value;
    }
    
    private boolean doAction(String choice){
        choice = choice.toUpperCase();
        switch(choice){
            case "G": 
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
                System.out.println("\n *Invalid Choice*");
                break;
                
        }
        return false;
    }

    private void gameGoal() {
        System.out.println("\n Game Goal");
    }

    private void inventory() {
        System.out.println("\n Inventory");
    }

    private void resources() {
        System.out.println("\n Resources");
    }

    private void foodLevel() {
        System.out.println("\n Food Level");
    }

    private void exitHelpMenu() {
        System.out.println("\n Exit Help Menu");
        MainMenu mainMenu = new MainMenu();       
        mainMenu.displayMainMenu();
    }
}
        

