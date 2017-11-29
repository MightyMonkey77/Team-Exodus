/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.Exception.DoubleControlException;
import byui.cit260.JamaicanExodus.JamaicanExodus;
import byui.cit260.JamaicanExodus.control.GameControl;
import byui.cit260.JamaicanExodus.Exception.GameControlException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Office Payne
 */
public class MainMenu extends View  {

     
    public MainMenu() {
       super("\n MAIN Menu"
                +"\n"
                +"\n N - Start New Game"
                +"\n H - Help"
                +"\n L - Load Saved Game"
                +"\n S - Save Game"
                +"\n E - Exit Game"
                +"\n Q - Quit Game"
                +"\n");
        
    }
    

    @Override
    public boolean doAction(String choice){
        choice = choice.toUpperCase();
        switch(choice){
            case "N":
                this.startNewGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "L":
                this.loadSavedGame();
                break;
            case "S":
                this.saveGame();
                break;
            case "E":
                this.exitGame();
                break;
            case "D":
        {
            try {
                this.callDoubleNumber();
            } catch (DoubleControlException ex) {
                Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "Q":
                this.giveUp();    
                break; //see line 38,39
            default :
                System.out.println("\nInvalid Choice");
                return false;
        }
        //return true;
        return true;
    }    

    private void startNewGame() { 
                    
       GameMenu gameMenu = new GameMenu();
       gameMenu.display();
    }

    private void displayHelpMenu() {
        System.out.println("\n ================================================="
                +"\n Welcome to the Help Menu, " +JamaicanExodus.getPlayer().getName()
                +"\n =================================================");
        HelpMenu helpMenu = new HelpMenu();
        helpMenu.display();
    }
              
    

    private void saveGame() {
       
          // prompt for and get the name of the file to save the game in
        this.console.println("\nEnter the path and filename for file where the game "
                           + "is to be saved:");
        String filePath = this.getInput();     
        
        try {
            // save the game to the speciried file
            GameControl.saveGame(JamaicanExodus.getCurrentGame(), filePath);
        } catch (GameControlException ex) {
            Error.display("MainMenuView", ex.getMessage());
        } 

    }
    

    private void exitGame() {
        System.out.println("\n Revolutionary 'Exit Game' function coming soon!");
    }

    private void giveUp() {
        System.out.println("\n So long, and thanks for all the fish. "
                         + "\n "
                         + "\n P.S. Don't Panic!!"                      
                         + "\n ");
    }

    private void loadSavedGame() {
                  
       // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the path and filename for file where the game "
                           + "is to be saved:");
        
        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.loadSavedGame(filePath);
        } catch (GameControlException ex) {
            Error.display("MainMenuView", ex.getMessage());
        } 

        // display the game menu
        GameMenu gameMenu = new GameMenu();
        gameMenu.display();
    
    }

    private void callDoubleNumber() throws DoubleControlException {
       
        System.out.println("\n*** callDoubleNumber function called");
        DoubleFormat doubleNumber = new DoubleFormat();
        doubleNumber.getDoubleNumber();
    }


}
    
  
   
