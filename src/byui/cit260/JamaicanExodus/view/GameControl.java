/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.control.MapControl;
import byui.cit260.JamaicanExodus.model.Actor;
import byui.cit260.JamaicanExodus.model.Game;
import byui.cit260.JamaicanExodus.model.Inventory;
import byui.cit260.JamaicanExodus.model.Map;
import byui.cit260.JamaicanExodus.model.Player;

/**
 *
 * @author Office Payne
 */
class GameControl {
     // Need it to be able to display certain pieces first like gathering the actors names choosing the month of departure occupation and such. 
     // should this not be in here to do first before the game menu is launched? 
    public static void createNewGame(Player player) {
     // System.out.println("Craptastic, still cannot get this to work.");
     Game currentGame = new Game(); // Starts the game.
     JamaicanExodus.setCurrentGame(currentGame); // Sets it to the main program.
    
     JamaicanExodus.setPlayer(player);//sets current player into main program. 
     
     Actor[] actors = GameControl.createActor();
     JamaicanExodus.setActor(actors);
     
     Inventory[] inventoryList = GameControl.createInvetoryList();
     JamaicanExodus.setInventoryList(inventoryList);// save me!
     
     Map map = MapControl.createMap(13, 22); // Start the Map
     if (map == null) {
     }

    }

    private static Actor[] createActor() {
        System.out.println("Future home of actors."); //To change body of generated methods, choose Tools | Templates.
        return null;
   
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
     
     
    public static Player createPlayer(String name) {  
               
     if (name == null) {
         return null;
     }
     Player player = new Player();
     player.setName(name);
     
     JamaicanExodus.setPlayer(player);// save th player thing.
     
    return player;
    } 
    
    
   
    }
    
    
    
     
     
    
     
      
     
      
    
      
      
    
   

       

