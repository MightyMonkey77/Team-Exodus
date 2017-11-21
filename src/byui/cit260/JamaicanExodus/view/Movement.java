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
    
    public Movement () {
          
    super ("\n"
          +"\n ********************************************"
          +"\n    Do you wish to continue on your journey? ")
          +"\n ********************************************"
         + "\n  C - Continue Forward "
         + "\n  F - Eat Some Food"
         + "\n  B - Back to Game Menu"
         + "\n*********************************************");

    Player coordinates = new Player();
    
    int x = coordinates.getX();
    int y = coordinates.getY();
    double health = coordinates.getCharHealth();
    Map playerMapLocation = new Map();
    Scene sceneDescription = new Scene();
    
    String playerLocation = playerMapLocation.buildMap(x, y);
    
    String currentSceneDescription = sceneDescription.buildSceneDescription(x, y);
    
}    
    

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        MovementControl movementControl = new MovementControl();
        
        Player coordinates = new Player();
        
        double charHealth = coordinates.getCharHealth();
        Map playerMapLocation = new Map();
        Scene scenedescription = new Scene();
        
        int x = coordinates.getX();
        int y = coordinates.getY(); 
        return false;

    }
    
}
