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
import byui.cit260.JamaicanExodus.model.Actor;
import byui.cit260.JamaicanExodus.model.Location;
import byui.cit260.JamaicanExodus.model.Obstacles;
import byui.cit260.JamaicanExodus.model.Scene;
import java.awt.Point;


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
       
       Obstacles[] obstaclePosition = createObstacles();
       
      // MapControl.sceneToLocations(map, scenes, obstaclePosition);
       
       return map; //brings up the map
       
    }

    public static Scene[] createScenes() {
     
        Game game = JamaicanExodus.getCurrentGame();

        Scene[] scenes = new Scene[GameControl.SceneArea.values().length];
        
        Scene froomeScenes = new Scene();
        froomeScenes.setDescription("");
        froomeScenes.setMap("");
        scenes[GameControl.SceneArea.froome.ordinal()] = froomeScenes;
        
        
        
        
        
        return scenes;
    }    
        
     private static Obstacles[] createObstacles() {
        
         Game game = JamaicanExodus.getCurrentGame();
         
         Obstacles[] obstaclePosition = new Obstacles[GameControl.ObName.values().length];
         
         Obstacles oneScene = new Obstacles();
         oneScene.setObstacleDescription("");
         oneScene.setAnswer("");
         obstaclePosition[GameControl.ObName.One.ordinal()] = oneScene;
         
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

   /* private static void sceneToLocations(Map map, Scene[] scenes, Obstacles[] obstaclePosition) {
         
         Location[][] locations = map.getLocations();
         
         locations [1][1].setScenes(scenes[GameControl.SceneArea.froome.ordinal()]);
         locations [1][10].setObstacles(obstaclePosition[GameControl.ObName.One.ordinal()]);
         locations [2][1].setScenes(scenes[GameControl.SceneArea.kingston.ordinal()]);
         locations [2][10].setObstacles(obstaclePosition[GameControl.ObName.Two.ordinal()]);
         locations [3][1].setScenes(scenes[GameControl.SceneArea.saintPetersburg.ordinal()]);
         locations [3][10].setObstacles(obstaclePosition[GameControl.ObName.Three.ordinal()]);
         locations [4][1].setScenes(scenes[GameControl.SceneArea.birmingham.ordinal()]);
         locations [4][10].setObstacles(obstaclePosition[GameControl.ObName.Four.ordinal()]);
         locations [5][1].setScenes(scenes[GameControl.SceneArea.elPaso.ordinal()]);
         locations [5][10].setObstacles(obstaclePosition[GameControl.ObName.Five.ordinal()]);
         locations [6][1].setScenes(scenes[GameControl.SceneArea.losAngeles.ordinal()]);
         locations [6][10].setObstacles(obstaclePosition[GameControl.ObName.Six.ordinal()]);
         locations [7][1].setScenes(scenes[GameControl.SceneArea.redding.ordinal()]);
         locations [7][10].setObstacles(obstaclePosition[GameControl.ObName.Seven.ordinal()]);
         locations [8][1].setScenes(scenes[GameControl.SceneArea.medford.ordinal()]);
   
    }*/

   
}
      
   

   

       
    
    
