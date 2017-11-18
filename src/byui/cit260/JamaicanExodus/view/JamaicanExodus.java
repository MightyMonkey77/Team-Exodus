/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;


import byui.cit260.JamaicanExodus.model.Actor;
import byui.cit260.JamaicanExodus.model.Game;
import byui.cit260.JamaicanExodus.model.Inventory;
import byui.cit260.JamaicanExodus.model.Player;

/**
 *
 * @author Office Payne
 */
public class JamaicanExodus {

    private static Game currentGame = null;
    private static Player player = null;
    private static Actor[] actors = null;
    private static Inventory[] inventoryList = null;
    private static Map map = null;

    public static Map getMap() {
        return map;
    }

    public static void setMap(Map map) {
        JamaicanExodus.map = map;
    }
    
    public static Inventory[] getInventoryList() {
        return inventoryList;
    }
    
    public static void setInventoryList(Inventory[] inventoryList) {
        JamaicanExodus.inventoryList = inventoryList;
    }

    public static Actor[] getActor() {
        return actors;
    }

    public static void setActor(Actor[] actors) {
        JamaicanExodus.actors = actors;
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

    static void setMap() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
      

    
    
    
}
