/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.JamaicanExodus;


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
        // create new game
       // int returnValue = GameControl.createNewGame();
       // if (returnValue < 0) {
        //    System.out.println("ERROR - Failiure to Launch.");
       // }
        //GameControl.createNewGame(JamaicanExodus.getPlayer());
        //GameControl gameControl = new GameControl();
        //gameControl.createNewGame();
      // GameControl.createNewGame(JamaicanExodus.getPlayer()); //New game
             
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
        System.out.println("\n Exciting 'Save Your Game' function coming soon!");
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
}    
