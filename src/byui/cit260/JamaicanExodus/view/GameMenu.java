/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.control.Actors;

/**
 *
 * @author Kim on a PC
 */
class GameMenu extends View {
    
    
    
    public GameMenu() {
        super( "\n GAME Menu"
                +"\n"
                +"\n I - Inventory"
                +"\n D - Map View"
                +"\n A - Actors"
                +"\n O - Choose Occupation"
                +"\n L - View contents of location"
                +"\n P - Move person to new location"
                +"\n E - Estimate the resource needed"
                +"\n G - Go into shop"
                +"\n C - Confront Obstacle"
                +"\n S - Solve Equation"
                +"\n T - Time of Month Leaving"
                +"\n H - Help Menu"
                +"\n M - Main Menu"
                +"\n");
    }    
  
    
    @Override
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();
        switch(choice)
        {
            case "I":
                this.inventory();
                return true;
            case "D":
                this.displayMap();
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
            case "T":
                this.months();    
                return true; 
            default :
                System.out.println("\n *Invalid Choice*");
                return false;              
        }
    }    
    private void inventory() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.display();
    }

    private void moveToNewLocation() {
       RationView rationView = new RationView();
       rationView.display();
    }

    private void estimateResources() {
        System.out.println("If you have to ask, you probably can't afford it.");
    }

    private void goInShop() {
        ShopMenu shopMenu = new ShopMenu();
        shopMenu.display();
    }

    private void confrontObstacle() {
        System.out.println("Do or do not.  There is no try.");
    }

    private void solveEquation() {
        System.out.println("Think hard, don't kill yourself.");
    }

    private void help() {
        HelpMenu helpMenu = new HelpMenu();
        helpMenu.display();
    }
    
    private void main() {
        MainMenu mainMenu = new MainMenu();       
        mainMenu.display();
    }    

    private void actors() {
        Actors actors = new Actors();
        actors.displayActorsNames();
    }

    private void occupations() {
     
        Occupations occupations = new Occupations();
        occupations.display();
    }

    private void locationContents() {
       System.out.println("");
    }

    private void months() {
       Months months = new Months();
       months.display();
    }

    private void displayMap() {
       Map map = new Map();
       map.display();
    }

 
    
   
}
