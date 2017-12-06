/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.control.MovementControl;
import byui.cit260.JamaicanExodus.model.Player;
import byui.cit260.JamaicanExodus.model.Scene;

/**
 *
 * @author Office Payne
 */
public class Movement extends View{
    
    public Movement() {
          
   /* super("\n"
          +"\n ********************************************"
          +"\n    Do you wish to continue on your journey? ")
          +"\n ********************************************"
         + "\n  C - Continue Forward "
         + "\n  F - Eat Some Food"
         + "\n  B - Back to Game Menu"
         + "\n*********************************************"
    );
*/    
        Player coordinates = new Player();
    
        int x = coordinates.getX();
        int y = coordinates.getY();
        double health = coordinates.getCharHealth();
        Map playerMapLocation = new Map();
        Scene sceneDescription = new Scene();
    
        String playerLocation = playerMapLocation.buildMap(x, y);
    
        int[] currentSceneDescription = sceneDescription.buildSceneDescription(x, y);
    }
    
    @Override
    public boolean doAction(String choice) {
          choice = choice.toUpperCase(); //convert choice to upper case
        
          MovementControl movementControl = new MovementControl();
        
          Player coordinates = new Player();

          double characterHealth = coordinates.getCharHealth();
          Map playerMapLocation = new Map();
          Scene sceneDescription = new Scene();

          int xCoord = coordinates.getX();
          int yCoord = coordinates.getY(); 
          
    switch(choice) {
    
        case "C":
            this.Continue();
            break;
            
        case "F":
            this.EatFood();
            break;
            
        case "B":
            this.Back();
            break;
        
        default :
            System.out.println("Invalid Choice");
            return false;
        } 
        return true;        
    }

    private void Continue() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void EatFood() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Back() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
