/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.control.GameControl;
import byui.cit260.JamaicanExodus.model.JamaicanExodus;
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
            case "N": // this starts the game
                this.startNewGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            case "E":
                this.exitGame();
                break;
            case "Q":
                this.giveUp();    
                break;
            default :
                System.out.println("\nInvalid Choice");
                break;
                
        }
        return false;
    }    

    private void startNewGame() {
        GameControl.createNewGame(JamaicanExodus.getPlayer());
        GameMenu gameMenu = new GameMenu();
        gameMenu.displayMenu();
        
    }

    private void displayHelpMenu() {
        System.out.println("\nWelcome to the Help Menu, " +JamaicanExodus.getPlayer().getName());
        HelpMenu helpMenu = new HelpMenu();
        helpMenu.displayHelpMenu();
        
    }

    private void saveGame() {
        System.out.println("\nSave Your Game");
    }

    private void exitGame() {
        System.out.println("\nExit Game");
    }

    private void giveUp() {
        System.out.println("\nExit Program");
    }
    
}    
