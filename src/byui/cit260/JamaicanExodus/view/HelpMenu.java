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
class HelpMenu extends View {
    
   
    
    public HelpMenu() {
        super( "\n HELP Menu"
                +"\n"
                +"\n G - Goal of the Game"
                +"\n I - Inventory"
                +"\n R - Resources"
                +"\n F - Food Levels"
                +"\n E - Exit Help Menu"
                +"\n");
    }    
   
    
    @Override
    public boolean doAction(String choice){
        choice = choice.toUpperCase();
        switch(choice){
            case "G": 
                this.gameGoal();
                return false;
            case "I":
                this.inventory();
                return false;
            case "R":
                this.resources();
                return false;
            case "F":
                this.foodLevel();
                return false;
            case "E":
                this.exitHelpMenu();    
                return true;
            default :
                System.out.println("\n *Invalid Choice*");
                return false;
                
        }
        //return true;
    }

    private void gameGoal() {
        System.out.println("\n The goal of the game will be "
                         + "\n displayed, someday, herein.");
    }

    private void inventory() {
        System.out.println("\n You don't have anything right now, "
                         + "\n we haven't programmed that yet.");
    }

    private void resources() {
        System.out.println("\n You've got a chocolate bar and a paper clip. "
                         + "\n MacGyver is that you?");
    }

    private void foodLevel() {
        System.out.println("\n There's that chocolate bar, "
                         + "\n but its a resource, "
                         + "\n so you can't eat it.");
        FoodLevel foodLevel = new FoodLevel();
        foodLevel.display();
    }

    private void exitHelpMenu() {
        System.out.println("\n Exit, and go back to the place"
                         + "\n from which you came.");
        MainMenu mainMenu = new MainMenu();       
        mainMenu.display();
    }
    
   
}
        

