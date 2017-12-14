/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.control;

import byui.cit260.JamaicanExodus.Exception.MapControlException;
import byui.cit260.JamaicanExodus.model.Game;
import byui.cit260.JamaicanExodus.model.Map;
import byui.cit260.JamaicanExodus.JamaicanExodus;
import byui.cit260.JamaicanExodus.enums.ObName;
import byui.cit260.JamaicanExodus.model.Actor;
import byui.cit260.JamaicanExodus.model.Obstacles;
import byui.cit260.JamaicanExodus.model.Scene;
import java.awt.Point;


/**
 *
 * @author Office Payne
 */
public class MapControl {
    
    

    public static Map createMap(int x, int y)throws MapControlException {
       
        if (x < 0 || y < 0){
        
       throw new MapControlException("Least 1 row and 1 col.");
        }       
               
       Map map = new Map();      
       
       //Scenes array
       Scene[] scenes = createScenes();
       
       Obstacles[] obstaclePosition = createObstacles();
       
      // MapControl.sceneToLocations(map, scenes, obstaclePosition);
       
       return map; //brings up the map
       
    }

   public static Scene[] createScenes() {
        Scene[] scenes = null;      
        return scenes;
    }    
        
     private static Obstacles[] createObstacles() {
        
         Game game = JamaicanExodus.getCurrentGame();
         
         Obstacles[] obstaclePosition = new Obstacles[ObName.values().length];
         
         Obstacles oneScene = new Obstacles();
         oneScene.setObstacleDescription("");
         oneScene.setAnswer("");
         obstaclePosition[ObName.One.ordinal()] = oneScene;
         
         return obstaclePosition;
    } 
     
       
    
    private static int moveActorToLocation(Actor actor, Point coordinates) throws MapControlException {
        Map map = JamaicanExodus.getCurrentGame().getMap();
        int newx = coordinates.x-1;
        int newy = coordinates.y-1;
        
        if (newx < 0 || newx >= map.getX() || newy < 0 || newy >= map.getY()) {
        throw new MapControlException("Can not move actor to location" + coordinates.x  
                + ", " + coordinates.y + " it is out bounds.");
        }
        return 0;
    }

    

   
}
      
   

   

       
    
    
