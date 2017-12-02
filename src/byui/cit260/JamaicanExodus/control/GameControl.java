/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.control;


import byui.cit260.JamaicanExodus.Exception.GameControlException;
import byui.cit260.JamaicanExodus.Exception.MapControlException;
import byui.cit260.JamaicanExodus.model.Game;
import byui.cit260.JamaicanExodus.model.Inventory;
import byui.cit260.JamaicanExodus.model.Map;
import byui.cit260.JamaicanExodus.model.Months;
import byui.cit260.JamaicanExodus.model.Occupations;
import byui.cit260.JamaicanExodus.model.Player;
import byui.cit260.JamaicanExodus.JamaicanExodus;
import byui.cit260.JamaicanExodus.enums.Companions;
import byui.cit260.JamaicanExodus.enums.Item;
import byui.cit260.JamaicanExodus.enums.Jobs;
import byui.cit260.JamaicanExodus.enums.ObName;
import byui.cit260.JamaicanExodus.enums.SceneArea;
import byui.cit260.JamaicanExodus.enums.UseableMonths;
import byui.cit260.JamaicanExodus.model.Actor;
import byui.cit260.JamaicanExodus.model.Location;
import byui.cit260.JamaicanExodus.model.Obstacles;
import byui.cit260.JamaicanExodus.model.Scene;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;




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
     
     JamaicanExodus.setPlayer(player);// save th player thing.
     
    return player;
    } 
    
    public static int createNewGame(Player player) throws GameControlException, MapControlException {
        
       if (player == null) {
            throw new GameControlException("You are not welcome here, O' nameless one.");  }
     
     // System.out.println("Craptastic, still cannot get this to work.");
     Game currentGame = new Game(); // Starts the game.
     JamaicanExodus.setCurrentGame(currentGame); // Sets it to the main program.
    
     currentGame.setPlayer(player);//sets current player into main program. 
           
     Actor[] actor = GameControl.createActors();
     currentGame.setActor(actor);
     
     Months[] months = GameControl.createMonths();
     currentGame.setMonths(months);
     
     Occupations[] occupations = GameControl.createOccupations();
     currentGame.setOccupations(occupations);
     
     Inventory[] inventory = GameControl.createInvetoryList();
     currentGame.setInventory(inventory);// save me!
     
     Map map = MapControl.createMap(8, 9); // Start the Map
     
     if (map == null) {
        return -1;
     }
     else {
     currentGame.setMap(map);
     JamaicanExodus.setCurrentGame(currentGame);
     return 1;
     }
    }   
        
   private static Months[] createMonths() { 
     Months[] monthList = new Months [6];
      
      Months January = new Months();
          January.setDescription("Month of January. Average temp of 86F dry season.");
          January.setName("January");
          January.setImpact((int) .25);
          monthList[UseableMonths.January.ordinal()] = January;
          
      Months February = new Months();
          February.setDescription("Month of Feburary. Average temp of 86F dry season.");
          February.setName("February");
          February.setImpact((int) .35);
          monthList[UseableMonths.February.ordinal()] = February;
      
      Months March = new Months();
          March.setDescription("Month of March. Average temp of 88F dry season.");
          March.setName("March");
          March.setImpact((int) .45);
          monthList[UseableMonths.March.ordinal()] = March;
      
      Months April = new Months();
          April.setDescription("Month of April. Average temp of 88F begining of the first wet season.");
          April.setName("April");
          April.setImpact((int) .25);
          monthList[UseableMonths.April.ordinal()] = April;
          
      Months May = new Months();
          May.setDescription("Month of May. Average temp of 88F first wet season.");
          May.setName("May");
          May.setImpact((int) .35);
          monthList[UseableMonths.May.ordinal()] = May;
      
      Months June = new Months();
          June.setDescription("Month of June. Average temp of 90F lightening of the first wet season.");
          June.setName("June");
          June.setImpact((int) .45);
          monthList[UseableMonths.June.ordinal()] = June;    
          
      return monthList;    
   }       
    
        private static Occupations[] createOccupations() {
        Occupations[] occupationsList = new Occupations[5]; 
        
        Occupations banker = new Occupations();        
        banker.setDescription("");
        banker.setName("banker");
        banker.setStartingMoney(100000000.00);
        occupationsList[Jobs.banker.ordinal()] = banker;
        
        Occupations carpenter = new Occupations();        
        banker.setDescription("");
        banker.setName("carpenter");
        banker.setStartingMoney(100000000.00);
        occupationsList[Jobs.carpenter.ordinal()] = carpenter;
        
        Occupations farmer = new Occupations();        
        banker.setDescription("");
        banker.setName("farmer");
        banker.setStartingMoney(100000000.00);
        occupationsList[Jobs.farmer.ordinal()] = farmer;
        
        Occupations shipwright = new Occupations();        
        banker.setDescription("");
        banker.setName("shipwright");
        banker.setStartingMoney(100000000.00);
        occupationsList[Jobs.shipwright.ordinal()] = shipwright;
        
        Occupations softwareEngineer = new Occupations();        
        banker.setDescription("");
        banker.setName("softwareEngineer");
        banker.setStartingMoney(100000000.00);
        occupationsList[Jobs.softwareEngineer.ordinal()] = softwareEngineer;
        return occupationsList;
  
    }       
    
    private static Actor[] createActors() {
       
        Actor[] actorList = new Actor[5];
        
        Actor companionOne = new Actor();
        companionOne.setDescription("This is your wife/husband that is accompaning you.");
        companionOne.setName("");
        companionOne.setCoordinates(1, 2);
        actorList[Companions.companionOne.ordinal()] = companionOne;
      
        Actor companionTwo = new Actor();
        companionTwo.setDescription("Your First child.");
        companionTwo.setName("");
        companionTwo.setCoordinates(1, 3);
        actorList[Companions.companionTwo.ordinal()] = companionTwo;
        
        Actor companionThree = new Actor();
        companionThree.setDescription("Your second child.");
        companionThree.setName("");
        companionThree.setCoordinates(1, 4);
        actorList[Companions.companionThree.ordinal()] = companionThree;
        
        Actor companionFour = new Actor();
        companionFour.setDescription("Best friend.");
        companionFour.setName("");
        companionFour.setCoordinates(1, 5);
        actorList[Companions.companionFour.ordinal()] = companionFour;
      
        Actor companionFive = new Actor();
        companionFive.setDescription("Best friends wife/husband.");
        companionFive.setName("");
        companionFive.setCoordinates(1, 6);
        actorList[Companions.companionFive.ordinal()] = companionFive;  
        
        return actorList;        
        
    }   
     
     public static Inventory[] createInvetoryList() {
          
          Inventory[] inventoryList = new Inventory [10];
          
          Inventory clothing = new Inventory();
          clothing.setDescription("clothing");
          clothing.setQuantity(0);
          clothing.setWeight(2.03);
          clothing.setCost(15.55);
          inventoryList[Item.clothing.ordinal()] = clothing;
          
          Inventory rations = new Inventory();
          rations.setDescription("rations");
          rations.setQuantity(0);
          rations.setWeight(2.15);
          rations.setCost(15.55);
          inventoryList[Item.rations.ordinal()] = rations;
          
          Inventory fuel = new Inventory();
          fuel.setDescription("fuel");
          fuel.setQuantity(0);
          fuel.setWeight(10.00);
          fuel.setCost(15.55);
          inventoryList[Item.fuel.ordinal()] = fuel;
          
          Inventory tools = new Inventory();
          tools.setDescription("tools used by carpenter, shipwrieght");
          tools.setQuantity(0);
          tools.setWeight(6.53);
          tools.setCost(15.55);
          inventoryList[Item.tools.ordinal()] = tools;
          
          Inventory computer = new Inventory();
          computer.setDescription("computer");
          computer.setQuantity(0);
          computer.setWeight(8.5);
          computer.setCost(15.55);
          inventoryList[Item.computer.ordinal()] = computer;
          
          Inventory calc = new Inventory();
          calc.setDescription("calculator");
          calc.setQuantity(0);
          calc.setWeight(1.01);
          calc.setCost(15.55);
          inventoryList[Item.calc.ordinal()] = calc;
          
          Inventory farmtools = new Inventory();
          farmtools.setDescription("farmtools");
          farmtools.setQuantity(0);
          farmtools.setWeight(8.36);
          farmtools.setCost(15.55);
          inventoryList[Item.farmtools.ordinal()] = farmtools;
          
          Inventory medicine = new Inventory();
          medicine.setDescription("medicine");
          medicine.setQuantity(0);
          medicine.setWeight(0.75);
          medicine.setCost(15.55);
          inventoryList[Item.medicine.ordinal()] = farmtools;
          
          Inventory chest = new Inventory();
          chest.setDescription("Chest of holding.");
          chest.setQuantity(0);
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
                
      private static Obstacles[] createObstacles() {
          
          Obstacles[] obstaclePosition = new Obstacles[7];
          
          Obstacles One = new Obstacles();
          One.getObstacleDescription();
          One.getAnswer();
          obstaclePosition[ObName.One.ordinal()] = One;
          
          Obstacles Two = new Obstacles();
          Two.getObstacleDescription();
          Two.getAnswer();
          obstaclePosition[ObName.Two.ordinal()] = Two;             
          
          Obstacles Three = new Obstacles();
          Three.getObstacleDescription();
          Three.getAnswer();
          obstaclePosition[ObName.Three.ordinal()] = Three;
          
          Obstacles Four = new Obstacles();
          Four.getObstacleDescription();
          Four.getAnswer();
          obstaclePosition[ObName.Four.ordinal()] = Four;
          
          Obstacles Five = new Obstacles();
          Five.getObstacleDescription();
          Five.getAnswer();
          obstaclePosition[ObName.Five.ordinal()] = Five;
          
          Obstacles Six = new Obstacles();
          Six.getObstacleDescription();
          Six.getAnswer();
          obstaclePosition[ObName.Six.ordinal()] = Six;
          
          Obstacles Seven = new Obstacles();
          Seven.getObstacleDescription();
          Seven.getAnswer();
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
     private static void scenesToLocation(Map map, Scene[] scenes, Obstacles[] obstaclePosition) {
        
         Location[][] locations = map.getLocations();
         
         locations [1][1].setScenes(scenes[SceneArea.froome.ordinal()]);
         locations [1][10].setObstacles(obstaclePosition[ObName.One.ordinal()]);
         locations [2][1].setScenes(scenes[SceneArea.kingston.ordinal()]);
         locations [2][10].setObstacles(obstaclePosition[ObName.Two.ordinal()]);
         locations [3][1].setScenes(scenes[SceneArea.saintPetersburg.ordinal()]);
         locations [3][10].setObstacles(obstaclePosition[ObName.Three.ordinal()]);
         locations [4][1].setScenes(scenes[SceneArea.birmingham.ordinal()]);
         locations [4][10].setObstacles(obstaclePosition[ObName.Four.ordinal()]);
         locations [5][1].setScenes(scenes[SceneArea.elPaso.ordinal()]);
         locations [5][10].setObstacles(obstaclePosition[ObName.Five.ordinal()]);
         locations [6][1].setScenes(scenes[SceneArea.losAngeles.ordinal()]);
         locations [6][10].setObstacles(obstaclePosition[ObName.Six.ordinal()]);
         locations [7][1].setScenes(scenes[SceneArea.redding.ordinal()]);
         locations [7][10].setObstacles(obstaclePosition[ObName.Seven.ordinal()]);
         locations [8][1].setScenes(scenes[SceneArea.medford.ordinal()]);
         

    }
         public static void loadSavedGame(String filepath) throws GameControlException 

       {
        Game game = null;

        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject(); // read the game object from file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
       // close the outuput file
       JamaicanExodus.setCurrentGame(game);    

    }
       
        public static void saveGame(Game game, String filepath) 
            throws GameControlException {

        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); // write the game object out to file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        } 
    }
 
}
