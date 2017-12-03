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
       System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return null;
    }
 


   
   
}
