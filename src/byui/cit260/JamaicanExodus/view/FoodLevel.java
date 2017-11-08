/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

/**
 *
 * @author Chris
 */
public class FoodLevel extends View {
   
        
      public FoodLevel() {
        super ("\n        *****************************************************"
                +"\n       |            Food Levels                           |"
                +"\n        ****************************************************"
                +"\n        A - Eating Air"
                +"\n        C - Crumbs"
                +"\n        H - Still Hungry"
                +"\n        S - Stuffed"
                +"\n        E - Exit"       
                +"\n       *****************************************************");
        
    }
   
    
      @Override
    public boolean doAction(String choice){
        choice = choice.toUpperCase();
        switch(choice){
            case "A":
                this.eatingAir();
                return true; 
                
            case "C":
                this.crumbs();
                return true;
                

         case "H":
                this.stillHungry();
                return true;
                
            case "S":
                this.stuffed();
                return true;
                
            case "E":
                this.exit();
                return true;
                
            default :
                System.out.println("\nInvalid Selection"); 
                return false;    
        } 
    }

    private void eatingAir () {
        System.out.println("\n You are all out of food and are about to kill over at anytime. We would suggest going to the store to pick up supplys.");

    }

    private void crumbs () {
        System.out.println("\n You are very very low on food. Be shure to make a stop at your local market.");
    }

    private void stillHungry() {
        System.out.println("\n You need to eat more food to have energy to go on. ");
    }
    
    private void stuffed () {
        System.out.println("\n You ate to much and now want to nap.");
    }

    private void exit() {
        System.out.println("\n Exiting Food Levels");
    }


       
}




