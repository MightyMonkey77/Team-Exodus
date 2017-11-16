/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.model.Actor;
import byui.cit260.JamaicanExodus.model.Game;
import byui.cit260.JamaicanExodus.model.Map;
import byui.cit260.JamaicanExodus.model.Player;

/**
 *
 * @author Office Payne
 */
class GameControl {

    public static Player createPlayer(String name) {
        
       if (name == null) {
         return null;
     }
     Player player = new Player();
     player.setName(name);
     
     JamaicanExodus.setPlayer(player);
     
    return player;
    }

    public void createNewGame() {
      System.out.println("Craptastic, still cannot get this to work.");
     // Player player = new Player();
     // player.getName();
      
     
      
    
      
      
    }

       
}
