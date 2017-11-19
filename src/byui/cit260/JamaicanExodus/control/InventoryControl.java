/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.control;

import byui.cit260.JamaicanExodus.model.Inventory;

/**
 *
 * @author Office Payne
 */
public class InventoryControl {
    
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
          rations.setWeight(1.05);
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
    
  //public double calcChestWeight(double weight, double clothing, double chest,
  //                              double rations, double fuel, double tools, 
  //                              double computer, double calc, double farmtools,
  //                              double medicine)  {
  public double calcChestWireght(Inventory[] createInventoryList) {   
  //      double totalWeight = (clothing + tools + chest + rations + fuel + computer + calc + farmtools + medicine);
          double totalWeight = 6;
          
        if (totalWeight >= 10 && totalWeight <= 500) {

            System.out.println( "There is more room in the chest.");
        } 
        else if (totalWeight < 10 && totalWeight > 0) { 
            System.out.println("You need more rations and stuff.");   
        }
        else if (totalWeight > 500) { 
            System.out.println("You are at maximum capacity. Discard items if needed.");   
        }
        else if (totalWeight < 0) {
            System.out.println("Cannot happen. A worm hole opens and you are sucked in.");  
        }
        return totalWeight;
    }
   
    
}

