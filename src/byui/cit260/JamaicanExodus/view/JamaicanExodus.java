/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;


import byui.cit260.JamaicanExodus.model.Actor;
import byui.cit260.JamaicanExodus.model.Game;
import byui.cit260.JamaicanExodus.model.Player;

/**
 *
 * @author Office Payne
 */
public class JamaicanExodus {

    private static Game currentGame = null;
    private static Player player = null;
    private static Actor actor = null;
    

    public static Actor getActor() {
        return actor;
    }

    public static void setActor(Actor actor) {
        JamaicanExodus.actor = actor;
    }
        
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        JamaicanExodus.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        JamaicanExodus.player = player;
    }
    
    
    
    public static void main(String[] args) {     
        
        StartProgram startProgram = new StartProgram();
        startProgram.displayStartProgram();
        
        
 
    
  }
}
