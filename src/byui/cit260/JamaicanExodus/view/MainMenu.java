/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

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
                +"\n S - Save Game"
                +"\n E - Exit Game"
                +"\n Q - Quit Game"
                +"\n");
        
    }
    

    private boolean doAction(String choice){
        choice = choice.toUpperCase();
        switch(choice){
            case "N":
                this.startNewGame();
                return true;
            case "H":
                this.displayHelpMenu();
                return true;
            case "S":
                this.saveGame();
                return false;
            case "E":
                this.exitGame();
                return false;
            case "Q":
                this.giveUp();    
                return true; //see line 38,39
            default :
                System.out.println("\nInvalid Choice");
                return false;
        }
        //return true;
    }    

    private void startNewGame() {
        //GameControl.createNewGame(JamaicanExodus.getPlayer());
        GameMenu gameMenu = new GameMenu();
        gameMenu.displayGameMenu();
        
    }

    private void displayHelpMenu() {
        System.out.println("\n ================================================="
                +"\n Welcome to the Help Menu, " +JamaicanExodus.getPlayer().getName()
                +"\n =================================================");
        HelpMenu helpMenu = new HelpMenu();
        helpMenu.displayHelpMenu();
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
    
  
}    
