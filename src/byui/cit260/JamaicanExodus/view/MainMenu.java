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
public class MainMenu {

    private String menu;
    
    public MainMenu() {
        this.menu = "\nMain Menu"
                +"\n"
                +"\nN - Start New Game"
                +"\nH - Help"
                +"\nS - Save Game"
                +"\nE - Exit Game"
                +"\nQ - Quit Game"
                +"\n";
        
    }
    
    public void displayMainMenu() {
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
            case "N": // this starts the game
                this.startNewGame();
            case "H":
                this.displayHelpMenu();
            case "S":
                this.saveGame();
            case "E":
                this.exitGame();
            case "Q":
                this.giveUp();    
                break;
            default :
                System.out.println("\nInvalid Choice");
                break;
                
        }
        return true;
    }    

    private void startNewGame() {
        System.out.println("\nStarts New Game");
    }

    private void displayHelpMenu() {
        System.out.println("\nDisplay Help Menu");
    }

    private void saveGame() {
        System.out.println("\nSimple");
    }

    private void exitGame() {
        System.out.println("\nExit Game");
    }

    private void giveUp() {
        System.out.println("\nGive Up");
    }
    
}    
