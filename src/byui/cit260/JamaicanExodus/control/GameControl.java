/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.control;


import byui.cit260.JamaicanExodus.model.JamaicanExodus;
import byui.cit260.JamaicanExodus.model.Player;



/**
 *
 * @author Office Payne
 */
public class GameControl {
    

    public static Player createPlayer(String name) {
        
               
     if (name == null) {
         return null;
     }
     Player player = new Player();
     player.setName(name);
     
     JamaicanExodus.setPlayer(player);
     
    return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("Pardon our dust, we're building for a better tomorrow.."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
