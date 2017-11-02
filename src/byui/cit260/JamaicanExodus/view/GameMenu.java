/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import java.util.Scanner;

/**
 *
 * @author Kim on a PC
 */
class GameMenu {
    
    private final String menu;
    
    public GameMenu() {
        this.menu = "\n GAME Menu"
                +"\n"
                +"\n I - Inventory"
                +"\n A - Actors"
                +"\n O - Choose Occupation"
                +"\n L - View contents of location"
                +"\n P - Move person to new location"
                +"\n E - Estimate the resource needed"
                +"\n G - Go into shop"
                +"\n C - Confront Obstacle"
                +"\n S - Solve Equation"
                +"\n H - Help Menu"
                +"\n M - Main Menu"
                +"\n";
    }    
    public void displayGameMenu() 
    {
        boolean done = false;    
            do
            {
                String menuOption = this.getMenuOption();
                done = this.doAction (menuOption);   
            }
            while(!done);
    }
    private String getMenuOption()
    {
        Scanner keyboard = new Scanner(System.in); 
        String value = "";
        boolean validated = false;
        
        while (!validated) 
        {
            System.out.println(menu);
            System.out.println("\n Input Choice");
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
    
    private boolean doAction(String choice)
    {
        choice = choice.toUpperCase();
        switch(choice)
        {
            case "I":
                this.inventory();
                return true;
            case "A":
                this.actors();
                return true;
            case "O":
                this.occupations();
                return true;
            case "L":
                this.locationContents();
                return false;    
            case "P":
                this.moveToNewLocation();
                return true;
            case "E":
                this.estimateResources();    
                return false;
            case "G":
                this.goInShop();    
                return true;
            case "C":
                this.confrontObstacle();    
                return false;
            case "S":
                this.solveEquation();    
                return false;
            case "H":
                this.help();    
                return true;
            case "M":
                this.main();    
                return true;       
            default :
                System.out.println("\n *Invalid Choice*");
                return false;              
        }
    }    
    private void inventory() {
        ItemMenu itemMenu = new ItemMenu();
        itemMenu.displayItemMenu();
    }

    private void moveToNewLocation() {
       RationView rationView = new RationView();
       rationView.displayRationView();
    }

    private void estimateResources() {
        System.out.println("If you have to ask, you probably can't afford it.");
    }

    private void goInShop() {
        ShopMenu shopMenu = new ShopMenu();
        shopMenu.displayShop();
    }

    private void confrontObstacle() {
        System.out.println("Do or do not.  There is no try.");
    }

    private void solveEquation() {
        System.out.println("Think hard, don't kill yourself.");
    }

    private void help() {
        HelpMenu helpMenu = new HelpMenu();
        helpMenu.displayHelpMenu();
    }
    
    private void main() {
        MainMenu mainMenu = new MainMenu();       
        mainMenu.displayMainMenu();
    }    

    private void actors() {
        Actors actors = new Actors();
        actors.displayActorsNames();
    }

    private void occupations() {
     
        Occupations occupations = new Occupations();
        occupations.displayOccupations();
    }

    private void locationContents() {
       System.out.println("");
    }
   
}
