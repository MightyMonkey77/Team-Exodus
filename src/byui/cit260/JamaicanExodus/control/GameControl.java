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
import byui.cit260.JamaicanExodus.enums.Jobs;
import byui.cit260.JamaicanExodus.enums.ObName;
import byui.cit260.JamaicanExodus.enums.Towns;
import byui.cit260.JamaicanExodus.enums.UseableMonths;
import byui.cit260.JamaicanExodus.model.Actor;
import byui.cit260.JamaicanExodus.model.InventoryItems;
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
     return -1;
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
      banker.setDescription("Smooth Talker");
      banker.setName("banker");
      banker.setStartingMoney(100000000.00);
      occupationsList[Jobs.banker.ordinal()] = banker;

      Occupations carpenter = new Occupations();
      banker.setDescription("Smells Like Wet Wood");
      banker.setName("carpenter");
      banker.setStartingMoney(100000000.00);
      occupationsList[Jobs.carpenter.ordinal()] = carpenter;

      Occupations farmer = new Occupations();
      banker.setDescription("Loves His Pigs");
      banker.setName("farmer");
      banker.setStartingMoney(100000000.00);
      occupationsList[Jobs.farmer.ordinal()] = farmer;

      Occupations shipwright = new Occupations();
      banker.setDescription("Can't Swim");
      banker.setName("shipwright");
      banker.setStartingMoney(100000000.00);
      occupationsList[Jobs.shipwright.ordinal()] = shipwright;

      Occupations softwareEngineer = new Occupations();
      banker.setDescription("C++,Java?");
      banker.setName("softwareEngineer");
      banker.setStartingMoney(100000000.00);
      occupationsList[Jobs.softwareEngineer.ordinal()] = softwareEngineer;
      return occupationsList;

   }

   private static Actor[] createActors() {

      Actor[] actorList = new Actor[5];

      Actor companionOne = new Actor();
      companionOne.setDescription(" Your spouce");
      companionOne.setName("");
      companionOne.setCoordinates(1, 2);
      actorList[Companions.companionOne.ordinal()] = companionOne;

      Actor companionTwo = new Actor();
      companionTwo.setDescription(" Your first child");
      companionTwo.setName("");
      companionTwo.setCoordinates(1, 3);
      actorList[Companions.companionTwo.ordinal()] = companionTwo;

      Actor companionThree = new Actor();
      companionThree.setDescription(" Your second child");
      companionThree.setName("");
      companionThree.setCoordinates(1, 4);
      actorList[Companions.companionThree.ordinal()] = companionThree;

      Actor companionFour = new Actor();
      companionFour.setDescription(" Your best friend");
      companionFour.setName("");
      companionFour.setCoordinates(1, 5);
      actorList[Companions.companionFour.ordinal()] = companionFour;

      Actor companionFive = new Actor();
      companionFive.setDescription(" Spouce's best friend");
      companionFive.setName("");
      companionFive.setCoordinates(1, 6);
      actorList[Companions.companionFive.ordinal()] = companionFive;

      return actorList;

   }
   // Re-did inventory here to accomidate changes in enum. AS well as to streamline the ordinal finding capability.

   public static Inventory[] createInvetoryList() {

      Inventory[] inventoryList = new Inventory[10];

      inventoryList[InventoryItems.clothing.ordinal()] = new Inventory(InventoryItems.clothing, 0, 0);
      inventoryList[InventoryItems.rations.ordinal()] = new Inventory(InventoryItems.rations, 0, 0);
      inventoryList[InventoryItems.fuel.ordinal()] = new Inventory(InventoryItems.fuel, 0, 0);
      inventoryList[InventoryItems.tools.ordinal()] = new Inventory(InventoryItems.tools, 0, 0);
      inventoryList[InventoryItems.computer.ordinal()] = new Inventory(InventoryItems.computer, 0, 0);
      inventoryList[InventoryItems.calc.ordinal()] = new Inventory(InventoryItems.calc, 0, 0);
      inventoryList[InventoryItems.farmtools.ordinal()] = new Inventory(InventoryItems.farmtools, 0, 0);
      inventoryList[InventoryItems.medicine.ordinal()] = new Inventory(InventoryItems.medicine, 0, 0);
      inventoryList[InventoryItems.money.ordinal()] = new Inventory(InventoryItems.money, 0, 0);

      return inventoryList;
   }

   /*         Inventory clothing = new Inventory();
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
<<<<<<< HEAD
     */
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
         scenePlace[Towns.froome.ordinal()] = froome;
         
         Scene kingston = new Scene();
         froome.setDescription("Kingston, Jamaica - Port Town");
         froome.setSceneName("Kingston");
         froome.setSymbol("KI");
         scenePlace[Towns.kingston.ordinal()] = kingston;
         
         Scene saintPetersburg = new Scene();
         froome.setDescription("Saint Petersburg, FL - Port Town - USA");
         froome.setSceneName("Saint Petersburg");
         froome.setSymbol("SP");
         scenePlace[Towns.saintPetersburg.ordinal()] = saintPetersburg;
         
         Scene birmingham = new Scene();
         froome.setDescription("Birmingham, AL - Switch Town for Railroads");
         froome.setSceneName("Birmingham");
         froome.setSymbol("BR");
         scenePlace[Towns.birmingham.ordinal()] = birmingham;
         
         Scene elPaso = new Scene();
         froome.setDescription("El Paso, TX - Switch Town");
         froome.setSceneName("El Paso");
         froome.setSymbol("EP");
         scenePlace[Towns.elPaso.ordinal()] = elPaso;
         
         Scene losAngeles = new Scene();
         froome.setDescription("Los Angeles, CA - Horrid Place, leave fast.");
         froome.setSceneName("Los Angeles");
         froome.setSymbol("LA");
         scenePlace[Towns.losAngeles.ordinal()] = losAngeles;
         
         Scene redding = new Scene();
         froome.setDescription("Redding, CA - A Dirty Palace");
         froome.setSceneName("Redding");
         froome.setSymbol("RD");
         scenePlace[Towns.redding.ordinal()] = redding;
         
         Scene medford = new Scene();
         froome.setDescription("Medford, OR - End Goal - Congrats");
         froome.setSceneName("Medford");
         froome.setSymbol("MD");
         scenePlace[Towns.medford.ordinal()] = medford;
                          
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

   public static void froome() {
      System.out.println("And so it begins..."
              + " Things are bleak in this town. Years of war"
              + " and strife have taken their toll on this town you"
              + " once loved. Thankfully, you have landed a job in "
              + " Medford, Oregon.  You and your family have decided to"
              + " make the long trek together, along with a few friends."
              + " A recent supply of goods has arrived, and the local"
              + " store should be well stocked.  You decide the time is"
              + " now, and need to get going!  The recent fires which "
              + " burned down your house have left you with only the "
              + " clothes on your back, and the money in your pockets."
              + ""
              + " Godspeed and Good-luck!  ");
   }

   public static void kingston() {
      System.out.println("Welcome to Kingston Jamaica !!"
              + "  \"The local time is...\",  eh nevermind.  You need to"
              + " check your inventory and your food before you take to"
              + " the next leg of your journey. Luckily, the ship"
              + " leaving for Florida has room on board for all of"
              + " your party.  Even better, the first mate is an old"
              + " friend of yours who has graciously made arrangements "
              + " for you to travel FOR FREE! Hallelujah!  Must be"
              + " living right! Don't dawdle too long, the ship is"
              + " leaving soon.  ");
   }

   public static void stPetersburg() {
      System.out.println("Welcome to St.Petersburg Florida."
              + "Welcome to the USA!"
              + " "
              + "No, it's not Saint Petersburg, that's in Russia. Besides"
              + "locals 'round here call it St.Pete.  There's a small shop"
              + "nearby.  You will need to choose wisely what you will"
              + "carry with you.  That old '87 Dodge Caravan you won from"
              + "that guy on the ship isn't exactly factory fresh.  You "
              + "should have known 20 thousand miles was a fairy tale. He "
              + "neglected to mention the other 300,000 miles it has.  I'm"
              + "sure if you could find him again, he'd tell you they're"
              + "all freeway miles.  Medford is just over 3000 miles away."
              + "Your next stop is Montgomery Alabama, at near exact 500"
              + "miles away.  You best be leaving soon, as the camp grounds"
              + "fill up early.     ");
   }

   public static void montogomery() {
      System.out.println("Welcome to Montgomery!"
              + " "
              + " Montgomery is the capital of the State of Alabama. Tip, if"
              + " you want to start a friendly conversation, you've got a "
              + " 60% chance of success if you say, \"Roll Tide!\""
              + " Of course, you're much closer to those who would cry "
              + " \"Go Tigers!\" so perhaps you should just get some sleep"
              + " and grab some supplies before pressing on."
              + ""
              + " Next stop, Dallas Texas, just over 600 miles to the west."
              + " Do you think that Caravan is up for the trip?  Are you?");
   }

   public static void dallas() {
      System.out.println("Welcome to Jerry's World!"
              + " "
              + " OK, fine, you're in Dallas Texas.  Depending on how you"
              + " get through this megalopolis, you may come across a giant"
              + " building that looks like half of a mechanical football. That's"
              + " \"Jerry's World\".  You've had a rough journey and the Caravan "
              + " smells like it hasn't showered in forever.  Think about it, "
              + " neither have you!  Grab that smart phone you found in Shreveport"
              + " and see if you find a KOA campground. Better yet, find a truck"
              + " stop. They've got showers there, but it will cost you a few"
              + " dollars each. While you're there, grab some supplies, and lay"
              + " off the beans!"
              + " Next stop: Albuquerque New Mexico - 644 miles away.  Better "
              + " let that Caravan, to say nothing of the rest of your party,"
              + " take a rest. There must be a Walmart parkiing lot you can"
              + " use. ");
   }

   public static void albuquerque() {
      System.out.println("Welcome to Albuquerque."
              + " "
              + " This historic city actually pre-dates the American Revolution."
              + " There's a lot of beautiful things to see around this area, but"
              + " you've got to focus on getting to Medford.  Good news, you"
              + " passed the half-way point on your journey across America at"
              + " about 50 miles this side of Amarillo. Despite working together"
              + " your party is quite tired and growing weary.  There are many"
              + " truckstops on the outskirts of town, and more than a few "
              + " Walmarts.  Get some sleep and get some food. If you were"
              + " significantly younger, and had fewer people, you could possibly"
              + " make get to your destination in two days.  But, you decide to"
              + " break the rest of the journey into 3 more days. "
              + " Next stop: Sin City 574 miles away.  ");
   }

   public static void lasVegas() {
      System.out.println("Welcome to Sin City USA."
              + " "
              + " Despite it's nickname, you did see a Temple of The Lord on the"
              + " mountains to the east as you drove around the city. Stay away"
              + " from the casinos and the giant resorts. In other words, \"Dont"
              + " pet the snake.\" Your party is struggling at this point, but"
              + " your faith is strong and at times you feel like angels are"
              + " pushing you along. It's nothing short of a miracle that the"
              + " Caravan has made it this far. Get to the NE part of the valley"
              + " and find a Walmart for supplies and place to park your van."
              + " You're way beyond the point of no return now. TIP, find some"
              + " shade, and linger as long as you can in the Walmart. It wouldn't"
              + " be unusual for it be over 100 degress at midnight this time"
              + " of year. "
              + " Next stop, Reno NV.- 448 miles to the North East");
   }

   public static void reno() {
      System.out.println("Welcome to the biggest little city in the word."
              + " "
              + " That's what they used to call this place,  you're sure to"
              + " see a sign to that effect if you look close enough as you"
              + " travel through here. Just think if you had gotten that job"
              + " with Tesla, or Amazon, or Apple... you may be arriving in"
              + " your new home. No such luck.  You're roughly 350 miles "
              + " from Medford, but your party (and the miraculous Caravan)"
              + " are ready to collapse.  "
              + " Get some supplies and good sleep.  Tomorrow's journey will"
              + " take you through some beautiful sights in Northern Califonia"
              + " as you make you're way to Medford. You may even decide to do"
              + " some side trips, before you reach the Oregon line. "
              + " "
              + " Next stop: Medford Oregon - 344 miles away.");
   }

   public static void medford() {
      System.out.println("Welcome to your new home!"
              + " "
              + " You don't need a description or advise. You will write the"
              + " words to describe your new life, with new opportunities, new"
              + " friends and new challenges to make your dreams come true."
              + " It's been tough, but you made it."
              + ""
              + " Congratulations, and WELCOME HOME!!! ");
   }

   public static void store() {
      System.out.println("Welcome to Walmart!"
              + " "
              + " You know what to do.");
   }


   private static Location[][] createLocations(int x, int y) {
      if (x < 1 || y < 1) {
         return null;
      }

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

      locations[1][1].setScenes(scenes[Towns.froome.ordinal()]);
      locations[1][10].setObstacles(obstaclePosition[ObName.One.ordinal()]);
      locations[2][1].setScenes(scenes[Towns.kingston.ordinal()]);
      locations[2][10].setObstacles(obstaclePosition[ObName.Two.ordinal()]);
      locations[3][1].setScenes(scenes[Towns.saintPetersburg.ordinal()]);
      locations[3][10].setObstacles(obstaclePosition[ObName.Three.ordinal()]);
      locations[4][1].setScenes(scenes[Towns.birmingham.ordinal()]);
      locations[4][10].setObstacles(obstaclePosition[ObName.Four.ordinal()]);
      locations[5][1].setScenes(scenes[Towns.elPaso.ordinal()]);
      locations[5][10].setObstacles(obstaclePosition[ObName.Five.ordinal()]);
      locations[6][1].setScenes(scenes[Towns.losAngeles.ordinal()]);
      locations[6][10].setObstacles(obstaclePosition[ObName.Six.ordinal()]);
      locations[7][1].setScenes(scenes[Towns.redding.ordinal()]);
      locations[7][10].setObstacles(obstaclePosition[ObName.Seven.ordinal()]);
      locations[8][1].setScenes(scenes[Towns.medford.ordinal()]);

   }

   public static void loadSavedGame(String filepath) throws GameControlException {
      Game game = null;

      try (FileInputStream fips = new FileInputStream(filepath)) {
         ObjectInputStream output = new ObjectInputStream(fips);

         game = (Game) output.readObject(); // read the game object from file
      } catch (Exception e) {
         throw new GameControlException(e.getMessage());
      }
      // close the outuput file
      JamaicanExodus.setCurrentGame(game);

   }

   public static void saveGame(Game game, String filepath)
           throws GameControlException {

      try (FileOutputStream fops = new FileOutputStream(filepath)) {
         ObjectOutputStream output = new ObjectOutputStream(fops);

         output.writeObject(game); // write the game object out to file
      } catch (Exception e) {
         throw new GameControlException(e.getMessage());
      }
   }
   // Press Enter to continue    

   public static void pressEnterToContinue() {
      System.out.println("Press -ENTER- to continue...");
      try {
         System.in.read();
      } catch (Exception e){
         System.out.println("Next time, just press the ENTER key.");
      }
   }

   /* Clear Screen
   public final static void clearScreen() { //doesnt work ... yet

      
       try {
         Robot pressbot = new Robot();
         pressbot.keyPress(17); // Holds CTRL key.
         pressbot.keyPress(76); // Holds L key.
         pressbot.keyRelease(17); // Releases CTRL key.
         pressbot.keyRelease(76); // Releases L key.
      } 
      catch (AWTException ex) {
      }*/
   }

