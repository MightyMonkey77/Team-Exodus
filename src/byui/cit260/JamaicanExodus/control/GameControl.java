/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.control;


import byui.cit260.JamaicanExodus.model.Game;
import byui.cit260.JamaicanExodus.model.Inventory;
import byui.cit260.JamaicanExodus.model.Map;
import byui.cit260.JamaicanExodus.model.Months;
import byui.cit260.JamaicanExodus.model.Occupations;
import byui.cit260.JamaicanExodus.model.Player;
import byui.cit260.JamaicanExodus.JamaicanExodus;
import byui.cit260.JamaicanExodus.model.Actor;
import byui.cit260.JamaicanExodus.model.Location;
import byui.cit260.JamaicanExodus.model.Obstacles;
import byui.cit260.JamaicanExodus.model.Scene;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



/**
 *
 * @author Office Payne
 */
public class GameControl {

    private static Obstacles one;
    private static Obstacles Two;
    private static Obstacles Three;
    private static Obstacles Four;
    private static Obstacles Five;
    private static Obstacles Six;
    private static Obstacles Seven;
    
    public static Player createPlayer(String name) {  
               
     if (name == null) {
         return null;
     }
     Player player = new Player();
     player.setName(name);
     
     JamaicanExodus.setPlayer(player);// save th player thing.
     
    return player;
    } 
    
    public static int createNewGame(Player player) {
        
       if (player == null) 
            return -1; 
     
     // System.out.println("Craptastic, still cannot get this to work.");
     Game currentGame = new Game(); // Starts the game.
     JamaicanExodus.setCurrentGame(currentGame); // Sets it to the main program.
    
     JamaicanExodus.setPlayer(player);//sets current player into main program. 
           
     Actor[] actor = GameControl.createActors();
     JamaicanExodus.setActor(actor);
     
     Months[] months = GameControl.createMonths();
     JamaicanExodus.setMonths(months);
     
     Occupations occupations = GameControl.createOccupations();
     JamaicanExodus.setOccupations(occupations);
     
     Inventory[] inventory = GameControl.createInvetoryList();
     JamaicanExodus.setInventory(inventory);// save me!
     
     Map map = MapControl.createMap(8, 9); // Start the Map
     
     if (map == null) {
        return -1;
     }
     else {
     JamaicanExodus.setMap(map);
     JamaicanExodus.setCurrentGame(currentGame);
     return 1;
     }
    }   

