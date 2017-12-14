package byui.cit260.JamaicanExodus.view;

//Kimbuilt

import byui.cit260.JamaicanExodus.control.Actors;
import byui.cit260.JamaicanExodus.control.MinMax;

class GameMenu extends View {
    
    
        
    public GameMenu() {
        super( "\n GAME Menu"
                +"\n"
                +"\n I - Inventory"
                +"\n D - Map View"
                +"\n A - Actors"
                +"\n O - Choose Occupation"
                +"\n L - View current location"
                +"\n P - Move party to next location"
                +"\n E - Estimate the resource needed"
                +"\n G - Go into shop"
                +"\n C - Confront Obstacle"
                +"\n Z - Mikes control"
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
                return false;
            case "A":
                this.actors();
                return false;
            case "O":
                this.occupations();
                return true;
            case "L":
                this.viewCurrentLoc();
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
            case "Z":
                this.mikesControl();
                return true;
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

    private void viewCurrentLoc() {
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

    private void mikesControl() {
       MinMax minMax = new MinMax();
       System.out.println(minMax);
    }

    private void obstacle(){
       Obstacle obstacle = new Obstacle();
       obstacle.display();
    }

 
    
   
}
