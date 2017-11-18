/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.control;

import byui.cit260.JamaicanExodus.model.Game;
import byui.cit260.JamaicanExodus.model.Inventory;
import byui.cit260.JamaicanExodus.model.Map;
import byui.cit260.JamaicanExodus.view.JamaicanExodus;
import javafx.scene.Scene;

/**
 *
 * @author Office Payne
 */
public class MapControl {

    public static Map createMap(int x, int y, Inventory[] inventory) {
        
        if (x < 0 || y < 0) {
        System.out.println("Invalid");
        }
       
       
       Map map = new Map(13,22);
       
       
       //Scenes array
       Scene[] scenes = createScenes();
       
       MapControl.sceneToLocations(map, scenes);
       
       return map; //brings up the map
       
    }

    public static Scene[] createScenes() {
     
        Game game = JamaicanExodus.getCurrentGame();

        Scene[] scenes = new Scene[SceneType.values().length];
        
        
        
        return scenes;      
    
    }

    private static void sceneToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}