    private static Months[] createMonths() {
       System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    private static Occupations createOccupations() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    private static Actor[] createActors() {
       
        Actor[] actorList = new Actor[5];
        
        Actor companionOne = new Actor();
        companionOne.setDescription("");
        companionOne.setName("");
        companionOne.setCoordinates(1, 1);
      //actorList[Actors[].companionOne.ordinal()] = companionOne;
        
        return actorList;        
        
    }
   

    public enum Item {
    
    clothing,
    rations,
    fuel,
    tools,
    computer,
    calc,
    farmtools,
    medicine,
    chest;
    }
     
     public static Inventory[] createInvetoryList() {
          
          Inventory[] inventoryList = new Inventory [8];
          
          Inventory clothing = new Inventory();
          clothing.setDescription("clothing");
          clothing.setQuantity(1);
          clothing.setWeight(2.03);
          clothing.setCost(15.55);
          inventoryList[Item.clothing.ordinal()] = clothing;
          
          Inventory rations = new Inventory();
          rations.setDescription("rations");
          rations.setQuantity(1);
          rations.setWeight(2.03);
          rations.setCost(15.55);
          inventoryList[Item.rations.ordinal()] = rations;
          
          Inventory fuel = new Inventory();
          fuel.setDescription("fuel");
          fuel.setQuantity(1);
          fuel.setWeight(10.00);
          fuel.setCost(15.55);
          inventoryList[Item.fuel.ordinal()] = fuel;
          
          Inventory tools = new Inventory();
          tools.setDescription("tools used by carpenter, shipwrieght");
          tools.setQuantity(1);
          tools.setWeight(6.53);
          tools.setCost(15.55);
          inventoryList[Item.tools.ordinal()] = tools;
          
          Inventory computer = new Inventory();
          computer.setDescription("computer");
          computer.setQuantity(1);
          computer.setWeight(8.5);
          computer.setCost(15.55);
          inventoryList[Item.computer.ordinal()] = computer;
          
          Inventory calc = new Inventory();
          calc.setDescription("calculator");
          calc.setQuantity(1);
          calc.setWeight(1.01);
          calc.setCost(15.55);
          inventoryList[Item.calc.ordinal()] = calc;
          
          Inventory farmtools = new Inventory();
          farmtools.setDescription("farmtools");
          farmtools.setQuantity(1);
          farmtools.setWeight(8.36);
          farmtools.setCost(15.55);
          inventoryList[Item.farmtools.ordinal()] = farmtools;
          
          Inventory medicine = new Inventory();
          medicine.setDescription("medicine");
          medicine.setQuantity(1);
          medicine.setWeight(0.75);
          medicine.setCost(15.55);
          inventoryList[Item.medicine.ordinal()] = farmtools;
          
          Inventory chest = new Inventory();
          chest.setDescription("Chest of holding.");
          chest.setQuantity(1);
          chest.setWeight(10.00);
          inventoryList[Item.chest.ordinal()] = chest;          
         
          
          return inventoryList;
     }
     
    public static Map createMap(int x, int y, Inventory[] inventory) {
    
        if (x < 0 || y < 0)
            return null;
        
        if (inventory == null)
            return null;
        
        Map map = new Map();
        map.setX(x);
        map.setY(y);
        
        Location[][] locations = createLocations(x, y);
        map.setLocations(locations);
        
        Scene[] scenes = GameControl.createScenes();
        
        Obstacles[] obstacles = GameControl.createObstacles();
         
        GameControl.scenesToLocation(map, scenes, obstacles);
        
        return map;
        
    }
     public enum SceneArea {
     froome,
     kingston,
     saintPetersburg,
     birmingham,
     elPaso,
     losAngeles,
     redding,
     medford,
     ;
     
     }
    
     private static Scene[] createScenes() {
       
         Scene[] scenePlace = new Scene[8];
         
         Scene froome = new Scene();
         froome.setDescription("Home Town - Beggining Town");
         froome.setSceneName("Froome");
         froome.setSymbol("FR");
         scenePlace[SceneArea.froome.ordinal()] = froome;
         
         Scene kingston = new Scene();
         froome.setDescription("Kingston, Jamaica - Port Town");
         froome.setSceneName("Kingston");
         froome.setSymbol("KI");
         scenePlace[SceneArea.kingston.ordinal()] = kingston;
         
         Scene saintPetersburg = new Scene();
         froome.setDescription("Saint Petersburg, FL - Port Town - USA");
         froome.setSceneName("Saint Petersburg");
         froome.setSymbol("SP");
         scenePlace[SceneArea.saintPetersburg.ordinal()] = saintPetersburg;
         
         Scene birmingham = new Scene();
         froome.setDescription("Birmingham, AL - Switch Town for Railroads");
         froome.setSceneName("Birmingham");
         froome.setSymbol("BR");
         scenePlace[SceneArea.birmingham.ordinal()] = birmingham;
         
         Scene elPaso = new Scene();
         froome.setDescription("El Paso, TX - Switch Town");
         froome.setSceneName("El Paso");
         froome.setSymbol("EP");
         scenePlace[SceneArea.elPaso.ordinal()] = elPaso;
         
         Scene losAngeles = new Scene();
         froome.setDescription("Los Angeles, CA - Horrid Place, leave fast.");
         froome.setSceneName("Los Angeles");
         froome.setSymbol("LA");
         scenePlace[SceneArea.losAngeles.ordinal()] = losAngeles;
         
         Scene redding = new Scene();
         froome.setDescription("Redding, CA - A Dirty Palace");
         froome.setSceneName("Redding");
         froome.setSymbol("RD");
         scenePlace[SceneArea.redding.ordinal()] = redding;
         
         Scene medford = new Scene();
         froome.setDescription("Medford, OR - End Goal - Congrats");
         froome.setSceneName("Medford");
         froome.setSymbol("MD");
         scenePlace[SceneArea.medford.ordinal()] = medford;
                          
         return scenePlace;
    }
     
      private enum ObName {
      one,
      Two,
      Three,
      Four,
      Five,
      Six,
      Seven;
      }
     
      private static Obstacles[] createObstacles() {
          
          Obstacles[] obstaclePosition = new Obstacles[7];
          
          Obstacles obstacleOne = new Obstacles();
          obstacleOne.getObstacleDescription();
          obstacleOne.getAnswer();
          obstaclePosition[ObName.one.ordinal()] = one;
          
          Obstacles obstacleTwo = new Obstacles();
          obstacleTwo.getObstacleDescription();
          obstacleTwo.getAnswer();
          obstaclePosition[ObName.Two.ordinal()] = Two;             
          
          Obstacles obstacleThree = new Obstacles();
          obstacleThree.getObstacleDescription();
          obstacleThree.getAnswer();
          obstaclePosition[ObName.Three.ordinal()] = Three;
          
          Obstacles obstacleFour = new Obstacles();
          obstacleFour.getObstacleDescription();
          obstacleFour.getAnswer();
          obstaclePosition[ObName.Four.ordinal()] = Four;
          
          Obstacles obstacleFive = new Obstacles();
          obstacleFive.getObstacleDescription();
          obstacleFive.getAnswer();
          obstaclePosition[ObName.Five.ordinal()] = Five;
          
          Obstacles obstacleSix = new Obstacles();
          obstacleSix.getObstacleDescription();
          obstacleSix.getAnswer();
          obstaclePosition[ObName.Six.ordinal()] = Six;
          
          Obstacles obstacleSeven = new Obstacles();
          obstacleSeven.getObstacleDescription();
          obstacleSeven.getAnswer();
          obstaclePosition[ObName.Seven.ordinal()] = Seven;
          
          return obstaclePosition;
    }

     
     private static Location[][] createLocations(int x, int y) {
          if (x < 1 || y < 1)
            return null;

        Location[][] locationsSpot = new Location[x][y];
        for (int i = 0; i < locationsSpot.length; i++) {
            for (int j = 0; j < locationsSpot[i].length; j++) {
                Location location = new Location();
                location.setX(i);
                location.setY(j);
                location.setVisited(false);
                locationsSpot[i][j] = location;
            }
        }

        return locationsSpot;
    }
     private static void scenesToLocation(Map map, Scene[] scenes, Obstacles[] obstaclesPosition, Obstacles[] obstacles) {
        
         Location[][] locations = map.getLocations();
         
         locations [1][1].setScenes(scenes[SceneArea.froome.ordinal()]);
         locations [1][10].setObstacles(obstacles[obstaclePosition.One.ordinal()]);
         locations [2][1].setScenes(scenes[SceneArea.kingston.ordinal()]);
         locations [2][10].setObstacles([obstaclesPosition.Two.ordinal()]):
         locations [3][1].setScenes(scenes[SceneArea.saintPetersburg.ordinal()]);
         locations [3][10].setObstacles(obstacles[obstaclesPosistion.Three.ordinal()]);
         locations [4][1].setScenes(scenes[SceneArea.birmingham.ordinal()]);
         locations [4][10].setObstacles(obstacles[obstaclesPosition.Four.ordinal()]);
         locations [5][1].setScenes(scenes[SceneArea.elPaso.ordinal()]);
         locations [5][10].setObstacles(obstacles[obstaclesPosition.Five.ordinal()]);
         locations [6][1].setScenes(scenes[SceneArea.losAngeles.ordinal()]);
         locations [6][10].setObstacles(obstacles[obstaclesPosition.Six.ordinal()]);
         locations [7][1].setScenes(scenes[SceneArea.redding.ordinal()]);
         locations [7][10].setObstacles(obstacles[obstaclesPosition.Seven.ordinal()]);
         locations [8][1].setScenes(scenes[SceneArea.medford.ordinal()]);
         

    }
         public static void getSavedGame(String filepath) throws GameControlException 

       {
        Game game = null;

        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject(); // read the game object from file
        }
        catch(FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }

       // close the outuput file
       JamaicanExodus.setCurrentGame(game);    

    }
       
        public static void saveGame(Game game, String filepath) 
            throws GameControlException, FileNotFoundException, IOException {

        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); // write the game object out to file
        }
        catch(IOException e) {
            throw new GameControlException(e.getMessage());
        } 
    }

     
}
     
   
     
    
     
     
     
     

    
    
   
    
