/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.control;

import byui.cit260.JamaicanExodus.model.Game;
import byui.cit260.JamaicanExodus.model.Map;
import byui.cit260.JamaicanExodus.JamaicanExodus;
import javafx.scene.Scene;

/**
 *
 * @author Office Payne
 */
public class MapControl {
    
    

    public static Map createMap(int x, int y) {
       
        if (x < 0 || y < 0){
        }
        
       Map map = new Map(8 ,10);      
       
       //Scenes array
       Scene[] scenes = createScenes();
       
       //MapControl.sceneToLocations(map, scenes);
       
       return map; //brings up the map
       
    }

    public static Scene[] createScenes() {
     
        Game game = JamaicanExodus.getCurrentGame();

        Scene[] scenes = new Scene[SceneType.values().length];
        
        
        
        return scenes;      
    
    }
   /* private static int moveActorToLocation(Actor actor, Point coordinates) throws MapControlException {
        Map map = JamaicanExodus.getCurrentGame().getMap();
        int newx = coordinates.x-1;
        int newy = coordinates.y-1;
        
        if (newx < 0 || newx >= map.getX() || newy < 0 || newy >= map.getY()) {
        throw new MapControlException("Can not move actor to location" + coordinates.x  
                + ", " + coordinates.y + " it is out bounds.");
        }
        return 0;
    } 
    
    private static int moveActorsToStart(Map map) throws MapControlException {
    Actor[] actors = Actor.values();
    
    for (Actor actor : actors) {
    Point coordinates = actor.getCoordinates();
    MapControl.moveActorToLocation(actor, coordinates);

    }
        return 0;
    */   
    
 }
      
   

   

       
    
    
