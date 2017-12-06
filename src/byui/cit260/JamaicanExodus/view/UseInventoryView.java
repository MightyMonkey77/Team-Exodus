/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.model.Player;
import java.util.IllegalFormatException;

/**
 *
 * @author Office Payne
 */
public class UseInventoryView extends View {

              
    public UseInventoryView() {
        
        super ( "\n+*************************************"
            + "\nM - Use Medicine"
            + "\nR - Use Rations"
            + "\nQ - Quit"
            + "\n**************************************"
     );  
      
    }    
    
    public UseInventoryView(String message) {
        super (message);
    }    
    
    @Override
    public boolean doAction(String choice) throws IllegalFormatException {
        return false; 


  /*      Player inventory = new Player();
  
        double newHealth = Player.getCharHealth();
        double newHitPoints = inventory.getHitPoints();                

        choice = choice.toUpperCase(); //convert choice to upper case
        
        
          
        
        switch (choice){
            
            case "M":// use medkits

                if (newHealth > 0){

                    newHealth = newHealth + (playerMedKitCount * 2);

                    inventory.setCharHealth(newHealth);                

                    playerMedKitCount = 0;
                }
                
                else {
                    
                    System.out.println("\nSorry man. No more left!");
                }

                
                
                break;
            case "W"://View inventory items?

                if (newHealth > 0){
                    
                    newHealth = newHealth + (playerWaterCount * 1.5);

                    inventory.setCharHealth(newHealth);                

                    playerWaterCount = 0; 
                
                }

                else {
                    
                    System.out.println("\nSorry man. No more left!");
                }

                
                break;  

            
            case "E"://View inventory items?

                if (newHitPoints > 0){

                    newHitPoints = newHitPoints + (playerEnergyBarCount * 0.1);

                    inventory.setHitPoints(newHitPoints);                

                    playerEnergyBarCount = 0;
                
                }
                
                else {
                    
                    System.out.println("\nSorry man. No more left!");
                }                
                
                 
                break;               


            default:
                System.out.println("\nInvalid selection. Try again");
                break;
      
            }
 
       

          return false;     
        
    }    
    */
    
    }
}
    

