/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.model.Actor;
import java.util.IllegalFormatException;

/**
 *
 * @author Office Payne
 */
public class Map extends View{
    
     public Map () {
    
         super(
                "\n The Jamaican Exodus "
               +"\n---------------------"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"         
               +"\n xxMDxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxRDxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"         
               +"\n xxxxxLAxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"         
               +"\n xxxxxxxxxEPxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"         
               +"\n xxxxxxxxxxxxxBRxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxSPxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxKIxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxFRxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n---------------------");   
     
     }
     private boolean message;
     
     @Override
    public boolean doAction(String choice) {
        Actor actor = null;
        
       
       
        try{
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            
            case "E"://what is the goal?
                System.out.println("\nReturning to the Game Menu");
                break;

 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
   
            }
        } catch
             (IllegalFormatException me){
                System.out.println(me.getMessage());
                }
        
        return false;
        
    } 

    String buildMap(int x, int y) {
        
        String [][] locArray = null; // Location array
        locArray = new String [8][9];
        
        locArray[1][0] = "Froome Starting Town";
        locArray[1][5] = "Store";
        locArray[1][9] = "Obstacle One";
        locArray[2][1] = "Kingston";
        locArray[2][5] = "Store";
        locArray[2][9] = "Obstacle Two";
        locArray[3][1] = "St Petersburg, FL";
        locArray[3][5] = "Store";
        locArray[3][9] = "Obstacle Three";
        locArray[4][1] = "Montgomery, AL";
        locArray[4][5] = "Store";
        locArray[4][9] = "Obstacle Four";
        locArray[5][1] = "Dallas, TX";
        locArray[5][5] = "Store";
        locArray[5][9] = "Obstacle Five";
        locArray[6][1] = "Albuquerque, NM";
        locArray[6][5] = "Store";
        locArray[6][9] = "Obstacle Six";
        locArray[7][1] = "Las Vegas, NV";
        locArray[7][5] = "Store";
        locArray[7][9] = "Obstacle Seven";
        locArray[8][1] = "Reno, NV";
        locArray[8][5] = "Store";
        locArray[8][9] = "Obstacle Eight";
        locArray[9][1] = "Medford, OR Finish";        

        return locArray[x][y];
    }
 


   
   
}
